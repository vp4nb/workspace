package advance;

public class PlaneEngine {
	private String type;
	private String name;
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display()
	{
		System.out.println("engine type: "+ type+ " engine name:"+name);
	}
}
