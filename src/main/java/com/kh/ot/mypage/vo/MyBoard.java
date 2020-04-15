package com.kh.ot.mypage.vo;

import java.sql.Date;

public class MyBoard {
	private int bno;			// 내가 쓴 게시판내에서의 게시글번호
	private int memno;			// 회원번호
	private int qna_no;			// 게시글의 글번호
	private int b_cate_no;		// 카테고리 번호
	private Date b_date;		// 작성일자
	
	public MyBoard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyBoard(int bno, int memno, int qna_no, int b_cate_no, Date b_date) {
		super();
		this.bno = bno;
		this.memno = memno;
		this.qna_no = qna_no;
		this.b_cate_no = b_cate_no;
		this.b_date = b_date;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public int getMemno() {
		return memno;
	}

	public void setMemno(int memno) {
		this.memno = memno;
	}

	public int getQna_no() {
		return qna_no;
	}

	public void setQna_no(int qna_no) {
		this.qna_no = qna_no;
	}

	public int getB_cate_no() {
		return b_cate_no;
	}

	public void setB_cate_no(int b_cate_no) {
		this.b_cate_no = b_cate_no;
	}

	public Date getB_date() {
		return b_date;
	}

	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}

	@Override
	public String toString() {
		return "MyBoard [bno=" + bno + ", memno=" + memno + ", qna_no=" + qna_no + ", b_cate_no=" + b_cate_no
				+ ", b_date=" + b_date + "]";
	}
	
	
}
