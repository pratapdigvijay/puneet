package com.sapient.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

	public static void main(String[] args) {


		Employee employee = new Employee("Priya");
		
		// HIbernate Code 
		
//		Step 1. Create a SessionFactory
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
//		Step 2. Get a session from sessionFactory
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		stransaction.begin();
		
		session.saveOrUpdate(employee);
		
		
		transaction.commit();
		session.close();
		

	}

}
