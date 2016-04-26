package day2;

public class TestIncrementSalaries {
	public static void main(String[] args) {
		
		Employee employee = new Employee(123,"Ravi", 20000.00);
		
		System.out.println(employee);
		
		Utility.incrementSalary(employee);
	
		System.out.println(employee);
		
		
		
		Manager manager = new Manager(123,"Ravi", 30000.00, true);
		
		System.out.println(manager);
		
		Utility.incrementSalary(manager);
//		manager.incrementSalary();
		System.out.println(manager);
	}

}
