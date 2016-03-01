package class9;

public class ErrorScenario {
	static int i=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}
	
	public static void method1()
	{
		System.out.println((i++)+"inside method1");
		method2();
	}
	public static void method2()
	{
		System.out.println((i++)+"inside method2");
		method1();
	}

}
