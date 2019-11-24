package com.class23;

public class TaskConstructor {
	String name; 
	int number; 
	
	public void displayInfo() {
		System.out.println("Task name " + name + " number " + number);
	}
	TaskConstructor(){
		
	}
	
	TaskConstructor(String taskName, int taskNumber){
		name = taskName;
		number = taskNumber; 
		}
	
	
	
	
}
