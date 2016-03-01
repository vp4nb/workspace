package com.vk.advance;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDmlService {
	public static void main(String[] args) {
		
	

	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    @SuppressWarnings("deprecation")
	SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();
    Transaction transaction = session.beginTransaction();
    Student std=new Student();
    session.get(Student.class,11);
    std.setName("ram");
    std.setDate(new Date());
    std.setAddress("nyt");
    session.merge(std);
    transaction.commit();
    session.get(Student.class,11);
    session.close();
    sf.close();
    
	}
    
}
