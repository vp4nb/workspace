package Class3;
class ABC
{
	ABC()
	{
		super();
		int a=10;
		System.out.println(a);
	}
	ABC(int a)
	{
		
		System.out.println(a);
	}
}
class DEF extends ABC
{
	DEF()
	{
		super();
		int a=20;
		System.out.println(a);
	}
	DEF(int a)
	{
		System.out.println(a);
	}
	
}
public class ConstructorExample {

	public static void main(String[] args) {
		ABC b=new ABC(50);
		ABC a=new ABC();
		DEF d=new DEF();
		DEF e=new DEF(30);
		// TODO Auto-generated method stub

	}

}
