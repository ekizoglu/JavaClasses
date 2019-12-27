package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

/*
 	Create an arraylist of cars and retrieve all the
	values using 3 different ways.
 */
public class Cars {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("BMW");
		cars.add("Nissan");
		cars.add("Infiniti"); 
		cars.add("Toyota");
		System.out.println("Regular for loop");
		for (int i = 0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("Advanced for loop");
		for (String str : cars) {
			System.out.println(str);
		}
		
		System.out.println("Using Iterator");
		Iterator<String> it = cars.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
