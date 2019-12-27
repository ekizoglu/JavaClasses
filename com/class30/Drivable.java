package com.class30;

public interface Drivable {
	// public static final variables (constant variables that do not change)
	// compiler will append "public static final" at the beginning of the declaration by defauly
	boolean DRIVE_FAST = true;  // Naming convention for constant variables.
								// Need to always initialize/assign/provide value
	
	// public abstract void drive(); by default compiler will add "public abstract"
	void drive(); 
	
}
class Cars {
	public void stop() {
		System.out.println("Car stops by pressing on breaks");
	}
}
class Toyota extends Cars implements Drivable{
	public void drive() {
		System.out.println("Toyota can drive");
	}
}