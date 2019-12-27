package com.class34;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class SetFamilyMembers {
	public static void main(String[] args) {
		Set<String> fruitSet = new LinkedHashSet<>();
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Grape");
		fruitSet.add("Pineapple");
		fruitSet.add("Banana");
		
		System.out.println(fruitSet.size());
		System.out.println(fruitSet);
		
		Set<Integer> tset = new TreeSet<>();
		tset.add(200);
		tset.add(2000); 
		tset.add(20); 
		tset.add(999);
		tset.add(0);
		tset.add(999);
		tset.add(0);	
		
		System.out.println(tset.size());
		System.out.println(tset);
		
		//Adding Collection into a Collection
		List<String> list = new ArrayList<>(); 
		list.add("Java"); 
		list.add("Selenium"); 
		list.add("TestNG"); 
		
		Set<String> linkedSet= new LinkedHashSet<>(); 
		linkedSet.addAll(fruitSet); 
		linkedSet.addAll(list); 
		
		System.out.println("-----------Objects from both collections");
		System.out.println(linkedSet);
	}
}
