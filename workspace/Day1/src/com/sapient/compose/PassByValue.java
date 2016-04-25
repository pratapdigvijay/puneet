package com.sapient.compose;



class Number{
	int x;
	public Number(int x){
		this.x = x;
	}
}

public class PassByValue {

	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3};
		int arr1 [] = new int[3];
		
		for(int i=0;i<arr1.length;i++){
			arr1[i] = i+1;
		}
		
		for(int element: arr1){
			System.out.println(element);
		}
		
		
		
		
		
		
		Number number = new Number(1);
		
		/*System.out.println("Original x: " + number.x);
		changeX(number);
		System.out.println("After method call x:" + number.x);*/
		
		/*int x = 1;
		System.out.println("Original x: " + x);
		changeX(x);
		System.out.println("After method call x:" + x);*/

	}
	
	
	public static void changeX(int x){
		x = x + 1;
		System.out.println("In ChangeX " + x);
	}
	
	public static void changeX(Number number){
		number.x = number.x + 1;
		System.out.println("In ChangeX " + number.x);
	}

}
