package com.lab;

public class InheritanceActivity {
	
	public static void main(String [] args) {
		// object creating 
		Manager m = new Manager(126534,"Peter","Chennai India",237844, 65000);
		Trainee t = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		// call the Manager class's methods
		
		System.out.println("Salary of the manager is : "+ m.calculateSalary());
		m.calculateTransportAllowance();
		// call the Trainee's class's methods
		System.out.println("Salary of the Trainee is : "+ t.calculateSalary());
		t.calculateTransportAllowance();
		
	}
}
