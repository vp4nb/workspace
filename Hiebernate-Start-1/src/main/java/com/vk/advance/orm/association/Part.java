package com.vk.advance.orm.association;

public class Part {

	private int partId;
	private String partName;
		
	public Part() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Part(int partId, String partName) {
		super();
		this.partId = partId;
		this.partName = partName;
	}


	public int getPartId() {
		return partId;
	}
	public void setPartId(int partId) {
		this.partId = partId;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	@Override
	public String toString() {
		return "Part [partId=" + partId + ", partName=" + partName + "]";
	}
	
}
