package com.kh.ot.mypage.vo;

import java.sql.Date;

public class Return {

	private int reNo; //교환번호
	private int memCode; //회원번호
	private int ordCode; //주문번호
	private Date qnaDate; //작성날짜
	private String reTitle; //작성제목
	private String reName;//작성자
	private String content; //작성내용
	private String reReason; //반품사유
	private String reCheck; //수령여부
	private String reReal; //실제상태
	private Date reDate; //반품신청날짜
	private String reMent; //반품메모
	private String reStatus; //반품여부
	
	public Return() {
	}

	public Return(int reNo, int memCode, int ordCode, Date qnaDate, String reTitle, String content, String reReason,
			String reCheck, String reReal, Date reDate, String reMent, String reStatus) {
		super();
		this.reNo = reNo;
		this.memCode = memCode;
		this.ordCode = ordCode;
		this.qnaDate = qnaDate;
		this.reTitle = reTitle;
		this.content = content;
		this.reReason = reReason;
		this.reCheck = reCheck;
		this.reReal = reReal;
		this.reDate = reDate;
		this.reMent = reMent;
		this.reStatus = reStatus;
	}

	
	public String getReName() {
		return reName;
	}

	public void setReName(String reName) {
		this.reName = reName;
	}

	public int getReNo() {
		return reNo;
	}

	public void setReNo(int reNo) {
		this.reNo = reNo;
	}

	public int getMemCode() {
		return memCode;
	}

	public void setMemCode(int memCode) {
		this.memCode = memCode;
	}

	public int getOrdCode() {
		return ordCode;
	}

	public void setOrdCode(int ordCode) {
		this.ordCode = ordCode;
	}

	public Date getQnaDate() {
		return qnaDate;
	}

	public void setQnaDate(Date qnaDate) {
		this.qnaDate = qnaDate;
	}

	public String getReTitle() {
		return reTitle;
	}

	public void setReTitle(String reTitle) {
		this.reTitle = reTitle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReReason() {
		return reReason;
	}

	public void setReReason(String reReason) {
		this.reReason = reReason;
	}

	public String getReCheck() {
		return reCheck;
	}

	public void setReCheck(String reCheck) {
		this.reCheck = reCheck;
	}

	public String getReReal() {
		return reReal;
	}

	public void setReReal(String reReal) {
		this.reReal = reReal;
	}

	public Date getReDate() {
		return reDate;
	}

	public void setReDate(Date reDate) {
		this.reDate = reDate;
	}

	public String getReMent() {
		return reMent;
	}

	public void setReMent(String reMent) {
		this.reMent = reMent;
	}

	public String getReStatus() {
		return reStatus;
	}

	public void setReStatus(String reStatus) {
		this.reStatus = reStatus;
	}

	@Override
	public String toString() {
		return "Return [reNo=" + reNo + ", memCode=" + memCode + ", ordCode=" + ordCode + ", qnaDate=" + qnaDate
				+ ", reTitle=" + reTitle + ", content=" + content + ", reReason=" + reReason + ", reCheck=" + reCheck
				+ ", reReal=" + reReal + ", reDate=" + reDate + ", reMent=" + reMent + ", reStatus=" + reStatus + "]";
	}

	
	
}
