package day3.collections;

public class Address implements Comparable<Address>{
	String locality;

	public Address(String locality) {
		super();
		this.locality = locality;
	}

	@Override
	public String toString() {
		return "Address [locality=" + locality + "]";
	}

	@Override
	public int compareTo(Address o) {
		return this.locality.compareTo(o.locality);
	}

	

}
