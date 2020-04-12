package com.kh.ot.mypage.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.PageInfo;

@Repository("mpDao")
public class MypageDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int PointListCount() {
		return sqlSession.selectOne("mypageMapper.PointListCount");
	}

	public ArrayList<Point> PointSelectList(PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1 ) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("mypageMapper.PointselectList", null, rowBounds);
	}
}
















//	public ArrayList<Point> selectList(PageInfo pi) {
//		int offset = (pi.getCurrentPage() - 1 ) * pi.getBoardLimit();
//		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
//		
//		return (ArrayList)sqlSession.selectList("mypageMapper.selectList", null, rowBounds);
//	}

