package Class2;
class student
{
	int id=1;
	String name="raghav";
	String phone="112123312";
	public void display()
	{
		int str;
		System.out.println("Student details:\nid: "+id+"\nname: "+name+"\nphone: "+phone);
		str=10;
	System.out.println("Student details:\nid: "+id+"\nname: "+name+"\nphone: "+phone+" str: "+str);
	}
}
public class Sample
	{
		public static void main(String[] args)
		{
			student std;

			std=new student();
			std.display();
		}
	}

