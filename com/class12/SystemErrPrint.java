package com.class12;

public class SystemErrPrint {
	public static void main(String[] args) {
		int a = 1, b=2; 
		if (a == b) 
			System.out.println("Two numbers are equal.");
		
		else
			System.err.println("Error two numbers are different");
	}
}
