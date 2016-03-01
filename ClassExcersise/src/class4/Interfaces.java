package class4;

 class Interfaces {
	public static void main(String[] args) {
		Audi1 a1=new Audi1();
		a1.engine();
		a1.symbol();
		a1.method();
		Car1.method();
		// TODO Auto-generated method stub

	}

}


interface Car1
{
	 void engine();
	 void symbol();
	 public static void method()
	 {
		System.out.println("inside interface"); 
	 }
}
class Audi1 implements Car1
{

	@Override
	public void engine()
	{
		System.out.println("engine is common for all");
	}
	public void symbol() {
		System.out.println("A");
		// TODO Auto-generated method stub
		
	}
	public static void method()
	 {
		System.out.println("inside audi"); 
	 }
	
}
class Honda1 implements Car1
{

	@Override
	public void engine()
	{
		System.out.println("engine is common for all");
	}
	public void symbol() {
		System.out.println("H");
		// TODO Auto-generated method stub
		
	}
	
}

