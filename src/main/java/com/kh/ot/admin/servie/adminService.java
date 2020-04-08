package com.kh.ot.admin.servie;

import java.util.ArrayList;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;

public interface adminService{

	/**
	 * @작성일  : 2020. 4. 7.
	 * @작성자  : 문태환
	 * @내용 	: 쿠폰등록
	 * @param clist
	 * @return
	 */
	public int couponInput(ArrayList<Coupon> clist);

	/**
	 * @작성일  : 2020. 4. 7.
	 * @작성자  : 문태환
	 * @내용 	:쿠폰 리스트
	 * @return
	 */
	public ArrayList<Coupon> selectListCoupon();

	/**
	 * @작성일  : 2020. 4. 8.
	 * @작성자  : 문태환
	 * @내용 	: 쿠폰 삭제
	 * @param cpName
	 * @return
	 */
	public int couponDelete(String cpName);
	

}
