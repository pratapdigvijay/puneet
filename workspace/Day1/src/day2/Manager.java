package day2;

public class Manager extends Employee {
	
	public Manager(){
		super();
	}
	


	boolean approveleaves;

	public Manager(int id, String name, double salary, boolean approveleaves) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.approveleaves = approveleaves;
	}

	@Override
	public String toString() {
		return "Manager [approveleaves=" + approveleaves + ", id=" + id
				+ ", name=" + name + ", salary=" + salary + "]";
	}



}
