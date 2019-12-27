package com.class38;

public class FinallyBlock {
	public static void main(String[] args) {
		String str = "Hello";
		try {
			char character = str.charAt(20);
			System.out.println(character);
		}
		catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		/*
		 * finally block always gets executed no matter what (i.e. whether Exception occurs or not)
		 * inside finally block we will put some clean up code like close()
		 * 	i.e. close the program even if test or data retrieval is unsuccessful
		 * finally block will not handle the exception but is also associated with try block
		 */
		finally {
			System.out.println("I am a finally block");
		}
		
		System.out.println("End of the code");

	}
}
