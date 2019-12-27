package com.class25_1;

public class Programming {
	
	Programming() {
		System.out.println("I love programming languages");
	}
	
	Programming(String str){
		System.out.println("I love " + str);
	}
	
	public static void main(String[] args) {
		Programming obj1 = new Programming(); 
		Programming obj2 = new Programming("Java");
	}
}
