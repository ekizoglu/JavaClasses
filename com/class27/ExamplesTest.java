package com.class27;

public class ExamplesTest {
	public static void main(String[] args) {
		Examples ex = new SmallExample(); 
		String str = ex.helloName("John"); 
		System.out.println(str);
		
		Examples ex1 = new SmallExample(); 
		String str1 = ex1.helloName("Ali"); 
		System.out.println(str1);
		
		
	}
}
