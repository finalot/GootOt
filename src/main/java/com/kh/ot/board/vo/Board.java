package com.kh.ot.board.vo;

public class Board {
	private int qna_no; // qna번호
	private int b_cate_no; // 보드테이블번호
	private int mem_no; // 회원번호
	private String qna_info; // 내용
	private String qna_comment; // 답변내용
	private String qna_chk; // 답변여부
	private String qna_date; // 등록일
	private String qna_writer; // 작성자
	private String qna_title; // 글제목
	
	public Board() {}

	public Board(int qna_no, int b_cate_no, int mem_no, String qna_info, String qna_comment, String qna_chk,
			String qna_date, String qna_writer, String qna_title) {
		super();
		this.qna_no = qna_no;
		this.b_cate_no = b_cate_no;
		this.mem_no = mem_no;
		this.qna_info = qna_info;
		this.qna_comment = qna_comment;
		this.qna_chk = qna_chk;
		this.qna_date = qna_date;
		this.qna_writer = qna_writer;
		this.qna_title = qna_title;
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

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public String getQna_info() {
		return qna_info;
	}

	public void setQna_info(String qna_info) {
		this.qna_info = qna_info;
	}

	public String getQna_comment() {
		return qna_comment;
	}

	public void setQna_comment(String qna_comment) {
		this.qna_comment = qna_comment;
	}

	public String getQna_chk() {
		return qna_chk;
	}

	public void setQna_chk(String qna_chk) {
		this.qna_chk = qna_chk;
	}

	public String getQna_date() {
		return qna_date;
	}

	public void setQna_date(String qna_date) {
		this.qna_date = qna_date;
	}

	public String getQna_writer() {
		return qna_writer;
	}

	public void setQna_writer(String qna_writer) {
		this.qna_writer = qna_writer;
	}
	
	

	public String getQna_title() {
		return qna_title;
	}

	public void setQna_title(String qna_title) {
		this.qna_title = qna_title;
	}

	@Override
	public String toString() {
		return "Board [qna_no=" + qna_no + ", b_cate_no=" + b_cate_no + ", mem_no=" + mem_no + ", qna_info=" + qna_info
				+ ", qna_comment=" + qna_comment + ", qna_chk=" + qna_chk + ", qna_date=" + qna_date + ", qna_writer="
				+ qna_writer + ", qna_title=" + qna_title + "]";
	}

	
	
	
}
