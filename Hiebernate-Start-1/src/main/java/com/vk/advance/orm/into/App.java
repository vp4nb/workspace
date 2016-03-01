package com.vk.advance.orm.into;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	      @SuppressWarnings("deprecation")
		SessionFactory sf = cfg.buildSessionFactory();
	      Session session = sf.openSession();
	      Transaction transaction = session.beginTransaction();
	      
	      CreditCard cr=new CreditCard(1,100,"4567-54-3-222-3",545);
	      CreditCard cr2=new CreditCard(1,200,"4567-54-3-222-3",345);
	      session.save(cr);
	      session.save(cr2);
	      
	      transaction.commit();
	      session.close();
	      sf.close();

	}

}
