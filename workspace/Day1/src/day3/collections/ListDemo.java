package day3.collections;

import java.util.ArrayList;

import day2.Employee;


public class ListDemo {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add(new Object());
		list.add(new Employee(123, "Ravi", 34253));
		
		
//		System.out.println(list);
		
		for(int i=0;i<list.size();i++){
			Object obj = list.get(i);
			
			if(obj instanceof Employee){
				Employee emp = (Employee)obj;
				System.out.println(emp.getSalary());
			}
			
		}
	}

}
