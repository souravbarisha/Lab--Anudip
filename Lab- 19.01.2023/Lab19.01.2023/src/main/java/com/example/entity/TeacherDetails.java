package com.example.entity;

public class TeacherDetails {
	private String qualification;
	private double salary;
	private String email;
	private long phone;

	public TeacherDetails(String qualification, double salary, String email, long phone) {
		this.qualification = qualification;
		this.salary = salary;
		this.email = email;
		this.phone = phone;
	}

	public String toString() {
		return ("Qualification: " + qualification + ", " + "Salary: " + salary + ", " + "Email: " + email + ", "
				+ "Phone: " + phone);
	}
}
