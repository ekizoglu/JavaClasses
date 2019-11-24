package com.class21;

public class Employee {
	int eID;
	double salary; 
	public static String CEO = "Sumair"; 
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee(); 
		Employee e2 = new Employee(); 
		e1.eID = 1234; 
		e1.salary = 80000;
		System.out.println(e1.eID);
		System.out.println(e1.salary);
		System.out.println(CEO);
		
		e2.eID = 12345; 
		e2.salary = 85000;
		System.out.println(e2.eID);
		System.out.println(e2.salary);
		System.out.println(CEO);
	}
	
	
}
