package com.class11;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country. (use 2 different loops).
		 */

		String[] countries = { "India", "Canada", "USA" };

		for (String getCountry : countries) {
			if (getCountry.equals("USA")) {
				System.out.println("The capital of USA is Wahington DC");
			}
		}
		
		for (int i = 0; i < countries.length; i++) {
			if(countries[i].equals("USA")) {
				System.out.println("The capital of USA is Wahington DC");

			}
		}

	}

}
