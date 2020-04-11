package com.kh.ot.board.vo;

import java.sql.Date;

import com.kh.ot.common.Pagination;

public class SearchCondition extends Pagination {
	private String title;
	private String content;
	private String writer;
	private int b_cate_no;
	private Date date;
	
	public SearchCondition() {}

	public SearchCondition(String title, String content, String writer, int b_cate_no, Date date) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.b_cate_no = b_cate_no;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getB_cate_no() {
		return b_cate_no;
	}

	public void setB_cate_no(int b_cate_no) {
		this.b_cate_no = b_cate_no;
	}
	
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "SearchCondition [title=" + title + ", content=" + content + ", writer=" + writer + ", b_cate_no="
				+ b_cate_no + ", date=" + date + "]";
	}

	
	

	
	
	
}
