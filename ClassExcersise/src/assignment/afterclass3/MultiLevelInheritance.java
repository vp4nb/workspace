package assignment.afterclass3;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		GCClass gcc=new GCClass(10,20.5,'c',"string");
		// TODO Auto-generated method stub

	}

}

class PClass
{
	PClass()
	{
		
	}
	PClass(char c,String str)
	{
		System.out.println("char: "+c+" string: "+str);
	}
	
}
class CClass extends PClass
{
	CClass()
	{
		
	}
	CClass(int a,double b)
	{
		System.out.println("integer: "+a+" double: "+b);
	}
	CClass(char a,String b)
	{
		super(a,b);
	}
}
class GCClass extends CClass
{
	GCClass()
	{
		
	}
	GCClass(int a,double b,char c,String str)
	{
		super(a,b);
		new CClass(c,str);
	}
	
}
