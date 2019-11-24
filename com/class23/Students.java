package com.class23;

public class Students {
	String name; 
	int grade1, grade2, grade3; 
	static int numberOfStudents;
	
	Students(String studentName, int studentGrade1, int studentGrade2, int studentGrade3){
		name = studentName;
		grade1 = studentGrade1;
		grade2 = studentGrade2; 
		grade3 = studentGrade3; 
				
	}
	public int calculateAverageGrade() {
		int averageGrade = (grade1 + grade2 + grade3)/3; 
		return averageGrade;	
	}
	
	
	
}
