package com.class12;

public class StringManipulationDemo2 {
	public static void main(String[] args) {
		/*
		 * .contains()
		 */
		String sentence = "It was raining";
		System.out.println(sentence.contains("Was"));
		System.out.println("===================");
		
		
		String str2 = "It is very hot in the class"; 
		System.out.println("Does the string start with= " + str2.startsWith("It"));
		System.out.println("Does the string start with=" + str2.startsWith("is", 3));
	}
}
