package com.class31;

public class MarksTest {
	public static void main(String[] args) {
		Marks a = new A(50,60,70); 
		System.out.println(a.getPercentage()); 
		
		System.out.println("**************************");
		Marks b = new B(50,60,70,80); 
		System.out.println(b.getPercentage());
		
	}
}
