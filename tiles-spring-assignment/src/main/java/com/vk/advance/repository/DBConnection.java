package com.vk.advance.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component("dbcon")
public class DBConnection {

	private Properties driverInfo;
	
	public void setDriverInfo(Properties driverInfo) {
		this.driverInfo = driverInfo;
	}
	public Connection getDBConnection() {
		Connection con = null;
		try {
			System.out.println(driverInfo.getProperty("driver"));
			Class.forName(driverInfo.getProperty("driver"));
			con = DriverManager.getConnection(driverInfo.getProperty("url"), driverInfo.getProperty("username"),
					driverInfo.getProperty("password"));
			return con;
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
			return con;
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return con;
		}
	}
}
