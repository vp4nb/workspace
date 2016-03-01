package assignment.afterclass8;

import java.util.Scanner;

public class Class {
	public void sort(int[] a,int n)
	{
		int i,j,index,temp;
		for(i=0;i<n;i++)
		{
			index=i;
			for(j=i;j<n;j++)
			{
				if(a[index]>a[j])
				{
					index=j;
				}
			}
			temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public void secondMax(int[] a,int n)
	{
		int i,j,index,temp;
		for(i=0;i<2;i++)
		{
			index=i;
			for(j=i;j<n;j++)
			{
				if(a[index]<a[j])
				{
					index=j;
				}
			}
			temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
		
			System.out.println("second maximum number is:"+a[n-2]);
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter no.of values to enter:");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter the numbers: ");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Class c=new Class();
		c.sort(a, n);
		c.secondMax(a, n);
		
		// TODO Auto-generated method stub

	}

}
