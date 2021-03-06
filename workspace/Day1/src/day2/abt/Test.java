package day2.abt;

public class Test {
	
	public static void main(String[] args) {
		
		BiCycle mountainBiCycle = new MountainBiCycle(10);
		BiCycle roadBiCycle = new RoadBiCycle(12);
		
		
		
		
		BiCycle bicycles[] = {mountainBiCycle, roadBiCycle};
		
		for(BiCycle bycycle: bicycles){
			bycycle.speedUp();
			System.out.println(bycycle);
			
			bycycle.applyBrakes();
			System.out.println(bycycle);
		}
		
	}

}
