package com.lab;
//Write a java class to develop an employee class object & initialized the emp name & emp Id for 5 Emp.
//now write another class having name and from this class you have to create 5 employee objects but you are not allowed to use new keyword.
public class Employee1 {
static String empName;
static int empId;

static void createObject(String name, int ID) {
	empName = name;
	empId = ID;
	System.out.println("Employee name : "+empName +"  "+" Employee ID : "+ID );
}

public static void main(String [] args) {
	Employee1.createObject("A", 01);
	Employee1.createObject("B", 02);
	Employee1.createObject("C", 03);
	Employee1.createObject("D", 04);
	Employee1.createObject("E", 05);
}

}
