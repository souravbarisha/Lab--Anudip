package com.lab;
//Hands-on Exercise 3
//1… Write the following code:
//1. A class named Arithmetic with a method named add that takes integers as
//parameters and returns an integer denoting their sum.
//A class named Adder that inherits from a superclass named Arithmetic
public class Arithmetic {
void add(int x, int y) {
	int z = x+y;
	System.out.println("sum of two number is : "+z);
}
}
// inheritance class
 class Adder extends Arithmetic {
	void result() {
}
}

 class MainClass{
	public static void main(String []args) {
		Adder ad =new Adder();
		ad.result();
	ad.add(5,4);
	}
}
 