package com.class21;

public class School {

	public static void main(String[] args) {

		Student student1 = new Student();
		
		//assigning instance variables
		int hours = 3;
		student1.studentName = "Eric"; 
		student1.GPA = 3.95;
		student1.school = "Syntax"; 
		student1.displayInfo();
		student1.study(hours);
		
		Student student2 = new Student(); 
		student2.studentName = "Jaime"; 
		student2.GPA = 3.90; 
		student2.school = "Syntax Technologies"; 
		student2.displayInfo();
		student2.study(hours);
		
		System.out.println(student1.studentName + " again");
		student1.displayInfo(); 
		
		
			
	}
}
