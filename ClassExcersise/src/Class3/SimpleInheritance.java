package Class3;
class Base
{
	int a=10;
	void baseMethod()
	{
		System.out.println("Inside the class Base method");
	}
}
class Child extends Base
{
	void baseChildMethod()
	{
	System.out.println("CHild for base class");
	}
}
class GrandChild extends Child
{
	
}
class GrandChild2 extends Child
{
	
}
public class SimpleInheritance {

	public static void main(String[] args) {
		Base b=new Base();
		System.out.println("Accessing using base class object: "+b.a);
		b.baseMethod();
		
		//simple inheritance
		
		Child c=new Child();
		System.out.println("Accessing using child class object: "+c.a);
		c.baseMethod();
		c.baseChildMethod();
		
		//multilevel inheritance
		
		GrandChild gc=new GrandChild();
		System.out.println("Accessing using grandchild class object: "+gc.a);
		gc.baseMethod();
		gc.baseChildMethod();
		
		//hierarchical inheritance
		
		GrandChild2 gc2=new GrandChild2();
		System.out.println("Accessing using grandchild class object: "+gc2.a);
		gc2.baseMethod();
		gc2.baseChildMethod();
		// TODO Auto-generated method stub

	}

}
