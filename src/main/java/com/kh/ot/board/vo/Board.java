package com.kh.ot.board.vo;

import java.sql.Date;

public class Board {
	private int qna_no; // qna번호
	private int b_cate_no; // 보드테이블번호
	private int mem_no; // 회원번호
	private String qna_info; // 내용
	private String qna_comment; // 답변내용
	private String qna_chk; // 답변여부
	private Date qna_date; // 등록일
	private String qna_writer; // 작성자
	private String qna_title; // 글제목
	private String originalFileName; // 첨부파일원래이름
	private String renameFileName; // 첨부파일변경이름
	private Date qna_modify_date; // 수정날짜
	
	public Board() {}



	public Board(int qna_no, int b_cate_no, int mem_no, String qna_info, String qna_comment, String qna_chk,
			Date qna_date, String qna_writer, String qna_title, String originalFileName, String renameFileName,
			Date qna_modify_date) {
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
		this.originalFileName = originalFileName;
		this.renameFileName = renameFileName;
		this.qna_modify_date = qna_modify_date;
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



	public Date getQna_date() {
		return qna_date;
	}



	public void setQna_date(Date qna_date) {
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



	public String getOriginalFileName() {
		return originalFileName;
	}



	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}



	public String getRenameFileName() {
		return renameFileName;
	}



	public void setRenameFileName(String renameFileName) {
		this.renameFileName = renameFileName;
	}



	public Date getQna_modify_date() {
		return qna_modify_date;
	}



	public void setQna_modify_date(Date qna_modify_date) {
		this.qna_modify_date = qna_modify_date;
	}



	@Override
	public String toString() {
		return "Board [qna_no=" + qna_no + ", b_cate_no=" + b_cate_no + ", mem_no=" + mem_no + ", qna_info=" + qna_info
				+ ", qna_comment=" + qna_comment + ", qna_chk=" + qna_chk + ", qna_date=" + qna_date + ", qna_writer="
				+ qna_writer + ", qna_title=" + qna_title + ", originalFileName=" + originalFileName
				+ ", renameFileName=" + renameFileName + ", qna_modify_date=" + qna_modify_date + "]";
	}



	

	
	
	
}
