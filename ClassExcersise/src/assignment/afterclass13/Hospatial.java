package assignment.afterclass13;

public class Hospatial implements Comparable<Hospatial>{
	    private String hospitalName;
	   private Doctor doc;
	    private Address hospitalAddress;
		public String getHospitalName() {
			return hospitalName;
		}
		public void setHospitalName(String hospitalName) {
			this.hospitalName = hospitalName;
		}
		public Doctor getDoc() {
			return doc;
		}
		public void setDoc(Doctor doc) {
			this.doc = doc;
		}
		public Address getHospitalAddress() {
			return hospitalAddress;
		}
		public void setHospitalAddress(Address hospitalAddress) {
			this.hospitalAddress = hospitalAddress;
		}
		public String toString()
		{
			return "hospatial name:"+hospitalName+"\n"+doc+"\n:"+hospitalAddress+"\n\n";
		}
		public int hashCode(){
			return 31*(hospitalName.hashCode()*hospitalAddress.hashCode());
		}
		public boolean equals(Object hos)
		{
			if(hos==null)
				return false;
			if(hos instanceof Hospatial)
			{
				if(hospitalName.equals(((Hospatial) hos).getHospitalName())&&
						hospitalAddress.equals(((Hospatial) hos).getHospitalAddress()))
				{
					return true;
				}
			}
			return false;
		}
		
		@Override
		public int compareTo(Hospatial o) {
			return hospitalName.compareToIgnoreCase(o.getHospitalName())==0? hospitalAddress.getZipCode()-o.getHospitalAddress().getZipCode():hospitalName.compareToIgnoreCase(o.getHospitalName());
			// TODO Auto-generated method stub
			
		}
	
}
