package com.class37;

public class ExceptionDemo {
	public static void main(String[] args) {
		division2Integers(10,5);
		division2Integers(10,0);
		division2Integers(10,0);
		division2Integers(10,2);
		division2Integers(10,5);
		division2Integers(10,5);
	}
	
	public static void division2Integers(int num1, int num2) {
		try {
			System.out.println(num1/num2); 
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero, please provide valid denominator");
			System.out.println(e.getMessage());
		}
	}
}
