package class9;

import java.util.Scanner;

public class ExceptionScenario {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number a:");
		int a=in.nextInt();
		System.out.println("Enter number b: ");
		int b,c=0;
		do
		{
			b=in.nextInt();
			try
			{
				c=a/b;
			}
			catch(Exception e)
			{
				System.out.println("reenter a non negative value of b: ");
			}
		}while(b==0);
		System.out.println("result: "+c);
		// TODO Auto-generated method stub

	}

}
