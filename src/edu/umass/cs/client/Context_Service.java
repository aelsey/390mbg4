package edu.umass.cs.client;

import java.util.ArrayList;

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
import weka.classifiers.*;


/**
 * 
 * Context_Service: This is a sample class to reads sensor data (accelerometer). 
 * 
 * @author CS390MB
 * 
 */
public class Context_Service extends Service implements SensorEventListener{

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
				//The following needs to be added 
				//Set up orienter 
				orienter = new ReorientAxis(); 
				long WINDOW_IN_MILLISECONDS = 5000; //5seconds
				//Set up a feature extractor that extracts features every 5 seconds
				extractor = new ActivityFeatureExtractor(5000);

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
			  
			  //Feature vector is not null only when it has buffered
			  //at least 5 seconds of data
			  
			  if(features!=null) {
			    //Classify 
			    try{
			      double classId = ActivityClassifier.classify(features);
			  
			      //TODO: 1. The activity labels below will depend on activities in your data set
			      String activity = null;
			      if(classId == 0.0) activity= "Walking";
			      else if(classId == 1.0) activity = "Stationary";
			      else if(classId == 2.0) activity = "Jumping";
			      //TODO: 2. Send new activity label to UI
			      sendUpdatedActivityToUI(activity);
			    }catch(Exception e){
			      e.printStackTrace();
			    }
			  }
		}

	}
}
