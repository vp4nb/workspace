package class4;

abstract class Car
{
	void engine()
	{
		System.out.println("engine is common for all");
	}
	abstract void symbol();
}
class Audi extends Car
{

	@Override
	void symbol() {
		System.out.println("A");
		// TODO Auto-generated method stub
		
	}
	
}
class Honda extends Car
{
	{
		System.out.println("block1");
	}
	{
		System.out.println("block2");
	}
	@Override
	void symbol() {
		System.out.println("H");
		// TODO Auto-generated method stub
		
	}
	
	
}

public class AbstractClass {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.engine();
		a.symbol();
		
		Honda b=new Honda();
		b.engine();
		b.symbol();
		//Car d=new Car();
		Car c; 
		c=new Honda();
		c.engine();
		c.symbol();
		
		
		// TODO Auto-generated method stub

	}

}
