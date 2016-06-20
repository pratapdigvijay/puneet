package com.dtsc;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {


	public static void main(String args[]) {
	
		Employee emp = new Employee();
		emp.setName("Puneet");
		
		
		RegularEmployee regular = new RegularEmployee();
		regular.setName("Vivek");
		regular.setBonus(1000);
		regular.setSalary(10000);
		
		ContractEmployee contract = new ContractEmployee();
		contract.setName("Kamal");
		contract.setContractDuration(6);
		contract.setPayPerHour(1000.10f);

		 try{
		         factory = new AnnotationConfiguration().
		                   configure().
		                   //addPackage("com.xyz") //add package if used.
		                   addAnnotatedClass(Employee.class).addAnnotatedClass(RegularEmployee.class).addAnnotatedClass(ContractEmployee.class).
		                   buildSessionFactory();
//		    	  factory = new Configuration().configure().buildSessionFactory();
		      }catch (Throwable ex) { 
		         System.err.println("Failed to create sessionFactory object." + ex);
		         throw new ExceptionInInitializerError(ex); 
		      }
		 Session session = null;
		 Transaction tx = null;
		try{
			session = factory.openSession();
			tx = session.beginTransaction();
		session.save(emp);
		session.save(regular);
		session.save(contract);
		 tx.commit();
	}catch (HibernateException e) {
        if (tx!=null) tx.rollback();
        e.printStackTrace(); 
     }finally {
        session.close(); 
     }
		
	}
	
	private static SessionFactory factory; 

}
