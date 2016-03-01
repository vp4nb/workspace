package class4;

interface A
{
	void mtd1();
}
interface B extends A
{
	void mtd2();
}
abstract class C implements B
{
	abstract void mtd3();
}

public class InterfaceExtends implements B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mtd1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mtd2() {
		// TODO Auto-generated method stub
		
	}

}
