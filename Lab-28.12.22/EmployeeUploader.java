package dec28th;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dec28th.Helper;

public class EmployeeUploader {
	Scanner sc = new Scanner (System.in);
	public void storeDepartmentDetails() throws SQLException {
		
		System.out.println("Enter Department ID: ");
		int D_ID = sc.nextInt();
		System.out.println("Enter Department Name: ");
		String D_Name = sc.next();
		System.out.println("Enter Department Head: ");
		String D_Head = sc.next();
		System.out.println("Enter Department Description: ");
		String D_DES = sc.next();
		
		Connection conn = Helper.con();
		PreparedStatement stm = conn.prepareStatement("insert into Department values (?,?,?,?)");
		stm.setInt(1, D_ID);
		stm.setString(2, D_Name);
		stm.setString(3, D_Head);
		stm.setString(4, D_DES);
		
		stm.execute();
		System.out.println("Insert Done ");
	}
	
	public void storeEmployeeDetails() throws SQLException {
		System.out.println("Enter Employee ID: ");
		int E_ID = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String E_Name = sc.next();
		System.out.println("Enter Employee Name: ");
		String E_Addr = sc.next();
		System.out.println("Enter Employee Salary: ");
		double E_Sal = sc.nextInt();
		System.out.println("Enter Employee Contact No: ");
		int E_Cont = sc.nextInt();
		System.out.println("Enter Department ID: ");
		int D_ID = sc.nextInt();
		
		Connection conn = Helper.con();
		PreparedStatement stm = conn.prepareStatement("insert into Employee1 values (?,?,?,?,?,?)");
		stm.setInt(1, E_ID);
		stm.setString(2, E_Name);
		stm.setString(3, E_Addr);
		stm.setDouble(4, E_Sal);
		stm.setInt(1, E_Cont);
		stm.setInt(1, D_ID);
		
		stm.execute();
		System.out.println("Insert Done ");
	}
	public static void main(String[] args) throws SQLException {
		EmployeeUploader e = new EmployeeUploader();
		e.storeDepartmentDetails();
		e.storeEmployeeDetails();
		
	}
}
