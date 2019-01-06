package com.cg.asset.bean;



public class EquityBean {

	private int id;
	private String name;
	private int unitPrice;
	private int noOfUnits;
	private int total;
	
	public EquityBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EquityBean(int id, String name, int unitPrice, int noOfUnits, int total) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.noOfUnits = noOfUnits;
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
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getNoOfUnits() {
		return noOfUnits;
	}
	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "EquityBean [name=" + name + ", unitPrice=" + unitPrice + ", noOfUnits=" + noOfUnits
				+ ", total=" + total + "]";
	}
	
	
	
	
	
}

