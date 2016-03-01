package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PropertyLoaderWithProp {

	private Properties driverInfo;
	private Connection con;

	public void setDriverInfo(Properties driverInfo) {
		this.driverInfo = driverInfo;
	}
	public void loadConnection()
	{
		try {
			Class.forName(driverInfo.getProperty("driver"));
			con= DriverManager.getConnection(driverInfo.getProperty("url"), driverInfo.getProperty("username"), driverInfo.getProperty("password"));
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
