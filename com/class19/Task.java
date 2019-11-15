package com.class19;

public class Task {
	String createEmail(String userName, String userLastName, String emailType) {
		String emailAddress = userName + userLastName + "@" + emailType + ".com";
		return emailAddress;
	}

	boolean isPrime(int num) {
		boolean isPrime = true;
		if (num == 0 || num == 1) {
			isPrime = false;} 
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;}			
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Task task = new Task();
		String task1 = task.createEmail("adam", "sandlers", "gmail");
		System.out.println(task1);
		boolean task2 = task.isPrime(0);
		System.out.println(task2);
	}

}
