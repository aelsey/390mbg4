/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.umass.cs.client;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lecho.lib.hellocharts.view.LineChartView;
import lecho.lib.hellocharts.view.PieChartView;

import edu.umass.cs.client.widget.LineDataChartView;
import edu.umass.cs.client.widget.PieDataChartView;
import edu.umass.cs.client.widget.DataChartView;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ListActivity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

import edu.umass.cs.client.PickerActivity.STREAMS;

@TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
public class ContextActivity extends ListActivity implements IDataObservable {
	//maximum amount of allowed widgets
	private static final Integer maxWidgets = 4;
	
	//because of the index hashing used in the original code, the length of this array
	//can't be the size of the max widgets
	private DataChartView[] widgets = new DataChartView[STREAMS.enumValues().length];
	
	private static final String TAG = "ContextActivity";
    
	// Datasource for the listview
    private ContextAdapter adapter;
    
	// Messenger service for exchanging messages with the background service
	private Messenger mService = null;
    
    // Variable indicating if this activity is connected to the service
	private boolean mIsBound;
	//   Messenger receiving messages from the background service to update UI
	private final Messenger mMessenger = new Messenger(new IncomingHandler());
    
    // Connection with the service
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
        	Log.d(TAG,"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        	Log.d(TAG,"Service connected");
            mService = new Messenger(service);
            mIsBound = true;
        	sendMessageToService(Context_Service.MSG_REGISTER_CLIENT);
       		Log.d(TAG,"after registering client");
        }

        public void onServiceDisconnected(ComponentName className) {
        	Log.d(TAG,"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        	Log.d(TAG,"Service disconnected");
            // This is called when the connection with the service has been unexpectedly disconnected - process crashed.
        	mIsBound = false;
            mService = null;
        }
    };
    
    @SuppressLint("HandlerLeak")
	class IncomingHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
	            case Context_Service.MSG_ACTIVITY_UPDATED:
	            {
	            	String data = msg.getData().getString("update");
	            	ContextActivity.this.notifyWithData(STREAMS.valueOf(data.toString()), data.toString());	
	            	break;
	            }
	            case Context_Service.MSG_ACCEL_VALUES:
	            {
	            	float accX = msg.getData().getFloat("accx");
	            	float accY = msg.getData().getFloat("accy");
	            	float accZ = msg.getData().getFloat("accz");
	            	//pass data to all widgets
	            	ContextActivity.this.notifyWithData(STREAMS.ACCX, accX);
	            	ContextActivity.this.notifyWithData(STREAMS.ACCY, accY);
	            	ContextActivity.this.notifyWithData(STREAMS.ACCZ, accZ);
	            	
	            	break;
	            }
	            case Context_Service.MSG_FFT:
	            {
	            	for(STREAMS stream : STREAMS.getFFTStreams()){
	            		ContextActivity.this.notifyWithData(stream, msg.getData().getDouble(stream.toString()));
	            	}
	            }
	            case Context_Service.MSG_Dev:
	            {
	            	ContextActivity.this.notifyWithData(STREAMS.xDEV, msg.getData().getDouble(STREAMS.xDEV.toString()));
	            	ContextActivity.this.notifyWithData(STREAMS.yDEV, msg.getData().getDouble(STREAMS.yDEV.toString()));
	            	ContextActivity.this.notifyWithData(STREAMS.zDEV, msg.getData().getDouble(STREAMS.zDEV.toString()));
	            }
	            default:
	                super.handleMessage(msg);
            }
        }
    }
    
    /**
     * Binds this activity to the service if the service is already running
     */
    private void bindToServiceIfIsRunning() {
        //If the service is running when the activity starts, we want to automatically bind to it.
        if (Context_Service.isRunning()) {
        	Log.d(TAG,"binding to service");
        	bindService(new Intent(this, Context_Service.class), mConnection, Context.BIND_AUTO_CREATE);
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
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(null);
        
//        View view = this.getWindow().getDecorView();/
//        view.setBackgroundColor(Color.WHITE);
    }
    
    
    
    @Override
    public void onDestroy(){
    	super.onDestroy();
    	
    }
    
    @Override
    public void onResume() {
        super.onResume();
        
        //Bind to the service if it is already running
        bindToServiceIfIsRunning();
        if(Context_Service.selected.size() > 0){
        	widgets = new DataChartView[STREAMS.enumValues().length];
        	if (adapter ==null){
        		adapter = new ContextAdapter();
        		setListAdapter(adapter);
        	}
            drawWidgets();
        } 
    }
    
    //reinstantiates all widgets currently 'selected'
    private void drawWidgets(){
    	List<Integer> selected = Context_Service.selected;
    	STREAMS[] streams = STREAMS.enumValues();
    	widgets = new DataChartView[STREAMS.enumValues().length];
    	byte b = 0b0;
    	for(int i : selected){
    		widgets[i] = streams[i].StreamToChartView(this, this);
    		widgets[i].setId(b);
    		
    		ListView.LayoutParams params = new android.widget.AbsListView.LayoutParams(
    				ListView.LayoutParams.MATCH_PARENT,
    				getWidgetHeight()
    		);
    		widgets[i].setLayoutParams(params);
    		//if(b > 1)
    		//	((LayoutParams) params).addRule(Relat.BELOW, b << 1);
    		widgets[i].requestLayout();
    	}
    }
    
    //used to partition the available height amongst the currently instantiated widgets
    public int getWidgetHeight(){
    	Point p = new Point();
    	getWindowManager().getDefaultDisplay().getSize(p);
    	int size = Context_Service.selected.size();
    	//remove 150 for the list header...unsure of how to calculate the exact height of that
    	int height = (int) (p.y - 150); 
    	return size <= ContextActivity.getMaxWidgets() ? height / Context_Service.selected.size()	:
    			height	/	ContextActivity.getMaxWidgets();
    }

    @SuppressLint("NewApi")
	@Override
    public void onPause() {
    	if (mIsBound) {
        	sendMessageToService(Context_Service.MSG_UNREGISTER_CLIENT);
            // Detach our existing connection.
            unbindService(mConnection);
        }
    	setListAdapter(null);
    	adapter = null;
    	widgets=null;
        super.onPause();
    }    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_pick:
            	Intent intent = new Intent(getApplicationContext(),PickerActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
				startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    
    private class ContextAdapter extends BaseAdapter {

    	/****/
        @Override
        public int getViewTypeCount(){
        	return Context_Service.selected.size();
        }
 
        @Override
        public int getItemViewType(int position) {
            return position;
        }
        
        @Override
        public int getCount() {
            return Context_Service.selected.size();
        }
 
        @Override
        public String getItem(int position) {
            return "";
        }
 
        @Override
        public long getItemId(int position) {
            return position;
        }
 
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
        	if(convertView == null){
            	int index = Context_Service.selected.get(position);
            	if(ContextActivity.this.widgets[index]==null)
            		ContextActivity.this.drawWidgets();//all widgets should be instantiated...so if any are missing for any reason, reinstantiate everything
            	return widgets[index];
            }
            else return convertView;
        }
    }
    
/*
 * Implementation of IDataObservable, see IDataObservable.java
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

	public static Integer getMaxWidgets() {
		return maxWidgets;
	}
}
