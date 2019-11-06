package com.class12;

public class StringManipulation3 {
	public static void main(String[] args) {
		String str ="";
		System.out.println("Is this string empty= " + str.isEmpty());
		String str2 = "Hello"; 
		System.out.println("Is this string empty= " + str2.isEmpty());
		
		if(!str.isEmpty()) {
			System.out.println("This is not empty");
		}
		else {
			System.err.println("This is an empty string");
		}
			
		System.out.println("==================================");
		
		String str3= "Hello", str4="World";
		String str5 = "People"; 
		System.out.println(str3 + " " + str4);
		System.out.println(str3.concat(" " + str4));
		System.out.println(str3.concat(str4).concat(str5));
		
		
		System.out.println("==================================");
		/*
		 * This method return as copy of the string
		 * with leading and trailing whitespace omitted
		 */
		String str6 = " How are you? "; 
		System.out.println(str6.trim());
		System.out.println("==================================");
		/*
		 * This method returns the character located at the String's specified index
		 * The string indexes start from zero
		 */
		
		String str7 = "We might be done early today"; 
		System.out.println(str7.charAt(3));
		
		System.out.println("==================================");
		/*
		 * This method returns the index within this string of the 
		 * first occurence of the specified character 
		 * or returns -1 if the character does not occur
		 */
		String str8 = "We might not be done early"; 
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('z'));
		System.out.println(str8.indexOf('m', 2));
		
		
	}
}
