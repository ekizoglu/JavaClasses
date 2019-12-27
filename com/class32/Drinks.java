package com.class32;

import java.util.ArrayList;
import java.util.Iterator;
/*
	Create an arrayList of drinks. If any drink has
	letter “a” or “e” replace it with water. 

 */
public class Drinks {
	public static void main(String[] args) {
		ArrayList<String> drinks = new ArrayList<String>(); 
		drinks.add("Cola");
		drinks.add("Pepsi");
		drinks.add("Rum"); 
		drinks.add("Tonic"); 
		for (int i = 0; i<drinks.size(); i++) {
			if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "Water");
			}
		}
		
		System.out.println(drinks);
		
	}
}
