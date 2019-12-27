package com.class35;
import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		Map<String, String> countries = new TreeMap<>(); 
		countries.put("Turkey", "Ankara");
		countries.put("Russia", "Moscow");
		countries.put("USA", "Washington DC");
		countries.put("Mexico", "Mexico City");
		
		Set<String> keys= countries.keySet();
		for (String key : keys) {
			System.out.println(key+":" + countries.get(key));
		}
		System.out.println("**********************");
		Iterator<String> it = keys.iterator(); 
		while(it.hasNext()){
			String country = it.next();
			String capital = countries.get(country);
			System.out.println(country +":"+capital);
		}
		
	}
	
}
