package Class3;
class Addition
{
	public int add(int a)
	{
		return a+10;
	}
	public int add(int a, int b)
	{
		return a+b;
	}
	public double add(int a, double b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	double add(double a, int b)
	{
		return a+b;
	}
	String add(char c,String str)
	{
		return c+str;
	}
}

public class OverLoading {

	public static void main(String[] args) {
		Addition obj=new Addition();
		System.out.println(obj.add(10));
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20.5));
		System.out.println(obj.add(10.5,20.7));
		System.out.println(obj.add(10.3,20));
		System.out.println(obj.add('c',"har"));
		// TODO Auto-generated method stub

	}

}
