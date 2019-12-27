package com.class32;

/*
 * 1. Create Registration Class in which you
would have variables as email, userName
and password that have an access scope
only within its own class. After creating an
object of the class user should be able to
call methods and in each method
separately pass values to set users email,
username and password.

Requirements:

A. Valid email consider to be only gmail

B. Valid userName and password cannot be
empty and should be of length larger than
6 characters. Also valid password cannot
contain userName.

 */
class RegistrationClass{
	private String email, userName, password; 
	
	//setting email
	public void setEmail(String email) {
		if (email.contains("gmail.com")) {
			this.email = email; 
		}else {
			System.out.println("Invalid email type. Email must be gmail");
		}
	}
	
	//getting email
	public String getEmail() {
		return email; 
	}
	
	//setting username
	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			if(userName.length() >6) {
				this.userName = userName; 
			}
			else {
				System.out.println("Username must contain 7 or more characters");
			}
		}
		else {
			System.out.println("Username cannot be empty");
		}
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		if(!password.isEmpty()) {
			if (password.length() > 6) {
				if(!password.contains(userName)) {
					this.password = password;
				}
				else {
					System.out.println("Password cannot contain username");
				}
			}
			else
			{
				System.out.println("Password should have more than 6 characters");
			}
		}
		else {
			System.out.println("Password cannot be empty");
		}
	}
	//get password
	public String getPassword() {
		return password;
	}
}

public class RegistrationTest {
	public static void main(String[] args) {
		RegistrationClass obj = new RegistrationClass(); 
		obj.setUserName("john123245");
		System.out.println(obj.getUserName());
	}
}
