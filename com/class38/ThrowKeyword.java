package com.class38;

public class ThrowKeyword {
	/*
	 * throws - is a keyword that delegates responsibility to handle the exception 
	 * to the caller/method that calls
	 * throws is associated with checked exception
	 * Compiler will give 2 options when checked exception occurs
	 * 1. use try & catch - handle the exception
	 * 2. throws - do not handle it now and pass it to whoever calls that method
	 */

	
	public static void main(String[] args) {
		System.out.println("Beginning");
		callingExceptionMethod();
		System.out.println("End");
	}
	
	public static void throwingException() {
		System.out.println("Creating an exception");
		ArithmeticException ae = new ArithmeticException(); 
		throw(ae); 
	}
	
	public static void callingExceptionMethod() {
		try {
			throwingException();
		}
		catch(ArithmeticException ae){
			System.out.println("Arithmetic E got caught");
		}
	}
}
