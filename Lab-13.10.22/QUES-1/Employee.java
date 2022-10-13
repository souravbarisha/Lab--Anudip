package com.lab;
// 1st ques
//Implement Inheritance in your program
//Apply method overriding concept in inheritance


public class Employee {
	long employeeId;	
	String employeeName;	
	String employeeAddress;	
	Long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	
	Employee(long Id,String Name,String address,Long phone){
		Id=employeeId;
		Name=employeeName;
		address=employeeAddress;
		phone=employeePhone;

	}
	Double calculateSalary() {
		double salary;
		return salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100); 
		
	}
	void calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary/100;
		System.out.println("Transport Allowance of employee is : "+ transportAllowance);
	}
}


