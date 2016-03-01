package com.vk.advance.orm.hasarelation.manytoone;

public class Address {

	private int platNumber;
	private String street;
	private String city;
	private String state;
	private int zipCode;
	public Address(){
		
	}
	public Address(int platNumber, String street, String city, String state, int zipCode) {
		super();
		this.platNumber = platNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public int getPlatNumber() {
		return platNumber;
	}
	public void setPlatNumber(int platNumber) {
		this.platNumber = platNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	@Override
	public String toString() {
		return "Address [platNumber=" + platNumber + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}
	
	
}
