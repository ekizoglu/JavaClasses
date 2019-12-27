package com.class35;
import java.util.*;
public class Recap {
	/*
	 * Set does not allow duplicates unlike List
	 * 3 Types of Main Classes in the Set Interface:
	 * 1- Hashset: Collection that doesn't maintain insertion order
	 * 2- LinkedHashSet: Maintains insertion order
	 * 3- TreeSet: Stores objects in ascending order 
	 */
	
	public static void main(String[] args) {
		int[] array = {12,12,13,14}; 
		Set<Double> set = new LinkedHashSet<>();
		set.add(99.99); 
		set.add(90.99); 
		set.add(9.99);
		set.add(39.99); 
		set.add(19.99); 
		
		//Retrieving Objects --> Iterator
		Iterator<Double> iterator = set.iterator(); 
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
			// OR
			double d = iterator.next(); 
			if (d<50) {
				iterator.remove(); 
			}
		}
		System.out.println("********************************");
		//Retrieving Objects --> For each loop
		for (double d1:set) {
			System.out.println(d1);
		}
		
		System.out.println("********************************");
		//Retrieving Objects --> For each loop
		// Cannot remove all elements with Loop, Can remove one objects
		for (Double d1:set) {
			System.out.println(d1);
		}
		
//////////////////////////////////////////////
		//Interview Question from Class 34 --> 2 ways below
		List<String> aList = new ArrayList<>(); 
		aList.add("John"); 
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String> hset = new HashSet<>(); 
		hset.addAll(aList); 
		System.out.println(hset);
		
		aList.clear();
		System.out.println(aList);
		aList.addAll(hset); 
		System.out.println(aList);
		
		
		Set<String> lset = new LinkedHashSet<>(); 
		lset.add("Morning");
		lset.add("Noon");
		lset.add("Evening");
		lset.add("Night");
		//convert to the ArrayList
		List<String> myList = new ArrayList<>(); 
		myList.addAll(lset); 
		String element = myList.get(2); 
		System.out.println(element);
		
		//Another way to create an Object of ArrayList by passing values to the constructor
		List<String> myList1 = new ArrayList<>(lset); 
		
		/*
		 * ArrayList vs Hashset
		 * ArrayList allows duplicates, ordered, Hashset Doesn't allow duplicates no order
		 * ArrayList: Methods get and set are available
		 * HashSet: Get and Set are not available
		 */
		
	}
	
}
