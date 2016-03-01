package assignment.afterclass12;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Remove4Element {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("enter the values:");
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			al.add(in.nextInt());
		}
		al.remove(3);
		ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		// TODO Auto-generated method stub

	}

}
