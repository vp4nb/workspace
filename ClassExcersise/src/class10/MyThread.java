package class10;

public class MyThread {
	static int a=10;
	String name;

	public static void main(String[] args) {
		new ThreadExample("java");
		new ThreadExample("sql");
		// TODO Auto-generated method stub

	}
	

}

 class ThreadExample implements Runnable
{
	Thread t1;
	ThreadExample(String str)
	{
		t1=new Thread(this,str);
		t1.start();
	}
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			
			
				try {
					//System.out.println("\nbefore sleep"+t1.getName());
					if(t1.getName().equals("sql")&&i<10)
					{
					Thread.sleep(500);
					}
					else
					{
					System.out.println(t1.getName());
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
	}
}
