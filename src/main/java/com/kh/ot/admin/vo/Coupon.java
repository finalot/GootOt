package com.kh.ot.admin.vo;

import java.sql.Date;

public class Coupon {

	private int cpNo;
	private String cpName;
	private int cpDiscount;
	private String cp_product; // 사용가능한 제품
	private Date cpDate;
	private String cp_status; // 쿠폰 사용여부
	
	public Coupon() {
	}


	public Coupon(int cpNo, String cpName, int cpDiscount, String cp_product, Date cpDate, String cp_status) {
		super();
		this.cpNo = cpNo;
		this.cpName = cpName;
		this.cpDiscount = cpDiscount;
		this.cp_product = cp_product;
		this.cpDate = cpDate;
		this.cp_status = cp_status;
	}


	public int getCpNo() {
		return cpNo;
	}

	public void setCpNo(int cpNo) {
		this.cpNo = cpNo;
	}

	public String getCpName() {
		return cpName;
	}

	public void setCpName(String cpName) {
		this.cpName = cpName;
	}

	public int getCpDiscount() {
		return cpDiscount;
	}

	public void setCpDiscount(int cpDiscount) {
		this.cpDiscount = cpDiscount;
	}

	public String getCp_product() {
		return cp_product;
	}

	public void setCp_product(String cp_product) {
		this.cp_product = cp_product;
	}

	public Date getCpDate() {
		return cpDate;
	}

	public void setCpDate(Date cpDate) {
		this.cpDate = cpDate;
	}

	public String getCp_status() {
		return cp_status;
	}

	public void setCp_status(String cp_status) {
		this.cp_status = cp_status;
	}

	@Override
	public String toString() {
		return "Coupon [cpNo=" + cpNo + ", cpName=" + cpName + ", cpDiscount=" + cpDiscount + ", cp_product="
				+ cp_product + ", cpDate=" + cpDate + ", cp_status=" + cp_status + "]";
	}

	

	
}
