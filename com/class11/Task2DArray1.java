package com.class11;

public class Task2DArray1 {
	public static void main(String[] args) {
				
		//Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
		int[][] array = new int[3][4];
		for (int i =0; i<array.length; i++) {
			for (int j = 0; j<array[i].length; j++) {
				System.out.print(j + " ");}
			System.out.println();
		}
		
		System.out.println("************************");
		
		//Create a 2D array of integer type where you will store odd and even numbers in 3 rows and 4 columns. 
		//Develop a program which will identify/print the even numbers only.
		for (int i = 0; i<array.length; i++) {
			for (int j = 0; j<array[i].length; j++) {
				if (j%2 ==0)
					System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("************************");
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
		int sum = 0; 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <array[i].length; j++) {
				sum += j; 
			}
		}
		System.out.println(sum);
		
		System.out.println("************************");
		
		
		
		
		
	}
}
