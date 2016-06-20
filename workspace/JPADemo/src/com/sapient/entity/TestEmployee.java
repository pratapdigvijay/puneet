package com.sapient.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestEmployee {
	
	

	public static void main(String[] args) {

		Employee employee = new Employee("Priya");

		// HIbernate Code

		// Step 1. Create a SessionFactory and in JPA we call it
		// EntityManagerFactory

		// SessionFactory sessionFactory = new
		// Configuration().configure().buildSessionFactory();
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("myPersistanceUnit");

		// Step 2. Get a session from sessionFactory and we call it
		// EntityManager

		// Session session = sessionFactory.openSession();
		EntityManager em = emf.createEntityManager();

		// Transaction transaction = session.beginTransaction();
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		em.persist(employee);

		transaction.commit();
		em.close();

	}
}
