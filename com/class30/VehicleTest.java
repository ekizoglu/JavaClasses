package com.class30;

public class VehicleTest {
	public static void main(String[] args) {
		BMW bmw = new BMW("767dasdas", "Sedan", "BMW", "X5");
		BMW.displayTotal(); //will output 1
		//Vehicle.displayTotal();
		// comes from Vehicle class
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.start();

		// comes from Car class
		bmw.breaking();

		// comes from BMW
		bmw.display();

		Car car = new BMW("767dasdas", "Sedan", "BMW", "X5");
		// comes from Vehicle class
		car.drive();
		car.stop();
		car.speed();
		car.start();

		// comes from Car class
		car.breaking();

//		// comes from BMW - won't be available to the parent
//		car.display();

		Vehicle vehicle = new BMW("767dasdas", "Sedan", "BMW", "X5");
		vehicle.drive();
		vehicle.stop();
		vehicle.speed();
		vehicle.start();

//		// comes from Car class - Won't be available to the parent
//		vehicle.breaking();
//
//		// comes from BMW - Won't be available to the grand parent
//		vehicle.display();
		vehicle.displayTotal();
		System.out.println("**************************");
		new BMW("13afadfsaf", "Truck", "BMW", "A7");
		new BMW("dasdasd123124", "Sedan", "BMW", "i3");
		new BMW("dsfgvfhtr134134", "Sedan", "BMW", "i7");
		vehicle.displayTotal();
		System.out.println("----------------");
		BMW.displayTotal();
	}

}
