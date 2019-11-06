package com.class3;

public class PrimitiveCasting1 {
	public static void main(String[] args) {
		//FYI - for your information
		double d=12;
		System.out.println(d);
		
		//int i=12.0; compile time error 
		//widening or automatic or implicit casting
		byte b=127;
		int i=b;
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		//narrowing or explicit or manual casting
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		int num3=789;
		byte b1=(byte)num3;
		System.out.println(b1);
	}
}
