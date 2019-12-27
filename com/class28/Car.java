package com.class28;

public class Car {
String make, model;//make=null, model=null
	
	Car(){
		System.out.println("I am a non argument constructor");
	}
	
	Car(String make, String model){
		this.make=make;
		this.model=model;
	}
}
class Tesla extends Car{
	boolean autopilot;
	Tesla(){
		//super();compiler will add by default to make a call to super class
		//constructor to initialize and object
		System.out.println("I am a child non argument constructor");
	}
	//
	Tesla (String make, String model, boolean autopilot){
		super(make, model);//constructor call
		this.autopilot=autopilot;
	}
	public void displayInfo() {
		System.out.println("Car "+make+" "+model+" has an autopilot "+autopilot);
	}
}
