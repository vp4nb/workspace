package class13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayListEx ale=new ArrayListEx();
		ale.display();
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
		
		System.out.println("display using vector");
		Vector v=new Vector();
		v.addAll(al);
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		System.out.println("convert array into arraylist");
		String[] str={"hello","hi","you","are","awesome"};
		List arrtoal=Arrays.asList(str);
		for(Object obj:arrtoal)
		{
			System.out.println(obj);
		}
		
		System.out.println("convert arraylist to array");
		String[] s=(String[]) arrtoal.toArray();
		for(String ss:s)
		{
			System.out.println(ss);
		}
		Collections.reverse(arrtoal);
		for(Object obj:arrtoal)
		{
			System.out.println(obj);
		}
		Collections.swap(arrtoal, 0, 2);
		for(Object obj:arrtoal)
		{
			System.out.println(obj);
		}
		
	}

}
