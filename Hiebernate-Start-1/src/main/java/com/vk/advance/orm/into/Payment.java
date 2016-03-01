package com.vk.advance.orm.into;

public class Payment {
	
	private int paymentId;
	private int amount;
		
	public Payment()
	{
		
	}
	
	
	public Payment(int paymentId, int amount) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + "]";
	}
	

}
