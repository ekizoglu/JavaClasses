package com.class26;

public class Degree {
	public void getDegree() {
		System.out.println("I got a degree");
	}
	public static void main(String[] args) {
		Degree d = new Degree(); 
		Undergraduate u = new Undergraduate(); 
		Postgraduate p = new Postgraduate(); 
		d.getDegree();
		u.getDegree();
		p.getDegree();
		
	}
}

class Undergraduate extends Degree {
	public void getDegree() {
		System.out.println("I am an Undergraduate");
	}
}

class Postgraduate extends Degree{
	public void getDegree() {
		System.out.println("I am a Postgraduate");
	}

	
}
