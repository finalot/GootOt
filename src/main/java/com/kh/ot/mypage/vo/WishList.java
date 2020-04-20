package com.kh.ot.mypage.vo;

public class WishList {
	private int wishno;
	private int memno;
	private int prdt_no;
	private int prdt_count;
	private String prdt_size;
	private int prdt_price;
	private int prdt_sumprice;
	private String prdt_name;
	
	public WishList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WishList(int wishno, int memno, int prdt_no, int prdt_count, String prdt_size, int prdt_price,
			int prdt_sumprice, String prdt_name) {
		super();
		this.wishno = wishno;
		this.memno = memno;
		this.prdt_no = prdt_no;
		this.prdt_count = prdt_count;
		this.prdt_size = prdt_size;
		this.prdt_price = prdt_price;
		this.prdt_sumprice = prdt_sumprice;
		this.prdt_name = prdt_name;
	}
	public int getWishno() {
		return wishno;
	}
	public void setWishno(int wishno) {
		this.wishno = wishno;
	}
	public int getMemno() {
		return memno;
	}
	public void setMemno(int memno) {
		this.memno = memno;
	}
	public int getPrdt_no() {
		return prdt_no;
	}
	public void setPrdt_no(int prdt_no) {
		this.prdt_no = prdt_no;
	}
	public int getPrdt_count() {
		return prdt_count;
	}
	public void setPrdt_count(int prdt_count) {
		this.prdt_count = prdt_count;
	}
	public String getPrdt_size() {
		return prdt_size;
	}
	public void setPrdt_size(String prdt_size) {
		this.prdt_size = prdt_size;
	}
	public int getPrdt_price() {
		return prdt_price;
	}
	public void setPrdt_price(int prdt_price) {
		this.prdt_price = prdt_price;
	}
	public int getPrdt_sumprice() {
		return prdt_sumprice;
	}
	public void setPrdt_sumprice(int prdt_sumprice) {
		this.prdt_sumprice = prdt_sumprice;
	}
	public String getPrdt_name() {
		return prdt_name;
	}
	public void setPrdt_name(String prdt_name) {
		this.prdt_name = prdt_name;
	}
	@Override
	public String toString() {
		return "WishList [wishno=" + wishno + ", memno=" + memno + ", prdt_no=" + prdt_no + ", prdt_count=" + prdt_count
				+ ", prdt_size=" + prdt_size + ", prdt_price=" + prdt_price + ", prdt_sumprice=" + prdt_sumprice
				+ ", prdt_name=" + prdt_name + "]";
	}
}