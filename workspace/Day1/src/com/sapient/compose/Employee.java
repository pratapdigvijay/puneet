package com.sapient.compose;

public class Employee {
	
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void m1(){
		int area =2;
		System.out.println(area);
	}
	
	/*@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}*/
	
	
	

}