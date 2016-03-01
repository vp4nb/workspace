package com.vk.advance.orm.into;

public class CreditCard extends Payment{

	private String cardNumber;
	private int cvv;
		
	public CreditCard(){
		
	}
	public CreditCard(int paymentId, int amount, String cardNumber, int cvv) {
		super(paymentId, amount);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cvv=" + cvv + "]";
	}
	
}
