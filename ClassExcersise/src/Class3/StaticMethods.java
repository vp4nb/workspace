package Class3;

public class StaticMethods {
	int a=10;
	static int b=20;
	public int add()
	{
		return a+b;
	}
	public static int sub()
	{
		StaticMethods m=new StaticMethods();
		return m.a-b;
	}

	public static void main(String[] args) {
		StaticMethods mem=new StaticMethods();
		System.out.println("variable 1: "+mem.a);
		System.out.println("variable 2: "+b);
		System.out.println("addition: "+mem.add());
		System.out.println("subtraction: "+sub());
		// TODO Auto-generated method stub

	}

}
