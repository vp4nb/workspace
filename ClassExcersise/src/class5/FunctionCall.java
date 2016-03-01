package class5;

import java.util.Scanner;

class ClsFun
{
	void display(String str,int id)
	{
		System.out.println("\n"+str+" id: "+id);
	}
}
public class FunctionCall {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		for(int i=1;i<=3;i++){
		System.out.println("Enter the String&id: ");
		ClsFun cf=new ClsFun();
		cf.display(in.next(),in.nextInt());
		}
		// TODO Auto-generated method stub

	}

}
