package day2.problem;

public class Test {

	public static void main(String[] args) {
		Engine engine = new Engine("Ford");
		Vehicle vehicle = new Vehicle(300, engine);
		vehicle.start();

		PlaneEngine planeEngine = new PlaneEngine("Boeing", true);
		Plane plane = new Plane(300, planeEngine, 10000);
		plane.start();
		
		
		Vehicle vehicles[] = {vehicle, plane};
		
		for(Vehicle v : vehicles){
			v.start();
		}
		
		
	}

}
