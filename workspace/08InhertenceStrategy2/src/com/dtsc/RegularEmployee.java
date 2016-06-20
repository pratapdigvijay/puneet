package com.dtsc;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regularemployee102")
/*@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="id")),
	@AttributeOverride(name="name", column=@Column(name="name"))
})
*/
//@AssociationOverride(name = "name", joinColumns = @JoinColumn(name = "Emp_Name"))

public class RegularEmployee extends Employee{
	
	private float salary;
	
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
