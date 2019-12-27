package com.class28;

public class Room extends Building{
	int roomNumber; 
	
	Room(String str, int num, int roomNumber){
		//super(); Compiler will implicitly call the constructor to initialize parent class instance variables
		super(str,num); //if you only have a parameterized constructor within super class
					    //when calling the super constructor you need to initialize it. 	
		this.roomNumber = roomNumber; 
	}
	public void print() {
		System.out.println(address+" "+floor+" "+roomNumber);
	}
	public static void main(String[] args) {
		Room room = new Room("121 Test Driver",10,101); 
		//System.out.println(room.floor); 
		room.print();
	}
}
