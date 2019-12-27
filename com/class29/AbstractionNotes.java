package com.class29;

public class AbstractionNotes {
	/*
	 * Abstraction is a process of hiding implementation details and showing functionality
	 * In Java Abstraction can be achieved in 2 ways:
	 * Abstract Class
	 * Interfaces
	 * Abstract class is a class defined with abstract keyword
	 * and it has implemented (methods that have body) and unimplemented
	 * (methods that do not have body)
	 * Cannot have objects of abstract class. Can have objects of child classes to abstract class
	 * 
	 * abstract is a non access modifier
	 * is a keyword that identifies smth incomplete
	 * Undefined/unimplemented/abstract methods --> methods w/o body
	 * public abstract void takePictures();
	 * 
	 * below method is not abstract as it has a body{},
	 * you will get a compiler error if you try to define a body
	 * public abstract void takePictures(){}
	 * ************************************************************************** 
	 * Class 30 Notes
	 * abstract- identifies sth incomplete
	 * abstract is a non access modifier that can be used with methods and classes.
	 * Can abstract class have a constructor?
	 * 	Cannot create objects of abstract class
	 * 	However you can have a constructor of abstract class to initialize instance variables
	 * Can abstract class have static & non static variables?
	 * 	Non-static methods and variables are OK inside abstract class. 
	 * 
	 * Summary Abstraction
	 * Abstract Class:
	 * Can have implemented and unimplemented method
	 * Implemented methods --> Can be static or non-static
	 * Unimplemented methods --> abstract = no body ({})
	 * 	Abstract methods cannot be static, final or private
	 * 	When implementing abstract methods (overriding) you cannot reduce visibility
	 * 	just as you cannot do when overriding non-abstract methods.
	 * Constructor: instance and static variables
	 * 
	 * Abstract Class vs Concrete Class
	 * 1. In concrete all methods must be defined
	 * 2. Abstract class --> Cannot create objects of it
	 * Create an Object of the class = Create an instance of the class = Instantiate the class
	 * 
	 */
	
	
}
