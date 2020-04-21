package com.kh.ot.review.service;

import java.util.ArrayList;

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

}
