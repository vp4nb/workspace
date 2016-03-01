package assignment.afterclass2;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=scan.nextInt();
		int num=1;
		
			for(int i=2;i<=a;i++)
			{
				num=num*i;
			}
			System.out.println("factorial of given number: "+num);
		// TODO Auto-generated method stub

	}

}
