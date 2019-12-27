package com.class38;

public class ThrowKeyword2 {
	public static void main(String[] args) {
		checkAge(17);
	}
	/*
	 * Create a method that will check if user is older than 18
	 * if it is not then we want to show exception
	 */
	public static void checkAge(int age) {
		if(age>=18) {
			System.out.println("You can get a driver's license");
		}
		else {
			// either throw in one step or create a RE object then use throw(REObject)
			try {
			throw new RuntimeException("You must be older than 18"); }
			catch(RuntimeException e){
				System.out.println(e.getMessage());
				
			}
		}
	}
}
