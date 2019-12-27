package com.class32;

import java.util.ArrayList;

import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("ali"); 
		strList.add("ayse");
		strList.add("fatma");
		strList.add("james"); 
		strList.add("mika");
		
		//retrieve values from an ArrayList
		//1 - for loop
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		//2 - using enhanced for loop
		for (String name: strList) {
			System.out.println(name);
		}
		
		System.out.println("-----------------USING ITERATOR--------------------");
		//3 - using iterator *New Way*
		Iterator<String> it = strList.iterator();
		for (int i = 0 ; i < strList.size(); i++) {
			System.out.println(it.next());
		}
	}
}
