package com.kh.ot.mypage.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.mypage.vo.CouponMem;

@Repository("mpDao")
public class MypageDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	/* ========================================= 적립금 부분 ========================================= */
	public int PointListCount() {
		return sqlSession.selectOne("mypageMapper.PointListCount");
	}

	public ArrayList<Point> PointSelectList(PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1 ) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("mypageMapper.PointselectList", null, rowBounds);
	}

	public int PointUnavailListCount() {
		return sqlSession.selectOne("mypageMapper.PointUnavailListCount");
	}

	public ArrayList<Point> PointselectUnavailList(PageInfo pi) {
		
		int offset = (pi.getCurrentPage() - 1 ) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("mypageMapper.PointselectUnavailList", null, rowBounds);
	}

	/* ========================================= 쿠폰 부분 ========================================= */
	
	public int CouponListCount() {
		return sqlSession.selectOne("mypageMapper.CouponListCount");
	}

	public ArrayList<CouponMem> CouponSelectList(PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1 ) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("mypageMapper.CouponSelectList", null, rowBounds);
	}

	public int CompleteCouponListCount() {
		return sqlSession.selectOne("mypageMapper.CompleteCouponListCount");
	}

	public ArrayList<CouponMem> CompleteCouponSelectList(PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1 ) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("mypageMapper.CompleteCouponSelectList", null, rowBounds);
	}
	
	
}


