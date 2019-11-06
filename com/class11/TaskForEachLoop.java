package com.class11;

public class TaskForEachLoop {

	public static void main(String[] args) {
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		String[] cars = {"Acura", "BMW", "Nissan", "Infiniti", "Lexus", "Toyota"};
		for (int i=0; i<cars.length ;i++) {
			System.out.println(cars[i]);
		}
		System.out.println("**********************");
		
		for (String car : cars) {
			System.out.println(car);
		}
		
		
		//Create an array on integers and calculate the sum of all elements in an array.
		System.out.println("**********************");
		int[] integers = {1, 2, 3} ;
		int sum = 0; 
		for (int i = 0; i<integers.length; i++) {
			sum +=integers[i]; 
		}
		System.out.println(sum);
		
		System.out.println("**********************");
		sum = 0; 
		for (int integer : integers) {
			sum += integer;
		}
		System.out.println(sum);
		System.out.println("**********************");
		//Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
		String[] countries = {"Turkey", "USA", "Russia"};
		for (int i = 0; i<countries.length; i++) {
		switch(countries[i]) {
		case "Turkey":
			System.out.println("Ankara");
			break;
		case "Russia": 
			System.out.println("Moscow");
			break;
		case "USA":
			System.out.println("Washington DC");
			break;}
		}
		
		System.out.println("**********************");
		for (String country: countries) {
//			switch(country) {
//			case "Turkey":
//				System.out.println("Ankara");
//				break;
//			case "Russia": 
//				System.out.println("Moscow");
//				break;
//			case "USA":
//				System.out.println("Washington DC");
//				break;}
			if (country.equals("Turkey")){
				System.out.println("Ankara");
			}
			else if (country.equals("USA")) {
				System.out.println("Washington DC");
			}
			else 
				System.out.println("Moscow");
			}	
		
		}
		
	}
