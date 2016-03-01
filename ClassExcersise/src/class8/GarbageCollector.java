package class8;

public class GarbageCollector {
	int x=25;
	String str=new String("cjndjncidcjnjdbicnk je  ejncenjnejk");
	public static void main(String[] args) {
		
		GarbageCollector gc=new GarbageCollector();
		gc.str.concat("uiuiuiui");
		gc.mtd1();
		gc.mtd2();
		gc=null;
		System.gc();
		//Runtime.getRuntime().gc();		
		//gc.mtd1();
		// TODO Auto-generated method stub

	}
	private void mtd2() {
		
		System.out.println("i am in mtd2");
		// TODO Auto-generated method stub
		
	}
	private void mtd1() {
		System.out.println("i am in mtd1");
		// TODO Auto-generated method stub
		
	}
	public void finalize()
	{
		System.out.println("i am in finalize");
	}

}
