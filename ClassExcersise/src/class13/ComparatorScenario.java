package class13;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorScenario {

	public static void main(String[] args) {
		Movies m1=new Movies();
		m1.setName("dictator");
		m1.setRating(8.5);
		m1.setLanguage("telugu");
		
		Movies m2=new Movies();
		m2.setName("nannaku prema tho");
		m2.setRating(8.0);
		m2.setLanguage("telugu");
		
		Movies m3=new Movies();
		m3.setName("express raja");
		m3.setRating(9.25);
		m3.setLanguage("telugu");
		
		Movies m4=new Movies();
		m4.setName("dictator");
		m4.setRating(8.25);
		m4.setLanguage("telugu");
		
		ArrayList<Movies> al=new ArrayList();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		System.out.println("before sort:");
		for(Movies m:al)
		{
			System.out.println(m);
		}
		Collections.sort(al, new NameAfterRating());
		
		System.out.println("after sort:");
		for(Movies m:al)
		{
			System.out.println(m);
		}
		// TODO Auto-generated method stub

	}

}
