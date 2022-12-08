package dec08th;

import java.util.ArrayList;
import java.util.List;
//Write a Java program to compare two array lists.
//compare both Array List for each elements
public class Problem3 {
public static void main(String[] args) {
	 //1st Array List
	List<String> color_list1 = new ArrayList<String>();// Declaring 1st Array List
	// adding elements
		color_list1.add("Red");
		color_list1.add("Green");
		color_list1.add("Black");
		color_list1.add("White");
		color_list1.add("Pink");
	System.out.println("\n 1st Array list : ");		
	System.out.print(color_list1 +", "); // printing list
	 //2nd Array List
	List<String> color_list2 = new ArrayList<String>();// Declaring 2nd Array List
	// adding elements
		color_list2.add("Red");
		color_list2.add("Green");
		color_list2.add("Black");
		color_list2.add("Pink");
		
		System.out.println("\n 2nd Array list : ");	
	System.out.print(color_list2 +", "); // printing list
			
	// compare both Array List for each elements
	System.out.println("compare both Array List for each elements : ");	

	   for(String s : color_list1) { // using for each loop
		   System.out.print(color_list2.contains(s)? "Yes." : "No.");
	   }
	
}
}
