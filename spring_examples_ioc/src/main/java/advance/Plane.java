package advance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Vector;

public class Plane {
	private String planeType;
	private PlaneEngine planeEngine;
	private Vector<String> parts;
	private Properties drivers;
	
	public void setDrivers(Properties drivers) {
		this.drivers = drivers;
	}

	public void setParts(Vector<String> parts) {
		this.parts = parts;
	}
	
	public void setPlaneEngine(PlaneEngine planeEngine) {
		this.planeEngine = planeEngine;
	}
	
	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}
	
	public void display()
	{
		System.out.println("plane type: "+planeType);
		planeEngine.display();
		System.out.println("parts: "+parts);
		drivers.forEach((k,v)->System.out.println("key: "+k+" value:"+v));
		
	}
	
}
