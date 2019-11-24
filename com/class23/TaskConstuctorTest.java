package com.class23;

public class TaskConstuctorTest {
	public static void main(String[] args) {
		TaskConstructor newTask = new TaskConstructor(); 
		newTask.name = "Task1";
		newTask.number = 1;
		TaskConstructor newTask2 = new TaskConstructor("Task2", 2 ); 
		newTask.displayInfo();
		newTask2.displayInfo();
		
		
	}
	
}
