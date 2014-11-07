package edu.umass.cs.client.widget;

import android.content.Context;
import edu.umass.cs.client.IDataObservable;
import edu.umass.cs.client.PickerActivity.STREAMS;
/*
 * 
 * override of PieDataChartView to allow for activities to be correctly graphed
 */
public class SynchronousPieDataChartView extends PieDataChartView {

	protected static final Integer renderWindow = 1;
	protected static final Integer maxCurrentWindow = 10;
	
	public SynchronousPieDataChartView(Context context, IDataObservable obs, STREAMS... streams) {
		super(context, obs, streams);
	}
	
	//basically the same as the underlying class, except cacheData is redefined to be used with activities
	//accelerometer values are implicitly synchronized, whereas with activities, to make them work with our
	//framework, we need to explicitly create a flag to determine which activity is active at each interval
	@Override
	public void cacheData(STREAMS lastStream, Object lastData) {
		int streamWindow = streamWindowCounter.get(lastStream) + 1;
		float lastValue = lastStream.parseValueForStream(lastData);
		float streamMovingSum = this.movingSums.get(lastStream) + lastValue;
		float streamTotalSum = this.totalSums.get(lastStream) + lastValue;
		
		for(STREAMS stream:streamData.keySet()){
			streamMovingSum = this.movingSums.get(stream);
			streamTotalSum = this.movingSums.get(stream);
			
			if(stream == lastStream){
				streamMovingSum += lastValue;
				streamTotalSum += lastValue;
				this.streamData.get(stream).add(lastValue);
			} else {
				this.streamData.get(stream).add(0F);
			}
			
			if(streamWindow>=SynchronousPieDataChartView.maxCurrentWindow){
				streamMovingSum -= streamData.get(stream).get(streamWindow - SynchronousPieDataChartView.maxCurrentWindow);
			}
			
			this.streamWindowCounter.put(stream, streamWindow);
			this.movingSums.put(stream, streamMovingSum);
			this.totalSums.put(stream, streamTotalSum);
		}
		
		if(streamWindow%renderWindow==0){
			updateCharts();
		}
	}
}
