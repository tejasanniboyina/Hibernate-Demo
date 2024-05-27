package com.teja.HibernateDemo;

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
    		Student s1 = new Student();
    		s1.setRollNo(103);
    		s1.setName("Anup");
    		s1.setMarks(90);
    		
    		Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class);// Configuration is a class
    		
    		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
    		
    		SessionFactory sf = conf.buildSessionFactory(reg);//SessionFactory is an interface
    				
    		Session session =sf.openSession();//Session is an interface
    				
    		
    		//ACID properties
    		Transaction ts = session.beginTransaction();
    				session.save(s1);
    				
    				ts.commit();
    }
}
