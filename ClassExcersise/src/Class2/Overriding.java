package Class2;

public class Overriding {
	public static void main(String[] args)
	{
		car c=new make();
		c.engine();
		//c.making();
		c.model();
		make m=new make();
		m.engine();
		m.making();
		m.model();
	}

}

class car
{
	int wheels=4;
	void engine()
	{
		System.out.println("Engine method in car");
	}
	void model()
	{
		System.out.println("model method in make");
	}
}
class make extends car
{
	int hp=100;
	void engine()
	{
		System.out.println("Engine method in make");
	}
	void making()
	{
		System.out.println("making method in make");
	}
}