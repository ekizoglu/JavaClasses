package com.class24;

public class Task {
	String name; 
	char identifier;
	int number;
	
	Task(){
		
	}
	/* When your local variables have same name you need to use this keyword
	 * this keyword refers to the current object in method or constructor
	 * if you assign different names to local and instance variables 
	 * you do not need to use this keyword.
	 */
	private Task(int number) {
		this.number = number; 
	}
	
	// Here this keyword is not needed but you can still do the following
	// this.number = taskNumber, this.name = taskName
	
	/* The following is illegal you cannot do this
	 * this.taskName = taskName; 
	 * this.taskName = name;  
	*/ 
	public Task(int taskNumber, String taskName) {
		number = taskNumber;
		name = taskName; 
	}
	 
	protected Task(int taskNumber, String taskName, char taskIdentifier) {
		number = taskNumber;
		name = taskName;
		identifier = taskIdentifier; 
	}
	
	
	
	/*static Task(int taskNumber, char taskIdentifier) {
	}
	//Cannot Use Non Access Parameters on Constructor*/
	
	
	public static void main(String[] args) {
		Task defaultTask = new Task(); 
		Task privateTask = new Task(2); 
		Task publicTask = new Task(3,"task3"); 
		Task protectedTask = new Task(4, "task4", 'D'); 
		
	}
	
	
	
	
	
}
