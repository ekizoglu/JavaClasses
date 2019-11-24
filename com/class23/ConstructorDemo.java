package com.class23;

public class ConstructorDemo {
	/* If you do not create a constructor compiler will create a default constructor
	 * an call it for you. Default constructor has no paramaters and looks like this
	 * In this case Default Constructor is called when an instance of the class is created
	 * ConstructorDemo(){
	 * }
	 */
	
	/*
	 *  Java calls default constructor when creating an object of class if no other
	 *  constructors are specified. 
	 */
	 
	ConstructorDemo(){
		System.out.println("I am your constructor");
	}
	
	ConstructorDemo(String str){
		System.out.println("I am constructor with 1 parameter " + str);
	}
	
	ConstructorDemo(int num) {
		System.out.println("I am constructor with 1 int parameter " + num);
	}
	
	ConstructorDemo(int num1, int num2){
		System.out.println("I am constructor with 2 int parameters " + num1 + " and " + num2);
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();	
		System.out.println("Code after creating an object");
		obj.hello();
		
		ConstructorDemo obj2 = new ConstructorDemo("My Parameter");
		ConstructorDemo obj3 = new ConstructorDemo(2,3);
		
	}
	
	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}
	
	
}
