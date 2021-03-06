package day3.collections;

import java.util.HashSet;
import java.util.Set;

class Product{
	int id;
	String name;
	String description;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}
	public Product(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class HashingDemo {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(123, "IPhone", "Sales already declining");
		System.out.println(p1.hashCode());
		Product anotherRef = new Product(123, "IPhone", "A better description");
		System.out.println(anotherRef.hashCode());
		Product p2 = new Product(127, "Macbook", "Awsome and stylish");
		System.out.println(p2.hashCode());
		
		Set<Product> products = new HashSet<>();
		products.add(p1);
		products.add(p2);
		products.add(anotherRef);
		
		
		Product searchProduct = new Product(127, "Macbook", "Awsome and stylish");
		
		
		boolean searchResult = products.contains(searchProduct);
		
		if(searchResult)
			System.out.println("Prdouct found in the list");
		
		
	
		
	}

}
