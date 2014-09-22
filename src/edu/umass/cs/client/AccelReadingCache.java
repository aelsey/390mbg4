package edu.umass.cs.client;
import java.util.Queue;

public class AccelReadingCache 
{
	private static final int defaultSize = 200;
	private static final int calibration = defaultSize / 2;
	private static final double magnitudeExponential = 10.0/defaultSize;
	private static final double magnitudeThreshold = 1;//lower than this is probably walking
	private static final double stepPeriodMillis = 300;
	
	private int stepCount;
	private double lastStep;
	private int count;
	
	private axis dominant;
	private axis x,
				 y,
				 z;
	
	private double[] lVec;
	
	private class axis{
		double[] values = new double[defaultSize];
		int index;
		boolean increasing,
				thresholdCrossed;
		double min,
			   magnitude,
			   threshold;
		
		boolean detectStep(double value){
			if(increasing && value <= values[index]){
				threshold = 
						(values[index] + min)/2 * AccelReadingCache.magnitudeExponential 
						 + threshold * (1 - AccelReadingCache.magnitudeExponential);
				magnitude = values[index] - min;
				increasing = false;
				return false;
			} else if(!increasing && value >= values[index]){
				min = values[index];
				increasing = true;
			}
			return thresholdCrossed = !increasing & values[index] > threshold & (values[incrementIndex()] = value) < threshold;
		}
		
		int incrementIndex(){
			return index = (index + 1) % defaultSize;
		}
	}
	
	public AccelReadingCache()
	{
		this(defaultSize);
	}
	
	public AccelReadingCache(int size)
	{
		x = new axis();
		y = new axis();
		z = new axis();
		
		lVec = new double[defaultSize];
	}
	
	public AccelReadingCache updateCache(double x, double y, double z){
		this.dominant = (this.x.magnitude > this.y.magnitude ? this.x : this.y);
		this.dominant = this.dominant.magnitude > this.z.magnitude ? this.dominant : this.z;
		
		this.x.detectStep(x);
		this.y.detectStep(y);
		this.z.detectStep(z);
		
		if(count++ > calibration && this.dominant.thresholdCrossed && this.dominant.magnitude > magnitudeThreshold && this.lastStep + stepPeriodMillis <= System.currentTimeMillis()){
			stepCount++;
			lastStep = System.currentTimeMillis();
		}
		return this;
	}
	
	public int getStepCount(){
		return stepCount;
	}
}
