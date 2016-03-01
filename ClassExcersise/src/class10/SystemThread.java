package class10;

public class SystemThread extends Thread{

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new SystemThread();
		t1.setName("thread 1");
		
		SystemThread t2=new SystemThread();
		t2.setName("thread 2");
		t1.start();
		t2.start();
		System.out.println();
		
		// TODO Auto-generated method stub

	}
	public void run()
	{
		
			System.out.println(this.getName());
			
				System.out.println("thread need to end");
				this.stop();
		
		System.out.println(this);
	}

}
