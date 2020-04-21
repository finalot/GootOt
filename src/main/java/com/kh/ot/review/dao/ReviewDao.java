package com.kh.ot.review.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.review.vo.Like_Heart;
import com.kh.ot.review.vo.Review;
import com.kh.ot.review.vo.ReviewReply;

@Repository("rDao")
public class ReviewDao {

	
	@Autowired
	private SqlSessionTemplate sqlSession;

	/**
	 * @작성일  : 2020. 4. 20.
	 * @작성자  : 우예진
	 * @내용    : review 리스트 뿌려주기
	 * @return
	 */
	public ArrayList<Review> selectReviewList() {
		return (ArrayList)sqlSession.selectList("reviewMapper.selectReviewList");
	}

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : review 모달 디테일 리스트 뿌려주기
	 * @param rvNo
	 * @return
	 */
	public Review selectReviewDetail(int rv_no) {
		return sqlSession.selectOne("reviewMapper.selectReviewDetail",rv_no);
	}

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 제대로 값이 들어오는지 확인
	 * @param lh
	 * @return
	 */
	public int selectLikeCount(Like_Heart lh) {
		return sqlSession.selectOne("reviewMapper.selectLikeCount",lh);
	}

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 좋아요 insert
	 * @param lh
	 * @return
	 */
	public int insertLike(Like_Heart lh) {
		return sqlSession.insert("reviewMapper.insertLike",lh);
	}

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 좋아요 리스트
	 * @param lh
	 * @return
	 */
	public Like_Heart selectLike(Like_Heart lh) {
		return sqlSession.selectOne("reviewMapper.selectLike",lh);
	}

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 좋아요 업데이트
	 * @param lh
	 * @return
	 */
	public int updateLikeCheck(Like_Heart lh) {
		return sqlSession.update("reviewMapper.updateLikeCheck",lh);
	}

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 좋아요 카운트 업데이트
	 * @param rv_no
	 * @return
	 */
	public int updateLikeCount(int rv_no) {
		return sqlSession.update("reviewMapper.updateLikeCount",rv_no);
	}
	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 좋아요 업데이트
	 * @param lh
	 * @return
	 */
	public int updateLikeCheck2(Like_Heart lh) {
		return sqlSession.update("reviewMapper.updateLikeCheck2",lh);
	}

	/**
	 * @작성일  : 2020. 4. 21.
	 * @작성자  : 우예진
	 * @내용    : 좋아요 카운트 내리기
	 * @param rv_no
	 * @return
	 */
	public int updateLikeCount2(int rv_no) {
		return sqlSession.update("reviewMapper.updateLikeCount2",rv_no);
	}

	public int insertReply(ReviewReply rp) {
		return sqlSession.insert("reviewMapper.insertReply",rp);
	}
	
}
