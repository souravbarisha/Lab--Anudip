package com.lab;

import java.util.Scanner;

//Problem 1.
//Write a Java method to check whether every digit of a given integer
//is even. Return true if every digit is odd otherwise false?
public class EveryDigitEven_OddCheck {
	// create a method for check
	public static boolean check (int number) {
		// condition
		if(number ==0) {
			return false;
		}
		
		while(number !=0) {
			if((number % 10)%2 !=0) { // check every digit odd or even
				return false;
			}
			number /= 10;
		}
	 
		     return true;
	}
	
	// main method
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check it's every digits are ODD or EVEN : ");
	int number = sc.nextInt();
	
	check(number);
	if(check(number)) {
	System.out.println("Every digit are even");
	}
	else {
		System.out.println("any digit is odd");
	}
}
}
