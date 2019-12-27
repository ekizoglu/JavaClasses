package com.class25_1;

public class Task {
	
	public static void calculateArea(int length) {
		System.out.println("Area of a square");
		System.out.println(length*length);
	}
	
	public static void calculateArea(int length, int width) {
		System.out.println("Area of a rectangle");
		System.out.println(length * width);
	}
	
	public static void calculateArea(int length, int height, int width) {
		System.out.println("Volume of a box");
		System.out.println(length * height * width);
	}

	
}
