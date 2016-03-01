package assignment.afterclass12;

import java.util.ArrayList;
import java.util.Scanner;

public class AddFloatArray {

	public static void main(String[] args) {
		
		ArrayList<Double> al=new ArrayList<>();
		System.out.println("enter first array values:");
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			al.add(in.nextDouble());
		}
		ArrayList<Double> inal=new ArrayList<>();
		System.out.println("enter first array values:");
		for(int i=0;i<3;i++)
		{
			inal.add(in.nextDouble());
		}
		
		System.out.println("outer array:");
		for(Double d:al)
		{
			System.out.print(d+" ");
		}
		System.out.println("\ninner array:");
		for(Double d:inal)
		{
			System.out.print(d+" ");
		}
		System.out.println("\nenter the position to where you want to insert:");
		int pos=in.nextInt();
		al.addAll(pos,inal);
		System.out.println("total array:");
		for(Double d:al)
		{
			System.out.print(d+" ");
		}
		// TODO Auto-generated method stub

	}

}
