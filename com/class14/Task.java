package com.class14;

public class Task {
	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence
		 * Write a program to get a new String without any spaces.
		 */
		
		String sentence = "Write a program to get a new String without any spaces."; 
		String[] noSpaces = sentence.split(" "); 
		for (String string : noSpaces) {
			System.out.print(string);
		}
		System.out.println();
		/*
		 * Create a String that should be a combination of letters,
		 * numbers and special characters. Find out how many alpha
		 * characters are there in the String.
		 */
		System.out.println("**************************");
		String str = "12451268rads8asdas@!#%^@&*()"; 
		String str1 = str.replaceAll("[^a-zA-Z]", ""); 
		int strAlphaLength = str1.length(); 
		System.out.println(strAlphaLength);
		
		
		/*
		 * You have a String a="Is it saturday? Is it raining? Do we have a Java Class today?"
		 * How would you find out how many sentences are in that String? 
		 */
		String a="Is it saturday? Is it raining? Do we have a Java Class today?"; 
		String[] a1 = a.split("\\?"); 
		for (int i = 0 ; i <a1.length; i++) {
			System.out.println(a1[i].trim());
		}
		System.out.println("String a has " + a1.length + " sentences.");
		
		
	}
}
