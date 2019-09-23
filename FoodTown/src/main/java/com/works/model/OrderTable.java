package com.works.model;

public class OrderTable {

	private int oid;
	private double ototalprize;
	private int ototalquantity;
	private String statu;
	private String uname;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public double getOtotalprize() {
		return ototalprize;
	}
	public void setOtotalprize(double ototalprize) {
		this.ototalprize = ototalprize;
	}
	public int getOtotalquantity() {
		return ototalquantity;
	}
	public void setOtotalquantity(int ototalquantity) {
		this.ototalquantity = ototalquantity;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
}
