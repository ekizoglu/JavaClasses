package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter your class day:: ");
		String day=scanner.nextLine();
		String day1=day.toLowerCase();
		
		
		if(day.trim().toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your Java Class");
		}else if(day.toLowerCase().equals("sunday")) {
			System.out.println("Sunday is your Git Class");
		}else if(day.trim().toUpperCase().equals("TUSEDAY")) {
			System.out.println("Tuseday is your SDLC class");
		}else if(day.trim().toLowerCase().equals("thursday")) {
			System.out.println("Thursday is your Manual Testig class");
		}else {
			System.err.println("Envalid Entry!! Please enter a valid class day");
		}
		scanner.close();
		
	}

}
