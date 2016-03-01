package assignment.afterclass12;

import java.util.ArrayList;
import java.util.Scanner;

public class EliminateDuplicates {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			String str=in.nextLine();
			if(!al.contains(str))
			{
			al.add(str);
			}
		}
		
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		

		// TODO Auto-generated method stub

	}

}
