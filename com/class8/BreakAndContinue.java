package com.class8;

public class BreakAndContinue {
	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			if (i==5)
				break; 
			System.out.println(i);
		}
		System.out.println("I am outside the loop");
		
		// Ignore the case i==3 and jump to the next iteration
		for (int i=1; i<=5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("I'm outside the loop");
		System.out.println("***************************");
		
		// skip 3 and 4 use || (or) since i cannot be 3 and 4 at the same time
		for (int i=1; i<=5; i++) {
			if (i==3 || i == 4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("I'm outside the loop");
	}
	
	
}
