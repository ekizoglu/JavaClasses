package com.class25;

public class Test {
	public static void main(String[] args) {
		System.out.println("Creating an object of Employee class");
		Employee emp = new Employee();
		emp.salary = 70000; 
		Employee.companyName = "Syntax"; 
		emp.work();
		emp.getPaid();
		
		System.out.println("*************************************");
		
		System.out.println("Creating an object of ScrumTeam class");
		ScrumTeam sm = new ScrumTeam(); 
		sm.salary = 90000; 
		sm.work();
		sm.getPaid(); 
		sm.artifacts = "Product Backlog, Sprint Backlog, Burndown Chart"; 
		sm.ceremonies = "Sprint Demo, Planning, Retro, Daily Standup"; 
		
		System.out.println("Creating an object of Developer class");
		Developer dev = new Developer(); 
		dev.salary = 120000; 
		dev.work(); 
		dev.getPaid();
		dev.artifacts = "Sprint Demo, Planning, Retro, Daily Standup";
		dev.ceremonies = "Spring Demo"; 
		
	}
}
