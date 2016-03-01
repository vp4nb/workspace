package assignment.afterclass2;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first value: ");
		a=scan.nextInt();
		System.out.println("Enter second value: ");
		b=scan.nextInt();
		if(a==b)
		{
			System.out.println("values are equal");
		}
		else if(a!=b)
		{
			System.out.println("values are not equal");
			if(a<b)
			{
				System.out.println("a is smaller than b");
			}
			else if(a>b)
			{
				System.out.println("a is larger than b");
			}
		}
		// TODO Auto-generated method stub

	}

}
