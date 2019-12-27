package com.class36;
import java.util.*;
import java.util.Map.Entry;
/*
 * Create a Map from array of cities that will sort keys in alphabetical order. 
 * As a key store the name of the city and as a value store the length of the city 
 * (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
If any city name is more than 7 characters remove that city ( use Iterator ). 
 */
public class CityTest {
	public static void main(String[] args) {
		Map<Integer, City> cityMap = new TreeMap<>(); 
		cityMap.put(1, new City("Paris"));
		cityMap.put(2, new City("Moscow"));
		cityMap.put(3, new City("Washington Dc"));
		
		Set<Entry<Integer,City>> entrySet = cityMap.entrySet();
		Iterator<Entry<Integer, City>> cityItr = entrySet.iterator();
		while (cityItr.hasNext()) {
			Integer key = cityItr.next().getKey();
			City city = cityMap.get(key);
			if (city.length > 7) {
				cityItr.remove(); 
			}
		}
		for (Entry<Integer,City> ent: entrySet) {
			Integer key = ent.getKey(); 
			City city = ent.getValue(); 
			System.out.println(key + "::" + city.displayDetails());
		}
		
	
	}
	
}

class City{
	String name; 
	int length;
	public City(String name) {
		this.name = name; 
		this.length = name.length(); 
	}
	
	public String displayDetails() {
		return name + "=" + length;
	}
	
	
}




