package com.vk.advance.orm.inheritance;

public class Payment {
	private int paymentId;
	//private String paymentType;
	private int amount;
	

	public Payment() {	}

	
	public Payment(int amount) {
		this.amount = amount;
	}

	public void setPaymentId(int paymentId) {
		paymentId = paymentId;
	}
	public int getPaymentId() {
		return paymentId;
	}


	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Payment [ amount=" + amount + " paymentId=" + paymentId+"]";
	}

	
	
}
