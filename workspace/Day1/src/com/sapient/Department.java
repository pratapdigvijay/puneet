package com.sapient;

public class Department {
	String deptNumber;
	Employee emp;

	public Department(String deptNumber, Employee emp) {
		super();
		this.deptNumber = deptNumber;
		this.emp = emp;
	}
	
	public void m1(){
		System.out.println(emp.empName);
	}

	public void addEmployeeToDepartment() {
		switch (deptNumber) {

		case "1":
			System.out.println(emp.empName + " : " + emp.age
					+ " added to Accounts Department");
			break;
		case "2":
			System.out.println(emp.empName + " : " + emp.age
					+ " added to Finance Department");
			break;
		/*
		 * case 3: System.out.println(empName +
		 * " added to Marketing Department"); break; case 4:
		 * System.out.println(empName + " added to Technology Department");
		 * break; case 5: System.out.println(empName +
		 * " added to Networking Department"); break;
		 */
		default:
			System.out.println("No such department available");

		}

	}
}
