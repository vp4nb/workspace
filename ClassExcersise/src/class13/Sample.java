package class13;

import java.util.LinkedList;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList();
		ll.add("add");
		ll.addFirst("first");
		ll.add("add again");
		ll.addLast("add last");
		ll.add(3, "using index");
		ll.add("add one more time");
		System.out.println(ll.get(3));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		//System.out.println(ll.removeLast());
		System.out.println(ll.remove());
		System.out.println("list is");
		for(String str:ll)
		{
			System.out.println(str);
		}
	}

}
