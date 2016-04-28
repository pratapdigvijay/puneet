package day3.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		//HashSets -- Unordered, Unsorted
		//LinkedHashSets - Order(Insertion), Unsorted
		//TreeSet - Unordered, Sorted
		
		Set<Integer> ints = new TreeSet<Integer>();
		
		ints.add(3);
		ints.add(5);
		ints.add(1);
		ints.add(2);
		ints.add(6);
		ints.add(4);
		
		System.out.println(ints);

	}

}
