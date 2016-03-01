package com.vk.advance.orm.inheritance;

public class CreditCard extends Payment{

	private String cardNumber;
	private int cccvv;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(int amount, String cardNumber, int cccvv) {
		super(amount);
		
		this.cardNumber = cardNumber;
		this.cccvv = cccvv;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCccvv() {
		return cccvv;
	}
	public void setCccvv(int cccvv) {
		this.cccvv = cccvv;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cccvv=" + cccvv + "]";
	}
	
	
	
}
