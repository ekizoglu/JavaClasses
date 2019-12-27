package com.class34;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
public class Task {
	public static void main(String[] args) {
		
		ArrayList<Integer> gradeList = new ArrayList<>();
		gradeList.add(50); 
		gradeList.add(60);
		gradeList.add(70);
		gradeList.add(50);
		gradeList.add(60);
		gradeList.add(80);
		Set<Integer> grades = new HashSet<>(); 
		grades.addAll(gradeList); 
		System.out.println(grades);
		
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		Set<String> list = new LinkedHashSet<String>(); 
		list.addAll(aList); 
		System.out.println(list);

		
		
		
		
		
	} 
	
}
