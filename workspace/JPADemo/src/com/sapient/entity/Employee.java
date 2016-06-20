package com.sapient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="empjpa")

@NamedQueries({
    @NamedQuery(name="Employee.findAll",
                query="SELECT e FROM Employee e"),
    @NamedQuery(name="Employee.findBySalaryGr",
                query="SELECT e FROM Employee c WHERE c.salary >= :salary"),
}) 
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public Employee(){
		
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

	

}
