package advance;

import org.springframework.stereotype.Component;

public class DriverInfo {
	private static DriverInfo driverInfo=new DriverInfo();
	private DriverInfo()
	{
		
	}
	
	public static DriverInfo getInstance()
	{
		return driverInfo;
	}
	private String qualification;

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getQualification() {
		return qualification;
	}
	
}
