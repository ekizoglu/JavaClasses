package com.class32;
import java.util.ArrayList;
public class ArrayListTask {
	public static void main(String[] args) {
		// Generic
		ArrayList<String> strArray = new ArrayList<>();
		strArray.add("ali"); 
		strArray.add("ayse");
		strArray.add("fatma");
		strArray.add("james"); 
		strArray.add("mika"); 
		System.out.println("is arraylist empty?" + "\n" + strArray.isEmpty());
		System.out.println("is ali in the array list?" + "\n" + strArray.contains("ali")); 
		System.out.println("size of array list?" + "\n" + strArray.size());
		
		for (String str : strArray) {
			System.out.println(str);	
		}
		
		//ArrayList can be Generic and Non-Generic
		
		//Non Generic
		ArrayList aList = new ArrayList(); 
		aList.add("Hello"); //warnings state generic is preferred
		aList.add(100);
		aList.add(10.10);
		aList.add('c');
		aList.add(true); 
//		int y = aList.get(1) + aList.get(2); CE: Ask to add type casting
		
		System.out.println(aList);
		
		ArrayList<Double> list = new ArrayList<Double>();
		list.add((double) 100);
		
		
	}
	
	
}
