package com.class28;

public class Child extends Parent {
	String name = "James";
	public static void main(String [] args) {
		Child obj = new Child();
		obj.callName();
		System.out.println("********************");
		obj.callingMethod();
	}
	public void callName() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(lastName);
	}
	
	public void callingMethod() {
		callName(); //BY DEFAULT THIS IS ADDED - SO WE ARE CALLING CURRENT CLASS METHOD
		super.callName();
	}
	
}
