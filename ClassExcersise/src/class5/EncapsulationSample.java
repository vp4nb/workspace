package class5;
class Student
{
	
	private int id;
	private String name;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
public class EncapsulationSample {

	public static void main(String[] args) {
		Student std=new Student();
		std.setId(1);
		std.setName("ramu");
		System.out.println("id: "+std.getId()+"\nname: "+std.getName());
		// TODO Auto-generated method stub

	}

}
