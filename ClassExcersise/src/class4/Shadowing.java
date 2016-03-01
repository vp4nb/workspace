package class4;
class Person
{
	int id=1;
	void method()
	{
		System.out.println("person");
	}
}
class Student extends Person
{
	int id=2;
	void method()
	{
		System.out.println("student");
	}
}
public class Shadowing {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.id);
		s.method();
		
		Person p=new Person();
		System.out.println(p.id);
		p.method();
		
		Person ps=new Student();
		System.out.println(ps.id);
		ps.method();
		// TODO Auto-generated method stub

	}

}
