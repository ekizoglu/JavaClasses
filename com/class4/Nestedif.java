package com.class4;

public class Nestedif {

	public static void main(String[] args) {
		boolean b = true; 
		boolean classToday = true;
		
		if(b)
		{
			System.out.println("Hello");
			if(classToday)
			{
				System.out.println("Hello my friends");
			}
		}
		else {
			System.out.println("Bye");
		}
	}
}
