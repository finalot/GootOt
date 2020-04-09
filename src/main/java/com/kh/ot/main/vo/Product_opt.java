package com.kh.ot.main.vo;

import java.sql.Date;

public class Product_opt {

	private int optNo;
	private int PrdtNo;
	private String optColor;
	private String size;
	private int stock;
	private Date optDate;
	private Date optModifyDate;
	private String prdtCode;
	
	public Product_opt() {
	}

	public Product_opt(int optNo, int prdtNo, String optColor, String size, int stock, Date optDate, Date optModifyDate,
			String prdtCode) {
		super();
		this.optNo = optNo;
		PrdtNo = prdtNo;
		this.optColor = optColor;
		this.size = size;
		this.stock = stock;
		this.optDate = optDate;
		this.optModifyDate = optModifyDate;
		this.prdtCode = prdtCode;
	}

	public int getOptNo() {
		return optNo;
	}

	public void setOptNo(int optNo) {
		this.optNo = optNo;
	}

	public int getPrdtNo() {
		return PrdtNo;
	}

	public void setPrdtNo(int prdtNo) {
		PrdtNo = prdtNo;
	}

	public String getOptColor() {
		return optColor;
	}

	public void setOptColor(String optColor) {
		this.optColor = optColor;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getOptDate() {
		return optDate;
	}

	public void setOptDate(Date optDate) {
		this.optDate = optDate;
	}

	public Date getOptModifyDate() {
		return optModifyDate;
	}

	public void setOptModifyDate(Date optModifyDate) {
		this.optModifyDate = optModifyDate;
	}

	public String getPrdtCode() {
		return prdtCode;
	}

	public void setPrdtCode(String prdtCode) {
		this.prdtCode = prdtCode;
	}

	@Override
	public String toString() {
		return "Product_opt [optNo=" + optNo + ", PrdtNo=" + PrdtNo + ", optColor=" + optColor + ", size=" + size
				+ ", stock=" + stock + ", optDate=" + optDate + ", optModifyDate=" + optModifyDate + ", prdtCode="
				+ prdtCode + "]";
	}

	
	
}
