package com.class31;

import java.awt.Rectangle;

public class ShapeTest {
	public static void main(String[] args) {
		Shape c = new Circle(); 
		Shape s = new Square(); 
		c.calculateArea();
		c.calculatePerimeter();
		System.out.println("****************************");
		s.calculateArea();
		s.calculatePerimeter();
	}
	
}
