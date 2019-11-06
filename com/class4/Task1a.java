package com.class4;

public class Task1a {
	public static void main(String[] args) {
		boolean diploma = true; 
		double GPA = 3.6; 
		
		if (diploma)
		{
			System.out.println("Congratulations on your degree!");
			if (GPA >=3.5) {
				System.out.println("You are eligible for scholarship");
			}
			else if (GPA < 3.5) {
				System.out.println("You should have studied harder");
			}
				
		}
		else
			System.out.println("Get a degree!");
	}
}
