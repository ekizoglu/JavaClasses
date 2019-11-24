package com.class21;

public class Students {
	public String Name; 
	public int ID; 
	public static int numberOfStudents = 0; 
	
	public static void main(String[] args) {
		Students std1 = new Students();
		Students std2 = new Students();
		Students std3 = new Students();
		
		std1.Name = "Ali"; 
		std1.ID = 10; 
		numberOfStudents++; 

		std2.Name = "Ayse"; 
		std2.ID = 11; 
		numberOfStudents++; 
		
		std3.Name = "Fatma"; 
		std3.ID = 12; 
		numberOfStudents++; 
		
		System.out.println(numberOfStudents);
		
	}
}
