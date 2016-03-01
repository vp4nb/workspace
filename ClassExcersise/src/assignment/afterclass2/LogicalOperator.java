//program to check the value pair fall with in the specified range or not

package assignment.afterclass2;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first value: ");
		a=scan.nextInt();
		System.out.println("Enter second value: ");
		b=scan.nextInt();
		if((a>=10)&&(b<=50))
		{
			System.out.println("the pair is with in the range");
		}
		else if((a>=10)||(b<=50))
		{
			System.out.println("in the pair one value is with in the range");
		}
		else
		{
			System.out.println("the pair is not in the range");
		}
		// TODO Auto-generated method stub

	}

}
