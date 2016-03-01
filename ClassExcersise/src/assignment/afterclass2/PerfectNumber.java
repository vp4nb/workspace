package assignment.afterclass2;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=scan.nextInt();
		int sum=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==a)
		{
			System.out.println("Given number is a perfect number");
		}
		else
		{
			System.out.println("Given number is not a perfect number");
		}
		// TODO Auto-generated method stub
		
	}

}
