package com.class24;

public class ThisKeyword {
	/* this keyword can be used with variables to refer instance variables
	 * 		if you have local and instance variables with the same name use this keyword
	 * this keyword can be used with methods to call current class "instance" methods
	 * this keyword can be used to call current class constructor --> this();
	 */
	
	
	int a, b;
	
	public ThisKeyword() {
		System.out.println("I am a non argument constructor");
	}
	
	public ThisKeyword(int a, int b) {
		this.a = a; 
		this.b = b;
	}
	
	public void sum(int a, int b) {
		System.out.println("The sum of local parameters is " + (a+b));
		System.out.println("The sum of instance variables is " + (this.a + this.b));
	}
	
	public void sayA() {
		System.out.println(a);
	}
	
	public void sayB() {
		System.out.println(b);
	}
	
	public void sayAandB() {
		this.sayA();
		sayB(); //compiler adds this automatically(implicitly) --> this.sayB();
	}
	
	public static void main(String[] args) {
			
		ThisKeyword obj = new ThisKeyword(5, 10); 
		obj.sum(10, 20);
		obj.sayAandB();
		obj.sayA();
		obj.sayB();
		
		System.out.println("----------------------------------");
		
		ThisKeyword obj1 = new ThisKeyword(20, 20); 
		obj1.sum(100, 200);
		
		
		
		
	}
}
