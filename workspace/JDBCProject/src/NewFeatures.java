
import static test.Utility.log;
import static test.Utility.ELIGIBILITY_AGE;
public class NewFeatures {

	public static void main(String[] args) {
		log("" + ELIGIBILITY_AGE);
		
		System.out.println(add(6));

	}
	
	
	public static int add(int ...x){
		int total = 0;
		for(int value : x){
			total+=value;
		}
		return total;
	}
	/*public static int add(int x, int y, int z){
		return x + y + z;
	}*/

}
