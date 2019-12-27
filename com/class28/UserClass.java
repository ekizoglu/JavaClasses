package com.class28;

public class UserClass{
	/*
	 * Write program: userClass  that has a constructor that initializes name and mobile number
	 * instance variables. Create a subclass  userInfo that will have user address variable 
	 * and it also being initialized through constructor call. Print users name, 
	 * mobile number and address in userDetails method. Test your code.
	 */
	
	String name, mobileNumber; 
	UserClass(String name, String mobileNumber) {
		this.name = name; 
		this.mobileNumber = mobileNumber; 
	}
	
	
}

class UserInfo extends UserClass{
	String address; 
	UserInfo(String name, String mobileNumber, String address ){
		super(name, mobileNumber); 
		this.address = address; 
	}
	
	public void userDetails() {
		System.out.println(name + " " + mobileNumber + " " + address); 
	}
	
	
	
}

