package com.class27;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
	
	
}


class Monkey extends Animal{
	/* Cannot override static methods with instance methods
	 * Compiler error
	public void whoAmI() {
		
	}*/
	/* @Override --> Not possible
	 * Static methods cannot be overridden
	 * When both methods are static within Subclass and Superclass it is method hiding */
	public static void whoAmI() {
		System.out.println("I am a Monkey");
	}
}