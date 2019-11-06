package com.class7;

public class WhileLoop {
	public static void main(String[] args) {
		int time = 8; 
		
		if (time < 12) {
			System.out.println("Good Morning"); // Code executes once
		}
		
		while (time < 12) { //while condition is true
			System.out.println("Good Morning"); 
			time++; 
		}
		// I want to print GM 5 times
		
		int i = 1; 
		
		while (i<=5) {
			System.out.println("Good Morning");
			i++; 
		}
		
		// I want to print GA 5 times
		int a = -1; 
		while (i < 4) {
			System.out.println("Good Afternoon");
			i++;
		}
		
	}
}
