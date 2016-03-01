package com.vk.advance.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vk.advance.model.FacultyRegistrationDetails;
import com.vk.advance.model.StudentRegistrationDetails;


@Component
public class FacultyRegistrationDao {

	@Autowired
	DBConnection dbcon;
	
	public int saveStudentDetails(FacultyRegistrationDetails srd)
	{
		int result=0;
		Connection con=dbcon.getDBConnection();
		try {
			PreparedStatement ps=con.prepareStatement("insert into facultyregister values(?,?,?,?,?,?)");
			ps.setString(1,srd.getUserName());
			ps.setString(2,srd.getPassWord());
			ps.setInt(3, srd.getId());
			ps.setString(4, srd.getFullName());
			ps.setString(5, srd.getEmail());
			ps.setString(6, srd.getPhone());
			result=ps.executeUpdate();
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
