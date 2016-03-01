package assignment.afterclass2;

import java.util.Scanner;

public class Minimum4Numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st values: ");
		int a=scan.nextInt();
		System.out.println("Enter 2nd values: ");
		int b=scan.nextInt();
		System.out.println("Enter 3rd values: ");
		int c=scan.nextInt();
		System.out.println("Enter 4th values: ");
		int d=scan.nextInt();
		int min=a;
		if(min>b)
		{
			min=b;
		}
		if(min>c)
		{
			min=c;
		}
		if(min>d)
		{
			min=d;
		}
		System.out.println("minimum number is: " +min);
		// TODO Auto-generated method stub

	}

}
