package day3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee12{
	int id;
	List<Address> addresses;
	
	public Employee12(int id, List<Address> addresses) {
		super();
		this.id = id;
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee12 [id=" + id + ", addresses=" + addresses + "]";
	}
	
	
}

public class NestedCollectionsDemo {

	public static void main(String[] args) {

		Address residentialAddress = new Address("Jangpura");
		Address officeAddress = new Address("Gurgoan");
		Address officeAddress2 = new Address("NFC");
		
		List<Address> addresses = new ArrayList<>();
		addresses.add(residentialAddress);
		addresses.add(officeAddress);
		
		Employee12 emp = new Employee12(123, addresses);
		
		addresses = new ArrayList<>();
		addresses.add(residentialAddress);
		addresses.add(officeAddress);
		addresses.add(officeAddress2);
		Employee12 emp1 = new Employee12(124, addresses);

		
		
		List<Employee12> employees = new ArrayList<>();
		employees.add(emp);
		employees.add(emp1);
		
		System.out.println(employees);
		
		for(Employee12 e : employees){
			List<Address> addressList = e.addresses;
			Collections.sort(addressList);
		}
		
		System.out.println(employees);
		
	}

}
