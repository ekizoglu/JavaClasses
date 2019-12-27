package com.class32;

public class Recap {
	public static void main(String[] args) {
		//to store single value
		int num = 10;
		
		//to store multiple values
		int[] numArray = {10,20,30}; 
		int[] array = new int[3];
		array[0]=100;
		array[1]=200;
		array[2]=300;
		
		
		System.out.println(array[2]);
		System.out.println("*******************************");
		//to retrieve all values 1 by 1
		for (int i = 0; i<array.length ; i++) {
			System.out.println(array[i]);
		}
		System.out.println("*******************************");
		//using for each loop
		for (int element:array) {
			System.out.println(element);
		}
		//Array: Store multiple values of the same type
		// Data types 
		// Primitive: 8
		// Non-primitive: Scanner, Monkey, String, .... Unlimited.
		// When we create an array we can store both primitive and non-primitive
		// Primitive types arrays: byte[] short[] int[] long[] float[] boolean[] char[] double[]
		// Non Primitive array notation: String[], Object[]
		
		
		
		
		//we can store non-primitive types: Objects
		Fruit f = new Apple(); 
		Fruit f1 = new Banana(); 
		Object f2 = new Orange(); 
		//above and below all objects
		Object monkey = new Monkey(); 
		
//		Fruit[] fruitArray = {f,f1,f2, monkey}; CE: Cannot convert from Fruit to Monkey
		Object[] mixArray = {f,f1,f2, monkey}; 
		for (Object obj : mixArray) {
			
		}
		
	}
}
class Monkey{
	
}
class Fruit{
	
}

class Apple extends Fruit{
	
}

class Orange extends Fruit{
	
}

class Banana extends Fruit{
	
}