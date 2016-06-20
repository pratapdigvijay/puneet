package com.dtsc;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contractemployee102")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="id")),
	@AttributeOverride(name="name", column=@Column(name="firstname"))
})

public class ContractEmployee extends Employee{
	
	private float payPerHour;
	
	private int contractDuration;

	public float getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}

	public int getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}

	

}
