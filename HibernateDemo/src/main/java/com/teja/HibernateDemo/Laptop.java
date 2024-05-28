package com.teja.HibernateDemo;

import javax.persistence.Entity;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String brand;
//	@ManyToOne
//	private Student studentt
//	@ManyToMany
//	private List<Student> student =new ArrayList<Student>();
	
	@ManyToOne 
	private Person person;
	public int getLid() {
		return lid;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public void setLid(int id) {
		this.lid = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	
//	public List<Student> getStudent() {
//		return student;
//	}
//	public void setStudent(List<Student> student) {
//		this.student = student;
//	}
//	@Override
//	public String toString() {
//		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
//	}
//	
//	
	
	

}
