package nov17th;

import java.util.Scanner;

/*Problem code 3: 
Write a method called addTwoPositive that takes two int parameters, and if either value is not positive, throw an 
ArithmeticException, passing the string "Non-positive integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them. Under what curcumstances will the finally code block be 
executed in a try/catch/finally segments.*/ 

public class ProblemNo3 {
	public void addTwoPositive(int a, int b) {
		try {
		if(a<0 || b<0) {
			throw new ArithmeticException("Non-positive integer sent");
		}
		else {
			int sum = a+b;
			System.out.println("sum of the two integer value is : "+sum);
		}
		}
		
		finally {
			System.out.println("operation done");
		}
	}
public static void main(String[] args) throws ArithmeticException {
	Scanner sc = new Scanner(System.in);
	// user input for two integer number
	System.out.println("enter the first integer number");
	int a = sc.nextInt();
	System.out.println("enter the first integer number");
	int b = sc.nextInt();
	
	ProblemNo3 p = new ProblemNo3(); // create an object of main class
	p.addTwoPositive(a, b);  // call the method
	
}
}
