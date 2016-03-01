package com.vk.advance.orm.isarelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("isarelation/hibernate.cfg.xml");
	      @SuppressWarnings("deprecation")
		SessionFactory sf = cfg.buildSessionFactory();
	      Session session = sf.openSession();
	      Transaction transaction = session.beginTransaction();
	      
	      SoftwareEmployee se=new SoftwareEmployee(1, "krishna", "IT", "15000", "maven");
	      HardwareEmployee he=new HardwareEmployee(1, "venkat", "Fitting","10000", 10);
	      
	      session.save(se);
	      session.save(he);
	      
	      transaction.commit();
	      session.close();
	      sf.close();
	}
}
