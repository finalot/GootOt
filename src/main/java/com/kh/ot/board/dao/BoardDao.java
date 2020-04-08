package com.kh.ot.board.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;

@Repository("bDao")
public class BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;


	public ArrayList<Board> selectList(PageInfo pi, int b_cate_no) {
		int offset = (pi.getCurrentPage()-1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset,pi.getBoardLimit());
				
		return (ArrayList)sqlSession.selectList("boardMapper.selectList",b_cate_no,rowBounds);
	}


	public int insertBoard(Board b) {
		return sqlSession.insert("boardMapper.insertBoard",b);
	}


	public int getListCount(int b_cate_no) {
		return sqlSession.selectOne("boardMapper.getListCount",b_cate_no);
	}


	public Board selectBoard(int qna_no) {
		return sqlSession.selectOne("boardMapper.selectBoard",qna_no);
	}

}
