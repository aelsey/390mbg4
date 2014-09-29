package edu.umass.cs.client;
import java.util.Queue;

public class AccelReadingCache 
{
	private static final long calibrationTime = 10000;
	private long startTime;
	
	private int stepCount;
	
	//this is kind of a lower bound, it's not dynamic though...more like a noise filter
	private static final double minimumStepThreshold = .8;
	//this is used to provide a weight to the time between steps, 
	//the standard deviation between steps,
	//and threshold, which is (max + min)/2
	private static final double exponentialWeight = .1;
	
	private static final int size = 1000;
	//this isn't really needed explicitly
	private double[] accelMagnitude;
	private int index = 0;
	
	private long lastStep;
	private long weightedStepPeriod;
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
	
	//updates max/min if the vector changes direction and re-positions 
	//the threshold
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
	//will detect a step during calibration period and post calibration period
	//only post calibration period will update the step counter
	public boolean detectSteps(double mag, long now){
		boolean updateStepInfo = false;
		//set to true if adjustStep needs to get called
		
		//if the magnitude has gone below the threshold
		//this happens once per step
		//also, if the magnitude is greater than an arbitrary minimum step
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
	
	//updates the metadata collected about a step
	//step deviation: standard deviation of a step from it's expected period
	//since the period is dynamically weighted, the deviation is too
	
	//step period: expected time between steps, dynamically weighted
	public void adjustStep(long now){
		//this just means to weight data collected during the calibration period more heavily
		double factor = (isCalibrating(now) ? 2.5 : 1.0) * AccelReadingCache.exponentialWeight;

		weightedStepDeviation = 
				(long) Math.sqrt(
						Math.pow(now - this.lastStep - this.weightedStepPeriod, 2) * factor +
						Math.pow(this.weightedStepDeviation, 2) * (1 - factor)
				);
		
		this.weightedStepPeriod = 
				(long) (((now - lastStep) * factor) +
				(this.weightedStepPeriod * (1 - factor)));

		this.lastStep = now;
	}
	
	//used to update activity view
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
