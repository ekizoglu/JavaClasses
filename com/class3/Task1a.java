package com.class3;

public class Task1a {

	public static void main(String[] args) {
		/*Declare variable cakePiece=11 
		 * and divide cakePiece between 4 people using shorthand operator 
			each person should get an equal piece of cake*/
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		double cake=11;
		cake/=4;
		System.out.println(cake);
		/*  Declare variable cakePiece=25 
		 *  and divide cakePiece between 7 people . 
		 *  Using shorthand operator found out 
		 *  how many pieces of cake left 
		 *  after it was distributed equally among 7 people*/
		int cakePiece2=25;
		cakePiece2%=7;
		System.out.println(cakePiece2);
	}
}
