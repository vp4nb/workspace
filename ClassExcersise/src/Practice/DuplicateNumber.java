package Practice;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		System.out.println("enter the number N");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int count;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j]&&j!=i)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(arr[i]);
			}
		}
		
		// TODO Auto-generated method stub

	}
	

}
