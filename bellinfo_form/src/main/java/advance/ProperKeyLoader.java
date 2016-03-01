package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;

public class ProperKeyLoader {

	private String driver;
	private String url;
	private String username;
	private String password;
	private Connection con;
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	@Required
	public void setUsername(String username) {
		this.username = username;
	}
	@Required
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void loadConnection()
	{
		try {
			Class.forName(driver);
			con= DriverManager.getConnection(url, username, password);
			if(con!=null)
			{
				System.out.println("success");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
