package day2.problem;

public class Vehicle {

	int maxSpeed;
	Engine engine;
	
	public Vehicle(){}
	
	public Vehicle(int maxSpeed, Engine engine) {
		this.maxSpeed = maxSpeed;
		this.engine = engine;
	}

	public void start(){
		engine.sparkEngine();
		System.out.println("Starting Vehicle");
		System.out.println("Can go:" + this.maxSpeed);
	}
}
