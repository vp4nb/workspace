package com.vk.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vk.model.RegisterModel;
import com.vk.repository.RetriveDetails;

public class SelectTypeService {

	public ArrayList<RegisterModel> getDetails(String targetId)
	{
		ResultSet rs=null;
		ArrayList<RegisterModel> al=new ArrayList<RegisterModel>();
		RegisterModel rm;
		rs=new RetriveDetails().getDetailsBasedJob(targetId);
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
