package assignment.afterclass5;

import java.util.Scanner;

public class ArrayUsingPrimitive {

	public static void main(String[] args) {
		ArrayPrimitive ap=new ArrayPrimitive();
		Scanner in=new Scanner(System.in);
		int n,i;
		while(true)
		{
			System.out.println("\nEnter the option: \n1. Enter Inputs 2. Display results 3. leave");
			n=in.nextInt();
			if(n==1){
				ap.inputReader();	
			}
			else if(n==2)
			{
				while(true)
				{
				System.out.println("\nEnter the option: \n1. Display All results 2. Display results based on section 3. Main menu");
				i=in.nextInt();
				if(i==1)
				{
				ap.displayResult();
				}
				else if(i==2)
				{
				System.out.println("enter the section you want to view: ");
				ap.displayResult(in.next().charAt(0));
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
