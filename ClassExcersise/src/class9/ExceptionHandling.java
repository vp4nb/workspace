package class9;

public class ExceptionHandling {

	public static void main(String[] args) {
		method1(2,0);
		// TODO Auto-generated method stub

	}
	static void method1(int a,int b)
	{
		method2(a,b);
	}
	static void method2(int a,int b)
	{
		method3(a,b);
	}
	 static void method3(int a, int b) {
		 int c=0;
		 try
		 {
			 c=a/b;
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
			 for(;;);
			 
			 //System.exit(0);
		 }
		 finally
		 {
			 System.out.println("result: "+c);
		 }
		// TODO Auto-generated method stub
		
	}

}
