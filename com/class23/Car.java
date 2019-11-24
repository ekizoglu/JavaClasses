package com.class23;

public class Car {

	public String model; 
	public String color; 
	public int speed;
	public int doors;
	public static String make;
	
	
	public void getDetails() {
		System.out.println("I built a " + color +" " + make + " " + model);
		System.out.println("My car has " + doors + " doors and can have a speed up to " + speed );
	}
}
