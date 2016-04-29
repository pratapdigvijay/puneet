import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;


public class ConnectDBDemo {
	
	
	
	
	public List<Employee> getEmployeeBySalary(double salary){
		
		//JDBC
		PreparedStatement stmt 
		
		"Select * from Employee where salary > ?"
		
		stmt.setDouble(1, salary);
	}

	public static void main(String[] args) {
		try {
			/*For Oracle Use
			Class.forName("oracle.jdbc.driver.OracleDriver"); */
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Load the Driver...");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sapientdemodb","root","root");
				/*For Oracle USe
				"jdbc:oracle:thin:@localhost:1521:xe","system","oracle"*/
				
				System.out.println("Connection Created...");
				
				Statement stmt=con.createStatement();  
				stmt.executeUpdate("insert into employee values(1,'Ravi',20000)");
				System.out.println("Inserting to DB...");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
