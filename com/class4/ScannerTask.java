package com.class4;
import java.util.Scanner; 
public class ScannerTask {

	public static void main(String[] args) {
		//task1
		
		Scanner input = new Scanner(System.in);
		System.out.println("How much are you looking to take out?");
		
		int loan = input.nextInt(); 
		if (loan <=200000) {
			System.out.println("We can work around that!");
		}
		else {
			System.out.println("Sorry we are unable to process your request.");
		}
		
		//task2
		Scanner input1= new Scanner (System.in); 
		System.out.println("Enter your age: ");
		int age = input1.nextInt(); 
		if (age >=18) {
			System.out.println("Great you can get a DL");
		}
		else if (age <18) {
			if (age >=16) {
				System.out.println("You can get a learners permit");
			}
			else 
			{
				System.out.println("You cannot get any type of license at this moment! ");
			}
		}
		
		//task3
		
		Scanner input3= new Scanner(System.in);
		Scanner input4= new Scanner(System.in); 
		
		
		
		
		System.out.println("Enter a city: ");
		String city = input4.nextLine(); 
		
		System.out.println("Enter a temperature in Fahrenheit: ");
		double temperature = input3.nextDouble();
		
		temperature =  ((temperature - 32) / 1.8); 
		
		System.out.println("The temperature of the city " + city + " is " + temperature + " Celcius Degrees");
		
	}
	
	
}
