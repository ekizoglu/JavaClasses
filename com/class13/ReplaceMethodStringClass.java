package com.class13;

public class ReplaceMethodStringClass {
	public static void main(String[] args) {
		/*
		 * replace()
		 * This method returns a new string resulting from 
		 * replacing all occurences of oldChar
		 * in this string with newChar
		 */
		
		String str = "Hello Dear Dan, how are you, How have you been";
		String str1 = "12-22-1990"; 
		System.out.println(str.replace('n', 'z'));
		System.out.println(str1.replace('-', '/'));

		System.out.println("============================");
		System.out.println(str.replace("Dan", "Ben"));
		
		
	}
}
