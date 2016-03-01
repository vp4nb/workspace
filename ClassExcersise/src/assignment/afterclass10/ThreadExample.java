package assignment.afterclass10;


public class ThreadExample {
	static int a=10;
	String name;

	public static void main(String[] args) {
		new MyThread("java");
		new MyThread("sql");
		// TODO Auto-generated method stub

	}
	

}

class MyThread implements Runnable
{
	Thread t1;
	MyThread(String str)
	{
		t1=new Thread(this,str);
		t1.start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			synchronized(t1){				
					try {
						t1.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(t1.getName());
					notify();
			}
				
			
			
		}
	}
}
