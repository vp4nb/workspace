package advance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
@Controller
public class Plane {
	
	@Autowired
	private Engine engine;
	@Qualifier(value="driver")
	@Autowired
	private DriverInfo driver;
	
	@Qualifier(value="driver1")
	@Autowired
	private DriverInfo driver1;
	
	public DriverInfo getDriver1() {
		return driver1;
	}

	public void setDriver1(DriverInfo driver1) {
		this.driver1 = driver1;
	}

	public void setDriver(DriverInfo driver) {
		this.driver = driver;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public DriverInfo getDriver() {
		return driver;
	}

	

}
