package com.vk.advance.orm.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TablePerClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	      @SuppressWarnings("deprecation")
		SessionFactory sf = cfg.buildSessionFactory();
	      Session session = sf.openSession();
	      Transaction transaction = session.beginTransaction();
	      
	      
	      CreditCard cc1=new CreditCard(50,"1234-4556-6776-8989",544);
	      CreditCard cc2=new CreditCard(100,"1234-4556-6776-8989",544);
	      /*CreditCard cc3=new CreditCard(3,150,"1234-4556-6776-8989",544);
	      CreditCard cc4=new CreditCard(4,200,"1234-4556-6776-8989",544);
	      CreditCard cc5=new CreditCard(5,250,"1234-4556-6776-8989",544);
	      
	      Cheque ch1 =new Cheque(6,25, "1435344-45344","krishna");
	      Cheque ch2 =new Cheque(7,75, "1435344-45344","krishna");
	      Cheque ch3 =new Cheque(8,125, "1435344-45344","krishna");
	      Cheque ch4 =new Cheque(9,175, "1435344-45344","krishna");
	      Cheque ch5 =new Cheque(10,225, "1435344-45344","krishna");
	      */
	      session.save(cc1);
	      session.save(cc2);/*
	      session.save(cc3);session.save(cc4);session.save(cc5);
	      
	      session.save(ch1);session.save(ch2);
	      session.save(ch3);session.save(ch4);session.save(ch5);*/
		
	      transaction.commit();
	      session.close();
	      sf.close();
	}
}
