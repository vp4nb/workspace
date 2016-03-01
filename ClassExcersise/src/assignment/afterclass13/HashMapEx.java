package assignment.afterclass13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<String,Hospatial> al=new HashMap<>();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of hospitals details we want to enter:");
		int n=in.nextInt();
		in.nextLine();
		Hospatial hos;
		Doctor doc;
		Address adr;
		String str;
		for(int i=0;i<n;i++)
		{
			hos=new Hospatial();
			doc=new Doctor();
			adr=new Address();
			System.out.println("enter hospatal name:");
			str=in.nextLine();
			hos.setHospitalName(str);
			System.out.println("enter the doctor id:");
			doc.setDocId(in.nextInt());
			in.nextLine();
			System.out.println("enter the doctor name:");
			doc.setName(in.nextLine());
			System.out.println("enter the specialization:");
			doc.setSpecialization(in.nextLine());
			hos.setDoc(doc);
			System.out.println("enter address line 1");
			adr.setAddress1(in.nextLine());
			System.out.println("enter address line 2");
			adr.setAddress2(in.nextLine());
			System.out.println("enter city");
			adr.setCity(in.nextLine());
			System.out.println("enter state:");
			adr.setState(in.nextLine());
			System.out.println("enter zipcode");
			adr.setZipCode(in.nextInt());
			in.nextLine();
			hos.setHospitalAddress(adr);
			
				al.put(str,hos);
			
		}
		al.forEach((k,v)->System.out.println("key"+k+"value"+v));
		// TODO Auto-generated method stub

	}

}
