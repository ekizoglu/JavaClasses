package com.class26;

public class Animal {
	public void sleep() {
		System.out.println("Animals sleep");
	}
	
	public void eat() {
		System.out.println("Animals eat");
	}
	
	
}

class Cat extends Animal{
	public void sleep() {
		System.out.println("Cats sleep all day");
	}
	
	public void meow() {
		System.out.println("I meow when I'm hungry");
	}
	
//	public void eat() {
//		System.out.println("Cats eat cat food");
//	}
	
	
}


