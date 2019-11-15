package com.class19;

public class Student {

	char getGrade(int score) {
		char grade; 
		if(score >=90 && score <=100)
			grade = 'A'; 
		else if (score >=80 && score <90)
			grade = 'B'; 
		else if (score >=70 && score <80)
			grade = 'C'; 
		else if (score >=60 && score <70)
			grade = 'D'; 
		else
			grade = 'F'; 
		
		return grade; 
	}
	
	public static void main(String[] args) {
		Student Ali = new Student(); 
		char aliGrade = Ali.getGrade(70); 
		System.out.println(aliGrade);
	}
}
