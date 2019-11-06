package com.class13;

public class RegularExpressions {
	public static void main(String[] args) {
		/*
		 * print only text and not numbers
		 */
		
		String str = "14234Hel45645lo465456";
		System.out.println(str.replaceAll("[0-9]", ""));
		
		/*
		 * print only numbers not text with carrot --> ^
		 * or use "[a-zA-Z]" 
		 */
		System.out.println(str.replaceAll("[^0-9]", ""));
		System.out.println(str.replaceAll("[a-zA-Z]", ""));
		
		// Remove everything except text
		String str2 = "Hi#%How#$%#$424142412"; 
		// This gives you the signs and other junk
		System.out.println(str2.replaceAll("[a-zA-Z0-9]", ""));
		// This gives you only numbers and letters
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		
		
	}
}
