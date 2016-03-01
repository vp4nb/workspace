package com.vk.advance;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	    @SuppressWarnings("deprecation")
		SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Transaction transaction = session.beginTransaction();
	    
	   /* Criteria cr = session.createCriteria(Employee.class);
	    List<Employee> li = cr.list();
	    for(Employee e:li)
	    {
	    	System.out.println(e);
	    }*/
	    
	    /*Criteria cr = session.createCriteria(Employee.class);
	    Criterion crt = Restrictions.eq("employeeId", 1);
	    cr.add(crt);
	    //System.out.println(cr.uniqueResult());
	    List<Employee> li = cr.list();
	    for(Employee e:li)
	    {
	    	System.out.println(e);
	    }
	    */
	   /* Criteria cr = session.createCriteria(Employee.class);
	    Projection pName = Projections.property("employeeName");
	    Criterion crt = Restrictions.eq("employeeId", 1);
	    cr.setProjection(pName);
	    cr.add(crt);
	    //System.out.println(cr.uniqueResult());
	    List<String> li = cr.list();
	    for(String e:li)
	    {
	    	System.out.println(e);
	    }*/
	    
	   /* Criteria cr = session.createCriteria(Employee.class);
	    Projection pName = Projections.property("employeeName");
	    Projection pSalary = Projections.property("salary");
	    Criterion crt = Restrictions.eq("employeeId", 1);
	    ProjectionList pl= Projections.projectionList();
	    pl.add(pName);
	    pl.add(pSalary);
	    cr.setProjection(pl);
	    cr.add(crt);
	    //System.out.println(cr.uniqueResult());
	    List<Object> li = cr.list();
	    for(Object o:li)
	    {
	    	Object[] obj= (Object[]) o;
	    	System.out.println(obj[0]);
	    	System.out.println(obj[1]);
	    }*/
	    
	    Criteria cr = session.createCriteria(Employee.class);
	    Projection pAvg= Projections.avg("salary");
	    cr.setProjection(pAvg);
	    System.out.println(cr.uniqueResult());
	    
	    transaction.commit();
	    session.close();
	    sf.close();
	    
	}

}
