package assignment.afterclass13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Hospatial> al=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of hospitals details we want to enter:");
		int n=in.nextInt();
		in.nextLine();
		Hospatial hos;
		Doctor doc;
		Address adr;
		int count;
		for(int i=0;i<n;i++)
		{
			hos=new Hospatial();
			doc=new Doctor();
			adr=new Address();
			System.out.println("enter hospatal name:");
			hos.setHospitalName(in.nextLine());
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
			count=0;
			for(Hospatial h:al)
			{
				
				if(hos.equals(h))
				{
					
					count++;
				}	
			}
			if(count==0)
			{
				al.add(hos);
			}
			else
			{
				System.out.println("same hospatial information is added with name and address");
			}
		}
		
		Collections.sort(al);
		for(Hospatial h:al)
		{
			System.out.println(h);
		}
		System.out.println("enter zipcode to find nearest hospatial:");
		System.out.println("nearest hospatial:\n"+NearestHospatial.nearHospatial(al, in.nextInt()));
		// TODO Auto-generated method stub

	}

}
