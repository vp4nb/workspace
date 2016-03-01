package advance;

public class Car {
	
	private String carname;

	public Car() {
		System.out.println("car inside");
		// TODO Auto-generated constructor stub
	}
	public Car(String carname)
	{
		
		System.out.println("car inside with carname: "+carname);
	}
	public Car(int year)
	{
		
		System.out.println("car inside with year: "+year);
	}
	public Car(String carname,int year,String engine)
	{
		
		System.out.println("car inside with carname,year,engine: "+carname+" "+year+" "+engine);
	}
	public void display()
	{
		System.out.println("display");
	}
}
