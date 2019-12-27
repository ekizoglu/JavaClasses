package com.class25_1;

public class CanWeOverload {
	
	// Can we overload a private method? - Yes
	private void methodOne() {
		System.out.println("I am method one");
	}

	private void methodOne(String str) {
		System.out.println("I am method one with " + str);

	}

	// Can we overload a main method? - Yes
	// Can we overload a static method? - Yes
	public static void main(String str) {
		System.out.println("I am a main method with String arguments");
	}

	public static void main(String str, String[] args) {
		System.out.println("I am a main method with 2 parameters");
	}
	
	// Overloading main method is possible but you can only use the actual main method to execute a program
	public static void main(String[] args) {
		System.out.println("I am a main method with String array");
		System.out.println("***********************************");
		main("String");
		String[] array = {"A", "B"}; 
		main("Hello", array); 
	}

}
