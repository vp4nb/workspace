package class13;

public class NestedClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out=new Outer();
		Outer.StaticNestedClass os=new Outer.StaticNestedClass();
		Outer.InnerClass oi=out.new InnerClass();
		out.mtd3();
		os.mtd1();
		oi.mtd2();
		
	}

}
class Outer
{
	static class StaticNestedClass
	{
		void mtd1()
		{
			System.out.println("Ststic nested class");
		}
	}
	class InnerClass
	{
		void mtd2()
		{
			System.out.println("inner class");
		}
	}
	void mtd3()
	{
		System.out.println("outer class");
	}
}
