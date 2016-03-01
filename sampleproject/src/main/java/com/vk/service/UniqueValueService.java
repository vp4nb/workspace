package com.vk.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vk.model.RegisterModel;
import com.vk.repository.RetriveDetails;

public class UniqueValueService {

	public ArrayList<RegisterModel> getDetails(String targetId)
	{
		ResultSet rs=null;
		ArrayList<RegisterModel> al=new ArrayList<RegisterModel>();
		RegisterModel rm;
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		rs=context.getBean("retriveDetails", RetriveDetails.class).getUniqueDetailsBasedJob(targetId);
		try {
			while(rs.next())
			{
				rm=new RegisterModel();
				rm.setName(rs.getString(1));
				rm.setEmail(rs.getString(2));
				rm.setPosition(rs.getString(3));
				rm.setJob(targetId);
				al.add(rm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	} 
}
