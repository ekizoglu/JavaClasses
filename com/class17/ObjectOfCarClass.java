package com.class17;

public class ObjectOfCarClass {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "S3";
		car1.color = "Black";
		car1.year = 2020;
		car1.wheels = 4;
		car1.windows = 5;
		car1.speed = 200;
		car1.start();
		car1.accelerate();
		car1.drive();
		System.out.println("---------------------------");

		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "i8";
		car2.color = "Purple";
		car2.year = 2019;
		car2.wheels = 4;
		car2.start();
		car2.drive();
		car2.accelerate();

		// print features of the car
		// I have black Tesla
		System.out.println("I have " + car1.color + " " + car1.make);
		// I drive bmw 2019
		System.out.println("I drive a " + car2.make + " " + car2.year);

	}
}
