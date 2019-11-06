package com.class8;

public class Task2 {
	public static void main(String[] args) {
		/*
		 * write a code to find the sum of even & odd numbers
		 * from range 1 to 20
		 * expecting 2 outputs
		 * sum for odd nums=....
		 * sum for even nums=...
		 */
		
		int sumOdd= 0 ;
		int sumEven= 0; 
		
		for (int i = 1 ; i<=20; i++) {
			if(i%2 == 1)
				sumOdd +=i; 
		}
		System.out.println("Sum for odd numbers = " + sumOdd);
		
		for (int i = 1; i<=20; i++) {
			if(i%2 == 0)
				sumEven +=i; 
		}
		System.out.println("Sum for even numbers = " + sumEven);
	}
}
