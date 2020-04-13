package com.kh.ot.mypage.vo;

import java.sql.Date;

public class CouponMem {
	private int memno;				// 회원테이블의 회원번호
	private int cpseq;				// 쿠폰 시퀀스(갯수)
	private int cpno;				// 쿠폰 번호(조인용)
	private String cpname;			// 쿠폰 이름
	private int cpDiscount;			// 할인율
	
	private Date cpdate;			// 쿠폰 발급날짜 (sysdate)
	private String cpstatus;		// 쿠폰 사용여부
	private Date cp_cdate;			// 쿠폰 사용날짜
	
	public CouponMem() {}

	public CouponMem(int memno, int cpseq, int cpno, String cpname, int cpDiscount, Date cpdate, String cpstatus,
			Date cp_cdate) {
		super();
		this.memno = memno;
		this.cpseq = cpseq;
		this.cpno = cpno;
		this.cpname = cpname;
		this.cpDiscount = cpDiscount;
		this.cpdate = cpdate;
		this.cpstatus = cpstatus;
		this.cp_cdate = cp_cdate;
	}

	public int getMemno() {
		return memno;
	}

	public void setMemno(int memno) {
		this.memno = memno;
	}

	public int getCpseq() {
		return cpseq;
	}

	public void setCpseq(int cpseq) {
		this.cpseq = cpseq;
	}

	public int getCpno() {
		return cpno;
	}

	public void setCpno(int cpno) {
		this.cpno = cpno;
	}

	public String getCpname() {
		return cpname;
	}

	public void setCpname(String cpname) {
		this.cpname = cpname;
	}

	public int getCpDiscount() {
		return cpDiscount;
	}

	public void setCpDiscount(int cpDiscount) {
		this.cpDiscount = cpDiscount;
	}

	public Date getCpdate() {
		return cpdate;
	}

	public void setCpdate(Date cpdate) {
		this.cpdate = cpdate;
	}

	public String getCpstatus() {
		return cpstatus;
	}

	public void setCpstatus(String cpstatus) {
		this.cpstatus = cpstatus;
	}

	public Date getCp_cdate() {
		return cp_cdate;
	}

	public void setCp_cdate(Date cp_cdate) {
		this.cp_cdate = cp_cdate;
	}

	@Override
	public String toString() {
		return "CouponMem [memno=" + memno + ", cpseq=" + cpseq + ", cpno=" + cpno + ", cpname=" + cpname
				+ ", cpDiscount=" + cpDiscount + ", cpdate=" + cpdate + ", cpstatus=" + cpstatus + ", cp_cdate="
				+ cp_cdate + "]";
	}

	
	
	
	
	
	
	
	
}
