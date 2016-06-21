package test.com.sapient;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sapient.entity.Address;
import com.sapient.entity.Person;

public class TestEmployeeOperations {
	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("myPersistanceUnit");

	public static void main(String[] args) {

		List<Address> addresses = new ArrayList<>();
		Person person = new Person("Ravi", addresses);
		Address add1 = new Address("GK");
		add1.setPerson(person);
		
		Address add2 = new Address("Rohini");
		add2.setPerson(person);

		
		addresses.add(add1);
		addresses.add(add2);

		

		TestEmployeeOperations test = new TestEmployeeOperations();
//		test.addPerson(person);
		
//		Person p  = test.findPerson(1);
		
		test.addAddress(add1);
		
	}
	
	public void addAddress(Address add) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(add);
		transaction.commit();
		em.close();

	}

	public void addPerson(Person person) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(person);
		transaction.commit();
		em.close();

	}
	public Person findPerson(int id) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Person p = em.find(Person.class, id);
		
		System.out.println(p.getName());
		System.out.println(p.getAddresses());
		
		transaction.commit();
		em.close();
		
		
		
		return p;

	}

}
