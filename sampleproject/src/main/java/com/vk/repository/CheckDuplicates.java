package com.vk.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vk.model.RegisterModel;

public class CheckDuplicates {
	
	ResultSet rs=null;
	public boolean registerDuplicates(Connection con, RegisterModel rm)
	{
		try {
			PreparedStatement ps=con.prepareStatement("select fullname,job,position from register where email=?");
			ps.setString(1, rm.getEmail());
			rs=ps.executeQuery();
			if(rs==null)
			{
				return true;
			}
			if(rs.next())
			{
				return false;
			}
			else
			{
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
}
