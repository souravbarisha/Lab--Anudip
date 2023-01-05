package com.maven.HibernateEmployee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // marking this class as Entity
// specifies the table name where data base of this entity is to be persisted.
@Table(name = "Employee_Info")

public class Employee {
	@Id //Marks identifier of class
	private int empId;
	private String empFirstName,empLastName,empDesig,empEmail,empAddr;
	private double empSalary;
	private long empPhone;
	
	
}
