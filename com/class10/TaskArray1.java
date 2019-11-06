package com.class10;

public class TaskArray1 {
	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it:
		 * A,B,C,D,E,F. Then print a grade B(use 2 different ways
		 * of creating an array)
		 */
		char[] chars1 = new char[6]; 
		chars1[0] = 'A'; 
		chars1[1] = 'B'; 
		chars1[2] = 'C'; 
		chars1[3] = 'D'; 
		chars1[4] = 'E'; 
		chars1[5] = 'F'; 
		
		char[] chars2 = {'A', 'B', 'C', 'D', 'E', 'F'}; 
		
		System.out.println(chars1[1]);
		System.out.println(chars2[1]);
	}
}
