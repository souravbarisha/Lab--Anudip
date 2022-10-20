package com.lab;
/*Problem 2.
Banking Operations relate a class with customer private instance
variables as accountNumber,accountName,accountBalance and
create methods as
1. create account => accnumber,accname,accbal
2. setAmount=> add amount to accbal
3. getAmount=>print accbal and name account
4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two
customers */

 class Customer {
	 //instance variables
private int accountNumber;
private String accountName;
private double accountBalance;
// creating method 1
void create_account(int accnumber,String accname,double accbal){
	System.out.println("Account Number : "+accountNumber);
	System.out.println("Account Holder Name : "+accountName);
	System.out.println("Account Balance : "+accountBalance);
}
//creating method 2
void setAmount(double diposite) {
	System.out.println("Diposite ammount to the Account is: "+diposite);
	
}
//creating method 3
void getAmount(double diposite) {
	
	double currentBalace= accountBalance + diposite;
	System.out.println("Balance of the AC is: "+currentBalace +"  "+"Name of the AC Holder is: "+accountName);
}
//creating method 4
void withDrawAmount(double withdraw){
	System.out.println("withdraw amount from accBalance is: "+ withdraw );
}

// creating getter and setter method
// for AC number
public int getACNO () { // using get ACNO 
	return accountNumber;
}
public void setACNO(int ACNO) {// using set ACNO
	accountNumber = ACNO;
}
// for AC holder name
public String getName() {
	return accountName;
}
public void setName(String ACNA) {
	accountName = ACNA;
}
// for AC balance
public double getBAL() {
	return accountBalance;
}
public void setBAL(double ACBAL) {
	accountBalance = ACBAL;
}

 }

// MAIN METHOD CLASS
public class BankingOperation{
public static void main(String [] args) {
		Customer c1 = new Customer();// creating object for 1st customer
		Customer c2 = new Customer();// creating object for 2nd customer
		// call setter method for 1st customer 
		c1.setACNO(101011);
		c1.setName("SOURAV");
		c1.setBAL(100000);
		// call setter method for 2nd customer
		c2.setACNO(202022);
		c2.setName("BAPAN");
		c2.setBAL(200000);
		// calling all methods for 1st customer
		c1.create_account(c1.getACNO(),c1.getName(),c1.getBAL());
		c1.setAmount(20000);
		c1.getAmount(20000);
		c1.withDrawAmount(5000);
		// calling all methods for 2nd customer
		c2.create_account(c1.getACNO(),c1.getName(),c1.getBAL());
		c2.setAmount(15000);
		c2.getAmount(15000);
		c2.withDrawAmount(8000);
	}
}