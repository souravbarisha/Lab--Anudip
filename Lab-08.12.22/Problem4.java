package dec08th;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to test an array list is empty or not.
public class Problem4 {
public static void main(String[] args) {
	
		List<String> color_list = new ArrayList<String>();// Declaring Array List
		// adding elements
			color_list.add("Red");
			color_list.add("Green");
			color_list.add("Black");
			color_list.add("White");
			color_list.add("Pink");
		
		System.out.print(color_list +", "); // printing list
		// checking empty or not 
		System.out.println("\n checking empty or not");
		if(color_list.isEmpty()) {
			System.out.println("True and empty");
		}
		else {
			System.out.println("False and not empty");
		}
		
		// removing all elements from array list
		System.out.println("removing all elements from array list");
//		for(int i = 0; i<=color_list.size(); i++) {
//			color_list.remove(i);
//		}
		color_list.removeAll(color_list);
		
		System.out.print(color_list +", "); // printing list
		// checking empty or not 
		System.out.println("\n checking empty or not");
		if(color_list.isEmpty()) {
			System.out.println("True and empty");
		}
		else {
			System.out.println("False and not empty");
		}
}
}
