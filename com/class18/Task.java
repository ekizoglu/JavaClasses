package com.class18;

public class Task {
	// Task 1 
	void largerNumber(int a, int b) {
		if (a > b) 
			System.out.println(a); 
		else 
			System.out.println(b); 
	}
	
	// Task2 
	void oddOrEven(int a)  
	{
		if (a % 2 == 0) 
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}
	
	// Task 3 
	void isPalindrome(String s) {
		String reverse = ""; 
		for (int i = s.length() - 1; i>=0; i--) {
			reverse = reverse + s.charAt(i); 
		}
		s.toLowerCase(); 
		reverse.toLowerCase(); 
		if (s.equals(reverse)) {
			System.out.println("String is palindrome");
		}
		else 
			System.out.println("String is NOT palindrome"); 
		
		
	}
	public static void main(String[] args) {
		int a = 5; 
		int b = 4; 
		String s = "kayak"; 
		String s1 = "renner"; 
		String s2 = "Renner"; 
		String s3 = "Kayak";
		String s4 = "Alex"; 
		
		Task compare = new Task(); 
		compare.largerNumber(a, b);
//		compare.oddOrEven(b);
		compare.isPalindrome(s);
		compare.isPalindrome(s4);
	}
}
