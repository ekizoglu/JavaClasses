package com.class27;

public class Student {
	public void study() {
		System.out.println("Student studies");
	}
	
	private void doHomework() {
		System.out.println("Student does homework");
	}
	
	protected void research() {
		System.out.println("Student does research");
	}
	
	void attendClasses() {
		System.out.println("Student attends classes");
	}
	
	
}

class SyntaxStudent extends Student{
	@Override
	public void study() {
		System.out.println("Syntax Student studies");
	}
	
	//@Override, compiler will complain since the method is not visible, it can however be implemented
	//Because private methods do not get inherited
	private void doHomework() {
		System.out.println("Syntax Student does homework");
	}
	
	@Override
	protected void research() {
		System.out.println("Syntax Student does research");
	}
	
	@Override
	void attendClasses() {
		System.out.println("Syntax Student attends classes");
	}
}
