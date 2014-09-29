package edu.umass.cs.client;
import java.util.Queue;

public class AccelReadingCache 
{
	private static final long calibrationTime = 10000;
	private long startTime;
	
	private int stepCount;
	
	private static final double minimumStepThreshold = .8;
	private static final double exponentialWeight = .1;
	
	private static final int size = 1000;
	private double[] accelMagnitude;
	private int index = 0;
	
	private long lastStep;
	private long weightedStepPeriod;
	private long weightedStepPeriodA[];
	private long weightedStepDeviationA[];
	private int aIndex;
	private int bIndex;
	private long weightedStepDeviation;
	private double weightedThreshold;
	private double localMin;
	private double humpMagnitude;
	private boolean increasing;
	
	public AccelReadingCache()
	{
		this(size);
	}
	
	public AccelReadingCache(int size)
	{
		this.startTime = this.lastStep = System.currentTimeMillis();
		this.accelMagnitude = new double[size];
	}
	
	public AccelReadingCache updateCache(double x, double y, double z){
		double mag = Math.sqrt(x*x + y*y + z*z);
		long now = System.currentTimeMillis();
		
		checkPeaks(mag);
		
		if(detectSteps(mag, now))
			adjustStep(now);
		
		return this;
	}
	
	public void checkPeaks(double mag){
		if(increasing && mag <= accelMagnitude[index]){
			this.humpMagnitude = accelMagnitude[index] - localMin;
			this.weightedThreshold = 
					(this.localMin + this.humpMagnitude) * AccelReadingCache.exponentialWeight 
					 + weightedThreshold * (1 - AccelReadingCache.exponentialWeight);
			this.increasing = false;
		} else if(!increasing && mag >= accelMagnitude[index]){
			this.localMin = accelMagnitude[index];
			this.increasing = true;
		}
	}
	
	public boolean detectSteps(double mag, long now){
		boolean updateStepInfo = false;
		
		if(accelMagnitude[index] >= weightedThreshold && 
				mag <= weightedThreshold &&
				mag > AccelReadingCache.minimumStepThreshold &&
				this.humpMagnitude > AccelReadingCache.minimumStepThreshold)
		{
			if(!isCalibrating(now) &&
			   this.lastStep + this.weightedStepPeriod - this.weightedStepDeviation * 1.2 <= now)
			{
				updateStepInfo = true;
				this.stepCount++;
			}
			else if(isCalibrating(now))
			{
				updateStepInfo = true;
			}
		}
		
		accelMagnitude[(index = (index + 1) % accelMagnitude.length)] = mag;
		
		return updateStepInfo;
	}
	
	public void adjustStep(long now){
		double factor = (isCalibrating(now) ? 2.5 : 1.0) * AccelReadingCache.exponentialWeight;
		if(this.weightedStepPeriodA == null){
			weightedStepPeriodA = new long[1000];
			weightedStepDeviationA = new long[1000];
		}
		
		weightedStepDeviation = 
				(long) Math.sqrt(
						Math.pow(now - this.lastStep - this.weightedStepPeriod, 2) * factor +
						Math.pow(this.weightedStepDeviation, 2) * (1 - factor)
				);
		long w = now - lastStep;
		long p = (long) (w * factor);
		long d = (long) ((long) (this.weightedStepPeriod) * (1 - factor));
		long c = p + d;
		this.weightedStepPeriod = 
				(long) (((now - lastStep) * factor) +
				(this.weightedStepPeriod * (1 - factor)));

		weightedStepDeviationA[bIndex++] = now - this.lastStep - weightedStepPeriod;
		this.lastStep = now;
		weightedStepPeriodA[aIndex++] = weightedStepPeriod;
	}
	
	public String toString(){
		long now = System.currentTimeMillis();
		return isCalibrating(System.currentTimeMillis()) ? 
					"Calibrating for " + calibrationTime(now) + " secs.\n Please walk!" :
			   isStopped(now) ? 
					"Stopped" :
				    "Walking";
				  
			
	}
	
	public boolean isStopped(long now){
		return this.lastStep + 3000 <= now;
	}
	
	public double calibrationTime(long now){
		return isCalibrating(now) ? (this.startTime + AccelReadingCache.calibrationTime - now)/1000.0 : 0.0;
	}
	
	public boolean isCalibrating(long now){
		return now <= this.startTime + AccelReadingCache.calibrationTime;
	}
	
	public int getStepCount(){
		return stepCount;
	}
}
