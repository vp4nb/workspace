package class7;

public class Employee {
	private int employeeId;
	private String employeeName;
	private Department department;
	private double salary;
	public void setEmployeeId(int employeeId)
	{
		this.employeeId=employeeId;
	}
	public void setEmployeeName(String employeeName)
	{
		this.employeeName=employeeName;
	}
	public void setDepartment(int id,String name,String location)
	{
		department=new Department();
		this.department.setDeptId(id);
		this.department.setDeptName(name);
		this.department.SetDeptLocation(location);
	}
	public void SetSalary(double salary)
	{
		this.salary=salary;
	}
	
	public int getEmployeeId(){
		return this.employeeId;
	}
	public String getEmployeeName()
	{
		return this.employeeName;
	}
	public Department getDepartment()
	{
		return this.department;
	}
	public double getSalary()
	{
		return this.salary;
	}
	
	public String toString()
	{
		return getClass().getName()+" values are: id:"+getEmployeeId()+" name:"+getEmployeeName()+" salary:"+getSalary()+" \nDepartment:"+getDepartment();
	}
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		else if(obj instanceof Employee)	
		{
			Employee s=(Employee)obj;
			if(this.getEmployeeId()==s.getEmployeeId()&&this.getEmployeeName().equals(s.getEmployeeName())&&this.getDepartment().equals(s.getDepartment()))
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
