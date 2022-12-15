package dec15th;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProblemStatement1 {
/*1ST*/	private static void storeEvenNumbers(ArrayList<Integer> A1,int N) {
	
		System.out.println("Even numbers from 2 to N: ");
		
		for(int i=2;i<=N;i++) {
		if(i%2 == 0) {// checking even number
			A1.add(i);
		}
		}
		System.out.print(A1);
		System.out.println("\n multiply each number with 2 and display:");
	}
/*2ND*/	private static void printEvenNumbers(ArrayList<Integer> A1) {
		Iterator itr = A1.iterator();
		// creating  ArrayList (A2)
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		while(itr.hasNext()) {
			//System.out.print((int) itr.next()*2+", ");
			int x= (int) itr.next() *2;
			System.out.println(x);
			// ADDING INTO  ArrayList (A2)
			A2.add(x);
		}
		// printing ArrayList (A2)
		System.out.println("add these numbers in a new ArrayList (A2)");
		System.out.print(A2);	
	}
/*3RD*/	private static void retrieveEvenNumber(ArrayList<Integer> A1, int n) {
	if(A1.contains(n)) { // checking exist or not
		System.out.println("exists: "+n);
	}
	else {
		System.out.println("not exists: "+0);
	}
}
public static void main(String[] args) {
/*1ST*/	// creating  ArrayList (A1)
	ArrayList<Integer> A1 = new ArrayList<Integer>();
	// user input
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the N th Number");
	int N = sc.nextInt();
	// calling storeEvenNumbers() method
	storeEvenNumbers(A1,N);
	
/*2ND*/	//calling printEvenNumbers() method
	printEvenNumbers(A1);
	
/*3RD*/	// user input FOR SEARCH
	System.out.println("\n Enter a number to check exists or not: ");
	int n = sc.nextInt();
	//calling retrieveEvenNumber() method
	retrieveEvenNumber(A1,n);
}
}
