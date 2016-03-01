package com.vk.advance.orm.association;

import java.util.Set;

public class Product {

	private int pid;
	private String pname;
	private Set<Part> parts;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	public Product(int pid, String pname, Set<Part> parts) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.parts = parts;
	}



	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Set<Part> getParts() {
		return parts;
	}
	public void setParts(Set<Part> parts) {
		this.parts = parts;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", parts=" + parts + "]";
	}
	
	
	
}
