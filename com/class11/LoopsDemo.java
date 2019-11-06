package com.class11;

public class LoopsDemo {

	public static void main(String[] args) {
		
		int [] array = new int [6]; 
		array[0]= 33; 
		int [] arr = {2,3,5,7};
		
		for (int g=0; g<arr.length; g++) {
			System.out.println(arr[g]);
		}
		System.out.println("****************************");
		
		// For each loop
		for(int ar:arr) {
			System.out.println(ar);
		}
		System.out.println("****************************");
		int [] numbersList = {4,8,10,12}; 
		
		for (int element:numbersList) {
			System.out.println(element);
		}
	}
}
