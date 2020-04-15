package com.kh.ot.mypage.service;

import java.util.ArrayList;

import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.member.vo.Member;
import com.kh.ot.mypage.vo.CouponMem;

public interface MypageService {

	/**
	 * @param memNo 
	 * @작성일 : 2020. 4. 12.
	 * @작성자 : 신경섭
	 * @내용 : 사용가능한 적립금 조회
	 * @param @return
	 * @return int
	 */
	int PointListCount(int memNo);

	ArrayList<Point> PointSelectList(int memNo, PageInfo pi);
	
	/**
	 * @작성일 : 2020. 4. 13.
	 * @작성자 : 신경섭
	 * @내용 : 미가용 적립금 조회
	 * @param @return
	 * @return int
	 */

	int PointUnavailListCount(int memNo);

	ArrayList<Point> PointselectUnavailList(int memNo, PageInfo pi);

	
	/**
	 * @param memNo 
	 * @작성일 : 2020. 4. 13.
	 * @작성자 : 신경섭
	 * @내용 : 사용가능한 쿠폰 조회
	 * @param @return
	 * @return int
	 */

	int CouponListCount(Member m);
	
	ArrayList<CouponMem> CouponSelectList(int memNo, PageInfo pi);
	
	/**
	 * @작성일 : 2020. 4. 13.
	 * @작성자 : 신경섭
	 * @내용 : 사용완료한 쿠폰 조회
	 * @param @return
	 * @return int
	 */
	
	int CompleteCouponListCount(Member m);

	ArrayList<CouponMem> CompleteCouponSelectList(int memNo, PageInfo pi);
	
	

	int PointPrice(Member m);



	
}
