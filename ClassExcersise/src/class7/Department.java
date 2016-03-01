package class7;

public class Department {
	private int deptId;
	private String deptName;
	private String deptLocation;
	public void setDeptId(int deptId)
	{
		this.deptId=deptId;
	}
	public void setDeptName(String deptName)
	{
		this.deptName=deptName;
	}
	public void SetDeptLocation(String deptLocation)
	{
		this.deptLocation=deptLocation;
	}
	
	public int getDeptId(){
		return this.deptId;
	}
	public String getDeptName()
	{
		return this.deptName;
	}
	public String getDeptLocation()
	{
		return this.deptLocation;
	}
	public String toString()
	{
		return getClass().getName()+" values are: id:"+deptId+" name:"+deptName+" Location:"+deptLocation;
	}
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		else if(obj instanceof Department)	
		{
			Department s=(Department)obj;
			if(this.getDeptId()==s.getDeptId()&&this.getDeptName().equals(s.getDeptName())&&this.getDeptLocation().equals(s.getDeptLocation()))
			{
				return true;
			}
			else
			{
			return false;
			}
		}
		else
		{
		return false;
		}
	}
}
