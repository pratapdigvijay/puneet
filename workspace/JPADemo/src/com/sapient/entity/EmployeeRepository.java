package com.sapient.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EmployeeRepository {
	
	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("myPersistanceUnit");
	
	
	public void addEmployee(Employee employee){
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(employee);
		transaction.commit();
		em.close();
	}
	
	public Employee deleteEmployee(long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();		
		Employee emp = em.find(Employee.class, id);	
	
		em.remove(emp);
		transaction.commit();
		em.close();
		return emp;
	}
	
	public Employee findEmployee(long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();		
		Employee emp = em.find(Employee.class, id);	
		transaction.commit();
		em.close();
		return emp;
	}
	public List<Employee> findAllEmployees(){
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();		

		TypedQuery<Employee> query = em.createQuery("from Employee e where e.salary < :salary",Employee.class);
		double salary = 30000.0;
		query.setParameter("salary", salary);
		List<Employee> employees = query.getResultList();
		
		
		transaction.commit();
		em.close();
		return employees;
		
		
	}
	
	public Employee updateEmployee(Employee updatedEmp){
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();		

		Employee emp = em.merge(updatedEmp);
		transaction.commit();
		em.close();
		return emp;
	}

	
}
