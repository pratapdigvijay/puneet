import java.util.List;


public class TestEmployee {

	public static void main(String[] args) {

		Employee emp  = new Employee(1, "Ravi" , 23033);
		
		EmployeeDAO dao = new EmployeeDAO();
		
		List<Employee> employees = dao.fetchEmployeesBySalary(1000);
		System.out.println(employees);

	}

}
