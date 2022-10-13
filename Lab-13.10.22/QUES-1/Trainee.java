package com.lab;

public class Trainee extends Employee{

	Trainee(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		
		super.basicSalary = salary;
		// TODO Auto-generated constructor stub
	}
	
}
