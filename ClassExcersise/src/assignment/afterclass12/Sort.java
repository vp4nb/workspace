package assignment.afterclass12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Sort {

	public static void main(String[] args) {
		Sort s=new Sort();
		s.display();
		// TODO Auto-generated method stub

	}
	public void display()
	{
		ArrayList al=new ArrayList();
		al.add("india");
		al.add("usa");
		al.add("canada");
		System.out.println("before sort");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		
		/*Collections.sort(al);
		System.out.println("after sort");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		
		Collections.shuffle(al);
		System.out.println("after shuffle");
		for(Object obj:al)
		{
			System.out.println(obj);
		}*/
		System.out.println("after sort");
		TreeSet ts=new TreeSet();
		ts.addAll(al);
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
	}

}

