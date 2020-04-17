package com.kh.ot.cart.vo;

import java.sql.Date;

public class Ord {
	private int ord_no; //주문번호
	private int mem_no; //회원번호
	private int prdt_no;  // 상품번호
	private Date ord_date; // 구매날짜
	private String ord_receiver; // 수령인
	private String ord_phone; // 수령인 번호
	private String ord_address; //수형인 주소
	private String ord_message; //배송메세지
	private String ord_status; //배송상태
	private String ord_size; // 상품 사이즈
	private String ord_color; //상품 컬러
	private int ord_count; //상품 수량
	private String path; // 이미지 경로
	private String image; // 이미지
	private String prdt_name; // 상품이름
	private int prdt_price; // 가격
	private int prdt_sumprice; // 총 가격
	

	public Ord() {
		super();
	}

	public Ord(int ord_no, int mem_no, int prdt_no, Date ord_date, String ord_receiver, String ord_phone,
			String ord_address, String ord_message, String ord_status, String ord_size, String ord_color,
			int ord_count) {
		super();
		this.ord_no = ord_no;
		this.mem_no = mem_no;
		this.prdt_no = prdt_no;
		this.ord_date = ord_date;
		this.ord_receiver = ord_receiver;
		this.ord_phone = ord_phone;
		this.ord_address = ord_address;
		this.ord_message = ord_message;
		this.ord_status = ord_status;
		this.ord_size = ord_size;
		this.ord_color = ord_color;
		this.ord_count = ord_count;
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

	public int getPrdt_no() {
		return prdt_no;
	}

	public void setPrdt_no(int prdt_no) {
		this.prdt_no = prdt_no;
	}

	public Date getOrd_date() {
		return ord_date;
	}

	public void setOrd_date(Date ord_date) {
		this.ord_date = ord_date;
	}

	public String getOrd_receiver() {
		return ord_receiver;
	}

	public void setOrd_receiver(String ord_receiver) {
		this.ord_receiver = ord_receiver;
	}

	public String getOrd_phone() {
		return ord_phone;
	}

	public void setOrd_phone(String ord_phone) {
		this.ord_phone = ord_phone;
	}

	public String getOrd_address() {
		return ord_address;
	}

	public void setOrd_address(String ord_address) {
		this.ord_address = ord_address;
	}

	public String getOrd_message() {
		return ord_message;
	}

	public void setOrd_message(String ord_message) {
		this.ord_message = ord_message;
	}

	public String getOrd_status() {
		return ord_status;
	}

	public void setOrd_status(String ord_status) {
		this.ord_status = ord_status;
	}

	public String getOrd_size() {
		return ord_size;
	}

	public void setOrd_size(String ord_size) {
		this.ord_size = ord_size;
	}

	public String getOrd_color() {
		return ord_color;
	}

	public void setOrd_color(String ord_color) {
		this.ord_color = ord_color;
	}

	public int getOrd_count() {
		return ord_count;
	}

	public void setOrd_count(int ord_count) {
		this.ord_count = ord_count;
	}
	
	

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
		return "Ord [ord_no=" + ord_no + ", mem_no=" + mem_no + ", prdt_no=" + prdt_no + ", ord_date=" + ord_date
				+ ", ord_receiver=" + ord_receiver + ", ord_phone=" + ord_phone + ", ord_address=" + ord_address
				+ ", ord_message=" + ord_message + ", ord_status=" + ord_status + ", ord_size=" + ord_size
				+ ", ord_color=" + ord_color + ", ord_count=" + ord_count + ", path=" + path + ", image=" + image
				+ ", prdt_name=" + prdt_name + ", prdt_price=" + prdt_price + ", prdt_sumprice=" + prdt_sumprice + "]";
	}


	
	
}
