package day2.problem;

public class Engine {
	
	public Engine(){
		
	}
	
	public Engine(String make) {
		super();
		this.make = make;
	}
	String make;
	public void sparkEngine(){
		System.out.println(this.make + " engine starting up");
	}
	
	
}
