package com.class7;
import java.util.Scanner;
public class TaskDoWithScanner {
	/*
	 * Ask user to enter 5 names
	 * Output should be "Good Afternoon (name)"
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int count = 1;
		
		while (count <= 5) {
		System.out.println("Please enter your name"); 
		String name = sc.nextLine();  
		System.out.println("Good afternoon " + name);
		count++; 
		}
		
	}
	
}
