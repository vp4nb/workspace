package Class2;
class StdInfo
{
	
	int a=10;
	static int b=20;
	
	
}
public class Stud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdInfo s1=new StdInfo();
		int x=s1.a;
		int y=s1.b;
		s1.a=x+y;
		StdInfo.b=x-y;
		StdInfo s2=new StdInfo();
		int s=s2.a;
		int p=s2.b;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("s="+s);
		System.out.println("p="+p);
	}

}
