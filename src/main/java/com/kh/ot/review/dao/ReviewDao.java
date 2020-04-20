package com.kh.ot.review.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.review.vo.Review;

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
	
}
