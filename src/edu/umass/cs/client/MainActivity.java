package edu.umass.cs.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import edu.umass.cs.client.PickerActivity.STREAMS;
import edu.umass.cs.client.widget.DataChartView;

import lecho.lib.hellocharts.view.LineChartView;
import android.R.string;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import edu.umass.cs.client.PickerActivity.STREAMS;

/**
 * <p>The first activity/UI visible upon launching the application
 * 
 * @author CS390MB
 * 
 */
public class MainActivity extends Activity implements IDataObservable, OnItemSelectedListener {
    
	
	/** 
	 * Variable to check if accelerometer is running
	 */
	private boolean accelStarted = false;
	
	//button for visualization options
	private Button vizButton;
	
	//spinner to display the visualizer on the primary tab
	private Spinner vizInlineSpinner;
	
	//view to display activity on primary tab when a spinner choice is selected
	private RelativeLayout vizInlineView;
	
	
	/**
	 * Instance of this activity
	 */
	private MainActivity activity;
	
	
	/*
	 * Various UI components 
	 */
	private TextView accelXView, accelYView, accelZView;
	private TextView statusView, stepsView;

	ImageView activityView;
	private CompoundButton accelButton;
	
	/**
	 * Messenger service for exchanging messages with the background service
	 */
	private Messenger mService = null;
    /**
     * Variable indicating if this activity is connected to the service
     */
	private boolean mIsBound;
    /**
     * Messenger receiving messages from the background service to update UI
     */
	private final Messenger mMessenger = new Messenger(new IncomingHandler());
    
	//borrowing this function from example code
    public void setImage(String label){
    	ImageView image = (ImageView)findViewById(R.id.ActivityImageView);
    	if(label.equals(STREAMS.RUNNING.toString()))
    		image.setImageResource(R.drawable.running);
    	else if(label.equals(STREAMS.STATIONARY.toString()))
    		image.setImageResource(R.drawable.stationary);
    	else if(label.equals(STREAMS.WALKING.toString()))
    		image.setImageResource(R.drawable.walking);
    }
	
    /**
     * Handler to handle incoming messages
     */
    @SuppressLint("HandlerLeak")
	class IncomingHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
            case Context_Service.MSG_ACTIVITY_STATUS:
            {
            	String activity = msg.getData().getString("activity");
            	//TODO: Display activity in UI
            	break;
            }
            case Context_Service.MSG_STEP_COUNTER:
            {
            	stepsView.setText(""+msg.arg1);
            	break;
            }
            case Context_Service.MSG_ACCEL_VALUES:
            {
            	float accX = msg.getData().getFloat("accx");
            	float accY = msg.getData().getFloat("accy");
            	float accZ = msg.getData().getFloat("accz");
            	//pass data to all registed listeners
            	MainActivity.this.notifyWithData(STREAMS.ACCX, accX);
            	MainActivity.this.notifyWithData(STREAMS.ACCY, accY);
            	MainActivity.this.notifyWithData(STREAMS.ACCZ, accZ);
            	activity.setAccelValues(accX,accY,accZ);
            	break;
            }
            case Context_Service.MSG_FFT:
            {
            	for(STREAMS stream : STREAMS.getFFTStreams()){
            		Bundle b = msg.getData();
            		Double d = b.getDouble(stream.toString());
            		MainActivity.this.notifyWithData(stream, msg.getData().getDouble(stream.toString()));
            	}
            }
            case Context_Service.MSG_Dev:
            {
            	MainActivity.this.notifyWithData(STREAMS.xDEV, msg.getData().getDouble(STREAMS.xDEV.toString()));
            	MainActivity.this.notifyWithData(STREAMS.yDEV, msg.getData().getDouble(STREAMS.yDEV.toString()));
            	MainActivity.this.notifyWithData(STREAMS.zDEV, msg.getData().getDouble(STREAMS.zDEV.toString()));
            }
            case Context_Service.MSG_ACCELEROMETER_STARTED:
            {
            	if(accelButton!=null) {
            		accelButton.setChecked(true);
            		accelStarted = true;
            		statusView.setText("Accelerometer Started");
            	}
            	break;
            }
            case Context_Service.MSG_ACCELEROMETER_STOPPED:
            {
            	if(accelButton!=null) {
            		accelButton.setChecked(false);
            		accelStarted = false;
            		activityView.setImageDrawable(null);
            		statusView.setText("Accelerometer Stopped");
            	}
            	break;
            }
            case Context_Service.MSG_ACTIVITY_UPDATED:
            {
            	CharSequence data = msg.getData().getString("update");
            	//pass data to all registered listeners
            	MainActivity.this.notifyWithData(STREAMS.valueOf(data.toString()), data.toString());
            	setImage(msg.getData().getCharSequence("update").toString());
            }
            default:
                super.handleMessage(msg);
            }
        }
    }
    
    /**
     * Connection with the service
     */
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            mService = new Messenger(service);
            statusView.setText("Attached to the Service");
            mIsBound = true;
            try {
                Message msg = Message.obtain(null, Context_Service.MSG_REGISTER_CLIENT);
                msg.replyTo = mMessenger;
                mService.send(msg);
            } catch (RemoteException e) {
                // In this case the service has crashed before we could even do anything with it
            }
        }

        public void onServiceDisconnected(ComponentName className) {
            // This is called when the connection with the service has been unexpectedly disconnected - process crashed.
        	mIsBound = false;
            mService = null;
            statusView.setText("Disconnected from the Service");
        }
    };
	
    /* Invoked when an activity is created
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	activity = this;
    	super.onCreate(savedInstanceState);
        //Set Layout
        setContentView(R.layout.main);
        
        activityView = (ImageView) findViewById(R.id.ActivityImageView);

        statusView = (TextView) findViewById(R.id.StatusView);
        stepsView = (TextView) findViewById(R.id.StepCountView);
        accelXView = (TextView) findViewById(R.id.AccelXView);
        accelYView = (TextView) findViewById(R.id.AccelYView);
        accelZView = (TextView) findViewById(R.id.AccelZView);
        statusView.setText("Service Not Bound");
        
        //Start Background Service if not already started
        if(!Context_Service.isRunning()) {
        	Intent cssBg = new Intent(activity,Context_Service.class);
    		startService(cssBg);
        }
        
        
        //Bind to the service if it is already running
        bindToServiceIfIsRunning();
        
        //Determine if the accelerometer is on
        accelStarted = false;
        if(Context_Service.isAccelerometerRunning())
        	accelStarted = true;
        
        //button to start the ContextActivity visualization activity
        vizButton = (Button) findViewById(R.id.VisualizeButton);
        vizButton.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        	Intent intent = new Intent(getApplicationContext(),ContextActivity.class);
        	intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        	startActivity(intent);
        	}
        	
        });
        
        //this will display the activity selected by the spinner
        vizInlineView = (RelativeLayout) findViewById(R.id.VisualizeInlineView);
        
        //this will select an activity to display in the above view
        //based off of STREAMS in PickerActivity
        vizInlineSpinner = (Spinner) findViewById(R.id.VisualizeInline);
        
        ArrayAdapter a = new ArrayAdapter(this, android.R.layout.simple_spinner_item, STREAMS.enumValues());
        a.setDropDownViewResource(android.R.layout.simple_gallery_item);
        vizInlineSpinner.setAdapter(a);
        vizInlineSpinner.setOnItemSelectedListener(this);
        
        accelButton = (ToggleButton) findViewById(R.id.StartButton);
        accelButton.setChecked(accelStarted);
        accelButton.setOnCheckedChangeListener(
        		new OnCheckedChangeListener() {
        		    public void onCheckedChanged(CompoundButton btn,boolean isChecked) {
        		    	accelStarted = Context_Service.isAccelerometerRunning();
        		    	if(!accelStarted)
        		    		startAccelerometer();
        		    	else
        		    		stopAccelerometer();
        		    }
        		}
        );
        
        
    }
    
    /**
     * Binds this activity to the service if the service is already running
     */
    private void bindToServiceIfIsRunning() {
        //If the service is running when the activity starts, we want to automatically bind to it.
        if (Context_Service.isRunning()) {
            doBindService();//
            statusView.setText("Request to bind service");
        }
    }
	
	
    /**
     * This method is required to send a request to the background service.
     * In current application, we are not sending any message yet.
     * @param message
     */
    private void sendMessageToService(int message) {
        if (mIsBound) {
            if (mService != null) {
            	try {
                    Message msg = Message.obtain(null, message);
                    msg.replyTo = mMessenger;
                    mService.send(msg);
                } catch (RemoteException e) {
                }
            }
        }
    }
    
    /**
     * Display accelerometer values in UI
     * @param accX
     * @param accY
     * @param accZ
     */
    public void setAccelValues(float accX, float accY, float accZ) {
    	String text = String.format("%2.2f", accX);
    	accelXView.setText(text);
    	text = String.format("%2.2f", accY);
    	accelYView.setText(text);
    	text = String.format("%2.2f", accZ);
    	accelZView.setText(text);
    }
    
   
    
    
    @Override
    public void onBackPressed() {
    	super.onBackPressed();
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	try {
            doUnbindService();
        } catch (Throwable t) {
            Log.e("MainActivity", "Failed to unbind from the service", t);
        }
    }
    
    /**
     * Binds the activity to the background service
     */
    void doBindService() {
        bindService(new Intent(this, Context_Service.class), mConnection, Context.BIND_AUTO_CREATE);
        statusView.setText("Binding to Service");
    }
    
    /**
     * Unbind this activity from the background service
     */
    void doUnbindService() {
        if (mIsBound) {
            // If we have received the service, and hence registered with it, then now is the time to unregister.
            if (mService != null) {
                try {
                    Message msg = Message.obtain(null, Context_Service.MSG_UNREGISTER_CLIENT);
                    msg.replyTo = mMessenger;
                    mService.send(msg);
                } catch (RemoteException e) {
                    // There is nothing special we need to do if the service has crashed.
                }
            }
            // Detach our existing connection.
            unbindService(mConnection);
            statusView.setText("Unbinding from Service");
        }
    }
    
    /**
     * Sends Accelerometer Start Request
     */
    private void startAccelerometer() {
    	if(!mIsBound) {
    		doBindService();
    		//In this case, start accelerometer won't work because service is not bound
    		accelButton.setChecked(false);
    	}
    	if(mIsBound) {
    		sendMessageToService(Context_Service.MSG_START_ACCELEROMETER);
    	}
    }
    
    /**
     * Sends Accelerometer Stop Request
     */
    private void stopAccelerometer() {
    	if(!mIsBound) {
    		doBindService();
    	}
    	if(mIsBound) {
    		sendMessageToService(Context_Service.MSG_STOP_ACCELEROMETER);
    	}
    }
    
    /*
     * 
     * Implementation of IDataObservable..see that for method details
     * 
     */
    
    Map<IDataObserverCache, List<STREAMS>> observers = new HashMap<IDataObserverCache, List<STREAMS>>();
  	
  	@Override
  	public void register(IDataObserverCache observer, STREAMS... streams) {
  		if(observers.containsKey(observer)){
  			List<STREAMS> observerStream = observers.get(observer);
  			for(STREAMS stream: streams){//could have used a set instead
  				if(!observerStream.contains(stream))
  					observerStream.add(stream);
  			}
  		}
  		else observers.put(observer, Arrays.asList(streams));
  	}

  	@Override
  	public void detach(IDataObserverCache observer, STREAMS... streams) {
  		if(observers.containsKey(observer)){
  			List<STREAMS> observerStream = observers.get(observer);
  			for(STREAMS stream: streams){
  				observerStream.remove(stream);
  			}
  		}
  	}

  	@Override
  	public void notifyWithData(STREAMS stream, Object data) {
  		for(IDataObserverCache obs: observers.keySet()){
  			if(observers.get(obs).contains(stream)){
  				obs.receive(stream, data);
  			}
  		}
  	}
 
	private DataChartView innerChart;

  	public void onItemSelected(AdapterView<?> parent, View view, 
            int pos, long id) {
  		
		vizInlineView.removeAllViews();	
		Object b = parent.getItemAtPosition(pos);
		STREAMS stream = STREAMS.valueOf(parent.getItemAtPosition(pos).toString());
		
		innerChart = stream.StreamToChartView(this, this);
		vizInlineView.addView(innerChart);
		vizInlineView.setClickable(true);
		vizInlineView.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
			}
			
		});
    }

    public void onNothingSelected(AdapterView<?> parent) {
    	vizInlineView.removeAllViews();
    	innerChart = null;
    	MainActivity.this.vizInlineView.setVisibility(RelativeLayout.GONE);
    }
}