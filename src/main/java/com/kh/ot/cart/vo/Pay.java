package com.kh.ot.cart.vo;

import java.sql.Date;

public class Pay {

	private int ord_no; //주문번호
	private int mem_no; //회원번호
	private int sumprice; //결제금액
	private String pay_category; //결제수단
	private Date pay_date; //결제일
	private int pay_usedcp; //사용쿠폰번호
	private int pay_point; //사용적립금
	private String pay_yn; // 결제완료여부
	private int prdt_no; // 상품번호(문자열)
	
	public Pay() {
	}

	public Pay(int ord_no, int mem_no, int sumprice, String pay_category, Date pay_date, int pay_usedcp, int pay_point,
			String pay_yn) {
		super();
		this.ord_no = ord_no;
		this.mem_no = mem_no;
		this.sumprice = sumprice;
		this.pay_category = pay_category;
		this.pay_date = pay_date;
		this.pay_usedcp = pay_usedcp;
		this.pay_point = pay_point;
		this.pay_yn = pay_yn;
	}

	public int getOrd_no() {
		return ord_no;
	}

	public void setOrd_no(int ord_no) {
		this.ord_no = ord_no;
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public int getSumprice() {
		return sumprice;
	}

	public void setSumprice(int sumprice) {
		this.sumprice = sumprice;
	}

	public String getPay_category() {
		return pay_category;
	}

	public void setPay_category(String pay_category) {
		this.pay_category = pay_category;
	}

	public Date getPay_date() {
		return pay_date;
	}

	public void setPay_date(Date pay_date) {
		this.pay_date = pay_date;
	}

	public int getPay_usedcp() {
		return pay_usedcp;
	}

	public void setPay_usedcp(int pay_usedcp) {
		this.pay_usedcp = pay_usedcp;
	}

	public int getPay_point() {
		return pay_point;
	}

	public void setPay_point(int pay_point) {
		this.pay_point = pay_point;
	}

	public String getPay_yn() {
		return pay_yn;
	}

	public void setPay_yn(String pay_yn) {
		this.pay_yn = pay_yn;
	}
	
	

	public int getPrdt_no() {
		return prdt_no;
	}

	public void setPrdt_no(int prdt_no) {
		this.prdt_no = prdt_no;
	}

	@Override
	public String toString() {
		return "Pay [ord_no=" + ord_no + ", mem_no=" + mem_no + ", sumprice=" + sumprice + ", pay_category="
				+ pay_category + ", pay_date=" + pay_date + ", pay_usedcp=" + pay_usedcp + ", pay_point=" + pay_point
				+ ", pay_yn=" + pay_yn + "]";
	}
	

	
}
