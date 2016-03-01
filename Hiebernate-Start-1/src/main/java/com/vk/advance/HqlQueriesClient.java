package com.vk.advance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlQueriesClient {
public static void main(String[] args) {
	

	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    @SuppressWarnings("deprecation")
	SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();
    Transaction transaction = session.beginTransaction();
    Employee E1=new Employee(1,"ram","IT",325.56);
    Employee E2=new Employee(1,"raj","mech",435.56);
    Employee E3=new Employee(1,"tarun","cse",225.56);
    Employee E4=new Employee(1,"raghav","cse",567.56);
    Employee E5=new Employee(1,"ramana","IT",654.56);
    
    session.save(E1);
    session.save(E2);
    session.save(E3);
    session.save(E4);
    session.save(E5);
    
    transaction.commit();
    
    session.close();
    sf.close();
    
}
    
}
