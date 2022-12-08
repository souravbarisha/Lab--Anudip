package dec08th;

import java.util.ArrayList;
import java.util.List;
//Write a Java program to extract a portion of an array list.
//Extracting first 3 elements from the list
public class Problem2 {
public static void main(String[] args) {
	List<String> color_list = new ArrayList<String>();// Declaring Array List
	// adding elements
	color_list.add("Red");
	color_list.add("Green");
	color_list.add("Orange");
	color_list.add("White");
	color_list.add("Black");
		System.out.print(color_list +", "); // printing list
		
		// Extracting first 3 elements from the list
		List<String> Final_list = new ArrayList<String>();// Declaring a new Final Array List
		System.out.println("\n Extracting first 3 elements from the list");
		for(int i = 0; i<3; i++) {
			Final_list.add(color_list.get(i)); // adding into Final_list 
		}
		System.out.print(Final_list +", "); //  printing
		
		
}
}
