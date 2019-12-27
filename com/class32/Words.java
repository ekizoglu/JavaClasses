package com.class32;
import java.util.ArrayList;
import java.util.Iterator;
/*
	Create an arrayList of words. Remove every
	word that ends with “e”. Use iterator
 */
public class Words {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>(); 
		words.add("Ayse");
		words.add("Fatma"); 
		words.add("Janine"); 
		words.add("Adams"); 
		
		Iterator<String> it = words.iterator();
		while (it.hasNext()) {
			if(it.next().endsWith("e")) {
				it.remove();
			}
		}
		
		System.out.println(words);
		
	}
}
