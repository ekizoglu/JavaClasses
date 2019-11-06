package com.class4;

public class IfElseRecap {
	public static void main(String[] args) {
		/*Class schedule
		 * if Tuesday --> SDLC
		 * if Wednesday --> Java review
		 * if Thursday --> SDLC
		 * if Saturday--> Java coding
		 * if Sunday --> My favorite Java coding
		 */
		
		int day = 4; 
		if (day==2)
		{
			System.out.println("SDLC Class");
		}
		else if(day==3)
		{
			System.out.println("Review Class");
		}
		else if (day==4)
		{
			System.out.println("SDLC Class");
		}
		else if (day==6)
		{
			System.out.println("Java Class");
		}
		else if (day == 7)
		{
			System.out.println("My favorite Java Coding");
		}
		else
		{
			System.out.println("No Class");
		}
	}
}
