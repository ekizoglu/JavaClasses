package com.class37;

public class ExceptionIntro {
	/*
	 * Parent of all exceptions is Throwable Class
	 * We have 2 Types of throwable objects/classes
	 * 	Error - Sth that cannot be handled (i.e. Out of memory error)
	 * 		error will occur usually because of lack of system resources.
	 * 	Exception - is an object that is thrown at the runtime and can be handled 
	 * 		programmatically.
	 * 	2 Types of exception: 
	 * 		All exception will occur during runtime some are warned by the compiler some are not
	 * 		Checked - compile time exceptions --> occur during compilation and you will have to 
	 * 			handle them, otherwise your code will not compile. CE, compiler will warn 
	 * 		Unchecked - this type of exception is not checked by the compiler. (i.e. Arithmetic
	 * 			exception, ArrayIndexOutOfBoundaryException etc). RE, compiler will not warn
	 * 
	 * 		To handle any exception we can use try and catch block
	 * 			try block will consist of any code that might throw an exception
	 * 			catch block is a block that need to catch the object of the thrown exception
	 * 				inside catch block we must provide corresponding exception type
	 */
	public static void main(String[] args) {
		int a = 20; 
		int b = 0;
		System.out.println(a/b);
		
		System.out.println("Code after an exception");
		System.out.println("Continues Code");
		
		int[] array = {10,20,30}; 
		System.out.println(array[3]);
		
		//anytime exception occurs an exception object gets created
		ArithmeticException exception = new ArithmeticException(); 
		throw(exception); 
	}
}
