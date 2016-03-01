package assignment.afterclass12;

import java.util.ArrayList;

public class RemoveSingleShot {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(123);
		al.add(234);
		al.add(345);
		al.add(456);
		al.add(678);
		al.add(789);
		System.out.println("before remove");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		System.out.println(al);
		al.removeAll(al);
		System.out.println("after remove");
		System.out.println(al);
		for(Object obj:al)
		{
			
			System.out.println(obj);
		}
		// TODO Auto-generated method stub

	}

}
