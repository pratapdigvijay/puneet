package day2.problem;

public class Plane extends Vehicle{
	int maxAltitude;
	
	public Plane(int maxSpeed, Engine engine, int maxAltitude) {
		this.maxSpeed = maxSpeed;
		this.engine = engine;
		this.maxAltitude = maxAltitude;
	}
	
	public void start(){
		
		super.start();
		
		engine.sparkEngine();
		System.out.println("Starting Plane");
		System.out.println("Can go:" + this.maxSpeed);
		System.out.println("Can fly:" + this.maxAltitude);
	}
}
