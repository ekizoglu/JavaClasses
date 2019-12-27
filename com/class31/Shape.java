package com.class31;
/*
 * 	
 	Create an Interface 'Shape' with undefined
	methods as calculateArea and
	calculatePerimiter. Create 2 classes Circle &
	Square that implements functionality defined in
	the Shape Interface. Test your code.
 */
public interface Shape {
	void calculateArea();
	void calculatePerimeter();
}

class Circle implements Shape{

	@Override
	public void calculateArea() {
		System.out.println("Circle Area");
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Circle Perimeter");
		
	}
	
}

class Square implements Shape{

	@Override
	public void calculateArea() {
		System.out.println("Square Area");
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Square Perimeter");
		
	}
	
}
