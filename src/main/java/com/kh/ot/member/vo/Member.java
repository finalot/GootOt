package com.kh.ot.member.vo;

import org.springframework.stereotype.Component;

@Component
public class Member {

	private int memNo;
	private String memId;
	private String memPwd;
	private String memName;
	private String memSsn; // 생년월일
	private String memAddress;
	private String memEmail;
	private String memPhone;
	private int memSumMoney; // 적립금
	private String memOwner; // 예금주
	private String bank; // 은행명
	private String returnBank; // 환불게좌
	
	
	
	public Member() {
		super();
	}

	public Member(int memNo, String memId, String memPwd, String memName, String memSsn, String memAddress,
			String memEmail, String memPhone, int memSumMoney,String memOwner, String bank, String returnBank) {
		super();
		this.memNo = memNo;
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.memSsn = memSsn;
		this.memAddress = memAddress;
		this.memEmail = memEmail;
		this.memPhone = memPhone;
		this.memSumMoney = memSumMoney;
		this.memOwner = memOwner;
		this.bank = bank;
		this.returnBank = returnBank;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPwd() {
		return memPwd;
	}

	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemSsn() {
		return memSsn;
	}

	public void setMemSsn(String memSsn) {
		this.memSsn = memSsn;
	}

	public String getMemAddress() {
		return memAddress;
	}

	public void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}

	public String getMemEmail() {
		return memEmail;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public int getMemSumMoney() {
		return memSumMoney;
	}

	public void setMemSumMoney(int memSumMoney) {
		this.memSumMoney = memSumMoney;
	}
	

	public String getMemOwner() {
		return memOwner;
	}

	public void setMemOwner(String memOwner) {
		this.memOwner = memOwner;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getReturnBank() {
		return returnBank;
	}

	public void setReturnBank(String returnBank) {
		this.returnBank = returnBank;
	}

	@Override
	public String toString() {
		return "Member [memNo=" + memNo + ", memId=" + memId + ", memPwd=" + memPwd + ", memName=" + memName
				+ ", memSsn=" + memSsn + ", memAddress=" + memAddress + ", memEmail=" + memEmail + ", memPhone="
				+ memPhone + ", memSumMoney=" + memSumMoney + ", memOwner=" + memOwner + ", bank=" + bank
				+ ", returnBank=" + returnBank + "]";
	}

	
	
	
	
}
