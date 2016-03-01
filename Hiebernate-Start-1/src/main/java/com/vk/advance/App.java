package com.vk.advance;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[]){
		 
	      Student std = new Student();
	      
	      std.setName("siva");
	      std.setDate(new Date());
	      std.setAddress("virgenia");
	      Student std1=new Student();
	      std1.setName("venkat");
	      //student state is transient
	      Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	      @SuppressWarnings("deprecation")
		SessionFactory sf = cfg.buildSessionFactory();
	      Session session = sf.openSession();
	      Transaction transaction = session.beginTransaction();
	      session.saveOrUpdate(std);
	      session.save(std);
	      //object state is persistent
	      transaction.commit();
	      //object will be moved to database
	      session.evict(std);
	      //from here object is eligible for garbage collection.
	 
	      session.close();
	 
	      sf.close();
	  }
}
