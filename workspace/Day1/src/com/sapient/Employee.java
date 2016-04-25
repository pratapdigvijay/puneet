package com.sapient;
public class Employee {
	
	 String empName;
	 int age;
	
	
	 public Employee(String empName, int age) {
			super();
			this.empName = empName;
			this.age = age;
		}

	

	@Override
	public String toString() {
		return "Employee [empName=" + empName + "]";
	}

	
	

}
