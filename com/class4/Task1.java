package com.class4;

public class Task1 {
	public static void main(String[] args) {
		/*
		 * we need to check if student completed the quiz
		 * if yes --> good job, if not --> not good
		 * if they completed we will check score:
		 * if more than 90 --> you got an A
		 * if more than 80 --> you got a B
		 * anything below --> you should study more
		 */
		
		boolean quiz = true; 
		int score = 89; 
		if (quiz)
		{ 
			System.out.println("Good job!");
			if(score>=90)
			{
				System.out.println("You got an A");
			}
			else if(score>=80) {
				System.out.println("You got a B");
			}
		}else {
			System.out.println("Not good");
		}
	}
}	
