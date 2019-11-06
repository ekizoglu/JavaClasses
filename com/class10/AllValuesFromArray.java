package com.class10;

public class AllValuesFromArray {
	public static void main(String[] args) {
		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'}; 
		int a = 2; 
		System.out.println(grades[a]);
		System.out.println("***************************************");
		for (int i = 0; i<grades.length ; i++) {
			System.out.println(grades[i]);
		}
		
		String[] animals = {"Cat", "Dog", "Cow", "Snake", "Elephant" }; 
		int size = animals.length; 
		
		for (int i =0 ; i< size; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		System.out.println("***************************************");
		
		//Create an array to store 5 double values, print all elements in one line
		
		double[] arrayDouble = {1.0, 2.0, 3.0, 4.0, 5.0};
		int sizeArray = arrayDouble.length; 
		
		for (int i = 0; i< sizeArray; i++) {
			System.out.print(arrayDouble[i] + " ");
		}
	}
}
