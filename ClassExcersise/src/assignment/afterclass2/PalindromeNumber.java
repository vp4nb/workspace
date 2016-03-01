package assignment.afterclass2;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=scan.nextInt();
		int num=0,i,b=a;
		while(a>0)
		{
			i=a%10;
			num=(num*10)+i;
			a=a/10;
		}
		if(b==num)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
		// TODO Auto-generated method stub

	}

}
