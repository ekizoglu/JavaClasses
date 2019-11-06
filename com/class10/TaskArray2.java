package com.class10;

public class TaskArray2 {
	public static void main(String[] args) {
		/*
		 * Array of names and store all names of your group
		 * Then print your name from that array. 
		 * Use 2 different ways of creating an array
		 */
		
		String[] names = new String[6]; 
		names[0] = "Seval"; 
		names[1] = "Ahmet"; 
		names[2] = "Omer"; 
		names[3] = "Mehmet"; 
		names[4] = "Fethullah"; 
		names[5] = "Fatma"; 
		
		System.out.println(names[3]);
		
		String[] names1 = {"Seval", "Ahmet", "Omer", "Mehmet", "Fethullah", "Fatma"};
		System.out.println(names1[3]);
		}
				
	}

