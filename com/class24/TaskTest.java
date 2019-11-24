package com.class24;

public class TaskTest {
	public static void main(String[] args) {
		Task defaultTask = new Task(); 
		//Task privateTask = new Task(2); //need access (private constructor)
		Task publicTask = new Task(3,"task3"); 
		Task protectedTask = new Task(4, "task4", 'D');
	}
}
