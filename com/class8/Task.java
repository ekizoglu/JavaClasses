package com.class8;

public class Task {

	public static void main(String[] args) {
		for (int a = 1; a<=100; a++) {
			System.out.println(a);
		}
		
		for (int b = 1; b<=100; b++) {
			System.out.print(b + " ");
		}
		System.out.println();
		for (int c = 20; c>=0; c--) {
			if(c%2 == 0) 
				System.out.println(c);	
		}
		System.out.println();
		
		for (int d = 20; d>=0; d--) {
			if (d%2 == 0 )
				System.out.print(d + " ");
		}
		
		for (int e = 20; e<=50; e++) {
			if (e%2 == 1)
				System.out.println(e);
		}
		
		System.out.println();
		for (int f = 20; f<=50; f++) {
			if (f%2 == 1)
				System.out.print(f + " ");
		}
		
		
				
		
	}
}
