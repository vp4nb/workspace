package class9;

public class ExceptionThrows {
	public static void main(String[] args) {
		method1(2,0);
		// TODO Auto-generated method stub

	}
	static void method1(int a,int b)
	{
		try
		{
			method2(a,b);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	static void method2(int a,int b)throws ArithmeticException,IndexOutOfBoundsException,Exception
	{
		method3(a,b);
	}
	 static void method3(int a, int b) throws ArithmeticException,IndexOutOfBoundsException,Exception{
		 int c=0;
		 int in[]=new int[1];
		 //c=a/b;
		 
		 in[2]=0;
		 System.out.println("result: "+c);
		// TODO Auto-generated method stub
		
	}

}
