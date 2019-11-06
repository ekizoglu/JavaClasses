package com.class11;
import java.util.Arrays;
public class ArrayManipulation {
	public static void main(String[] args) {
		String[] actualNames= {"Jhon", "Smith","Alex","Tanaz"};
        Arrays.sort(actualNames);
        
        String[] expectedNames= { "Smith","Jhon","Alex","Tanaz"};
        
        //To sort the elements of an Array
        Arrays.sort(expectedNames);
        
        System.out.println(Arrays.toString(actualNames));
        
        String actual=Arrays.toString(actualNames);
        String expected=Arrays.toString(expectedNames);
        
        System.out.println(actual.equals(expected));
        
        System.out.println("*****************************");
        
        int[] numbers = {123,34, 15,66,99}; 
        for (int i: numbers) {
        	System.out.print(i + " ");
         
        }
        
        System.out.println();
        System.out.println("********************************");
        
        Arrays.sort(numbers); 
        for (int i : numbers) {
        	System.out.print(i + " ");
        }
        
        System.out.println();
        System.out.println("********************************");
	}
}
