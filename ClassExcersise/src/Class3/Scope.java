package Class3;


public class Scope {
	
	public static void main(String[] args) {
		Scoper s=new Scoper();
		System.out.println("values in side other class with in the package not a derived class: "+s.a+" b is not accessble"+" "+s.c+" "+s.d);
		s.display();
		//s.display1();   scoper.display1() is not visible
		s.display2();
		s.display3();
		
		
		ScoperChild sc=new ScoperChild();
		System.out.println("values in side other class with in the package not a derived class: "+sc.a+" b is not accessble"+" "+sc.c+" "+sc.d);
		sc.display();
		//sc.display1();   scoper.display1() is not visible
		sc.display2();
		sc.display3();
		// TODO Auto-generated method stub
		
	}

}
