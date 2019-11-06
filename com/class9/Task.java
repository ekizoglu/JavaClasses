package com.class9;

public class Task {
	
	/*
	 * 123456789
	 * 123456789
	 * 123456789
	 * 123456789
	 * 123456789
	 */
	
	public static void main(String[] args) {
		for (int i=1; i<6; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		/*
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		
		System.out.println("------------------------------------------");
		for (int i=5; i>0; i--) {
			for (int j=5; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		 * 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */
		System.out.println("------------------------------------------");
		for (int i=5; i>0; i--) {
			for (int j=5; j>0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}
