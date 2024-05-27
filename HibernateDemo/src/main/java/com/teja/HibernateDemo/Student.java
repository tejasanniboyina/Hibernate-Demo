package com.teja.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

// annotation to indicate this class is the one that is going to be a table
@Entity
public class Student {
	
	// annotation to make PRIMARY KEY (PRIMARY KEY must me available)
	@Id
	private int rollNo;
	private String name;
	private int marks;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	

}
