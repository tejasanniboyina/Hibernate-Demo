package com.teja.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


// annotation to indicate this class is the one that is going to be a table

//@Table(name="student_table")// table name can be given like this too
@Entity()
public class Student {
	
	// annotation to make PRIMARY KEY (PRIMARY KEY must me available)
	@Id
	private int rollNo;
	
	//@Transient()  //excludes name as column of the table
	private String name;
	//private StudentName sname;
	
	//@Column(name="student_marks")// to set the explicit column name
	private int marks;
	
//	@OneToOne
//	private Laptop laptop;
//	
//	@OneToMany(mappedBy = "student")
//	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	
	@ManyToMany
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
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
	
//	public StudentName getSname() {
//		return sname;
//	}
//	public void setSname(StudentName sname) {
//		this.sname = sname;
//	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	

	
//	@Override
//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", sname=" + sname + ", marks=" + marks + "]";
//	}
	

//	@Override
//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
//	}
//	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", laptop=" + laptop + "]";
	}
	

}
