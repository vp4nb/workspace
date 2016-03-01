package assignment.afterclass2;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=scan.nextInt();
		int num=0,i;
		while(a>0)
		{
			i=a%10;
			num=(num*10)+i;
			a=a/10;
		}
		System.out.println("Reverse of the number is: "+num);
	}

}
