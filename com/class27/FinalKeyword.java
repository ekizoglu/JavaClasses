package com.class27;

public class FinalKeyword {
	/* 
	 * Can have more than one access modifiers following is legal
	 * In fact final variables will usually be declared in a static fashion
	 * 
	 * Final keyword key points summary: 
	 * - variables --> makes variable to have a constant value that cannot be changed later on
	 * - methods --> prevents overriding, final methods cannot be overridden in the child class
	 *				 We can still overload.
	 * - classes --> prevents inheritance, class defined as final cannot have any subclasses
	 * 				 FOREVER ALONE :)
	 * Method Overloading vs Method Overriding
	 * 1. Same method name but different parameters within same class (method signature must be different),
	 * while in overriding same method name and same parameters(numbers, orders) - method signature must be SAME
	 * 2. Return type can be different in overloading(return type is not part of method signature), while in
	 * OVERRIDING must be same 
	 * 3. To overload no inheritance is needed, to override we must use inheritance
	 * 4. Static, final, private methods can be overloaded, but cannot be overridden
	 * 5. Constructors can be overloaded but cannot be overridden
	 * 6. In overloading no restriction to access modifiers, while in overriding the scope visibility
	 *    cannot be reduced (can be the same, or increased going from least to most visible)
	 */
	public static final String str = "Hello Static Final";
	
	public static void main(String[] args) {
		String str1 = "I am awesome"; 
		str1 = "I am cool"; 
		System.out.println(str1);
		
		final String finalString = "Java is easy"; 
		//finalString = "Java is hard";  Compiler error
		
		final int age = 120; 
		//age = 100;	Compiler error 
		
		FinalKeyword obj = new FinalKeyword(); 
		System.out.println(obj.str);
		obj.hello();
		System.out.println("***********");
		obj.hello(1);
	}
	
	public final void hello() {
		System.out.println("I am a final method in parent class");
	}
	
	//can we overload a final method --> Yes
	public final void hello(int num) {
		System.out.println("I am a final method in parent class with 1 parameter");
	}

}

class FinalKeywordChild extends FinalKeyword{
	//final methods cannot be overridden, will get a Compiler Error
	/*
	public final void hello() {
		System.out.println("I am a final method in child class");
	}
	*/
	
	
}
