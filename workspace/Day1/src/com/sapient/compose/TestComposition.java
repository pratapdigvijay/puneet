package com.sapient.compose;

public class TestComposition {

	public static void main(String[] args) {
		Address address = new Address(101, "Jangpura", "ND","INDIA", 110014);
//		System.out.println(address);
		
		Employee employee = new Employee(10123, "Ravi", address);
		Employee employee1 = new Employee(10123, "Ravi", address);
		Employee employee2 = new Employee(10123, "Ravi", address);
		
//		System.out.println(employee.salary);
		System.out.println(employee.getSalary());
		
		Employee employees[] = new Employee[3];
		employees[0] = employee;
		employees[1] = employee1;
		employees[2] = employee2;
		
		
		System.out.println("Before Incrementing");
		
		for(Employee emp: employees){
			System.out.println(emp);
		}
		
		Employee.incrementSalaries(employees);
		
		System.out.println("After Incrementing");
		for(Employee emp: employees){
			System.out.println(emp);
		}
		
		

	}

}
