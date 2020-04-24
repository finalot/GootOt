package com.kh.ot.review.service;

import java.util.ArrayList;

import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_color;
import com.kh.ot.main.vo.Product_opt;
import com.kh.ot.review.vo.Like_Heart;
import com.kh.ot.review.vo.Review;
import com.kh.ot.review.vo.ReviewReply;

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

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 제대로 insert가 되어있는지 확인(멤버번호랑 리뷰번호)
	 * @param lh
	 * @return
	 */
	int selectLikeCount(Like_Heart lh);

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 좋아요 insert
	 * @param lh
	 * @return
	 */
	int insertLike(Like_Heart lh);

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 좋아요 select
	 * @param lh
	 * @return
	 */
	Like_Heart selectLike(Like_Heart lh);

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진 
	 * @내용    : 좋아요 update
	 * @param lh
	 * @return
	 */
	int updateLikeCheck(Like_Heart lh);

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 리뷰의 카운트 올리기
	 * @param lh
	 * @return
	 */
	int updateLikeCount(int rv_no);

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 좋아요 update2(상태값 =='n') Y에서 N으로 바꾼거임
	 * @param lh
	 * @return
	 */
	int updateLikeCheck2(Like_Heart lh);

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 리뷰 카운트 내리기
	 * @param rv_no
	 * @return
	 */
	int updateLikeCount2(int rv_no);

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 리뷰 댓글 등록
	 * @param rp
	 * @return
	 */
	int insertReply(ReviewReply rp);

	/**
	 * @작성일  : 2020. 4. 22.
	 * @작성자  : 우예진
	 * @내용    : 리뷰  리스트
	 * @param rv_no
	 * @return
	 */
	ArrayList<ReviewReply> selectReplyList(int rv_no);

	/**
	 * @작성일  : 2020. 4. 22.
	 * @작성자  : 우예진
	 * @내용    : 리뷰 댓글 삭제
	 * @param rp
	 * @return
	 */
	int DeleteReply(ReviewReply rp);

	/**
	 * @작성일  : 2020. 4. 22.
	 * @작성자  : 우예진
	 * @내용    : 리뷰 신고 기능
	 * @param rp
	 * @return
	 */
	int WarningReply(ReviewReply rp);

	/**
	 * @작성일  : 2020. 4. 23.
	 * @작성자  : 우예진
	 * @내용    : 리뷰 좋아요순 정렬
	 * @return
	 */
	ArrayList<Review> selectLikeSort();

	/**
	 * @작성일  : 2020. 4. 23.
	 * @작성자  : 리뷰 최신순 정렬
	 * @내용    :
	 * @return
	 */
	ArrayList<Review> selectDateSort();

	/**
	 * @작성일  : 2020. 4. 23.
	 * @작성자  : 우예진
	 * @내용    : 키 정렬
	 * @param optionHeight
	 * @return
	 */
	ArrayList<Review> selectCheckSort(int optionHeight);

	/**
	 * @작성일  : 2020. 4. 23.
	 * @작성자  : 우예진
	 * @내용    : 몸무게 정렬
	 * @param optionWeight
	 * @return
	 */
	ArrayList<Review> selectWeightSort(int optionWeight);

	/**
	 * @작성일  : 2020. 4. 23.
	 * @작성자  : 우예진
	 * @내용    : 사이즈 정렬
	 * @param optionSize
	 * @return
	 */
	ArrayList<Review> selectSizeSort(int optionSize);

	ArrayList<Product> getBestList();

	ArrayList<Product_color> selectColorList1();

	ArrayList<Product_opt> selectOptionBestList();

}
