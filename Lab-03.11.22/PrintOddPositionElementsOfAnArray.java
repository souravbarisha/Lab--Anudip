package com.lab;
//Q.3   we need to print the elements of the array which are present in odd positions. This can 
public class PrintOddPositionElementsOfAnArray {
public static void main(String[] args) {
	char [] arr = {'a','b','c','d','e','f','g','h','i','j'}; // declaring an array
	
	for(int i=0;i<arr.length;i=i+2) {// for odd position
		System.out.print(arr[i]+", ");
	}
}
}
