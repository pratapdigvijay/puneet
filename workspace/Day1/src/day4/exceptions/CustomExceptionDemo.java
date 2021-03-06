package day4.exceptions;

class MyCheckedException extends Exception{
	
	MyCheckedException(){
		
	}
	MyCheckedException(String message){
		super(message);
	}
	
}

class MyUnCheckedException extends RuntimeException{
	
	MyUnCheckedException(){
		
	}
	MyUnCheckedException(String message){
		super(message);
	}
	
}


public class CustomExceptionDemo {
	public static void main(String[] args) {
		
		MyUnCheckedException exception = new MyUnCheckedException();
		
		Exception composedException = new Exception("New Exception", exception);
		
		
		try {
			throw composedException;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
