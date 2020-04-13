package com.kh.ot.cart.vo;

public class Cart {

	private int mem_no; // 회원번호
	private int prdt_no; // 상품번호
	private int prdt_price; // 상품가격
	private int prdt_count; // 상품갯수
	private int prdt_sumprice; // 상품총금액
	private String prdt_color; // 상품컬러
	private String prdt_size; // 상품사이즈
	private String mem_name; // 회원이름
	
	public Cart() {}

	public Cart(int mem_no, int prdt_no, int prdt_price, int prdt_count, int prdt_sumprice, String prdt_color,
			String prdt_size, String mem_name) {
		super();
		this.mem_no = mem_no;
		this.prdt_no = prdt_no;
		this.prdt_price = prdt_price;
		this.prdt_count = prdt_count;
		this.prdt_sumprice = prdt_sumprice;
		this.prdt_color = prdt_color;
		this.prdt_size = prdt_size;
		this.mem_name = mem_name;
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public int getPrdt_no() {
		return prdt_no;
	}

	public void setPrdt_no(int prdt_no) {
		this.prdt_no = prdt_no;
	}

	public int getPrdt_price() {
		return prdt_price;
	}

	public void setPrdt_price(int prdt_price) {
		this.prdt_price = prdt_price;
	}

	public int getPrdt_count() {
		return prdt_count;
	}

	public void setPrdt_count(int prdt_count) {
		this.prdt_count = prdt_count;
	}

	public int getPrdt_sumprice() {
		return prdt_sumprice;
	}

	public void setPrdt_sumprice(int prdt_sumprice) {
		this.prdt_sumprice = prdt_sumprice;
	}

	public String getPrdt_color() {
		return prdt_color;
	}

	public void setPrdt_color(String prdt_color) {
		this.prdt_color = prdt_color;
	}

	public String getPrdt_size() {
		return prdt_size;
	}

	public void setPrdt_size(String prdt_size) {
		this.prdt_size = prdt_size;
	}
	
	

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	@Override
	public String toString() {
		return "Cart [mem_no=" + mem_no + ", prdt_no=" + prdt_no + ", prdt_price=" + prdt_price + ", prdt_count="
				+ prdt_count + ", prdt_sumprice=" + prdt_sumprice + ", prdt_color=" + prdt_color + ", prdt_size="
				+ prdt_size + ", mem_name=" + mem_name + "]";
	}

	
	
	
}
