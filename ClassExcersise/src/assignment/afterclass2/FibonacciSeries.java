package assignment.afterclass2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=scan.nextInt();
		int num1=0,num2=1;
		System.out.print("Fibonacci series: "+num1);
		while(num2<=a)
		{
			System.out.print(" "+num2);
			num2=num1+num2;
			num1=num2-num1;
			
		}
		// TODO Auto-generated method stub

	}

}
