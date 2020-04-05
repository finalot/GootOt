package com.kh.ot.mypage.model.vo;

public class MyAddress {
	private int memno; // 회원번호
	private int ordno; // 주문번호
	private String addressTitle; // 배송지명
	private String memName; // 성명
	private String telephone; // 집전화번호
	private String mobile; // 핸드폰번호
	private String address; // 배송지 주소
	private boolean address_fix; // 기본배송지 (true & false)
	
	public MyAddress() {}
	
	

	public MyAddress(int memno, int ordno, String addressTitle, String memName, String telephone, String mobile,
			String address, boolean address_fix) {
		super();
		this.memno = memno;
		this.ordno = ordno;
		this.addressTitle = addressTitle;
		this.memName = memName;
		this.telephone = telephone;
		this.mobile = mobile;
		this.address = address;
		this.address_fix = address_fix;
	}


	public int getMemno() {
		return memno;
	}

	public void setMemno(int memno) {
		this.memno = memno;
	}

	public int getOrdno() {
		return ordno;
	}

	public void setOrdno(int ordno) {
		this.ordno = ordno;
	}

	public String getAddressTitle() {
		return addressTitle;
	}

	public void setAddressTitle(String addressTitle) {
		this.addressTitle = addressTitle;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isAddress_fix() {
		return address_fix;
	}

	public void setAddress_fix(boolean address_fix) {
		this.address_fix = address_fix;
	}


	@Override
	public String toString() {
		return "MyAddress [memno=" + memno + ", ordno=" + ordno + ", addressTitle=" + addressTitle + ", memName="
				+ memName + ", telephone=" + telephone + ", mobile=" + mobile + ", address=" + address
				+ ", address_fix=" + address_fix + "]";
	}
}
