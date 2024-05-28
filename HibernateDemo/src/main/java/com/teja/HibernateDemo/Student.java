package com.teja.HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


// annotation to indicate this class is the one that is going to be a table

@Entity()
@Table(name="student_table")// table name can be given like this too
public class Student {
	
	// annotation to make PRIMARY KEY (PRIMARY KEY must me available)
	@Id
	private int rollNo;
	
	@Transient()  //excludes name as column of the table
	private String name;
	
	@Column(name="student_marks")// to set the explicit column name
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
