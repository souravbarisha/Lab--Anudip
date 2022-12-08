package dec08th;

import java.util.ArrayList;
import java.util.List;
//Write a Java program to update specific array element by given element.
//adding Yellow at index position of 2 in the array list
public class Problem1 {
public static void main(String[] args) {
	List<String> color_list = new ArrayList<String>();// Declaring Array List
	// adding elements
	color_list.add("Red");
	color_list.add("Blue");
	color_list.add("Green");
	color_list.add("Black");
	System.out.print(color_list +", "); // printing list
	// adding Yellow at index position of 2 in the array list
	System.out.println("\n Add Yellow at index position of 2 in the array list");
	color_list.add(2,"Yellow");
	System.out.print(color_list +", ");
}
}
