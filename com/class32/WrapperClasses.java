package com.class32;
/* Limitation of Array: Array is a fixed size data structure
 * We do not have methods to manipulate data(add, remove, replace etc)
 * Except for some basic functionality
 * To overcome limitation with the array --> Collections concepts came into action 
 * Collection is a group of objects represent as a single unit
 * Wrapper Classes: is class that convert non-primitive types into Object Types
 * Provide a way to use primitive data types as objects
 * Why do we need it: Using wrapper classes we store converted primitive types inside our collections
 * (number, characters, boolean)
 */
public class WrapperClasses {
	public static void main(String[] args) {
		int num = 10; 
		
		//Autoboxing --> Converting primitive type into an Object type
		Integer integer = 100; 
		System.out.println(integer.MIN_VALUE);
		String str = integer.toString();
		System.out.println(str);
		
		//Converting boolean primitive type into boolean object type
		Boolean bool = true; 
		Byte $b = 20; 
		System.out.println($b.MAX_VALUE);
		
		//AutoUnboxing --> Converting Object type into a primitive type
		int num1 = new Integer(10);
		System.out.println(num1);
	}
}
