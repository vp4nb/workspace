package class13;

public class Movies {

	private String language;
	private double rating;
	private String name;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return name+" "+rating+" "+language;
	}
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		if(obj instanceof Movies)
		{
			Movies m=(Movies)obj;
		if(this.name.equals( m.getName())&&this.rating==m.getRating()&&this.language.equals(m.getLanguage()))
		{
			return true;
		}
	
		}
		return false;
	}
	public int hashCode(){
		return 31*(name.hashCode()*language.hashCode());
	}
}
