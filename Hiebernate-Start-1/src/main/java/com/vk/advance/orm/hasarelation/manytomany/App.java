package com.vk.advance.orm.hasarelation.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hasrelation-manytomany/hibernate.cfg.xml");
	      @SuppressWarnings("deprecation")
		SessionFactory sf = cfg.buildSessionFactory();
	      Session session = sf.openSession();
	      Transaction transaction = session.beginTransaction();
	      
	     Address ad=new Address(204,"emanueal","kansas city","missouri",64112);
	     Address ad1=new Address(205,"emanueal","kansas city","missouri",64112);
	     Address ad2=new Address(206,"emanueal","kansas city","missouri",64112);
	     Set<Address> s=new HashSet<Address>();
	     s.add(ad);
	     s.add(ad1);
	     s.add(ad2);
	      Employee e=new Employee(103,"ram","IT","15000",s);
	      session.save(ad);
	      session.save(ad1);
	      session.save(ad2);
	      session.save(e);
	      transaction.commit();
	      session.close();
	      sf.close();
	}
}