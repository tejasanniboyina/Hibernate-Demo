package com.teja.HibernateDemo;

import java.util.Collection;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App 
{
    public static void main( String[] args )
    {
    	
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(101);
//    	laptop.setLname("Dell");
//    	Student student = new Student();
    		
//    		StudentName sn = new StudentName();
//    		sn.setFname("Teja");
//    		sn.setLname("Sanniboyina");
//    		sn.setMname("Guna");
    		
//    		student.setRollNo(1);
//    		student.setName("Teja");
//    		student.setMarks(90);
//    		//student.setLaptop(laptop);
//    		student.getLaptop().add(laptop);
//        	laptop.getStudent().add(student);

    		
    		
//    		s1.setRollNo(101);
//    		s1.setMarks(60);
//    		s1.setSname(sn);
    	
    		
    		Configuration conf = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Laptop.class);// Configuration is a class
    		
    		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
    		
    		SessionFactory sf = conf.buildSessionFactory(reg);//SessionFactory is an interface
    				
    		Session session =sf.openSession();//Session is an interface
    				
    		
    		//ACID properties
    		Transaction ts = session.beginTransaction();
    		
    		//to fetch the data from the db
    		Person person = session.get(Person.class,1);
    		
    		System.out.println(person.getPname());
    		Collection<Laptop> laptops = person.getLaps();
    		
    		for(Laptop l : laptops) {
    			System.out.println(l);
    		}
    	//	s1 = (Student)session.get(Student.class, 101);// to get the data from the database ,
    		//get method takes 2 parameters ( class name, primary key) and returns the Object of Object so typecast  it . 
//    		session.save(laptop);
//    		session.save(student);
    		

    				ts.commit();
    				
//    				System.out.println(student);
//    				System.out.println(laptop);
    }
}
