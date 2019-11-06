package com.class11;

public class ForEachLoop {

	public static void main(String[] args) {
		//How to declare and initialize a variable in different ways.
		int num1 = 12;
		int num2 = 14;
		int num3 = 16;
		
		//How declare and initialize multiple variables in one data type
		int num4 = 13, num5 = 50, num6 = 33;
		
		//how to declare multiple variables in one data type.
		int a, b, c, d;

		//Initialization in two steps
		a = 12;
		b = 33;

		// Array Object creation and giving size to it.
		int[] h = new int[3];
		
		//Declaring array variables
		int e[];
		int y[];
		y = new int[3];
		// u=new int [2]; //will not compile
		// u=12;

	
		int[] numbersList = { 2, 3, 5, 7 };
		
		for(int g=0;g<numbersList.length;g++) { //retrieving values using for loop.
			System.out.println(numbersList[g]);
		}
		System.out.println("**************");
		
		for(int element:numbersList) {// Retrieving values using for-each loop.
			System.out.println(element);
			
		}

	}

}
