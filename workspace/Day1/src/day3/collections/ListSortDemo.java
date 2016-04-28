package day3.collections;

import java.util.ArrayList;
import java.util.Comparator;


class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.salary.compareTo(o2.salary);
	}
	
}

class Employee implements Comparable<Employee>{
	
	Integer id;
	String name;
	String lname;
	Double salary;
	
	public Employee(){
		super();
	}
	
	

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
*/


	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}*/



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
	public int compareTo(Employee emp) {
		if(this.name.equals(emp.name)){
			return this.lname.compareTo(emp.lname);
		}
		return this.name.compareTo(emp.name);
	}



	/*@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		if(this.name.equals(emp.name)){
			return this.lname.compareTo(emp.lname);
		}
		return this.name.compareTo(emp.name);
		
		
	}
*/
	

}


public class ListSortDemo {
	
	
	
	static ArrayList<Employee> list = new ArrayList<Employee>(20);
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(12,"Ravi" , "Sharma",33344);
		Employee emp2 = new Employee(1,"Ravi" ,"Aneja",35444);
		
		System.out.println(emp1.compareTo(emp2));
		
		Employee emp3 = new Employee(123,"Amit" ,"Kukreja",34544);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		Employee searchEmployee = emp1;//new Employee(1,"Ravi" ,"Aneja",35444);
		boolean searchResult = list.contains(searchEmployee);
		System.out.println(searchResult);
		
		/*System.out.println(list);
		
		Collections.sort(list);	
		System.out.println(list);
		
		Collections.sort(list, new SalaryComparator());
		
		System.out.println(list);*/
	}

}
