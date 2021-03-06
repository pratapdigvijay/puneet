package com.sapient.compose;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private Address address;
	
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		if(salary>0)
			return salary;
		else
			return -1;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		if(salary<=0){
			throw new RuntimeException("How d heck can salary be zero!!");
		}
		this.salary = salary;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

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
	
	public static void incrementSalaries(Employee[] employees){
		for(Employee employee: employees){
			employee.salary = employee.salary + 24024;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}
	
	
	
	

}
