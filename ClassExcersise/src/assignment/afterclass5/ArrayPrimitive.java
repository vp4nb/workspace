package assignment.afterclass5;

import java.util.Scanner;

public class ArrayPrimitive implements ArrayPrim{
		int id[]=new int[50];
		String[] name=new String[50];
		double[] fee=new double[50];
		char[] section=new char[50];
		int prev=0;
		int num;
		public void inputReader()
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Eneter no.of users: ");
			num=in.nextInt();
			num=num+prev;
			for(int i=prev;i<num;i++)
			{
				System.out.println("Eneter user:"+(i+1)+" details: ");
				System.out.println("id: ");
				id[i]=in.nextInt();
				System.out.println("name: ");
				name[i]=in.next();
				System.out.println("fee: ");
				fee[i]=in.nextDouble();
				System.out.println("section: ");
				section[i]=in.next().charAt(0);
			}
			prev=num;
		}
		public void displayResult()
		{
			System.out.println("the results are: ");
			for(int i=0;i<prev;i++)
			{
				System.out.println();
				System.out.println("user:"+(i+1)+" details: ");
				System.out.println("id: "+id[i]);
				System.out.println("name: "+name[i]);
				System.out.println("fee: "+fee[i]);
				System.out.println("section: "+section[i]);
			}
		}
		public void displayResult(char c)
		{
			System.out.println("the results based on section: "+c+" are: ");
			for(int i=0;i<prev;i++)
			{
				if(section[i]==c)
				{
				System.out.println();
				System.out.println("user:"+(i+1)+" details: ");
				System.out.println("id: "+id[i]);
				System.out.println("name: "+name[i]);
				System.out.println("fee: "+fee[i]);
				System.out.println("section: "+section[i]);
				}
			}
		}
}
