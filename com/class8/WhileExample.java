package com.class8;
import java.util.Scanner;
public class WhileExample {
	public static void main(String[] args) {
		/*
		 * Ask user to enter if it is raining or not
		 * As long as there is rain let's keep asking
		 * 
		 */
		
		Scanner sc = new Scanner(System.in); 
		boolean isRain; 
		
		do {
			System.out.println("Is it raining?");
			isRain=sc.nextBoolean(); 
			
		}while(isRain);
		
		System.out.println("Go to the park");
		
	}
}
