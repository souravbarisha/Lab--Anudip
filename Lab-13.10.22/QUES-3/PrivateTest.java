package com.lab;
//3. Develop a public java class and make sure nobody can create any object of this class from outside the class
public class PrivateTest {
 private PrivateTest() {
	 int value = 5;
	 System.out.println(value);
	 System.out.println("this class is private");
 }
 public static void main(String [] args) {
	 PrivateTest pt = new PrivateTest();
	 
 }
}
