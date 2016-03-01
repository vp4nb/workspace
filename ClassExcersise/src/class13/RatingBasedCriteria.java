package class13;

import java.util.Comparator;

public class RatingBasedCriteria implements Comparator<Movies>{


		@Override
		public int compare(Movies o1, Movies o2) {
			// TODO Auto-generated method stub
			return (new Double(o1.getRating())).compareTo((new Double(o2.getRating())));
		

		
	}

}
