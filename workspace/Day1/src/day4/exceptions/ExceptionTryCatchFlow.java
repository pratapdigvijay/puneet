package day4.exceptions;

public class ExceptionTryCatchFlow {

	public static int m1(boolean param) {
		try {
			if(param)	
				throw new RuntimeException();
			return 1;
		} catch (Exception e) {
			return 2;
		} /*finally {
			return 3;
		}*/
	}

	public static void main(String[] args) {
		System.out.println(m1(true));
	}
}
