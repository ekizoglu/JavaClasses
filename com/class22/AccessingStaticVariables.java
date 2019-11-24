package com.class22;

public class AccessingStaticVariables {

	public static void main(String[] args) {
		
		Husky obj=new Husky();
		System.out.println(obj.name);
		obj.name="Sharik";
		System.out.println(obj.name);
		
		System.out.println(Husky.breed);
		Husky.breed="New breed";
		System.out.println(obj.breed);//possible but not preferable
		
	}
}