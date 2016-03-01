package com.bellinfo.b2.advance.spring;

public class LaptopDetails {

	String brand;
	int price;
	public LaptopDetails(String brand, int price){
		this.brand=brand;
		this.price=price;
	}
	public String getLaptopDetails(){
		return "brand: "+brand+" price: "+price;
	}
}
