package com.class38;

public class SpecificToGeneral {
	public static void main(String[] args) {
		division(12,0);
		division(12, 2);
		
	}
	
	public static void division(int num1, int num2) {
		int result; 
		/* 
		 * We can have multiple catch blocks associated with try block
		 * Only one catch block will be executed depending on the exception thrown at runtime
		 * Cannot have multiple tries. 
		 * When we create multiple catch blocks we should specify order of catch blocks from specific
		 * to general (i.e. ArithmeticException --> Exception)
		 * 
		 * Inside Throwable class we can use 3 methods to call and get details on the exception
		 * 	.printStackTrace
		 * 	SOPln(exceptionObject)
		 * 	getMessage(): String
		 * 	
		 */
		try {
			result = num1/num2; //new ArithmeticException();
			System.out.println(result);
			Thread.sleep(5000);//new InterruptedException();
		}
//		catch(Exception e) { CE: Unreachable code, exception already handled for below catch blocks
//			System.out.println("Catching all types of exception");
//		}
		catch(ArithmeticException e) {
//			System.out.println("Please do not pass zero as denominator");
			e.printStackTrace();
		}
		catch(InterruptedException e) {
//			System.out.println("Someone interrupted program sleep");
			System.out.println(e);
		}
		
		catch(Exception e) {
//			System.out.println("Catching all types of exception");
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of my method");
	}
}
