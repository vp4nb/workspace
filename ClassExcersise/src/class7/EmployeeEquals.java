package class7;

public class EmployeeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee sd1=new Employee();
		sd1.setEmployeeId(1);
		sd1.setEmployeeName("rama");
		sd1.SetSalary(45.56);
		sd1.setDepartment(123,"IT","HYD");
		
		Employee sd2=new Employee();
		sd2.setEmployeeId(2);
		sd2.setEmployeeName("raju");
		sd2.SetSalary(51.33);
		sd2.setDepartment(234,"hr","DEL");
		
		Employee sd3=new Employee();
		sd3.setEmployeeId(3);
		sd3.setEmployeeName("ravan");
		sd3.SetSalary(71.56);
		sd3.setDepartment(345,"HR","CHE");
		
		Employee sd4=new Employee();
		sd4.setEmployeeId(3);
		sd4.setEmployeeName("ravan");
		sd4.SetSalary(70.23);
		sd4.setDepartment(345,"HR","CHE");
		
		if(sd1.equals(sd2))
		{
			System.out.println("\n"+sd1+"\n\n"+sd2);
			System.out.println("\nsd1 and sd2 are same");
		}
		else
		{
			System.out.println("\n"+sd1+"\n\n"+sd2);
			System.out.println("\nsd1 and sd2 are not same");
		}
		
		if(sd3.equals(sd4))
		{
			System.out.println("\n"+sd3+"\n\n"+sd4);
			System.out.println("\nsd3 and sd4 are same");
		}
		else
		{
			System.out.println("\n"+sd3+"\n\n"+sd4);
			System.out.println("\nsd3 and sd4 are not same");
		}
		
	}

}
