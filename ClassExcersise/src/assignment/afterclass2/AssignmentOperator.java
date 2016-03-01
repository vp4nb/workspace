package assignment.afterclass2;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value: ");
		int a=scan.nextInt();  //assignment operator =
		System.out.println("a value after assignment :"+a);
		a+=10;  //this means a=a+10
		System.out.println("a value after short hand addition assignment :"+a);
		a-=10;  //this means a=a-10
		System.out.println("a value after short hand subtraction assignment :"+a);
		a*=10;  //this means a=a*10
		System.out.println("a value after short hand multiplication assignment :"+a);
		a/=10;  //this means a=a/10
		System.out.println("a value after short hand division assignment :"+a);
		a%=10;   //this means a=a%10
		System.out.println("a value after short hand modulo division assignment :"+a);
		// TODO Auto-generated method stub

	}

}
