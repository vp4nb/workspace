package class13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(132, "shiva");
		hm.put(245, "venkat");
		hm.put(367, "ramu");
		hm.put(null,null);
		hm.put(453,"raju");
		hm.put(444,"raghav");
		hm.put(null,null);
		ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<>(hm);
		//way only work in java1.8
		hm.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
		//other way
		Set<Integer> set=hm.keySet();
		System.out.println("other way");
		for(Integer i:set)
		{
			System.out.println("key: "+i+" value: "+hm.get(i));
		}
		//other way
		for(Map.Entry<Integer, String> m:hm.entrySet())
		{
			System.out.println("key : "+m.getKey()+" value : "+m.getValue());
		}
		// TODO Auto-generated method stub

	}

}
