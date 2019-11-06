package com.class11;

public class TwoDArraysDemo2 {
	public static void main(String[] args) {
		String[][] names = {
				{"Khan", "Yousuf", "Alex", "Zynab", "Michael"},
				{"Mohammad", "Ann", "Naslyhan", "Weqas"},
				{"Diago", "Asif", "Zubair", "Shogofa"}
					
		}; 
		int length = names.length;
		System.out.println(length);
		
		
		System.out.println("***********************");
		
		int lengthOfElements = names[0].length; 
		System.out.println(lengthOfElements);
		
		System.out.println("***********************");
		for (String getArrays[]: names) {
			for (String getName: getArrays) {
				System.out.print(getName + " ");
			}
			System.out.println();
		}
	} 
	
}
