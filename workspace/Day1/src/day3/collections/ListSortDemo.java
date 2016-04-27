package day3.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable{
	
	Integer id;
	String name;
	String lname;
	double salary;
	
	public Employee(){
		super();
	}
	
	

	public Employee(Integer id, String name, String lname, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lname=" + lname
				+ ", salary=" + salary + "]";
	}



	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		if(this.name.equals(emp.name)){
			return this.lname.compareTo(emp.lname);
		}
		return this.name.compareTo(emp.name);
		
		
	}

	

}


public class ListSortDemo {
	
	
	
	static ArrayList list = new ArrayList();
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(12,"Ravi" , "Sharma",33344);
		Employee emp2 = new Employee(1,"Ravi" ,"Aneja",35444);
		
		System.out.println(emp1.compareTo(emp2));
		
		Employee emp3 = new Employee(123,"Amit" ,"Kukreja",34544);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		
		System.out.println(list);
	}

}
