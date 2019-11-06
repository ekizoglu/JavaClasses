package com.class11;

public class Task2DArray {
	
	//2D Array of String Data Type with 2 rows and 3 columns
	public static void main(String[] args) {
		String[][] string2DArray = new String[2][3]; 
		
		//1st row
		string2DArray[0][0] = "Ali"; 
		string2DArray[0][1] = "Ahmet"; 
		string2DArray[0][2] = "Ayse"; 
		
		//2nd row
		string2DArray[1][0] = "Baris"; 
		string2DArray[1][1]	= "Baha"; 
		string2DArray[1][2] = "Boris"; 
		
		
		System.out.println(string2DArray[1][2]); 
		
		
		// Declare and initialize in the same line
		int [][] numbers= {
				{8,7,5,3,8}, 
				{1,5,6,4,5},
				{3,6,8,0,7}
				
		};  
		
		System.out.println("The value in index 1 and 4 is = " + numbers[1][4]);
		// To identify the number of Rows
		System.out.println("The number of Rows are: " + numbers.length);
		// To identify the number of Columns/elements in a row
		System.out.println("The number of Columns are= " + numbers[0].length );
	}
}
