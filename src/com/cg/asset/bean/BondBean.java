package com.cg.asset.bean;

public class BondBean {

	private int id;
	private String name;
	private int amount;
	private int interestRate;
	private int tenure;
	private int total;
	
	public BondBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BondBean(int id, String name, int amount, int interestRate, int tenure, int total) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "BondBean [ name=" + name + ", amount=" + amount + ", interestRate=" + interestRate
				+ ", tenure=" + tenure + ", total=" + total + "]";
	}
	
	
	
	
}
