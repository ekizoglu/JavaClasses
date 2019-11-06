/*
 * 
 * 
 * Write a Java program to add, subtract, multiply and divide 2 decimal values. 
 * Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”

Write a program to find the square of the number 3.9. 
You program should say “The square of the ____ is ____ “

Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
 */



package com.class2;

public class Task2 {
	public static void main(String[] args) {
		int a, b; 
		a = 5; b = 2 ;
		int add= a+b; 
		int sub= a-b; 
		int mult= a*b; 
		int div= a/b; 
		
		System.out.println("The addition of two numbers " + a + " and " + b + " is " + add );
		System.out.println("The subtraction of two numbers " + a + " and " + b + " is " + sub );
		System.out.println("The multiplication of two numbers " + a + " and " + b + " is " + mult );
		System.out.println("The division of two numbers " + a + " and " + b + " is " + div );
		
		double a1, b1; 
		a1= 3.9;
	
		
		System.out.println("The square of the " + a1 + " is "+ Math.pow(a1, 2));
		
		
		int a2, b2; 
		a2= 5; b2= 8; 
		int area = a2* b2; 
		int perimeter = (a2*2) + (b2*2);
		System.out.println("The perimeter of a rectangle with width " + a2 + 
				" and height " + b2 + " is equal to " + perimeter + " and the area is " + area);
		
		
		
	}

}
