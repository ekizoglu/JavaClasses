package com.class25_1;

public class OverloadTask {
	static void m1() {
		System.out.println("I am method m1");
	}
	
	static void m1(String str) {
		System.out.println("I am method m1 with String param");
	}
	
	static void m1(int number) {
		System.out.println("I am method m1 with int param");
	}
	
	public static void main(String[] args) {
		m1();
		m1("Hello"); 
		m1(10); 
	}
	
	
}
