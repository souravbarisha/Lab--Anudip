package com.lab;
//Hands-on Exercise 2
//Write a Java program to print numbers between 1 to 100 which are divisible by 3,
//5 and by both.
public class DivisibleBy3_5_both {
public static void divisible() {
	System.out.println("divisible by 3 are : ");
	for(int i=1;i<=100;i++) {
		if(i%3==0) {
			System.out.print(i+" ");
			}
	}
	System.out.println();
	System.out.println("divisible by 5 are : ");
	for(int i=1;i<=100;i++) {
		if(i%5==0) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
	System.out.println("divisible by 3 & 5 both are : ");
	for(int i=1;i<=100;i++) {
		if(i%3==0 && i%5==0) {
			System.out.print(i+" ");
		}
	}
}
public static void main(String [] args) {
	divisible();
}
}
