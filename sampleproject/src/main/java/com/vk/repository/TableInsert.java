package com.vk.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vk.model.RegisterModel;

public class TableInsert {
	
	public int insertRegister(Connection con,RegisterModel rm)
	{
		int result=0;
		try {
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?)");
			ps.setString(1, rm.getName());
			ps.setString(2, rm.getEmail());
			ps.setString(3, rm.getJob());
			ps.setString(4, rm.getPosition());
			result=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
