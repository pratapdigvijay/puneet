import com.sapient.Department;
import com.sapient.Employee;


public class Test {
	
public static void main(String[] args) {

	Employee emp = new Employee("Ravi", 34);
	
	System.out.println(emp);
	
	Department department = new Department("2", emp);
	
	department.addEmployeeToDepartment();
	department.m1();
		
		/*Employee emp1 = new Employee("1", "Ravi");
		emp.deptNumber = "1";
		emp.empName = "Ravi";
		
		emp1.addEmployeeToDepartment();
		System.out.println(emp1.toString());
		
		
		Employee emp2 = new Employee("23", "Priya");
		emp2.addEmployeeToDepartment();
		System.out.println(emp2);
*/
	}
	
}
