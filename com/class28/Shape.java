package com.class28;

public class Shape {
	/*
	 *  Shape class has a constructor that takes the radius and has a subclass as  circle class. 
	 *  In circle class create a method to calculate the area of circle. Test your code
	 */
	
	double radius; 
	Shape (double radius){
		this.radius = radius; 
	}
	
	
}

class Circle extends Shape{
	
	Circle(double circleRadius){
		super(circleRadius);
	}
	
	public void calculateArea(){ 
		
	}
}