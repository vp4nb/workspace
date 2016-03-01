package class8;

import java.util.Scanner;

import class7.Employee;

public class EmployeeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Scanner in=new Scanner(System.in);
		System.out.println("Eneter employee details: ");
		System.out.println("id: ");
		e1.setEmployeeId(in.nextInt());
		System.out.println("name: ");
		e1.setEmployeeName(in.next());
		System.out.println("salary: ");
		e1.SetSalary(in.nextDouble());
		System.out.println("Department Id: ");
		int id=in.nextInt();
		System.out.println("Department name: ");
		String name=in.next();
		System.out.println("Department location");
		String location=in.next();
		e1.setDepartment(id,name,location);
		
		//Employee e2=(Employee)e1.clone();
		//System.out.println(e2.getEmployeeId());
	}

}
