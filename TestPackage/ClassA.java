package TestPackage;

public class ClassA {
	ClassA(){
		System.out.println("Parent Class Constructor");
	}
	
	
}

class ClassB extends ClassA{
	ClassB(){
		System.out.println("Child class constructor");
	}
}
