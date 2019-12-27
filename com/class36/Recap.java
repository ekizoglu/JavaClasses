package com.class36;
import java.util.*;
import java.util.Map.Entry; 
public class Recap {
	/*
	 * Create a map of groceries that will store products and its quantities
	 * and we want to maintain the insertion order of the keys
	 */
	
	public static void main(String[] args) {
		Map<String, Integer> groceryMap = new LinkedHashMap<>();
		groceryMap.put("Milk", 2); 
		groceryMap.put("Tea", 3);
		groceryMap.put("Onion", 5);
		groceryMap.put("Apple", 10);
		
		//Retrieve a single value
		groceryMap.get("Apple"); 
		
		//Verify if specific key or value is in the map
		groceryMap.containsKey("Milk");
		//Verify Value 
		groceryMap.containsValue(2);
		
		//How to retrieve all values?
		Collection<Integer> values = groceryMap.values(); 
		for (Integer val: values) {
			System.out.println(val);
		}
		
		Iterator<Integer> valIt = values.iterator(); 
		while(valIt.hasNext()) {
			System.out.println(valIt.next());
		}
		
		//get all keys and map them to values (i.e. milk-->2)
		Set<String> keys = groceryMap.keySet(); 
		for (String k:keys) { 
			System.out.println(k.toUpperCase() + "-->"  + groceryMap.get(k));
		}
		
		Iterator<String> keyIterator = groceryMap.keySet().iterator(); 
		while(keyIterator.hasNext()) {
			String itKey =keyIterator.next();
			Integer val = groceryMap.get(itKey); 
			System.out.println(itKey.toLowerCase() + "-->" + val);
		}
		
		//get all keys and map them to values using entry set (milk-->2)
		Set<Entry<String, Integer>> entr = groceryMap.entrySet();
		for (Entry<String, Integer> e : entr) {
			System.out.println(e.getKey() + "-->" + e.getValue());
		}
	}
	
	
}
