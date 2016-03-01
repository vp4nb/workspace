package assignment.afterclass13;

import java.util.ArrayList;
import java.util.Collection;

public class NearestHospatial {
	public static Hospatial nearHospatial(Collection<Hospatial> c,int zipCode)
	{
		int zipDiff=99999;
		Hospatial hos=null;
		for(Hospatial h:c)
		{
			if(h.getHospitalAddress().getZipCode()==zipCode)
			{
				return h;
			}
			else if(Math.abs(h.getHospitalAddress().getZipCode()-zipCode)<zipDiff)
			{
				zipDiff=Math.abs(h.getHospitalAddress().getZipCode()-zipCode);
				hos=h;
			}
		}
		return hos;
	}

}
