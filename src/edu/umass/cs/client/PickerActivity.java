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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import edu.umass.cs.client.widget.ColumnDataChartView;
import edu.umass.cs.client.widget.DataChartView;
import edu.umass.cs.client.widget.FastLineDataChartView;
import edu.umass.cs.client.widget.LineDataChartView;
import edu.umass.cs.client.widget.PieDataChartView;
import edu.umass.cs.client.widget.SynchronousPieDataChartView;

import android.app.ListActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PickerActivity extends ListActivity {
	
		//stationary, walking, and running are not menu options, but can be graphed
		//activity is a menu optio, but it is not graphed
	public enum STREAMS {
		VOICE,
		
		SPEECH,
		NOISE,
		SILENCE,
		
		ACCX
		,ACCY
		,ACCZ,
		FFT,
		ACCALLLine,
		ACCALLPie,
		ACTIVITY,
		DEVIATION,
		
		xDEV,
		yDEV,
		zDEV,
		
		xFFT1,
		xFFT2,
		xFFT3,
		xFFT4,
		yFFT1,
		yFFT2,
		yFFT3,
		yFFT4,
		zFFT1,
		zFFT2,
		zFFT3,
		zFFT4,
		STATIONARY,
		WALKING,
		RUNNING;
		
		//can't override static methods in java, so this must be used as alternate to enum.values
		//hides streams that can't be selected as graphs
		@SuppressWarnings("unchecked")
		public static STREAMS[] enumValues(){
			STREAMS[] retVal = {
					VOICE,
					ACCX
					,ACCY
					,ACCZ,
					FFT,
					ACCALLLine,
					ACCALLPie,
					ACTIVITY,
					DEVIATION
			};
			return retVal;
		}
		
		//used in incominghandler
		public static STREAMS[] getFFTStreams(){
			STREAMS[] retVal = {
					xFFT1,
					xFFT2,
					xFFT3,
					xFFT4,
					yFFT1,
					yFFT2,
					yFFT3,
					yFFT4,
					zFFT1,
					zFFT2,
					zFFT3,
					zFFT4
			}; return retVal;
		}
		
		//used to stack fourier harmonics of each axis onto one another
		public static STREAMS[][] getFFTGroupings(){
			STREAMS[][] retVal = {
					{ xFFT1, xFFT2, xFFT3, xFFT4 },
					{ yFFT1, yFFT2, yFFT3, yFFT4 },
					{ zFFT1, zFFT2, zFFT3, zFFT4 }
			}; return retVal;
		}
		
		//used in graphing classes
		public int StreamToColor(){
			switch(this){
				case SPEECH:
				case xDEV:
				case ACCX: return Color.GREEN;
				case NOISE:
				case yDEV:
				case ACCY: return Color.MAGENTA;
				case SILENCE:
				case zDEV:
				case ACCZ: return Color.CYAN;
				
				case STATIONARY: return Color.YELLOW;
				case WALKING: return Color.BLUE;
				case RUNNING: return Color.RED;
				
				case xFFT1:
				case yFFT1:
				case zFFT1: return Color.BLACK;
				case xFFT2:
				case yFFT2:
				case zFFT2: return Color.DKGRAY;
				case xFFT3:
				case yFFT3:
				case zFFT3: return Color.LTGRAY;
				case xFFT4:
				case yFFT4:
				case zFFT4: return Color.CYAN;
				
				default: return 0;
			}
		}
		
		//returns the best graph for a particular stream
		//used in MainActivity and ContextActivity for widget instantiation
		public DataChartView StreamToChartView(Context context, IDataObservable obs){
			switch(this){
				case VOICE:  
					return (DataChartView) new SynchronousPieDataChartView(context, obs, SPEECH, NOISE, SILENCE);
				case DEVIATION:
					return (DataChartView) new FastLineDataChartView(context, obs, xDEV, yDEV, zDEV);
				case ACTIVITY:
					return (DataChartView) new SynchronousPieDataChartView(context, obs, STATIONARY, WALKING, RUNNING);
				case ACCX:
				case ACCY:
				case ACCZ:
					return (DataChartView) new LineDataChartView(context, obs, this);
				case ACCALLLine: 
					return (DataChartView) new LineDataChartView(context, obs, ACCX, ACCY, ACCZ);
				case ACCALLPie:
					return (DataChartView) new PieDataChartView(context, obs, ACCX, ACCY, ACCZ);
				case FFT:
					return (DataChartView) new ColumnDataChartView(context, obs, STREAMS.getFFTGroupings(), 
																				xFFT1, xFFT2, xFFT3, xFFT4,
																				yFFT1, yFFT2, yFFT3, yFFT4,
																				zFFT1, zFFT2, zFFT3, zFFT4);
				default:
					return null;
			}
		}
		
		//not sure if this is being used
		public List<Object> getCacheForStream(){
			switch(this){
				case ACTIVITY:
					return (List) new LinkedList<String>();
				case ACCX:
				case ACCY:
				case ACCZ:
					return (List) new LinkedList<Integer>();
				default:
					return null;
			}
		}
		
		//probably isn't necessary in the current code, but it's being
		//used in cacheData, which is implemented in all subclasses of DataChartView
		public Float parseValueForStream(Object value){
			switch(this){
				case ACTIVITY: 
					return null;
				case STATIONARY:
				case WALKING:
				case RUNNING: 
					return 1.0F;
				case xDEV:
				case yDEV:
				case zDEV: 
					return ((Double)value).floatValue();
				 //break;
				case ACCX:  //break;
				case ACCY:  //break;
				case ACCZ:
					return (Float) value; //break;
				case xFFT1:
				case xFFT2:
				case xFFT3:
				case xFFT4:
				case yFFT1:
				case yFFT2:
				case yFFT3:
				case yFFT4:
				case zFFT1:
				case zFFT2:
				case zFFT3:
				case zFFT4:
					return ((Double) value).floatValue();
			    default: {
					return null;
				}
			}
		}
	}
	
	private static final String TAG = "PickerActivity";
    
    STREAMS[] values = STREAMS.enumValues();
    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
      
        ArrayAdapter<STREAMS> adapter = new ArrayAdapter<STREAMS>(this,
                      android.R.layout.simple_list_item_multiple_choice, values);
        
        setListAdapter(adapter); 
        final ListView lv = getListView();
        
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lv.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				SparseBooleanArray a = lv.getCheckedItemPositions();
                ArrayList<Integer> selected = new ArrayList<Integer>();
                int count = 0;
                for(int i = 0; i < values.length ; i++){
                    if (a.get(i)){
                    	Log.d(TAG,"stored: " + i);
                    	if(count++<ContextActivity.getMaxWidgets())//widget max size enforced here
                    		selected.add(i);
                    	else break;
                    }
                }
                Context_Service.selected = selected; 
			}
			
        	
        });                
        for(int i : Context_Service.selected){
        	lv.setItemChecked(i, true);	
        }
    }
    
    @Override
    public void onDestroy(){
    	super.onDestroy();
    	
    }
    
    @Override
    public void onResume() {
        super.onResume();
        
        
    }

    @Override
    public void onPause() {
        super.onPause();
    }    
    
}
