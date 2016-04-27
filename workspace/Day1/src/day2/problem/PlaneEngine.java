package day2.problem;

public class PlaneEngine extends Engine{
	boolean booster;
	
	public PlaneEngine(String make, boolean booster) {
		this.make = make;
		this.booster = booster;
	}
	
	public void sparkEngine(){
		System.out.println(this.make + " engine starting up with " + this.booster);
	}
}