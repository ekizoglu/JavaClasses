package com.class14;

public class ToCharArrayMethod {
	public static void main(String[] args) {
		String str = "Syntax";
		
		char[] array = str.toCharArray();
		
		for (char i: array) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("*****************************");
	}
}
