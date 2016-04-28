package day4.exceptions;

public class ExceptionHierarchyDemo {
	
	public static void m3() {
		throw new RuntimeException("Inputs supplied not valid");
	}
	public static void m2() {
		m3();
	}
	
	public static void m1() {
		m2();
	}
	
	public static void main(String[] args)  {
		
		
		try{
			m1();
		}
		catch(RuntimeException re){
			System.out.println("Caught in main.. will do some handling");
			re.printStackTrace();
		}
		catch(Exception re){
			System.out.println("Caught in main.. will do some handling");
			re.printStackTrace();
		}
		
		
		
		System.out.println("Program ends here--");
		
	}

}
