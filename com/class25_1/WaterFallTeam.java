package com.class25_1;

import com.class25.Employee;

public class WaterFallTeam extends Employee {
	public static void main(String[] args) {

		WaterFallTeam team = new WaterFallTeam();
		// team.companyName;
		Employee.companyName = "Syntax";
		
		// accessing protected variable in different package
		team.employeeID = 102;
		
	
		// Private variables and methods are not inherited (they won't be available in
		// the subclasses)
		// Default variables and methods are available to the child class in the SAME
		// PACKAGE ONLY.
		// Protected variables and methods are available to the child class defined in
		// DIFFERENT PACKAGE.

	}
}
