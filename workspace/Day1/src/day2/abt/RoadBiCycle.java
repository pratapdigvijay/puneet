package day2.abt;

public class RoadBiCycle extends AbstractBiCycle {

	int speed;
	
	RoadBiCycle(int speed){
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return "RoadBiCycle [speed=" + speed + "]";
	}

	@Override
	public void speedUp() {
		speed = speed + 2;

	}

}
