package class12.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleCollection {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(4);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		Iterator i=al.iterator();
		System.out.println("iterator way");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("using for each");
		for(Integer ii:al)
		{
			System.out.println(ii);
		}
		// TODO Auto-generated method stub

	}

}
