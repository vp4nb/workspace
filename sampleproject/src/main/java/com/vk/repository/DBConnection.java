package com.vk.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBConnection {
/*	private Properties driverInfo;
	
	public void setDriverInfo(Properties driverInfo) {
		this.driverInfo = driverInfo;
	}
	*/
	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	
	public void setDriver(String driver) {
		this.driver = driver;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName(driver /*driverInfo.getProperty("driver")*/);
			con = DriverManager.getConnection(url,username,password
					/*driverInfo.getProperty("url"), driverInfo.getProperty("username"),
					driverInfo.getProperty("password")*/);
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
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(context.getBean("dbcon", DBConnection.class));
	}
	
}
