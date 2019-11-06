package com.class9;

public class Pattern {
	public static void main(String[] args) {
		
		for (int k=1; k<=5; k++) {
			System.out.print("*");
		}
		System.out.println();
		for (int k=1; k<=5; k++) {
			System.out.println("*");
		}
		System.out.println();
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		
		for (int i = 0; i<5 ; i++) {//rows
			for (int j=0; j<7;j++) {//columns
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		
		
		for (int i=1; i<5; i++) {
			for (int j=1; j<6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}
}
