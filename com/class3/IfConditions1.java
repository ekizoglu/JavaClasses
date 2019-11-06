package com.class3;

public class IfConditions1 {

	public static void main(String[] args) {
		int a=90;
		int b=300;
		//if number a is bigger than number b 
		// I want to print a is larger than b
		if (a>b) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("a is smaller than b");
		}
		
		int expectedHours=15;
		int actualHours=20;
		//if expected hours are more than actual -> you will succeed
		//otherwise, please study more
		if(actualHours>expectedHours) {
			System.out.println("you will succeed");
		}else {
			System.out.println("please study more");
		}
		
		double teaPrice=4.99;
		double allowedPrice=5.99;
		//teaPrice-=2;//2.99=4.99-2
		
		//if price is more that I can afford I will NOT buy
		//if price is less or matches what I can afford then I will buy tea
		
		if(allowedPrice>=teaPrice) {
			System.out.println("I will buy tea");
			System.out.println("And I will enjoy my tea");
		}else {
			System.out.println("I cannot afford, I need to study more");
			System.out.println("I will go back to study more");
		}
		
		System.out.println("I keep writing some code");
		System.out.println("I keep writing more code");
		
		boolean val=false;

		if(val) { //if val ==true
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		boolean isRain=true;
		//if it is raining I will take umbrella, otherwise I go for a walk
		if(isRain) {//isRain==true
			System.out.println("I will take umbrella");
		}else {
			System.out.println("I go for a walk");
		}
	}
}
