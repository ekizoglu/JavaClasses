package com.class25;

public class Employee {
	int salary; // accessible within the package
	public static String companyName; // accessible through the project
	private String employeeSSN; // accessible within the same class only
	protected int employeeID; // 
	
	
	
	void work() {
		System.out.println("I work at " + companyName );
	}
	
	void getPaid() {
		System.out.println("I get paid " + salary);
	}
}
