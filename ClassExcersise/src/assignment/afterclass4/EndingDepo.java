package assignment.afterclass4;

public abstract class EndingDepo implements Transportation{
	public void routeMap(String str1,String str2)
	{
		System.out.println("route is:"+str1+"-->"+str2+" via "+villegeCount+" villeges");
	}
	public String busType()
	{
		return "General";
	}
	public int busCapacity(String type)
	{
		if(type=="General")
		{
			return 50;
		}
		else
		{
			return 40;
		}
	}
	public abstract boolean isBusSentToClean();
}
