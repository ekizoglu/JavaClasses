package com.class27;

public class Examples {
	
	public String helloName(String str) {
		return str; 
	}
	
	public String helloName(String str, String str2) {
		return str+" " + str2; 
	}
	
	public void helloName(String str, String str2, String str3) {
		System.out.println(str+ " " + str2 + " " + str3);
	}
	
}

class SmallExample extends Examples{
	public String helloName(String str) {
		return "Hello " + str; 
	}
	
	
	
}
