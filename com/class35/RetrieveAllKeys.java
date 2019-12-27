package com.class35;

import java.util.*;

public class RetrieveAllKeys {
	public static void main(String[] args) {
		// Create a map of a person (name, lastName, address, city, state);
//		Map<String, String> personMap = new TreeMap<>(); //Maintains ascending order
		Map<String, String> personMap = new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");

		// how to retrieve a specific value?
		System.out.println("--------Printing all keys-----------");
		String value = personMap.get("State");
		System.out.println(value);

		// how to retrieve all keys and all values
		Set<String> keys = personMap.keySet();

		for (String key : keys) {
			System.out.println(key + ":" + personMap.get(key));
		}

		Iterator<String> keysIterator = keys.iterator();
		while (keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		System.out.println("--------Printing all keys-----------");
		
		System.out.println("**************************************************");
		
		
		// how can I retrieve and print values using for loop  -->key:value
		Set<String> keysSet = personMap.keySet();
		for (String singleKey: keysSet) {
			System.out.println(singleKey+ ":" + personMap.get(singleKey)); 
		}
		
		System.out.println("**************************************************");
		// how can I retrieve and print values using for loop  -->key:value
		Iterator<String> keysIterator1 = keysSet.iterator();
		while(keysIterator1.hasNext()) {
			//-->System.out.println(keysIterator1.next() + ":" + personMap.get(keysIterator1.next())); 
			//-->Exception .next() prints the next value on the values list (i.e. name:yildiz)
			String mapKey = keysIterator1.next();
			String mapValue = personMap.get(mapKey);
			System.out.println(mapKey +":" +mapValue);
		}
	}
}
