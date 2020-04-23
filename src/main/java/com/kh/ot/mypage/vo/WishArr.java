package com.kh.ot.mypage.vo;

import org.springframework.stereotype.Component;

@Component
public class WishArr {
	private int dibsno;
	
	
	public WishArr() {
		super();
		// TODO Auto-generated constructor stub
	}


	public WishArr(int dibsno) {
		super();
		this.dibsno = dibsno;
	}


	public int getDibsno() {
		return dibsno;
	}


	public void setDibsno(int dibsno) {
		this.dibsno = dibsno;
	}


	@Override
	public String toString() {
		return "WishArr [dibsno=" + dibsno + "]";
	}

	
}