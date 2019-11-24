package com.class23;

public class StudentsTest {
	public static void main(String[] args) {
		Students std1 = new Students("Ali", 50, 60, 70);
		Students std2 = new Students("Ayse", 60, 70, 80);
		Students std3 = new Students("Fatma", 70, 80, 90);
		Students std4 = new Students("Mehmet", 80, 90, 100);
		Students std5 = new Students("Niyazi", 100, 90, 90);
		
		System.out.println("Student name " + std1.name + " Student grade average " + std1.calculateAverageGrade());
		System.out.println("Student name " + std2.name + " Student grade average " + std2.calculateAverageGrade());
		System.out.println("Student name " + std3.name + " Student grade average " + std3.calculateAverageGrade());
		System.out.println("Student name " + std4.name + " Student grade average " + std4.calculateAverageGrade());
		System.out.println("Student name " + std5.name + " Student grade average " + std5.calculateAverageGrade());
	}
}
