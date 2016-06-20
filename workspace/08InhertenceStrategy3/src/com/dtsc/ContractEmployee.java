package com.dtsc;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contractemployee103")
@PrimaryKeyJoinColumn(name="id")

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
