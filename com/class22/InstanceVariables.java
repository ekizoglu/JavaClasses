package com.class22;

public class InstanceVariables {

	String name="Samir";
	
	public static void main(String[] args) {
		
		String name="Burcu";
		System.out.println(name);
		
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);
		//changing value of the instance variable
		obj.name="John";
		System.out.println(obj.name);
		//creating a new instance of Class InstanceVariables
		InstanceVariables obj1=new InstanceVariables();
		//output will be Samir
		System.out.println(obj1.name);
	}
}