package com.class2;

public class LastExercise {
	public static void main(String[] args) {
		
		int a = 10; 
		int b= 22; 
		
		String x = "Hello"; 
		String y = "Bye"; 
		
		// When 
		System.out.println(a+b+x+y);//32HelloBye
		System.out.println(a+x+b+y);//10Hello22Bye
		System.out.println(x+y+a+b); //result of this is HelloBye1022
	}
}
