package com.class8;

public class Task1 {
	public static void main(String[] args) {
		int sum = 0; 
		for(int i = 0; i<=5; i++) {
			sum = sum + i; 
			System.out.println(sum + "+");
		}
		
		System.out.println();
		System.out.println(sum);
		
		
		System.out.println("*********************");
		
		int sumAll = 0; 
		for (int i = 1; i<=5; i++) {
			sumAll +=i; 
				
		}
		System.out.println(sumAll);
		System.out.println("*************************");
		System.out.println("8! Step by step");
		int factorial = 1; 
		for (int i = 1; i<=8; i++) {
			factorial = factorial * i; 
			System.out.println(factorial);
		}
		System.out.println("*************************" + "\n" + "Result");
		System.out.println(factorial);
	}
}
