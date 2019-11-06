package com.class8;
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		for (int i = 1; i <=50; i++) {
			if (i%3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i<=10; i++) {
			System.out.println("Would you like to apply for a credit card:"); 
			String input = sc.next();
			
			if (input.equalsIgnoreCase("yes")) {
				break; }
		}
	}
}
