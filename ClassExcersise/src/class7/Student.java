package class7;

public class Student {
	private int id;
	private String name;
	private double fee;
	private int marks;
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	
	public int getId(){
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public double getFee()
	{
		return this.fee;
	}
	public int getMarks() {
		return this.marks;
	}
	public String toString()
	{
		return getClass().getName()+" values are: id:"+id+" name:"+name+" fee:"+fee;
	}
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		else if(obj instanceof Student)	
		{
			Student s=(Student)obj;
			if(this.getId()==s.getId()&&this.getName().equals(s.getName())&&this.getFee()==s.getFee())
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
