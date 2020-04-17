package com.kh.ot.mypage.service;

import java.util.ArrayList;

import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.board.vo.SearchCondition;
import com.kh.ot.cart.vo.Ord;
import com.kh.ot.member.vo.Member;
import com.kh.ot.mypage.vo.CouponMem;
import com.kh.ot.mypage.vo.MyBoard;

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
	
	

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 신경섭
	 * @내용 : 적립금 계산
	 * @param @param m
	 * @param @return
	 * @return int
	 */
	int PointPrice(Member m);


	
	/**
	 * @작성일 : 2020. 4. 16.
	 * @작성자 : 신경섭
	 * @내용 : 내가 쓴 게시판 조회
	 * @param @param memNo
	 * @param @param b_cate_no
	 * @param @return
	 * @return int
	 */
	int getListCount(int memNo);

	ArrayList<MyBoard> selectList(PageInfo pi, int memNo);
	
	
	

	/**
	 * @작성일 : 2020. 4. 16.
	 * @작성자 : 신경섭
	 * @내용 : 게시판 검색 기능
	 * @param @param sc
	 * @param @return
	 * @return int
	 */
	int SearchListCount(SearchCondition sc);

	ArrayList<MyBoard> selectSearchList(PageInfo pi, SearchCondition sc);

	/**
	 * @작성일 : 2020. 4. 17.
	 * @작성자 : 신경섭
	 * @내용 : 주문정보
	 * @param @param memNo
	 * @param @return
	 * @return int
	 */
	int getOrderListCount(int memNo);

	ArrayList<Ord> selectOrderList(PageInfo pi, int memNo);

	
}
