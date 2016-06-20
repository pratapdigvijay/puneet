package test.com.sapient;

import java.util.List;

import com.sapient.entity.Employee;
import com.sapient.entity.EmployeeRepository;

public class TestEmployeeOperations {
	
	public static void main(String[] args) {

		Employee employee = new Employee("Amit", 24534);
		EmployeeRepository test = new EmployeeRepository();
//		test.addEmployee(employee);
		/*Employee emp = test.findEmployee(1l);
		
		emp.setName("Priya");
		System.out.println(emp);*/

		/*Employee emp = new Employee("Ravi");
		emp.setId(2l);*/
		List<Employee> employees = test.findAllEmployees();
		System.out.println(employees);
		

	}

}
