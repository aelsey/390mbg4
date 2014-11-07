package edu.umass.cs.client.widget;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


import lecho.lib.hellocharts.view.AbstractChartView;
import lecho.lib.hellocharts.view.LineChartView;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import edu.umass.cs.client.ContextActivity;
import edu.umass.cs.client.PickerActivity;
import edu.umass.cs.client.PickerActivity.STREAMS;
import edu.umass.cs.client.Context_Service;
import edu.umass.cs.client.IDataObservable;
import edu.umass.cs.client.IDataObserverCache;

import edu.umass.cs.client.PickerActivity.STREAMS;
//base class for all graphs
public abstract class DataChartView<T extends AbstractChartView, S> extends RelativeLayout implements IDataObserverCache{
	//essentially tracks the Y axis for each stream
	protected Map<STREAMS, LinkedList<S>> streamData;
	//essentially tracks the X axis for each stream
	protected Map<STREAMS, Integer> streamWindowCounter;
	
	//
	public static final Integer maxCurrentWindow = 100;
	
	
	//this variable determines how often the graph updates.
	//when X amount of data gets stored for a particular stream, the graph redisplays itself
	public static final Integer renderWindow = 5;
	
	//this textview just determines whether the currently displayed graph is active or historical
	protected TextView chartDescription;
	
	protected boolean isCurrent; //this determines whether or not current or historical is being displayed
	
	//T is determined by the subclass - it's the type of graph being used
	protected T historicalChart;
	protected T currentChart;
	
	//it was tough getting this to work properly
	protected OnClickListener listener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			toggleCharts();
		}
		
	};
	
	@SuppressLint("NewApi")
	@SuppressWarnings("deprecation")
	public DataChartView(Context context) {
		super(context);
		RelativeLayout.LayoutParams params = new LayoutParams(
				LayoutParams.MATCH_PARENT,
				LayoutParams.WRAP_CONTENT
		);
		setBackgroundColor(Color.WHITE);
		//this.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
		//this.setBackgroundTintMode(Mode.DARKEN);
		//Drawable background = getBackground();    
		Drawable background = getResources().getDrawable(R.drawable.screen_background_dark_transparent);
		//Drawable border = getResources().getDrawable(R.drawable.)
		Drawable[] drawableLayers = { background };
		LayerDrawable ld = new LayerDrawable(drawableLayers);
		setBackgroundDrawable(ld);
		setLayoutParams(params);
		setClickable(true);
		setOnClickListener(listener);

		addToggleToLayout(context);
	}
	
	public DataChartView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	public DataChartView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	
	public DataChartView(Context context, IDataObservable obs, STREAMS... streams){
		this(context);

		this.streamData = new HashMap<STREAMS, LinkedList<S>>();
		this.streamWindowCounter = new HashMap<STREAMS, Integer>();
		this.isCurrent = true;
		for(STREAMS stream: streams){
			this.streamData.put(stream, new LinkedList<S>());
			this.streamWindowCounter.put(stream, 0);
		}
		obs.register(this, streams);
		addChartsToView();
	}

	//================================================================================
    // Implementation of IDataObserverCache
    //================================================================================

	@Override
	public void receive(STREAMS stream, Object data) {
		if(this.streamData.keySet().contains(stream)){
			cacheData(stream, data);
		}
		else {
			((IDataObservable)this.getContext()).detach(this, stream);
		}
	}

	@Override
	public List<STREAMS> getStreams() {
		List<STREAMS> retVal = new LinkedList<STREAMS>();
		retVal.addAll(streamData.keySet());
		return retVal;
	}

	@Override
	public List<STREAMS> addStream(STREAMS stream) {
		Set<STREAMS> streams = this.streamData.keySet();
		if(!streamData.keySet().contains(stream))
			streamData.put(stream, new LinkedList<S>());	
		return getStreams();
	}

	@Override
	public List<STREAMS> removeStream(STREAMS stream) {
		if(streamData.keySet().contains(stream))
			streamData.remove(stream);
		return getStreams();
	}
	
	
	//this name is a misnomer..
	//simply adds the text field to the layout, rather than a toggle button
	public void addToggleToLayout(Context ct){
		this.chartDescription = new TextView(ct);
		this.chartDescription.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);
		this.chartDescription.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 15);
		this.chartDescription.setText("Current");
		this.chartDescription.setLayoutParams(new LayoutParams(
			LayoutParams.WRAP_CONTENT,
			LayoutParams.WRAP_CONTENT
		));
		((RelativeLayout.LayoutParams)this.chartDescription.getLayoutParams()).addRule(ALIGN_PARENT_LEFT);
		addView(this.chartDescription);
	}
	
	public void toggleCharts(){
		removeAllViews();
		if(isCurrent){//the current chart is brought to the front
			this.chartDescription.setText("Historical");
			addView(chartDescription);
			addView(historicalChart);
		} else {
			this.chartDescription.setText("Current");
			addView(chartDescription);
			addView(currentChart);
		} isCurrent = ! isCurrent;
	}
	
	//implemented in subclasses
	public abstract void addChartsToView();
	public abstract void updateCharts();

}
