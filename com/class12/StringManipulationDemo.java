package com.class12;

public class StringManipulationDemo {
	public static void main(String[] args) {
		//2 Ways to create String Objects
		
		//1 - String Literal
		String name = "John";
		System.out.println(name);
		System.out.println(name.length());
		
		//2- Creating a String with "new" key word
		String name1 = new String("John1"); 
		System.out.println(name1);
		
		/*
		 * This method returns the length of this string
		 * The length is equal to the number
		 * of 16-bit Unicode characters in the string.
		 */
		int name1Len = name.length(); 
		System.out.println("The length of name is= " + name1Len);
		
		String str1 = "Hello World"; 
		System.out.println("Before: " + str1);
		
		str1 = str1.toLowerCase(); 
		System.out.println("After: " + str1 );
		
		System.out.println("=======================");
		
		//.equals()
		String str2 = "HElLo WorLd"; 
		
		boolean isEqual = str1.equals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase();
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println("===========================");
		/*
		 * toUpperCase(); 
		 * Converts all the characters in the string to upper case
		 */
		
		String str3 = "Jackson"; 
		System.out.println("Before conversion: " + str3);
		str3 = str3.toUpperCase(); 
		System.out.println("After conversion: " + str3); 
		
	}
}
