package class13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListMobilePhones {

	public static void main(String[] args) {
		
		ArrayList<MobilePhone> al=new ArrayList<>();
		
		MobilePhone mp1=new MobilePhone();
		mp1.setName("Samasung");
		mp1.setCost(40000);
		mp1.setOs("android");
		
		MobilePhone mp2=new MobilePhone();
		mp2.setName("Apple");
		mp2.setCost(45000);
		mp2.setOs("Mac");
		
		MobilePhone mp3=new MobilePhone();
		mp3.setName("lg");
		mp3.setCost(40000);
		mp3.setOs("android");
		
		al.add(mp1);
		al.add(mp2);
		al.add(mp3);
		System.out.println("printing objects");
		for(MobilePhone mp:al)
		{
			System.out.println(mp);
		}
		System.out.println("after sort");
		Collections.sort(al);
		//Set<MobilePhone> phoneSet=new TreeSet<>();
		//phoneSet.addAll(al);
		for(MobilePhone mp:al)
		{
			System.out.println(mp);
		}
		// TODO Auto-generated method stub

	}

}
