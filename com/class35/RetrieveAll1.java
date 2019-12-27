package com.class35;
import java.util.*;
import java.util.Map.Entry; 

public class RetrieveAll1 {
	//Lets create a map of a classroom in which we will store objects and its quantities
	public static void main(String[] args) {
		Map<String, Integer> classRoom = new HashMap<>();
		classRoom.put("Instructor", 3); // Each of these are entries
		classRoom.put("Student", 80);//Entry
		classRoom.put("Tables", 20);//Entry
		classRoom.put("Chairs", 80);//Entry
				
		//entrySet() --> Set<Entry<String,Integer>>
		// Entry is an interface inside Map
		// getKey() and getValue() from a set of entries 
		Set<Entry<String,Integer>> entrySet = classRoom.entrySet(); 
		System.out.println("-------------------using for each loop to get all entry objects-----");
		for(Entry<String,Integer> entry :entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("-------------------using iterator to get all entry objects-----");
		Iterator<Entry<String,Integer>> entryIterator= entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> ent = entryIterator.next();
			String entry = ent.getKey() + "--->" + ent.getValue();
			System.out.println(entry);
			
			
			
		}
		
		
		/*System.out.println(classRoom);
		//retrieve Values
		Collection<Integer> values = classRoom.values();
		System.out.println(values);
		//retrieve Keys
		Set<String> keys = classRoom.keySet(); 
		System.out.println(keys);*/
		
		
		
		
	}
}
