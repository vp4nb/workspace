package assignment.afterclass13;

public class Address {
	  private String address1;
	  private String address2;
	  private String city;
	  private String state;
	  private int zipCode;
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String toString()
	{
		return "Address Line 1:"+address1+"\nAddress Line 2:"+address2+"\nCity:"+city+"\nState:"+state+"\nZipcode:"+zipCode;
	}
	public int hashCode(){
		return 31*(address1.hashCode()*address2.hashCode()*city.hashCode()*state.hashCode());
	}
	public boolean equals(Object adr)
	{
		if(adr==null)
			return false;
		if(adr instanceof Address)
		{
			if(address1.equals(((Address) adr).getAddress1())&&
					address2.equals(((Address) adr).getAddress2())&&
					city.equals(((Address) adr).getCity())&&
					state.equals(((Address) adr).getState())&&
					zipCode==((Address) adr).getZipCode())
			{
				return true;
			}
		}
		return false;
	}
}
