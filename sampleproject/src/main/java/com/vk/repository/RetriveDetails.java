package com.vk.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RetriveDetails {
	
	DBConnection dbcon;
	public void setDbcon(DBConnection dbcon) {
		this.dbcon = dbcon;
	}
	Connection con=dbcon.getDBConnection();;
	ResultSet rs=null;
	
	public ResultSet getDetailsBasedJob(String targetId)
	{
		
		try {
			PreparedStatement ps=con.prepareStatement("select fullname,email,position from register where job=?");
			ps.setString(1, targetId);
			return (ps.executeQuery());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet getUniqueDetailsBasedJob(String targetId)
	{
		
		try {
			PreparedStatement ps=con.prepareStatement("select distinct fullname,email,position from register where job=?");
			ps.setString(1, targetId);
			return (ps.executeQuery());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
}
