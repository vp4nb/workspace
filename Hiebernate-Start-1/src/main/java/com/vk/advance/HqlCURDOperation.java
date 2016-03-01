package com.vk.advance;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlCURDOperation {

	public static void main(String[] args) {
		
	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    @SuppressWarnings("deprecation")
	SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();
    Transaction transaction = session.beginTransaction();
    
   /* Query q=session.createQuery("update Employee set employeeName='venkat' where employeeId=1 ");
     int i=q.executeUpdate();
     System.out.println(i);*/
    
    /*Query q=session.createQuery("from Employee where employeeId=1");
    Employee std=(Employee) q.uniqueResult();
    System.out.println(std);*/
    
   /* Query q=session.createQuery("from Employee");
    List<Employee> li= q.list();
    for(Employee e:li)
    {
    	System.out.println(e);
    }*/
    
   /* Query q=session.createQuery("select employeeName from Employee");
    List<String> li=q.list();
    for(String s:li){
    	System.out.println(s);
    }
    */
   /* Query q= session.createQuery("select employeeName, salary from Employee");
    
    List<Object> li=q.list();
    for(Object o:li){
    	Object[] obj=(Object[]) o;
    	System.out.println(obj[0]);
    	System.out.println(obj[1]);
    }*/
    
    /*Query q= session.createQuery("select avg(salary) from Employee");
    Double d=(Double) q.uniqueResult();
    System.out.println(d);
    */
    
    Query q=session.createQuery("insert into Employee(employyeName,employeeDept,salary) values('ram','IT',15000)");
    System.out.println(q.executeUpdate());
    transaction.commit();
     session.close();
     sf.close();
}
}
