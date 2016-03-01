package class7;

public class StingEquals {

	public static void main(String[] args) {
		
		String s1="orange";
		String s2="apple";
		String s3=new String("orange");
		String s4=new String("apple");
		if(s1==s2)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		if(s1==s3)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("equal with equals()");
		}
		else
		{
			System.out.println("not equal with equals()");
		}
		if(s1.equals(s3))
		{
			System.out.println("equal with equlas()");
		}
		else
		{
			System.out.println("not equal with equals()");
		}
		// TODO Auto-generated method stub

	}

}
