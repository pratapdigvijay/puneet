package day4.exceptions;

import day2.Employee;

public class ExceptionsDemo {
	
	private static double result;

	public static void calculateLoan(int age, int salary){
		/*if(age<18){
			throw new RuntimeException("Not eligible");
		}*/
		
		try{
			result = salary/age;
		}
		catch(ArithmeticException ae){
			System.out.println("Please provide > 0 in age");
		}
		
		System.out.println(result);
			
	}
	
	public static void main(String[] args) {
		
		try {
			new Object().wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Employee emp = null;
		
		calculateLoan(23, 3532235);
		calculateLoan(0, 1);
		/*try {
			c
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		emp.getSalary();*/
	}

}


/*try{
	//Guarded Region
}
catch(Exception e){
	//Handling
}*/
