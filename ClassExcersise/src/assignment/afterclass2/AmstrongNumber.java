package assignment.afterclass2;

import java.util.Scanner;
class Caluculate
{
	public int calcCount(int x)
	{
		int c=0;
		while(x>0)
		{
			
				c++;
				x=x/10;
		}
		return c;
	}
	public int calcPower(int a,int b)
	{
		int num=1;
		for(int i=1;i<=b;i++)
		{
			num=num*a;
		}
		return num;
	}
}

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=scan.nextInt();
		int num=0,i,b=a;
		Caluculate p=new Caluculate();
		int count=p.calcCount(a);
		while(a>0)
		{
			i=a%10;
			num=num+p.calcPower(i,count);
			a=a/10;
		}
		if(num==b)
		{
		System.out.println("number is armstrong ");
		}
		else
		{
			System.out.println("number is not armstrong ");
		}
	}

}
