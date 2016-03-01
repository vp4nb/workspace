package Class2;

import Class3.Scoper;
import Class3.ScoperChild;

public class Class3Scope {

	public static void main(String[] args) {
		Scoper s=new Scoper();
		System.out.println("values in side other class with in the package not a derived class: "+s.a+" b is not accessble"+" c is not accessble "+" d is not accessble ");
		s.display();
		//s.display1();   scoper.display1() is not visible
		//s.display2();   scoper.display2() is not visible
		//s.display3();   scoper.display3() is not visible
		
		
		ScoperChild sc=new ScoperChild();
		System.out.println("values in side other class with in the package not a derived class: "+sc.a+" b is not accessble"+" c is not accessble "+" d is not accessble ");
		sc.display();
		//sc.display1();   scoper.display1() is not visible
		//sc.display2();
		//sc.display3();
		// TODO Auto-generated method stub

	}

}
