package class12;

import java.io.Serializable;

public class WebSite implements Serializable {
	private int rank;
	private String name;
	private transient String purpose;
	public void setRank(int rank){
		this.rank=rank;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPurpose(String purpose){
		this.purpose=purpose;
	}
	public int getRank(){
		return this.rank;
	}
	public String getName(){
		return this.name;
	}
	public String getPurpose(){
		return this.purpose;
	}

}
