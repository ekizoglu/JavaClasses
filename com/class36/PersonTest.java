package com.class36;
import java.util.*;
import java.util.Map.Entry;
public class PersonTest {
	/*
	 * 1.Create a Person class with following private fields: 
	 * name, lastName, age, salary
	 * -Variables should be initialized through constructor
	 * -Inside the test class also create a method to print user details
	 * -In Test Class create a Map that will store key in ascending order. 
	 * 	In that Map store personId and a Person Object, print each object details
	 */
	
	public static void main(String[] args) {
		Map<Integer, Person> personMap = new TreeMap<>(); 
		personMap.put(1, new Person("Ali", "Atay", 25, 85000));
		personMap.put(2, new Person("Ahmet", "Uzun", 45, 120000));
		personMap.put(3, new Person("Jackson", "Smith", 54, 81000));
		
		//Using keyset with for each loop
		System.out.println("Using keyset with for each loop");
		Set<Integer> keySet = personMap.keySet(); 
		for (Integer key : keySet) {
			String personDetails = personMap.get(key).displayDetails();
			System.out.println(key + "==>" + personDetails); 
		}
		
		System.out.println("Using Entry set with for each loop");
		//Using Entry set with for each loop
		Set<Entry<Integer,Person>> entrySet = personMap.entrySet();
		for (Entry<Integer,Person> entry : entrySet) {
			Integer key = entry.getKey(); 
			Person person = entry.getValue();
			System.out.println(key + "-->" + person.displayDetails());
		}
		
		//Using Iterator with keyset
		System.out.println("Using Iterator with keyset");
		Iterator<Integer> keyItr = keySet.iterator();
		while (keyItr.hasNext()) {
			Integer key = keyItr.next();
			Person person = personMap.get(key); 
			System.out.println(key + "::" + person.displayDetails());
		}
		
		//Using Iterator with EntrySet
		System.out.println("Using Iterator with EntrySet");
		Iterator<Entry<Integer, Person>> entItr = personMap.entrySet().iterator(); 
		while (entItr.hasNext()) {
			Integer key = entItr.next().getKey(); 
			Person person = personMap.get(key); 
			System.out.println(key + "--------" + person.displayDetails());
		}
		
	}

}

class Person{
	private String name, lastName; 
	private double salary; 
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
	public Person(String name, String lastName, int age, double salary) {
		this.name = name; 
		this.lastName = lastName; 
		this.age = age;
		this.salary = salary; 
	}
	
	public String displayDetails() {
		return getName() + " " + getLastName() + " " + getAge() + " " + getSalary();
		
		
	}
}
