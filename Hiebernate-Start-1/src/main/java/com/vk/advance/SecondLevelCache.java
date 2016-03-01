package com.vk.advance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Session s1=sf.openSession();
	s.get(Employee.class, 2);
	s1.get(Employee.class, 2);
	s.close();
	s1.close();
	sf.close();
}
}
