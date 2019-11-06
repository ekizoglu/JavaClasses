package com.class10;

public class TaskArray4 {
	/*
	 * Create an array of countries. While retrieving all values from an array print
	 * capital for each country.
	 */
	public static void main(String[] args) {
		String[] countries = {"Turkey", "USA", "Russia"}; 
		
		for (int i = 0; i<countries.length; i++) {
			if (countries[i].equals("Turkey")) 
				System.out.println("Ankara");
			else if (countries[i].equals("USA")) 
				System.out.println("Washington DC");
			else 
				System.out.println("Moscow");	
		}
		
//		With Switch case inside the loop
//************************************************************************
		
//		switch (countries[i]) {
//		case "Turkey":
//			System.out.println("Ankara");
//			break;
//		case "Russia": 
//			System.out.println("Moscow");
//			break;
//		case "USA":
//			System.out.println("Washington DC");
//			break;
//		}
		
//************************************************************************		
		
		
	}
}
