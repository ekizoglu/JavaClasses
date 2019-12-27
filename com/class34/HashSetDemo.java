package com.class34;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
	public static void main(String[] args) {
		// lets create a collection of veggies where I do not want to have duplicates
		// sets do not allow duplicates
		HashSet<String> hset = new HashSet<>(); 
		//storing values into hashset
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zucchini");
		hset.add("carrot");
		hset.add("zucchini");	
		
		System.out.println(hset.size()); //Will output 5 since no duplicates policy
		System.out.println(hset); 
		
		// they do not have any methods to retrieve elements from the collection
		// .get(); , .set(); <-- belongs to list interface
		
		// hw can retrieve all elements?
		// iterator
		
		Iterator<String> it=hset.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		System.out.println("-----------------------------");
		//enhanced for loop
		for(String str:hset) {
			System.out.println(str);
		}
	}
	
}
