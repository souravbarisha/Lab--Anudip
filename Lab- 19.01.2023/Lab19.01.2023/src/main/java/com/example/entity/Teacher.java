package com.example.entity;

import java.util.Iterator;
import java.util.List;

public class Teacher {
	private int id;
	private String fname;
	private String lname;
	private TeacherDetails details;
	private List<String> Class;

	public Teacher(int id, String fname, String lname, TeacherDetails details, List<String> Class) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.details = details;
		this.Class = Class;
	}

	public void display() {
		System.out.println(id + " " + fname + " " + lname);
		System.out.println(details.toString());
		System.out.println("The Teacher will take the following classes : ");

		Iterator<String> itr = Class.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
