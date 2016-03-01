package class13;

import java.util.Comparator;

public class NameBasedCriteria implements Comparator<Movies>{

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	
}
