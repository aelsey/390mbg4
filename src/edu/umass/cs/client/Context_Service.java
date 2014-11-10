package edu.umass.cs.client;

import java.util.*;

import lecho.lib.hellocharts.view.LineChartView;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import edu.umass.cs.accelerometer.*;
import edu.umass.cs.client.PickerActivity.STREAMS;
import edu.umass.cs.client.voice.FeaturizeWeka;
import edu.umass.cs.client.voice.MicrophoneRecorder;
import edu.umass.cs.client.voice.MicrophoneRecorder.MicrophoneListener;
import edu.umass.cs.client.widget.DataChartView;
import edu.umass.cs.client.widget.LineDataChartView;
import edu.umass.cs.client.widget.PieDataChartView;
import weka.classifiers.*;


/**
 * 
 * Context_Service: This is a sample class to reads sensor data (accelerometer). 
 * 
 * @author CS390MB
 * 
 */
public class Context_Service extends Service implements SensorEventListener, IDataObservable, MicrophoneListener {
	
	/**
	 * Notification manager to display notifications
	 */
	private NotificationManager nm;
	
	/**
	 * SensorManager
	 */
	private SensorManager mSensorManager;
    /**
     * Accelerometer Sensor
     */
    private Sensor mAccelerometer;

	//List of bound clients/activities to this service
	ArrayList<Messenger> mClients = new ArrayList<Messenger>();

	//Message codes sent and received by the service
	static final int MSG_REGISTER_CLIENT = 1;
	static final int MSG_UNREGISTER_CLIENT = 2;
	static final int MSG_ACTIVITY_STATUS = 3;
	static final int MSG_STEP_COUNTER = 4;
	static final int MSG_ACCEL_VALUES = 5;
	static final int MSG_START_ACCELEROMETER = 6;
	static final int MSG_STOP_ACCELEROMETER = 7;
	static final int MSG_ACCELEROMETER_STARTED = 8;
	static final int MSG_ACCELEROMETER_STOPPED = 9;
	static final int MSG_ACTIVITY_UPDATED = 0xA;
	static final int MSG_FFT = 0xB;
	static final int MSG_Dev = 0xF;
	
	static final int MSG_START_MICROPHONE = 20;
	static final int MSG_STOP_MICROPHONE = 21;
	static final int MSG_MICROPHONE_STARTED = 22;
	static final int MSG_MICROPHONE_STOPPED = 23;
	static final int MSG_SPEECH_STATUS = 24;
	
	private static double speechThreshold = .4;
	//private static double noiseThreshold = .1;
	
	/**
	* Class to orient axis
	*/
	private ReorientAxis orienter = null;
	/**
	* Feature extractor
	*/
	private ActivityFeatureExtractor extractor = null;

	static Context_Service sInstance = null;
	private static boolean isRunning = false;
	private static boolean isAccelRunning = false;
	private static boolean isMicrophoneRunning = false;
	private static final int NOTIFICATION_ID = 777;
	
	private AccelReadingCache cache = null;
	
	/**
	 * Filter class required to filter noise from accelerometer
	 */
	private Filter filter = null;
	/**
	 * Step count to be displayed in UI
	 */
	private int stepCount = 0;
	
	//
	public static LinkedList<Float> accx_history = new LinkedList<Float>();
	public static LinkedList<Float> accy_history = new LinkedList<Float>();
	public static LinkedList<Float> accz_history = new LinkedList<Float>();
	public static List<Integer> selected = new ArrayList<Integer>();
	public static LinkedList<Integer> raw_activity_history;
	
	
	//Messenger used by clients
	final Messenger mMessenger = new Messenger(new IncomingHandler());

	/**
	 * Handler to handle incoming messages
	 */
	@SuppressLint("HandlerLeak")
	class IncomingHandler extends Handler { 
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case MSG_REGISTER_CLIENT:
				mClients.add(msg.replyTo);
				break;
			case MSG_UNREGISTER_CLIENT:
				mClients.remove(msg.replyTo);
				break;
			case MSG_START_ACCELEROMETER:
			{
				isAccelRunning = true;
				mSensorManager.registerListener(Context_Service.this, mAccelerometer, SensorManager.SENSOR_DELAY_GAME);
				sendMessageToUI(MSG_ACCELEROMETER_STARTED);
				showNotification();
				
				//Set up filter
				//Following sets up smoothing filter from mcrowdviz
				//int SMOOTH_FACTOR = 10;
				//filter = new Filter(SMOOTH_FACTOR);
				//OR Use Butterworth filter from mcrowdviz
				double CUTOFF_FREQUENCY = 3.5;
				filter = new Filter(CUTOFF_FREQUENCY);
				cache = new AccelReadingCache();
				stepCount = 0;
				
				orienter = new ReorientAxis(); 
				long WINDOW_IN_MILLISECONDS = 2500; //5seconds
				//Set up a feature extractor that extracts features every 5 seconds
				extractor = new ActivityFeatureExtractor(2000);

				break;
			}
			case MSG_STOP_ACCELEROMETER:
			{
				isAccelRunning = false;
				mSensorManager.unregisterListener(Context_Service.this, mAccelerometer);
				//mSensorManager = null;
				sendMessageToUI(MSG_ACCELEROMETER_STOPPED);
				showNotification();
				//Free filter and step detector
				//cache = null;
				//The following needs to be added 
				orienter = null; 
				extractor = null;
				filter = null;
				break;
			}
			case MSG_START_MICROPHONE: {
				MicrophoneRecorder recorder = MicrophoneRecorder.getInstance();
				recorder.registerListener(Context_Service.this);
				recorder.startRecording();
				isMicrophoneRunning = !isMicrophoneRunning;
				Context_Service.this.sendMessageToUI(Context_Service.MSG_MICROPHONE_STARTED);
				break;
			}
			case MSG_STOP_MICROPHONE: {
				MicrophoneRecorder recorder = MicrophoneRecorder.getInstance();
				recorder.unregisterListener(Context_Service.this);
				recorder.stopRecording();
				isMicrophoneRunning = !isMicrophoneRunning;
				Context_Service.this.sendMessageToUI(Context_Service.MSG_MICROPHONE_STOPPED);
			}
			default:
				super.handleMessage(msg);
			}
		}
	}


	private void sendMessageToUI(int message) {
		for (int i=mClients.size()-1; i>=0; i--) {
			try {
				// Send message value
				mClients.get(i).send(Message.obtain(null, message));
			} catch (RemoteException e) {
				// The client is dead. Remove it from the list; we are going through the list from back to front so this is safe to do inside the loop.
				mClients.remove(i);
			}
		}
	}
	
	private void sendFFTToUI(double[] values, STREAMS[] fftStreams){
		for (int i=mClients.size()-1; i>=0; i-- ) {
			try {
				
				//why is the bundle/msg nested in here?
				//can they be reused?
				//otherwise very inefficient
				Bundle b = new Bundle();
				for(int c = 0;c<values.length;c++)
				{
					b.putDouble(fftStreams[c].toString(), values[c]);
				}
				Message msg = Message.obtain(null, MSG_FFT);
				msg.setData(b);
				mClients.get(i).send(msg);

			} catch (RemoteException e) {
				// The client is dead. Remove it from the list; we are going through the list from back to front so this is safe to do inside the loop.
				mClients.remove(i);
			}
		}
	}
	
	private void sendAccelValuesToUI(float accX, float accY, float accZ) {
		for (int i=mClients.size()-1; i>=0; i-- ) {
			try {
				
				//Send Accel Values
				Bundle b = new Bundle();
				b.putFloat("accx", accX);
				b.putFloat("accy", accY);
				b.putFloat("accz", accZ);
				Message msg = Message.obtain(null, MSG_ACCEL_VALUES);
				msg.setData(b);
				mClients.get(i).send(msg);

			} catch (RemoteException e) {
				// The client is dead. Remove it from the list; we are going through the list from back to front so this is safe to do inside the loop.
				mClients.remove(i);
			}
		}
	}
	
	private void sendUpdatedStepCountToUI() {
		for (int i=mClients.size()-1; i>=0; i-- ) {
			try {
				//Send Step Count
				Message msg = Message.obtain(null, MSG_STEP_COUNTER,stepCount,0);
				mClients.get(i).send(msg);

			} catch (RemoteException e) {
				// The client is dead. Remove it from the list; we are going through the list from back to front so this is safe to do inside the loop.
				mClients.remove(i);
			}
		}
	}
	
	private void sendUpdatedActivityToUI(String activity) {
		for (int i = mClients.size()-1; i>=0; i--) {
			try {
				Bundle b = new Bundle();
				b.putString("update", activity);
				Message msg = Message.obtain(null, MSG_ACTIVITY_UPDATED);
				msg.setData(b);
				mClients.get(i).send(msg);
			} catch (RemoteException e) {
				mClients.remove(i);
			}
		}
	}
	
	private void sendSpeechStatusToUI(String speechStatus) {
		for (int i = mClients.size()-1; i>=0; i--) {
			try {
				Bundle b = new Bundle();
				b.putString("speechStatus", speechStatus);
				Message msg = Message.obtain(null, MSG_SPEECH_STATUS);
				msg.setData(b);
				mClients.get(i).send(msg);
			} catch (RemoteException e) {
				mClients.remove(i);
			}
		}
	}

	/**
	 * On Binding, return a binder
	 */
	@Override
	public IBinder onBind(Intent intent) {
		return mMessenger.getBinder();
	}

	//Start service automatically if we reboot the phone
	public static class Context_BGReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			Intent bootUp = new Intent(context,Context_Service.class);
			context.startService(bootUp);
		}		
	}

	@SuppressWarnings("deprecation")
	private void showNotification() {
		//Cancel previous notification
		if(nm!=null)
			nm.cancel(NOTIFICATION_ID);
		else
			nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

		// The PendingIntent to launch our activity if the user selects this notification
		PendingIntent contentIntent = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 0);

		// Use the commented block of code if your target environment is Android-16 or higher 
		/*Notification notification = new Notification.Builder(this)
		.setContentTitle("Context Service")
		.setContentText("Running").setSmallIcon(R.drawable.icon)
		.setContentIntent(contentIntent)
		.build();
		
		nm.notify(NOTIFICATION_ID, notification); */
		
		//For lower versions of Android, the following code should work
		Notification notification = new Notification();
		notification.icon = R.drawable.icon;
		notification.tickerText = getString(R.string.app_name);
		notification.contentIntent = contentIntent;
        notification.when = System.currentTimeMillis();
        if(isAccelerometerRunning())
        	notification.setLatestEventInfo(getApplicationContext(), getString(R.string.app_name), "Accelerometer Running", contentIntent);
        else
        	notification.setLatestEventInfo(getApplicationContext(), getString(R.string.app_name), "Accelerometer Not Started", contentIntent);
        
        // Send the notification.
        nm.notify(NOTIFICATION_ID, notification);
	}

	/* getInstance() and isRunning() are required by the */
	static Context_Service getInstance(){
		return sInstance;
	}

	protected static boolean isRunning(){
		return isRunning;
	}
	
	protected static boolean isAccelerometerRunning() {
		return isAccelRunning;
	}

    protected static boolean isMicrophoneRunning() {
    	return isMicrophoneRunning;
    }

	@Override
	public void onCreate() {
		super.onCreate();
		showNotification();
		isRunning = true;
		sInstance = this;
		mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
		mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		nm.cancel(NOTIFICATION_ID); // Cancel the persistent notification.
        isRunning = false;
		//Don't let Context_Service die!
		Intent mobilityIntent = new Intent(this,Context_Service.class);
		startService(mobilityIntent);
	}
	
	@Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY; // run until explicitly stopped.
    }

	/* (non-Javadoc)
	 * @see android.hardware.SensorEventListener#onAccuracyChanged(android.hardware.Sensor, int)
	 */
	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		
	}

	/* (non-Javadoc)
	 * @see android.hardware.SensorEventListener#onSensorChanged(android.hardware.SensorEvent)
	 */
	@Override
	public void onSensorChanged(SensorEvent event) {
		if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER && isAccelRunning) {
			
			float accel[] = event.values;
			sendAccelValuesToUI(accel[0], accel[1], accel[2]);
			/**
			 * TODO: Step Detection
			 */
			//First, Get filtered values
			double filtAcc[] = filter.getFilteredValues(accel[0], accel[1], accel[2]);
			//Now, increment 'stepCount' variable if you detect any steps here
			stepCount = cache.updateCache(filtAcc[0], filtAcc[1], filtAcc[2]).getStepCount(); 
			//detectSteps() is not implemented 
			sendUpdatedStepCountToUI();
			
			//Add the following 
			  long time = event.timestamp/1000000; //convert time to milliseconds from nanoseconds
			  //Orient accelerometer
			  double ortAcc[] = 
			    orienter.getReorientedValues(accel[0], accel[1], accel[2]);
			  
			  //Extract Features now 
			  Double features[] = extractor.extractFeatures(time, ortAcc[0], ortAcc[1],ortAcc[2], accel[0], accel[1], accel[2]);
			  if(features != null){
				  double[] fftVals = {
					features[3],
					features[4],
					features[5],
					features[6],
					
					features[12],
					features[13],
					features[14],
					features[15],
					
					features[21],
					features[22],
					features[23],
					features[24]
				  };
				
				  sendFFTToUI(fftVals, STREAMS.getFFTStreams());
				  
				  double[] axisDevs = {
					features[1],
					features[10],
					features[19]
				  };
				  
				  sendDevsToUI(axisDevs);
			  }
			  
			  //Feature vector is not null only when it has buffered
			  //at least 5 seconds of data
			  
			  if(features!=null) {
			    //Classify 
			    try{
			      double classId = ActivityClassifier.classify(features);
			  
			      //TODO: 1. The activity labels below will depend on activities in your data set
			      String activity = null;
			      if(classId == 0.0) activity= "RUNNING";
			      else if(classId == 1.0) activity = "STATIONARY";
			      else if(classId == 2.0) activity = "WALKING";
			      //TODO: 2. Send new activity label to UI
			      sendUpdatedActivityToUI(activity);
			    }catch(Exception e){
			      e.printStackTrace();
			    }
			  }
		}

	}
	
	private void sendDevsToUI(double[] axisDevs) {
		for (int i=mClients.size()-1; i>=0; i-- ) {
			try {
				//Send Step Count
				Bundle b = new Bundle();
				b.putDouble(STREAMS.xDEV.toString(), axisDevs[0]);
				b.putDouble(STREAMS.yDEV.toString(), axisDevs[1]);
				b.putDouble(STREAMS.zDEV.toString(), axisDevs[2]);
				
				Message msg = Message.obtain(null, MSG_Dev);
				msg.setData(b);
				mClients.get(i).send(msg);

			} catch (RemoteException e) {
				// The client is dead. Remove it from the list; we are going through the list from back to front so this is safe to do inside the loop.
				mClients.remove(i);
			}
		}
	}

	//Map<IDataObserverCache, List<Integer>> observers = new HashMap<IDataObserverCache, List<Integer>>();
	List<IDataObserverCache> observers = new LinkedList<IDataObserverCache>();
	
	@Override
	public void register(IDataObserverCache observer, STREAMS... streams) {
		/*if(observers.containsKey(observer)){
			List<Integer> observerStream = observers.get(observer);
			for(Integer stream: streams){//could have used a set instead
				if(!observerStream.contains(stream))
					observerStream.add(stream);
			}
		}
		else observers.put(observer, Arrays.asList(streams));*/
		if(!observers.contains(observer))
			observers.add(observer);
	}

	@Override
	public void detach(IDataObserverCache observer, STREAMS... streams) {
		/*if(observers.containsKey(observer)){
			List<Integer> observerStream = observers.get(observer);
			for(Integer stream: streams){
				observerStream.remove(stream);
			}
		}*/
		observers.remove(observer);
	}

	@Override
	public void notifyWithData(STREAMS stream, Object data) {
		/*for(IDataObserverCache obs: observers.keySet()){
			if(observers.get(obs).contains(stream)){
				obs.receive(stream, data);
			}
		}*/
		
		for(IDataObserverCache obs: observers){
			if(obs.getStreams().contains(stream)){
				obs.receive(stream, data);
			}
		}
	}
	
	@Override
	//This method was declared in an interface in MicrophoneRecorder
	public void microphoneBuffer(short[] buffer, int window_size) {
	//You will break a chunk of one-second-long samples into multiple 25-ms windows. Think about how many of 25-ms windows you will get for a second. 
		int voiced = 0;
		int frame_size = window_size/40; //might skip a few frames, but not a big deal probably
		int total_frames = 40;
		int frame_count = 10;
		int speech_count = 0;
		for(int k=0;k<window_size;k+=(frame_size/frame_count*total_frames)){
            double[] features = FeaturizeWeka.ComputerFeaturesForFrameForAssignment4(buffer, frame_size, k);
            Object[] oFeatures = new Object[features.length];
            int count = 0;
            for(double d: features)
            	oFeatures[count++] = (Double) d;
            
            try
            {
            	if((int)SpeechClassifier.classify(oFeatures)==0)
            		speech_count +=1;
            }
            catch(Exception ex)
            {
            	
            }
        }
		double threshold = ((double)speech_count)/((double)frame_count);
		if(threshold>Context_Service.speechThreshold)
			sendSpeechStatusToUI(STREAMS.SPEECH.toString());
		else
			sendSpeechStatusToUI(STREAMS.SILENCE.toString());
	}
}
