package com.class36;
//Create a car class that will have variables, methods and Constructor
//Create a map that will hold car number and car objects
import java.util.*; 
import java.util.Map.Entry;
class Car{
	String make, model; 
	public Car(String make, String model) {
		this.make = make; 
		this.model = model; 
	}
	
	public void display() {
		System.out.println(make + " " + model);
	}
	
	
}

public class CarTest {

	
	public static void main(String[] args) {
		Map<Integer, Car> mapCar = new LinkedHashMap<>(); 
		mapCar.put(1, new Car("BMW", "X5"));
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S5"));
		mapCar.put(4, new Car("Toyota", "Rav4"));
		mapCar.put(5, new Car("Honda", "Civic"));
		mapCar.put(2, new Car("Lincoln", "Mkc"));
		
		System.out.println(mapCar.size());
		//map key to its corresponding values
		Collection<Car> coll = mapCar.values();
		for(Car c: coll) {
			System.out.println(c.make);
			c.display();
		}
		
		//map key to its corresponding values (entrySet or keySet)
		Set<Entry<Integer,Car>> set = mapCar.entrySet(); 
		for(Entry<Integer,Car> ent: set) {
			Integer i = ent.getKey(); 
			Car c = ent.getValue(); 
			//Cannot just print c it will print the object itself, need to use attributes make & model
			System.out.println("Key " + i + " is associated with value of " + c.make );
		}
		
		//using keyset to map keys to values
		Set<Integer> keySet = mapCar.keySet(); 
		for (int key: keySet) {
			// Integer + map Object -->  value object(car type)
			// System.out.println(key+"="+mapCar.get(key).make+"-"+mapCar.get(key).model);
//			System.out.println(key + mapCar.get(key).make);
			Car car = mapCar.get(key); 
			String carDetails = car.make + "-" + car.model; 
			System.out.println(key+"="+carDetails);
			
		}
		
		//use Iterator to iterate through values, keySet, entrySet
		System.out.println("Using iterator with entry set");
		Iterator<Entry<Integer,Car>> it = mapCar.entrySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next().getKey(); 
			Car car = mapCar.get(key); 
			String carDetails = car.make + "" + car.model; 
			System.out.println(key + "==>"+ carDetails);
		}
		System.out.println("Using iterator with key set");
		
		//using keySet
		Set<Integer> keys = mapCar.keySet();
		Iterator<Integer> keyItr = keys.iterator();
		while (keyItr.hasNext()) {
			Integer key = keyItr.next();
			Car car = mapCar.get(key);
			String carDetails = car.make + " " + car.model;
			System.out.println(key + "-->" + carDetails);
		}
		
	}
}


