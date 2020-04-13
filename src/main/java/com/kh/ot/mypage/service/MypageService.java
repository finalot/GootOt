package com.kh.ot.mypage.service;

import java.util.ArrayList;

import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.PageInfo;

public interface MypageService {

	/**
	 * @작성일 : 2020. 4. 12.
	 * @작성자 : 신경섭
	 * @내용 : 쿠폰 리스트 조회
	 * @param @return
	 * @return int
	 */
	int PointListCount();

	ArrayList<Point> PointSelectList(PageInfo pi);

	
}
