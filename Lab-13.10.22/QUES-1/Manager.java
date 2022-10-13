package com.lab;

public class Manager extends Employee{

	Manager(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		
		super.basicSalary = salary;
		// TODO Auto-generated constructor stub
	}
	void calculateTransportAllowance() {
	double transportAllowance = 15*basicSalary /100;
	System.out.println("Transport Allowance Of the Manager is : "+transportAllowance);
	}
}
