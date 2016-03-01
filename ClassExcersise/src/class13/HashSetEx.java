package class13;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		m4.setRating(8.5);
		m4.setLanguage("telugu");
		HashSet<Movies> hs=new HashSet<>();
		hs.add(m1);
		hs.add(m2);
		hs.add(m3);
		hs.add(m4);
		
		System.out.println("result");
		for(Movies m:hs)
		{
			System.out.println(m);
		}
		
	}

}
