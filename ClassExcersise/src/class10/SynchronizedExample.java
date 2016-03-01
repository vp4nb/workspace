package class10;

public class SynchronizedExample {
	public static void main(String[] args) {
		Inc inc1=new Inc();
		new Sync("java",inc1);
		new Sync("sql",inc1);
		
		
	}

}

class Sync implements Runnable
{
	String str;
	Inc inc;
	Thread t;
	Sync()
	{
		
	}
	Sync(String str,Inc inc)
	{
		this.str=str;
		this.inc=inc;
		t=new Thread(this,str);
		t.start();
	}
	@Override
	public void run() {
		System.out.println("thread started "+t.getName());
		
		inc.incMethod(str);
		inc.incMethod2(str);
		System.out.println("thread ended:"+t.getName());
		// TODO Auto-generated method stub
		
	}
	
}

class Inc
{
	int a=10;
	public synchronized void incMethod(String str)
	{
		if(str.equals("java"))
		{
			a=20;
		}
		else
		{
			a=30;
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("running thread:"+str+" count:"+i+"  "+a);
		}
		//incMethod2(str);
	}
	public void incMethod2(String str)
	{
		
			System.out.println("running thread:"+str+"   "+a);
			//incMethod(str);
	}
}
