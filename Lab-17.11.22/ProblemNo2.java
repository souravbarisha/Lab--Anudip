package nov17th;
import java.util.Scanner;
/*Problem code 2:
Take two numbers x and y. Throw the exception if the two numbers are negative else print the 
Product of x and y.
Input Format
The only line of input consists of two integers, x and y.
Constraints   -----      -20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero.*/
class NegativeNumberException extends Exception{
	public NegativeNumberException(String str) {
		super(str);
	}
}
public class ProblemNo2 {
	public void checkNegative(int x, int y) throws NegativeNumberException{
		
			if((-20<= x && y <=20) && (x!=0 && y>0)) {
				System.out.println("Product of x and y is : "+ (x*y));
			}
			
			else {
				throw new NegativeNumberException("x and y should not be zero");
				
			}
			
	}
public static void main(String[] args) throws NegativeNumberException{
	Scanner sc = new Scanner(System.in);
	// user input for two integer number
	System.out.println("enter the first integer number");
	int x = sc.nextInt();
	System.out.println("enter the first integer number");
	int y = sc.nextInt();
	ProblemNo2 p2 = new ProblemNo2(); // create the obj
	p2.checkNegative(x, y);
	
}
}
