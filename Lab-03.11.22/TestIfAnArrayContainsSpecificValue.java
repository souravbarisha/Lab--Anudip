package com.lab;

import java.util.Scanner;

//Q.1   Write a Java program to test if an array contains a specific value.
public class TestIfAnArrayContainsSpecificValue {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int [] arr = {1789,2035,1899,1456,2013}; // create an array
	// enter the value
	System.out.println("Enter the value to find : ");
	int value = sc.nextInt();
	boolean flag=true;
	int i;
	for( i=0; i<arr.length; i++) {
		if(arr[i] == value) {
			flag = true;
			break;
		}
		else {
			flag=false;
		}
	}
	if (flag==true) {
		System.out.println(" True");
		}
		else {
			System.out.println("False...the array is not contains with ");
		}
}
}
