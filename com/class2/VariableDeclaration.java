package com.class2;

public class VariableDeclaration {

	public static void main(String[] args) {
		//declaring variable num1 that will hold value of int and 
		//assigning value of 123 to it

		int num1= 123; 
		int num2= 6767; 
		int num3=786678; 
		
		//declaring variables that will hold value of int
		int num4; 
		int num5;
		int num6; 
		
		//assigning values now
		num4 = 1234; 
		num5= 7673; 
		num6= 1313; 
		
		
		//declare all together then assign value
		int a1, a2, a3; 
		a1= 3123; 
		a2= 333; 
		a3= 3321; 
		
		/*
		 * If you want to change the value of a variable i.e. assign another number to x1
		 * Left to right top to bottom execution the final value in x1 remains and is printed
		 */
		
		int x1, x2; 
		x1=12; 
		x2=13; 
		
		//Assigns x2 value to x1, deletes x1 value, x2 value remains the same
		x1 = x2; 
		System.out.println(x1); 
		System.out.println(x2);

		
		boolean isRain=false; 
		boolean isSnow; 
		isSnow = isRain; //isSnow False
		System.out.println(isSnow);
		
		isSnow= true; 
		System.out.println(isSnow);
	}
}
