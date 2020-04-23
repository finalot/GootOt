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

	/**
	 * @작성일  : 2020. 4. 22.
	 * @작성자  : 우예진
	 * @내용    : 리뷰 등록
	 * @param rp
	 * @return
	 */
	public int insertReply(ReviewReply rp) {
		return sqlSession.insert("reviewMapper.insertReply",rp);
	}

	/**
	 * @작성일  : 2020. 4. 22.
	 * @작성자  : 우예진
	 * @내용    : 댓글 리스트 뿌려주기
	 * @param rv_no
	 * @return
	 */
	public ArrayList<ReviewReply> selectReplyList(int rv_no) {
		return (ArrayList)sqlSession.selectList("reviewMapper.selectReplyList",rv_no);
	}

	/**
	 * @작성일  : 2020. 4. 22.
	 * @작성자  : 우예진
	 * @내용    : 댓글삭제
	 * @param rp
	 * @return
	 */
	public int DeleteReply(ReviewReply rp) {
		return sqlSession.delete("reviewMapper.DeleteReply",rp);
	}

	/**
	 * @작성일  : 2020. 4. 22.
	 * @작성자  : 우예진
	 * @내용    : 리뷰 신고
	 * @param rp
	 * @return
	 */
	public int WarningReply(ReviewReply rp) {
		return sqlSession.update("reviewMapper.WarningReply",rp);
	}

	/**
	 * @작성일  : 2020. 4. 23.
	 * @작성자  : 우예진
	 * @내용    : 리뷰 좋아요순 정렬
	 * @return
	 */
	public ArrayList<Review> LikeSort() {
		return (ArrayList)sqlSession.selectList("reviewMapper.LikeSort");
	}

	/**
	 * @작성일  : 2020. 4. 23.
	 * @작성자  : 우예진
	 * @내용    : 리뷰 최신순 정렬
	 * @return
	 */
	public ArrayList<Review> DateSort() {
		return (ArrayList)sqlSession.selectList("reviewMapper.DateSort");
	}

	/**
	 * @작성일  : 2020. 4. 23.
	 * @작성자  : 우예진
	 * @내용    : 키 정렬
	 * @param optionHeight
	 * @return
	 */
	public ArrayList<Review> selectCheckSort(int optionHeight) {
		
		if(optionHeight==1) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectCheckSort1");
		} else if(optionHeight==2) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectCheckSort2");			
		} else if(optionHeight==3) {			
			return (ArrayList)sqlSession.selectList("reviewMapper.selectCheckSort3");
		} else if(optionHeight==4) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectCheckSort4");			
		} else if(optionHeight==5) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectCheckSort5");			
		} else {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectCheckSort6");			
		}
	}

	public ArrayList<Review> selectWeightSort(int optionWeight) {
		if(optionWeight==7) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectWeightSort7");
		} else if(optionWeight==8) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectWeightSort8");			
		} else if(optionWeight==9) {			
			return (ArrayList)sqlSession.selectList("reviewMapper.selectWeightSort9");
		} else if(optionWeight==10) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectWeightSort10");			
		} else if(optionWeight==11) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectWeightSort11");			
		} else {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectWeightSort12");			
		}
	}

	public ArrayList<Review> selectSizeSort(int optionSize) {
		if(optionSize==13) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectSizeSort13");
		} else if(optionSize==14) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectSizeSort14");			
		} else if(optionSize==15) {			
			return (ArrayList)sqlSession.selectList("reviewMapper.selectSizeSort15");
		} else if(optionSize==16) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectSizeSort16");			
		} else if(optionSize==17) {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectSizeSort17");			
		} else {
			return (ArrayList)sqlSession.selectList("reviewMapper.selectSizeSort18");			
		}
	}
	
}
