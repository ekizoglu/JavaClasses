package com.class3;

public class RelationalOperators {
	
	public static void main(String[] args) {
		//==, !=, >=, <=, <,> 
		int num1=20;
		int num2=19;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("****************");
		
		double d=1.99; 
		double d1=2.99; 
		
		boolean b=d>d1; 
		System.out.println(b);
		
		boolean b1=d<d1; 
		System.out.println(b1);
		
		boolean b2=d==d1;
		System.out.println(b2);
		
		boolean b3=d!=d1; 
		System.out.println(b3);
		
		
		int a=30; 
		int e=20; 
		
		if(a>e) { 
			System.out.println("a is larger than e");
		}
	}

}
