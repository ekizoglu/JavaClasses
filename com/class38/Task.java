package com.class38;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Task {
	public static void main (String[] args)throws InterruptedException {
		/*
		 * How would handle InputMismatchException? Input Mismatch Exception when user
		 * enters mismatch value then programmer expected.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input of integer type");
		try {
			int input = sc.nextInt();
		}
		catch(InputMismatchException e) {
//			System.out.println(e);
			System.out.println("Enter integer only");
//			e.printStackTrace();
		}
		System.out.println("********************END OF TASK 1*******************");
		System.out.println();
		Thread.sleep(2000);
		System.out.println("************Task2******************");
		/*
		 * Task 2 
		 * Method that will return exception list, using try catch throw exceptions 
		 * add them to the list
		 * in main method call exceptionList and print details of each exception
		 */
		
		ArrayList<Exception> exceptionList = exceptionList();
		System.out.println(exceptionList);
		
	}
	public static ArrayList<Exception> exceptionList(){
		ArrayList<Exception> exceptionList = new ArrayList<>();
		try {
		 int a = 2; int b=0; int result = a/b; 
		}
		catch(ArithmeticException a) {
			exceptionList.add(a);
		}
		
		try {
			int[] arr = {1,2}; 
			 System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException c) {
			exceptionList.add(c);
		}
		try {
			int[] arr = {1,2}; 
			 System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException c) {
			exceptionList.add(c);
		}
		
		try {
			int a = 2; int b=0; int result = a/b;
		}
		catch(Exception d) {
			exceptionList.add(d);
		}
		
		return exceptionList;
		
		
		
		
	}
	

}
