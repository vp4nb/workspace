package com.bellinfo.faculty.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bellinfo.faculty.model.FacultyLogin;

@Repository
@Transactional
public class FacultyRepository {

	@Autowired
	SessionFactory sessionFactory;
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	public int saveFaculty(FacultyLogin flogin)
	{
		return (Integer) getSession().save(flogin);
	}
	public List<FacultyLogin> getFaculty()
	{
		Criteria cr=getSession().createCriteria(FacultyLogin.class);
		return cr.list();
	}
	public FacultyLogin getFaculty(int id)
	{
		return (FacultyLogin) getSession().get(FacultyLogin.class, id);
	}
	public void updateFaculty(FacultyLogin flogin)
	{
		//getSession().beginTransaction();
		getSession().saveOrUpdate(flogin);
		//getSession().getTransaction().commit();
	}
	public void deleteFaculty(int id)
	{
		//getSession().beginTransaction();
		Query q=getSession().createQuery("delete from FacultyLogin where id=:id");
		q.setInteger("id", id);
		q.executeUpdate();
		//getSession().getTransaction().commit();
	}
}
