package com.class4;
import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter any number: ");
		/*
		 * nextInt(); --> For numbers
		 * nextLine(); --> For Strings
		 * nextDouble(); --> double values
		 */
		int number =scan.nextInt();
		System.out.println("Entered number is " +number);
		
		System.out.println("*****************************");
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Please enter your name ");
		String name = input.nextLine(); 
		System.out.println("Good afternoon respected sir " + name);
		
	}
	
	
}
