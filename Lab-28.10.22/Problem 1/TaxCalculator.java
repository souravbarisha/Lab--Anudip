package com.cognizant.tax;

public class TaxCalculator {
	//  Declaring instance variables.
float basicSalary;
boolean citizenship;
float tax;
int nettSalary;
// constuctor
TaxCalculator(boolean citizenship,float basicSalary){
	this.citizenship = citizenship;
	this.basicSalary = basicSalary;
}
// create a method named  calculateTax
void calculateTax() {
	tax = 30*basicSalary/100;
	System.out.println("The Tax of the employee  for  the "+basicSalary+" is "+tax );
}
//create a method named  deductTax() 
void deductTax() {
	nettSalary = (int) (basicSalary - tax);
	System.out.println("The nett salary of the employee "+ nettSalary);
}
//create a method named  validateSalary
void validateSalary() {
	if(basicSalary > 100000) {
		//citizenship = true;
		System.out.println("The salary and citizenship eligibility: "+ true);
	}
	else {
		System.out.println("The salary and citizenship eligibility: "+ false);
	}
}

}
