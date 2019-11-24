package com.class24;

public class ThisWithConstructor {
	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}
	
	ThisWithConstructor(String str){
		this(); // here this keyword is used to call current class constructor
		System.out.println("I am constructor with 1 String parameter"); 
	}
	
	ThisWithConstructor(String str, String str1){
		this("Hello");
		/*this();*/ //Constructor call has to be the first statement within a constuctor
		System.out.println("I am a constructor with 2 parameters");
	}
	
	public static void main(String[] args) {
		ThisWithConstructor obj = new ThisWithConstructor();
	
		System.out.println("---------------------------------");
		// Can we execute 2 constructors when creating an Object
		// yes - it can be achieved using this keyword --> this();
		// This type of constructor calls are known as CONSTRUCTOR CHAINING
		ThisWithConstructor obj1 = new ThisWithConstructor("Hello"); 
		
		System.out.println("---------------------------------");
		ThisWithConstructor obj2 = new ThisWithConstructor("Hello", "Bye"); 
		
	}
}
