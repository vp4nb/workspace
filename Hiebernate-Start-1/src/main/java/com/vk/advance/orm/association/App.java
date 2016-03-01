package com.vk.advance.orm.association;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    @SuppressWarnings("deprecation")
	SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();
   
    
    Part part1=new Part(1,"monitor");
    Part part2=new Part(2,"mouse");
    Part part3=new Part(3,"keyboard");
    Part part4=new Part(4,"cpu");
    
    Set<Part> s=new HashSet<Part>();
    s.add(part1);
    s.add(part2);
    s.add(part3);
    s.add(part4);
    Transaction transaction = session.beginTransaction();
    Product p=new Product(7,"desktop",s);
    
    session.save(p);
    
    
    /*session.save(part1);
    session.save(part2);
    session.save(part3);
    session.save(part4);*/
    transaction.commit();
    session.close();
    sf.close();
	}
}
