package class13;

import java.util.Comparator;

public class NameAfterRating implements Comparator<Movies>{

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		int result=o1.getName().compareTo(o2.getName());
		if(result==0)
			return (new Double(o1.getRating())).compareTo((new Double(o2.getRating())));
		return result;
	}

}
