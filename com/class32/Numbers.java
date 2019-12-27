package com.class32;
import java.util.ArrayList;
import java.util.Iterator;

/*
	Create an arrayList of even numbers from 1
	to 50. Using Iterator remove any number that
	is divisible by 5 from that arrayList.

 */
public class Numbers {
	public static void main(String[] args) {
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		for (int i = 0; i<=50; i++) {
			if(i%2 ==0) {
			evenNumbers.add(i);}
		}
		Iterator<Integer> it = evenNumbers.iterator();
		while(it.hasNext()) {
			if(it.next() % 5 == 0) {
				it.remove();
			}
		}
		
		System.out.println(evenNumbers);
	}
}	
