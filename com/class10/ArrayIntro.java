package com.class10;

public class ArrayIntro {
	public static void main(String[] args) {
		
//		int[] intArray; //preferred way to declare
//		int intArray[]; //both are valid declarations
//
//		int intArray[]; // declaring array
//		intArray = new int[20]; // allocating memory to array
//		int[] intArray = new int[20]; // combining both statements in one
		
		int a; 
		a=10; 
		
		int a1=10; 
		
		int [] b; //declare an array --> preferred way 
		int c[]; 
		
		b = new int[4];
		int[] array = new int[4];
		
		array[0] = 10; 
		array[1] = 20; 
		array[2] = 30; 
		array[3] = 40; 
		
		//access value from an array
		System.out.println(array[2]);
		
		//lets create an array that will store classes
		String[] classes = new String[4]; 
		classes[0] = "Java"; 
		classes[1] = "SDLC"; 
		classes[2] = "Manual Testing";
		classes[3] = "GIT";
		
		//Today we have Java class
		System.out.println("Today we have " + classes[0]+" class"); 
		
		int[] nums = new int[3]; 
		nums[0] = 1; 
		nums[1] = 2; 
		nums[2] = 3; 
		
		//how can I change 1 to 100
		nums[0] = 100; 
		System.out.println(nums[0]);
		System.out.println(nums[0] + nums[2]); //100+3
		
		String[] names = new String [4]; 
		names [0] = "Diana"; 
		names [1] = "Seda"; 
		names [2] = "Jaime"; 
		names [3] = "Olga"; 
		
		System.out.println(names[3]);
		
		int[] numbers = new int [4]; 
		numbers[1] = 100; 
		numbers[3] = 200; 
		//this statement will print 0 since the default value is 0 for int
		System.out.println(numbers[0]);
		
		/*this will produce ArrayIndexOutOfBounds
		Exception*/ 
		// System.out.println(numbers[4]); 
		
		/*
		 * We cannot store any data types other than what is declared
		 * inside array. In other words it is not convertible
		 * The size of an array is fixed ArrayIndexOutOfBounds exception
		 */
		
		
		
		
	}
	
}
