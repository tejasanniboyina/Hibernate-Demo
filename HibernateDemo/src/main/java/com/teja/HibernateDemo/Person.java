package com.teja.HibernateDemo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	private int pid;
	private String pname;
	
	@OneToMany(mappedBy = "person")
	private Collection<Laptop> laptops = new ArrayList<Laptop>();

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Collection<Laptop> getLaps() {
		return laptops;
	}

	public void setLaps(Collection<Laptop> laps) {
		this.laptops = laps;
	}
	
	

	
	
	
}
