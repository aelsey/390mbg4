package edu.umass.cs.client.widget;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import edu.umass.cs.client.ContextActivity;
import edu.umass.cs.client.Context_Service;
import edu.umass.cs.client.IDataObservable;
import edu.umass.cs.client.PickerActivity;
import lecho.lib.hellocharts.model.ArcValue;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.view.LineChartView;
import lecho.lib.hellocharts.view.PieChartView;

import edu.umass.cs.client.PickerActivity.STREAMS;
/*
 * 
 * This graph is used for rendering accel values and activity values
 */
public class PieDataChartView extends DataChartView<PieChartView, Float> {
	HashMap<STREAMS, Float> movingSums;
	HashMap<STREAMS, Float> totalSums;
	
	
	
	public PieDataChartView(Context context, IDataObservable obs, STREAMS... streams) {
		super(context, obs, streams);
		
		totalSums = new HashMap<STREAMS, Float>();
		movingSums = new HashMap<STREAMS, Float>();
		for(STREAMS stream: streams){
			movingSums.put(stream, 0F);
			totalSums.put(stream, 0F);
		}
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addChartsToView() {
		currentChart = new PieChartView(getContext());
		historicalChart = new PieChartView(getContext());
		List<ArcValue> arcs = new LinkedList<ArcValue>();
		for(STREAMS s: this.streamData.keySet()){
			ArcValue arc = new ArcValue(1, s.StreamToColor());
			arcs.add(arc);
		}
		currentChart.setPieChartData(new PieChartData(arcs));
		historicalChart.setPieChartData(new PieChartData(arcs));
		
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
	public void updateCharts() {

		List<ArcValue> arcs = new LinkedList<ArcValue>();
		PieChartData data;
		// TODO Auto-generated method stub
		if(isCurrent){
			data = currentChart.getPieChartData();
			data.setHasLabels(true);
			data.setHasLabelsOutside(true);
			for(STREAMS stream: this.streamData.keySet()){
				ArcValue arc = new ArcValue(movingSums.get(stream), stream.StreamToColor());
				arc.setArcSpacing(10);
				arc.setLabel(stream.toString().toCharArray());
				arcs.add(arc);
			}
			data.setValues(arcs);
			currentChart.setPieChartData(data);
		}
		else{
			data = historicalChart.getPieChartData();
			data.setHasLabels(true);
			data.setHasLabelsOutside(true);
			for(STREAMS stream: this.streamData.keySet()){
				ArcValue arc = new ArcValue(totalSums.get(stream), stream.StreamToColor());
				arc.setArcSpacing(10);
				//NO LABELS...window moves too much
				arc.setLabel(stream.toString().toCharArray());
				arcs.add(arc);
			}
			data.setValues(arcs);
			historicalChart.setPieChartData(data);
		}
	}

	@Override
	public void cacheData(STREAMS lastStream, Object lastData) {
		int streamWindow = streamWindowCounter.get(lastStream);
		float lastValue = lastStream.parseValueForStream(lastData);
		float streamMovingSum = this.movingSums.get(lastStream) + lastValue;
		float streamTotalSum = this.totalSums.get(lastStream) + lastValue;
		
		this.streamData.get(lastStream).add(lastValue);
		this.streamWindowCounter.put(lastStream, ++streamWindow);
		
		if(streamWindow>=DataChartView.maxCurrentWindow){
			streamMovingSum -= streamData.get(lastStream).get(streamWindow - DataChartView.maxCurrentWindow);
		}
		this.movingSums.put(lastStream, streamMovingSum);
		this.totalSums.put(lastStream, streamTotalSum);
		
		if(streamWindow%DataChartView.renderWindow==0){
			updateCharts();
		}
	}
}
