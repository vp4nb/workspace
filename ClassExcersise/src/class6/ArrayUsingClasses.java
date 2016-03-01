package class6;

import java.util.Scanner;

public class ArrayUsingClasses implements ArrayPrim{
	int prev=0;
	ArrayOfClasses[] ac=new ArrayOfClasses[50];
	public void inputReader()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of Users: ");
		int num=in.nextInt();
		num=num+prev;
		ArrayOfClasses aof;
		for(int i=prev;i<num;i++)
		{aof=new ArrayOfClasses();
			System.out.println("Eneter user:"+(i+1)+" details: ");
			System.out.println("id: ");
			aof.setId(in.nextInt());
			System.out.println("name: ");
			aof.setName(in.next());
			System.out.println("fee: ");
			aof.setFee(in.nextDouble());
			System.out.println("section: ");
			aof.setSection(in.next().charAt(0));
			System.out.println("no.of address you want to enter: ");
			int ad=in.nextInt();
			aof.setAddress(ad);
			in.nextLine();
			for(int j=0;j<ad;j++)
			{
				System.out.println("Enter Address"+j+ " :");
				String s=in.nextLine();
				aof.setAddress(j,s);
			}
			ac[i]=aof;
		}
		prev=num;
	}
	public void displayResult()
	{
		System.out.println("the results are: ");
		for(int i=0;i<prev;i++)
		{
			System.out.println();
			System.out.println("user:"+(i+1)+" details: ");
			System.out.println("id: "+ac[i].getId());
			System.out.println("name: "+ac[i].getName());
			System.out.println("fee: "+ac[i].getFee());
			System.out.println("section: "+ac[i].getSection());
			String add[]=ac[i].getAddress();
			int len=add.length;
			for(int j=0;j<len;j++)
			{
				System.out.println("address "+(j+1)+": "+add[j]);
			}
		}
	}
	public void displayResult(char c)
	{
		System.out.println("the results are: ");
		for(int i=0;i<prev;i++)
		{
			if(ac[i].getSection()==c)
			{
			System.out.println();
			System.out.println("user:"+(i+1)+" details: ");
			System.out.println("id: "+ac[i].getId());
			System.out.println("name: "+ac[i].getName());
			System.out.println("fee: "+ac[i].getFee());
			System.out.println("section: "+ac[i].getSection());
			
			String add[]=ac[i].getAddress();
			int len=add.length;
			for(int j=0;j<len;j++)
			{
				System.out.println("address "+(j+1)+": "+add[j]);
			}
			
			}
		}
	}

	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		ArrayUsingClasses aus=new ArrayUsingClasses();
		int n,i;
		while(true)
		{
			System.out.println("\nEnter the option: \n1. Enter Inputs 2. Display results 3. leave");
			n=in.nextInt();
			if(n==1){
				aus.inputReader();	
			}
			else if(n==2)
			{
				while(true)
				{
				System.out.println("\nEnter the option: \n1. Display All results 2. Display results based on section 3. Main menu");
				i=in.nextInt();
				if(i==1)
				{
				aus.displayResult();
				}
				else if(i==2)
				{
				System.out.println("enter the section you want to view: ");
				aus.displayResult(in.next().charAt(0));
				}
				else if(i==3)
				{
					break;
				}
				else
				{
					System.out.println("Enter valid option");
				}
				}
			}
			else if(n==3)
			{
				break;
			}
			else
			{
				System.out.println("you enter a wrong number,please enter an option that is available");
			}
		}
	
		
		
		// TODO Auto-generated method stub

	}

}
