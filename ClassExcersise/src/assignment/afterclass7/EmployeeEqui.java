package assignment.afterclass7;

import java.util.Scanner;

import class7.Department;
import class7.Employee;

public class EmployeeEqui{
	Employee[] emp=new Employee[50];
	int prev=0;
	public void inputReader()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int num=in.nextInt();
		num=num+prev;
		Employee e;
		for(int i=prev;i<num;i++)
		{e=new Employee();
			System.out.println("Eneter employee:"+(i+1)+" details: ");
			System.out.println("id: ");
			e.setEmployeeId(in.nextInt());
			System.out.println("name: ");
			e.setEmployeeName(in.next());
			System.out.println("salary: ");
			e.SetSalary(in.nextDouble());
			System.out.println("Department Id: ");
			int id=in.nextInt();
			System.out.println("Department name: ");
			String name=in.next();
			System.out.println("Department location");
			String location=in.next();
			e.setDepartment(id,name,location);
			in.nextLine();
			emp[i]=e;
		}
		prev=num;
	}
	public void displayResult()
	{
		System.out.println("the results are: ");
		int count;
		for(int i=0;i<prev;i++)
		{
			count=0;
			for(int j=0;j<i;j++)
			{
				if(emp[i].equals(emp[j]))
				{
					count=1;
				}
			}
			if(count==0)
			{
				System.out.println();
				System.out.println("user:"+(i+1)+" details: ");
				System.out.println("employee id: "+emp[i].getEmployeeId());
				System.out.println("employee name: "+emp[i].getEmployeeName());
				System.out.println("salary: "+emp[i].getSalary());
				Department d=emp[i].getDepartment();
				System.out.println("department id: "+d.getDeptId());
				System.out.println("department name: "+d.getDeptName());
				System.out.println("department location: "+d.getDeptLocation());
			}
		}
	}
	public void displayResult(int c)
	{
		System.out.println("the results are: ");
		int count;
		for(int i=0;i<prev;i++)
		{
			count=0;
			for(int j=0;j<i;j++)
			{
				if(emp[i].getEmployeeId()==c&&!(emp[i].equals(emp[j])))
				{
					count=1;
				}
			}
			if(count==1)
			{
					System.out.println();
					System.out.println("user:"+(i+1)+" details: ");
					System.out.println("employee id: "+emp[i].getEmployeeId());
					System.out.println("employee name: "+emp[i].getEmployeeName());
					System.out.println("salary: "+emp[i].getSalary());
					Department d=emp[i].getDepartment();
					System.out.println("department id: "+d.getDeptId());
					System.out.println("department name: "+d.getDeptName());
					System.out.println("department location: "+d.getDeptLocation());
				
			}
			
		}
	}

	
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		EmployeeEqui equi=new EmployeeEqui();
		int n,i;
		while(true)
		{
			System.out.println("\nEnter the option: \n1. Enter Inputs 2. Display results 3. leave");
			n=in.nextInt();
			if(n==1){
				equi.inputReader();	
			}
			else if(n==2)
			{
				while(true)
				{
				System.out.println("\nEnter the option: \n1. Display All results 2. Display results based on section 3. Main menu");
				i=in.nextInt();
				if(i==1)
				{
				equi.displayResult();
				}
				else if(i==2)
				{
				System.out.println("enter the employee id you want to view: ");
				equi.displayResult(in.nextInt());
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
