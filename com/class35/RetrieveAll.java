package com.class35;

import java.util.*;

public class RetrieveAll {
	public static void main(String[] args) {
		// Create a map of a person (name, lastName, address, city, state); 
//		Map<String, String> personMap = new TreeMap<>(); //Maintains ascending order
		Map<String, String> personMap = new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		
		//how to retrieve a specific value?
		System.out.println("--------Printing all keys-----------");
		String value = personMap.get("State");
		System.out.println(value);
		
		//how to retrieve all keys and all values
		Set<String> keys = personMap.keySet(); 
		
		for (String key: keys) {
			System.out.println(key+":"+personMap.get(key));
		}
		
		Iterator<String> keysIterator = keys.iterator(); 
		while (keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		System.out.println("--------Printing all keys-----------");
		
		
		System.out.println("-----------Printing all values----------");
		Collection<String> values = personMap.values();
		
		for (String val : values) {
			System.out.println(val);
		}
		
		Iterator<String> valuesIterator = values.iterator();
		while(valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}
		
		
		
		
	}
}
