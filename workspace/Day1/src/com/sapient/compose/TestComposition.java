package com.sapient.compose;

public class TestComposition {

	public static void main(String[] args) {
		Address address = new Address(101, "Jangpura", "ND","INDIA", 110014);
		System.out.println(address);
		
		Employee employee = new Employee(10123, "Ravi", address);
		System.out.println(employee);

	}

}
