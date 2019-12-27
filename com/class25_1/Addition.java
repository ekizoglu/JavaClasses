package com.class25_1;

public class Addition {
	/*
	 * 2 Types of Polymorphism: Compile Time and Runtime: 
	 * 1) Compile time polymorphism / Static Binding / Early binding - method overloading
	 * 	  Can be achieved through Method overloading is having the same method name within the same 
	 * 2) Runtime Polymorphism / Method Overriding / Dynamic Binding / Late Binding
	 * 	  a subclass or child class to provide a specific implementation of a method 
	 *    that is already provided by one of its superclasses or parent classes	  
	 */
	/*
	 * Method Overloading 
	 * 1st way passing different AMOUNT of parameters
	 */
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	
	/*
	 * 2nd way by having different types of parameters
	 */
	
	public void add(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	/*	Same method name and params with different return type 
	 *	will not make the method different
	 *	Return type is not a type of method signature 
	 *	For method overloading method signature must be different
	 *	i.e. different types or amount of params 	
	 *	Access modifiers (public, private, default, protected)
	 *	are also not part of the method signature
	 */
	
	/*
	 * public double add(double num1, double num2) {
	   System.out.println(num1 + num2);}
	   */
	
	
	public void add(int num1, double num2) {
		System.out.println(num1 + num2);
	}

	public void add(double num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void main(String[] args) {
		Addition obj = new Addition(); 
		obj.add(1, 2);
		System.out.println("****************************");
		obj.add(1, 2, 3);
		System.out.println("****************************");
		obj.add(12.09, 12.10);
		System.out.println("****************************");
		
		String str = "Hello"; 
		System.out.println(str.substring(3));
		System.out.println(str.substring(1, 3));
		
	
	}
	
}
