
public class StringDemo {

	public static void main(String[] args) {
		
		String s = "Amit";

		String str = new String("Amit");
		String str2 = new String("Amit");
		
		String result = str.concat("123");
		
		System.out.println(str);
		System.out.println(result);
		
		if(str == str2){
			System.out.println("Same References");
		}
		

	}

}
