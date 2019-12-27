package com.class35;
import java.util.HashMap;

public class MapIntro {
	/*
	 * Map is an interface that is not a part of Collection Framework
	 * Map will have its own unique methods to manipulate Data
	 * Inside the map we store 2 objects --> Key + Value <-- 1 Entry
	 * Map is a collection of Entries --> Entry Objects
	 * Classes that implement Map Interface
	 * 	HashMap
	 * 	TreeMap
	 * 	LinkedHashMap
	 * 	HashTable
	 * 	
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>(); 
		//to store key+value pair into map
		map.put(101, "John"); 
		map.put(102, "Jack");
		map.put(103, "Jane");
		map.put(104, "Jenny");
		
		System.out.println(map);
		//how to verify if there are any elements inside map
		boolean flag = map.isEmpty();
		if (!flag) {
			int size = map.size(); 
			System.out.println(size);
		}
		//I want to add more Entry Objects
		// adding duplicate values with different keys
		map.put(105, "John"); //Need to match key and value types as initially declared
		System.out.println(map);
		// cannot have duplicate keys no error but it will override the value in that key
		// Keys must be unique (DUH)
		map.put(102, "Jamie"); 
		System.out.println(map);
		
		//how to access a value
		String mapElement = map.get(105); 
		System.out.println(mapElement);
		
		//to replace or update the value
		map.replace(103, "Zeynep"); 
		System.out.println(map
				);
		
		//how to remove
		map.remove(101); 
		System.out.println(map);
		System.out.println("--------------------------------------------");
		
		//how to verify if certain key or value exists
		boolean flag1=map.containsKey(103); 
		System.out.println(flag1);
		if (flag1) {
			map.replace(103,"Seval"); 
		}
		else {
			map.put(103, "Seval"); 
		}
		System.out.println(map);
		
		//how to verify if certain value exists
		boolean contains = map.containsValue("Seval");
		System.out.println(contains);
		System.out.println(map);
		
		
		
	}
	

	
}
