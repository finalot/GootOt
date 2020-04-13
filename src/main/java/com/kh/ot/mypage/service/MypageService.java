package com.kh.ot.mypage.service;

import java.util.ArrayList;

import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.mypage.vo.CouponMem;

public interface MypageService {

	/**
	 * @작성일 : 2020. 4. 12.
	 * @작성자 : 신경섭
	 * @내용 : 사용가능한 적립금 조회
	 * @param @return
	 * @return int
	 */
	int PointListCount();

	ArrayList<Point> PointSelectList(PageInfo pi);
	
	/**
	 * @작성일 : 2020. 4. 13.
	 * @작성자 : 신경섭
	 * @내용 : 미가용 적립금 조회
	 * @param @return
	 * @return int
	 */

	int PointUnavailListCount();

	ArrayList<Point> PointselectUnavailList(PageInfo pi);

	
	/**
	 * @작성일 : 2020. 4. 13.
	 * @작성자 : 신경섭
	 * @내용 : 사용가능한 쿠폰 조회
	 * @param @return
	 * @return int
	 */

	int CouponListCount();
	
	ArrayList<CouponMem> CouponSelectList(PageInfo pi);
	
	/**
	 * @작성일 : 2020. 4. 13.
	 * @작성자 : 신경섭
	 * @내용 : 사용완료한 쿠폰 조회
	 * @param @return
	 * @return int
	 */
	
	int CompleteCouponListCount();

	ArrayList<CouponMem> CompleteCouponSelectList(PageInfo pi);



	
}
