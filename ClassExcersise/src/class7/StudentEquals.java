package class7;

public class StudentEquals {

	public static void main(String[] args) {
		
		Student sd1=new Student();
		sd1.setId(1);
		sd1.setName("rama");
		sd1.setFee(45.56);
		
		Student sd2=new Student();
		sd2.setId(2);
		sd2.setName("raju");
		sd2.setFee(51.33);
		
		Student sd3=new Student();
		sd3.setId(3);
		sd3.setName("raghav");
		sd3.setFee(33.45);
		
		Student sd4=new Student();
		sd4.setId(4);
		sd4.setName("ravan");
		sd4.setFee(71.56);
		
		Student sd6=new Student();
		sd6.setId(4);
		sd6.setName("ravan");
		sd6.setFee(71.56);
		Student sd5=null;
		
		//compare with ==
		/*if(sd1==sd2)
		{
			System.out.println("same compare with ==");
		}
		else
		{
			System.out.println("not same compare with ==");
		}
		
		if(sd1.equals(sd2))
		{
			System.out.println("same compare with equals()");
		}
		else
		{
			System.out.println("not same compare with equals()");
		}
		
		if(sd3==sd4)
		{
			System.out.println("same compare with ==");
		}
		else
		{
			System.out.println("not same compare with ==");
		}
		
		if(sd3.equals(sd4))
		{
			System.out.println("same compare with equals()");
		}
		else
		{
			System.out.println("not same compare with equals()");
		}*/
		// TODO Auto-generated method stub
		if(sd4==sd5)
		{
			System.out.println("same compare with ==");
		}
		else
		{
			System.out.println("not same compare with ==");
		}
		
		if(sd4.equals(sd5))
		{
			System.out.println("same compare with equals()");
		}
		else
		{
			System.out.println("not same compare with equals()");
		}
		
		if(sd4==sd6)
		{
			System.out.println("same compare with ==");
		}
		else
		{
			System.out.println("not same compare with ==");
		}
		
		if(sd4.equals(sd6))
		{
			System.out.println("same compare with equals()");
		}
		else
		{
			System.out.println("not same compare with equals()");
		}
		
	}

}
