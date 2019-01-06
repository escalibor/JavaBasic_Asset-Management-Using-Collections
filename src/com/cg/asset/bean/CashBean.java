package com.cg.asset.bean;

public class CashBean {
	
	private int amount;

	public CashBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CashBean(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CashBean [amount=" + amount + "]";
	}
	
	

}
