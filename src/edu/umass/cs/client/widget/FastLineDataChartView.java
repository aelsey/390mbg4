package edu.umass.cs.client.widget;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.view.LineChartView;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import edu.umass.cs.client.IDataObservable;
import edu.umass.cs.client.PickerActivity.STREAMS;
//used for deviations, since they render sporadically due to ActivityFeatureExtractor
public class FastLineDataChartView extends LineDataChartView {

	protected static final Integer renderWindow = 1;
	protected static final Integer maxCurrentWindow = 3;
	
	public FastLineDataChartView(Context context, IDataObservable obs,
			STREAMS... streams) {
		super(context, obs, streams);
		// TODO Auto-generated constructor stub
	}
	
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
						currentCounter >= this.maxCurrentWindow ?
						currentCounter - this.maxCurrentWindow :
						0;
				Line currentLine = new Line().setColor(currentStream.StreamToColor()).setCubic(true).setPointRadius(1);
				LinkedList<PointValue> points2 = new LinkedList<PointValue>(
						(streamData.get(currentStream)
								.subList(windowBase, currentCounter)));
				currentLine.setValues(points2);
				newDataLines.add(currentLine);
			}
			data.setLines(newDataLines);
			currentChart.setLineChartData(data);
		} else {
			data = historicalChart.getLineChartData();
			Iterator<Line> lines = data.getLines().iterator();
			List<Line> newLines = new LinkedList<Line>();
			for(STREAMS currentStream: streamData.keySet()){
				int currentCounter = this.streamWindowCounter.get(currentStream);
				
				Line currentLine = lines.next();				
				
				List<PointValue> points = currentLine.getValues();
				windowBase = points.size();
				
				List<PointValue> streamValues = this.streamData.get(currentStream);
				if(windowBase >= currentCounter)
					return;
				
				List<PointValue> sub = streamValues.subList(windowBase,  currentCounter);
				List<PointValue> streamValuesSublist = new LinkedList<PointValue>(sub);

				points.addAll(streamValues.subList(windowBase, currentCounter));
				if(windowBase > LineDataChartView.maxHistory){
					currentLine.setValues(points.subList(DataChartView.maxCurrentWindow, currentCounter));
				}
				
				//newLines.add(currentLine);
			}
			//data.setLines(newLines);
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
