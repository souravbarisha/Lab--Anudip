package com.cognizant.tax;

public class EmployeeTax {
public static void main (String [] args) {
	// test case -1
	TaxCalculator TC1 =new TaxCalculator(true,25000);
	TC1.calculateTax();
	TC1.deductTax();
	TC1.validateSalary();
	// test case -2
	TaxCalculator TC2 =new TaxCalculator(true,125000);
	TC2.calculateTax();
	TC2.deductTax();
	TC2.validateSalary();
	
}
}
