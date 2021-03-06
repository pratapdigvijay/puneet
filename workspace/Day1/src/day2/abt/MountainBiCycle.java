package day2.abt;

public class MountainBiCycle extends AbstractBiCycle {

	int speed;
	
	MountainBiCycle(int speed){
		this.speed = speed;
	}
	

	@Override
	public void speedUp() {
		speed++;
		
	}

	@Override
	public String toString() {
		return "MountainBiCycle [speed=" + speed + "]";
	}

}
