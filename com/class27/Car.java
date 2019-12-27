package com.class27;

public class Car {
	String make, model; 
	int year; 
	
	public void display() {
		System.out.println("We build " + year+ " " + make + " " + model);
	}
	
	Car(){
		System.out.println("I am a non argument constructor of the Parent Super Class");
	}
	
	
	public static void main(String[] args) {
		Car car = new Car(); 
		car.display(); 
//		int num;	Local Variables must be initialized
//		System.out.println(num);
		System.out.println(car.year); //will work like this
		
		System.out.println("--------------Object of child class-------------");
		Tesla tesla = new Tesla(); 
		
		
	}
	
}

class Tesla extends Car{
	boolean autoPilot;
	Tesla(){
		super();
		System.out.println("Non argument constructor of child Tesla class");
	}
	
	
}
