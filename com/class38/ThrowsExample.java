package com.class38;

public class ThrowsExample {
	/*
	 * Throws keyword transfers responsibility of handling that exception to another method
	 * 
	 */
	static String name = "John";
	
	public static void main(String[] args) {
		callingMore();
	}
	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student is " +name+" is sleeping.");
		Thread.sleep(3000);
	}
	// need to handle exception in the studentSleeping() method or throw it
	public static void callingSleepingStudent() throws InterruptedException{
		studentSleeping();
		
	}
	// need to handle exception in callingSleepingStudent() method or throw it
	public static void callingMore() { 
//		callingSleepingStudent(); CE: in main method unhandled exception
		try{
			callingSleepingStudent();
		}
		catch(InterruptedException e){
			System.out.println("Interrupted Exception");
		}
		
	}
}
