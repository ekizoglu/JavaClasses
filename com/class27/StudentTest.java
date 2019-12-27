package com.class27;

public class StudentTest {
	public static void main(String[] args) {
		SyntaxStudent ss = new SyntaxStudent();
		ss.study();
		
		//ss.doHomework(); not visible since private Compiler Error
		ss.attendClasses();
		ss.research();
		
		Student student = new SyntaxStudent(); 
		student.study();
		student.research();
		student.attendClasses();
		//student.doHomework(); not visible since private Compiler Error
	}
}
