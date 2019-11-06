package com.class3;

public class PrimitiveCasting {

	public static void main(String[] args) {
		double d=12;
		System.out.println(d);
		//int i=12.0; compile time error
		/*
		 * Casting definition: Changing/converting one data type 
		 * to another data type
		 * Widening(Implicit/Automatic)
		 * Narrowing(Explicit/Manual)
		 * from smaller to larger units 
		 * byte-->short-->int-->long-->float-->double
		 */
		
		byte b=127; 
		int i =b;
		
		//Implicit casting storing int into double compiler will do
		int num=123;
		double d1=num; 
		System.out.println(d1);
		
		//Explicit casting narrowing going from larger data type to smaller
		//JVM will cast but some information will be lost, i.e. Decimal Places
		double d2 = 123.56; 
		int num2=(int)d2;
		System.out.println(num2);
		
		//Will compile but the result will be very different from the initial number
		int num3=1000; 
		byte b1=(byte)num3; 
		System.out.println(b1);
		
		
	}
		
		
}
