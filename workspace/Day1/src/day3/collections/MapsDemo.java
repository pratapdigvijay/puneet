package day3.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo {
	
	public static void main(String[] args) {
		Map<Integer, Employee> employeeMap = new HashMap<>();
		
		Employee emp1 = new Employee(123,"Ravi" , "Sharma",33344);
		Employee emp2 = new Employee(1,"Ravi" ,"Aneja",35444);
		
		
		// Putting entries to Map
		employeeMap.put(123, emp1);
		employeeMap.put(1, emp1);
		employeeMap.put(4, emp1);
		employeeMap.put(1, emp2);
		
		System.out.println(employeeMap);
		
		//Finding the key set in map
		Set<Integer> keys =employeeMap.keySet();
		System.out.println(keys);
		
		//Picking up values using keys
		System.out.println(employeeMap.get(123));
		
		//Pick up values using keySet
		for(Integer key: keys){
			System.out.println(employeeMap.get(key));
		}
		
	}

}
