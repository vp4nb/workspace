package com.vk.service;

import java.sql.Connection;

import com.vk.model.RegisterModel;
import com.vk.repository.CheckDuplicates;
import com.vk.repository.DBConnection;
import com.vk.repository.TableInsert;

public class RegisterService {
	RegisterModel rm;
	Connection con=null;
	public RegisterService()
	{
		this.rm=null;
	}
	public RegisterService(RegisterModel rm)
	{
		this.rm=rm;
	}
	public int saveDetails()
	{
		DBConnection dbc=new DBConnection();
		 con=dbc.getDBConnection();
		
		 if(new CheckDuplicates().registerDuplicates(con,rm))
		 {
			if(new TableInsert().insertRegister(con, rm)==1)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		 }
		 else
		 {
			 return 2;
		 }
	}
}
