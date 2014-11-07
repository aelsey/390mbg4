package edu.umass.cs.client.widget;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.widget.RelativeLayout;
import edu.umass.cs.client.ContextActivity;
import edu.umass.cs.client.IDataObservable;
import edu.umass.cs.client.PickerActivity;
import edu.umass.cs.client.PickerActivity.STREAMS;
import edu.umass.cs.client.Context_Service;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.LineChartView;
import lecho.lib.hellocharts.view.PieChartView;

import edu.umass.cs.client.PickerActivity.STREAMS;
/*
 * 
 * This class is used for rendering accel value streams
 */
public class LineDataChartView extends DataChartView<LineChartView, PointValue> {

	//have to truncate the historical data for performance reasons
	//frequently re-rendering data over too long of a time span is too expensive
	public static final Integer maxHistory = DataChartView.maxCurrentWindow * 15;
	
	public LineDataChartView(Context context, IDataObservable obs, STREAMS... streams) {
		super(context, obs, streams);
	}

	//init graphs...provides empty widgets
	@Override
	public void addChartsToView() {
		LinkedList<PointValue> emptyDataList;
		
		currentChart = new LineChartView(getContext());
		historicalChart = new LineChartView(getContext());
		List<Line> lines = new LinkedList<Line>();
		for(STREAMS s: this.streamData.keySet()){
			emptyDataList = new LinkedList<PointValue>();
			Line line = new Line(emptyDataList).setColor(s.StreamToColor()).setCubic(true).setPointRadius(1);
			lines.add(line);
		}
		currentChart.setLineChartData(new LineChartData(lines));
		historicalChart.setLineChartData(new LineChartData(lines));
		
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
	
	//this code could use some work.
	@SuppressWarnings("unused")
	@Override
	public void updateCharts() {
		//UPDATE HISTORICAL CHART DATA EVERY WINDOW
		LineChartData data = new LineChartData();
		List<Line> newDataLines = new LinkedList<Line>();
		Integer windowBase;
		
		//ONLY UPDATE THE CURRENT WINDOW IF IT IS ACTIVE
		if(this.isCurrent){
			data = currentChart.getLineChartData();
			
			Object[] streamArray = streamData.keySet().toArray();
			for(int i = 0; i<streamArray.length; i++){
				STREAMS currentStream = (STREAMS) streamArray[i];
				int currentCounter = this.streamWindowCounter.get(currentStream);
				windowBase = 
						currentCounter >= DataChartView.maxCurrentWindow ?
						currentCounter - DataChartView.maxCurrentWindow :
						0;
				Line newLine = new Line().setColor(currentStream.StreamToColor()).setCubic(true).setPointRadius(1);
				LinkedList<PointValue> points2 = new LinkedList<PointValue>(
						(streamData.get(currentStream)
								.subList(windowBase, currentCounter)));
				newLine.setValues(points2);
				newDataLines.add(newLine);
			}
			data.setLines(newDataLines);
			currentChart.setLineChartData(data);
		} else {
			data = historicalChart.getLineChartData();
			
			//assumes they're correctly ordered
			Iterator<Line> lines = data.getLines().iterator();
			
			List<Line> newLines = new LinkedList<Line>();
			for(STREAMS currentStream: streamData.keySet()){
				int currentCounter = this.streamWindowCounter.get(currentStream);
				
				Line currentLine = lines.next();				
				Line newLine = new Line().setColor(currentStream.StreamToColor()).setCubic(true).setPointRadius(1);
				
				windowBase = currentCounter >= this.maxHistory ?
								currentCounter - this.maxHistory :
									0;
				
				List<PointValue> streamValues = this.streamData.get(currentStream);
				
				try{
					currentLine.getValues().subList(0, currentCounter);
					return;
				} 
				catch(Exception e){
					
				}
				
				List<PointValue> sub = streamValues.subList(windowBase,  currentCounter);
				List<PointValue> streamValuesSublist = new LinkedList<PointValue>(sub);

				
				newLine.setValues(streamValuesSublist);
				newLines.add(newLine);
			}
			data.setLines(newLines);
			historicalChart.setLineChartData(data);
		}
	}
	
	@Override
	public void cacheData(STREAMS lastStream, Object lastData) {
		int streamWindow = this.streamWindowCounter.get(lastStream);
		this.streamData.get(lastStream).add(new PointValue(streamWindow, lastStream.parseValueForStream(lastData)));
		this.streamWindowCounter.put(lastStream, ++streamWindow);
		if(streamWindow%this.renderWindow==0 && isCurrent){
			updateCharts();
		} else if (streamWindow%this.maxCurrentWindow==0){
			updateCharts();
		}
	}
}
