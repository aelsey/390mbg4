package edu.umass.cs.client.widget;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import lecho.lib.hellocharts.model.ArcValue;
import lecho.lib.hellocharts.model.Column;
import lecho.lib.hellocharts.model.ColumnChartData;
import lecho.lib.hellocharts.model.ColumnValue;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.view.ColumnChartView;
import lecho.lib.hellocharts.view.PieChartView;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import edu.umass.cs.client.IDataObservable;
import edu.umass.cs.client.PickerActivity.STREAMS;

public class ColumnDataChartView extends DataChartView<ColumnChartView, Float> {
	//HashMap<STREAMS, Column> movingColumns;
	List<Column> movingColumns;
	HashMap<STREAMS, ColumnValue> movingColumnValues;
	//HashMap<STREAMS, Column> totalColumns;
	List<Column> totalColumns;
	HashMap<STREAMS, ColumnValue> totalColumnValues;
	STREAMS[][] groupings;
	
	public static final Integer maxCurrentWindow = 10;
	
	
	//this variable determines how often the graph updates.
	//when X amount of data gets stored for a particular stream, the graph redisplays itself
	public static final Integer renderWindow = 1;
	
	public ColumnDataChartView(Context context, IDataObservable obs, STREAMS... streams) {
		super(context, obs, streams);
		movingColumnValues = new HashMap<STREAMS, ColumnValue>();
		totalColumnValues = new HashMap<STREAMS, ColumnValue>();
		for(STREAMS stream: streams){
			ColumnValue cv = new ColumnValue(0F).setColor(stream.StreamToColor()).setLabel(stream.toString().toCharArray());
			movingColumnValues.put(stream, cv);
			
			cv = new ColumnValue(0F).setColor(stream.StreamToColor()).setLabel(stream.toString().toCharArray());
			totalColumnValues.put(stream, cv);
		}
		System.out.println("Exiting constructor");
	}
	
	public ColumnDataChartView(Context context, IDataObservable obs, STREAMS[][] groupings, STREAMS... streams) {
		//this(context, obs, streams);
		this(context, obs, streams);
		this.groupings = groupings;
		addChartsToView();
	}
	
	@Override
	public void addChartsToView() {
		if(groupings == null)
			return; //hack to hide base call
		
		
		
		this.movingColumns = new LinkedList<Column>();
		this.totalColumns = new LinkedList<Column>();
		for(STREAMS[] streamColumn: groupings){
			Column movingColumn = new Column();
			Column totalColumn = new Column();
			
			List<ColumnValue> movingValues = new LinkedList<ColumnValue>();
			List<ColumnValue> totalValues = new LinkedList<ColumnValue>();
			
			for(STREAMS stream: streamColumn){
				movingValues.add(movingColumnValues.get(stream));
				totalValues.add(totalColumnValues.get(stream));
			}
			movingColumn.setValues(movingValues);
			movingColumns.add(movingColumn);
			
			totalColumn.setValues(movingValues);
			totalColumns.add(totalColumn);
		}
		
		
		currentChart = new ColumnChartView(getContext());
		historicalChart = new ColumnChartView(getContext());
		
		ColumnChartData data = new ColumnChartData(movingColumns);
		data.setStacked(true);
		currentChart.setColumnChartData(data);
		
		data = new ColumnChartData(totalColumns);
		data.setStacked(true);
		historicalChart.setColumnChartData(new ColumnChartData(totalColumns));
		
		RelativeLayout.LayoutParams params = new LayoutParams(
			LayoutParams.WRAP_CONTENT,
			LayoutParams.MATCH_PARENT
		);
		params.addRule(ALIGN_PARENT_RIGHT);
		
		currentChart.setLayoutParams(params);
		historicalChart.setLayoutParams(params);
		
		currentChart.setOnClickListener(((DataChartView)this).listener);
		historicalChart.setOnClickListener(((DataChartView)this).listener);
		
		this.addView(currentChart);
	}

	@Override
	public void cacheData(STREAMS lastStream, Object lastData) {
		int streamWindow = streamWindowCounter.get(lastStream);
		float lastValue = lastStream.parseValueForStream(lastData);
		float streamMovingSum = this.movingColumnValues.get(lastStream).getValue() + lastValue;
		float streamTotalSum = this.totalColumnValues.get(lastStream).getValue() + lastValue;
		
		this.streamData.get(lastStream).add(lastValue);
		this.streamWindowCounter.put(lastStream, ++streamWindow);
		
		if(streamWindow>=DataChartView.maxCurrentWindow){
			streamMovingSum -= streamData.get(lastStream).get(streamWindow - DataChartView.maxCurrentWindow);
		}
		
		this.movingColumnValues.get(lastStream).setValue(streamMovingSum);
		this.totalColumnValues.get(lastStream).setValue(streamTotalSum);
		
		if(streamWindow%DataChartView.renderWindow==0){
			updateCharts();
		}
	}

	@Override
	public void updateCharts() {
		currentChart.setColumnChartData(currentChart.getChartData());
		historicalChart.setColumnChartData(historicalChart.getChartData());
	}

}
