package assignment.afterclass2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=scan.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("given number is prime");
		}
		else
		{
			System.out.println("given number is not a prime");
		}
		// TODO Auto-generated method stub

	}

}
