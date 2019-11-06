package com.class7;

public class Task1 {
	public static void main(String[] args) {
		// Print only odd number from 50 to 100
		// Print only even numbers from 100 to 1
		
		int a = 50; 
		int b = 100; 
		System.out.println("Odd numbers from 50 to 100");
		while ((a>=50) && (a<=100)){ 
			if (a%2 == 1) {
				System.out.print(a + " "); 
			}
			a++;}
		System.out.print("\n");
		System.out.println("Even numbers from 100 to 1");
		while ((b<=100) &&(b>=1)) {
			if (b%2 ==0) {
				System.out.print(b + " ");
			}
			b--; 
		}
		
	}
}
