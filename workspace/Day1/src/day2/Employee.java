package day2;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee(){
		super();
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	/*public double incrementSalary(){
		return this.salary = this.salary + (this.salary * .1);
	}*/


	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

	

}
