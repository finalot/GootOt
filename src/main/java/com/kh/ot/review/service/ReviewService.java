package com.kh.ot.review.service;

import java.util.ArrayList;

import com.kh.ot.review.vo.Review;

public interface ReviewService {

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 리뷰 리스트 뿌려주기
	 * @return
	 */
	ArrayList<Review> selectReviewList();

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 리뷰 모달창 디테일 리스트 뿌려주기
	 * @param rvNo
	 * @return
	 */
	Review selectReviewDetail(int rv_no);

}
