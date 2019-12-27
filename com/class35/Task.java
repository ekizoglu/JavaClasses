package com.class35;
import java.util.HashMap;
public class Task {
	public static void main(String[] args) {
		HashMap<Integer, String> building = new HashMap<>(); 
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Intel");
		building.put(4, "Microsoft");
		building.put(4, "Amazon");
		building.put(6, "Google");
		building.put(7, "Microsoft");
		
		int size = building.size();
		System.out.println(size);
		boolean flag = building.containsKey(4); 
		if (flag) {
			building.replace(4, "New Company");
		}
		
		boolean flag1 = building.containsKey(7); 
		if (flag1) {
			building.remove(7); 
		}
		
		System.out.println(building);
	}
	
}
