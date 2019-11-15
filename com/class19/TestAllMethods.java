package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		// find the largest from 300 and 500
		// then identify is the largest number is odd

		AllMethods obj = new AllMethods();
		int large = obj.findLargest(300, 500);
		System.out.println(large);
		boolean odd = obj.isOdd(large);
		System.out.println(odd);
		String day = obj.weekDayName(1);

		if (day.equals("Tuesday") || day.equals("Thursday") || day.equals("Saturday") || day.equals("Sunday"))
			System.out.println("I'm learning java");
		else
			System.out.println("I'm practicing");

	}
}