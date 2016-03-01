package assignment.afterclass3;

public abstract class AbstractClass1 implements Interface1{
	AbstractClass1()
	{
		System.out.println("Default constructor");
	}
	public void display()
	{
		System.out.println("display of interface 1 in abstract class 1");
	}
	public int get()
	{
		return 0;
	}
	static void setId(int id)
	{
		System.out.println("static in abstract class 1");
	}
	{
		System.out.println("instance in abstract class 1");
	}
}
