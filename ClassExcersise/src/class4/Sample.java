package class4;
class ABC
{
	void mtd1()
	{
		
	}
}
class DEF extends ABC
{
	int b=10;
	void mtd1()
	{
		
	}
	void mtd2()
	{
		
	}
}
public class Sample {
	static DEF a1=new DEF();
	public static void main(String[] args) {
		ABC a=new DEF();
		//DEF d=(DEF)new ABC();
		a1.b=20;
		CBA c=new CBA();
		c.method();
		//System.out.println(a.a);
		// TODO Auto-generated method stub

	}

}
class CBA
{
	void method()
	{
		DEF a1=new DEF();
		System.out.println(a1.b);
	}
}
