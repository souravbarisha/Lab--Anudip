package com.maven.HibernateEmployee;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {
    	Employee e = new Employee();
    	//user input
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Employee ID: ");
    	int id= sc.nextInt();
    	System.out.println("Enter the Employee FirstName: ");
    	String fn = sc.next();
    	System.out.println("Enter the Employee LastName: ");
    	String ln = sc.next();
    	System.out.println("Enter the Employee Designation: ");
    	String desig = sc.next();
    	System.out.println("Enter the Employee Address: ");
    	String addr = sc.next();
    	System.out.println("Enter the Employee Email ID: ");
    	String email = sc.next();
    	System.out.println("Enter the Employee Phone Number: ");
    	int ph = sc.nextInt();
    	System.out.println("Enter the Employee Salary: ");
    	double salary = sc.nextDouble();
    	System.out.println("Press Enter: ");
    	
    	 //Configuration- activates hibernate framework
    	//configure- read both cfg files and mapping details
    	//buildSessionFactory- from cfg object it takes jdbc information and create a jdbc connection
   SessionFactory s = new Configuration().configure().buildSessionFactory();
 //opens an connection with db and session object perform CURD
	Session ses = s.openSession(); // one of the method od session factory to get session obj
	//operation performed in db, save permanent
	Transaction t = ses.beginTransaction();
	//create object of presistent class
	
	// use object to enter data in table using setter method
	e.setEmpId(id);
	e.setEmpFirstName(fn);
	e.setEmpLastName(ln);
	e.setEmpDesig(desig);
	e.setEmpEmail(email);
	e.setEmpPhone(ph);
	e.setEmpAddr(addr);
	e.setEmpSalary(salary);
	
  // session object is used to save the persistent object
    ses.save(e);
    //transaction object to commit change
    t.commit();
    // closing session
    ses.close();
    
    System.out.println("All Data Inserting Done");
    
    }
}
