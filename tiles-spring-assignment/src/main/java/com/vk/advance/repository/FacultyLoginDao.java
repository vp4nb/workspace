package com.vk.advance.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vk.advance.model.FacultyLoginDetails;
import com.vk.advance.model.FacultyRegistrationDetails;



@Component
public class FacultyLoginDao {

	@Autowired
	DBConnection dbcon;
	@Autowired
	FacultyRegistrationDetails srd;
	
	public FacultyRegistrationDetails retriveDetails(FacultyLoginDetails sld)
	{
		Connection con=dbcon.getDBConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select username,id,fullname,email,phone from facultyregister where username=? and password=?");
			ps.setString(1,sld.getUserName());
			ps.setString(2,sld.getPassWord());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				srd.setUserName(rs.getString("username"));
				srd.setId(rs.getShort("id"));
				srd.setFullName(rs.getString("fullname"));
				srd.setEmail(rs.getString("email"));
				srd.setPhone(rs.getString("phone"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return srd;
	}
	
	
	
}
