package class7;

public class StudentInfo {

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
		
		System.out.println(sd1.toString());
		System.out.println(sd2.toString());
		System.out.println(sd3.toString());
		
		System.out.println();
		
		System.out.println(sd1);
		System.out.println(sd2);
		System.out.println(sd3);
		
		// TODO Auto-generated method stub

	}

}
