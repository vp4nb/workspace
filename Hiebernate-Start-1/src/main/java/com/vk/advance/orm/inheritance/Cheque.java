package com.vk.advance.orm.inheritance;

public class Cheque extends Payment{

	private String chequeNumber;
	private String chequeBy;
	public Cheque() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cheque( int amount, String chequeNumber, String chequeBy) {
		super(amount);
		this.chequeNumber = chequeNumber;
		this.chequeBy = chequeBy;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public String getChequeBy() {
		return chequeBy;
	}
	public void setChequeBy(String chequeBy) {
		this.chequeBy = chequeBy;
	}
	@Override
	public String toString() {
		return "Cheque [chequeNumber=" + chequeNumber + ", chequeBy=" + chequeBy + "]";
	}
	
	
}
