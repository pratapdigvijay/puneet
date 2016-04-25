package com.sapient.compose;

public class Address {
	
	int houseNumber;
	String locality;
	String city;
	String country;
	int pinCode;
	public Address(int houseNumber, String locality, String city,
			String country, int pinCode) {
		super();
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", locality=" + locality
				+ ", city=" + city + ", country=" + country + ", pinCode="
				+ pinCode + "]";
	}

}
