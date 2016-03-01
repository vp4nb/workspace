package class13;

public class MobilePhone implements Comparable<MobilePhone>{
	private String name;
	private int cost;
	private String os;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		else if(obj instanceof MobilePhone)
		{
			MobilePhone other=(MobilePhone)obj;
			if(name.equals(other.getName())&&cost==other.getCost()&&os.equals(other.getOs()))
			{
				return true;
			}
			
		}
		return false;
	}
	public String toString()
	{
		return name+" "+cost+" "+os;
	}
	@Override
	public int compareTo(MobilePhone o) {
		int result=this.os.compareToIgnoreCase(o.getOs());
		if(result==0)
		{
			return this.name.compareToIgnoreCase(o.getName());
		}
		return result;
		// TODO Auto-generated method stub
	}
	
}
