package com.lab;

import java.util.Arrays;

//Q.2   Write a Java program to find the duplicate values of an array of integer values.
public class FinedDuplicateValueOfAnArray {
public static void main(String[] args) {
	int arr[] = {5,2,7,7,5};
	Arrays.sort(arr);  // sorting the array
	
	int i;
	int j;
	for(i=0;i<arr.length-1;i++) {
		int count=1;
		for(j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j] ) {  // search equal value
				count++; // increase the count
				}
			else
				break;
		}
	
	if(count>1) {
		System.out.println(arr[i]+" appears "+ count + " times");
		i+=(count-1);  
	}
	}	
	
}
}
