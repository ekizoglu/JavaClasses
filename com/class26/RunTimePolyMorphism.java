package com.class26;

public class RunTimePolyMorphism {
	public static void main(String[] args) {
		
		//creating an object on parent class
		Animal a = new Animal(); 
		a.sleep();
		a.eat();
		
		//creating object of child class
		Cat cat = new Cat(); 
		cat.eat(); //from parent
		cat.meow(); //from child
		cat.sleep();//from child
		
		
		// Widening/implicit
		double d = 90; 
		
		// Narrowing/Explicit
		int i = (int)1.99; 
		System.out.println("*********************************");
		// Non Primitive Type Casting, down casting & up casting
		// widening --> Creating an object of the child class 
		// and giving reference to the Parent class.
		/* When you create an object of the Cat class with reference to Animal Class,
		 * you will only be able to access the methods in the parent class (Animal)
		 * if you have the same methods in the child class (Cat) they will override 
		 * the methods in the parent class as seen in the below code
		 */
		Animal obj = new Cat(); 
		obj.eat(); //method from parent class
		obj.sleep(); // this method will come from child class --> runtime polymorphism
		//obj.meow(); --> method won't be available
		
		// narrowing
		// Cat obj2 = new Animal(); --> JVM Error: Cannot convert from animal to cat
	
	}
	
}
