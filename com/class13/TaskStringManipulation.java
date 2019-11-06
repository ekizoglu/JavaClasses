package com.class13;

public class TaskStringManipulation {
	public static void main(String[] args) {
		String str = "Sunday"; 
		for (int i =str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		String str2 = "Helloa"; 
		if (!str2.isEmpty()) {
			if (str2.length() % 2  != 0) { 
				System.out.print(str2.charAt(str2.length()/2));}
		
		else {
			System.err.println("Error");
		}}
	}
}
