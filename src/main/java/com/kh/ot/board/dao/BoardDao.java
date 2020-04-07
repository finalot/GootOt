package com.kh.ot.board.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;

@Repository("bDao")
public class BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;


	public ArrayList<Board> selectList(PageInfo pi) {
		int offset = (pi.getCurrentPage()-1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset,pi.getBoardLimit());
				
		return (ArrayList)sqlSession.selectList("boardMapper.selectList",null,rowBounds);
	}


	public int insertBoard(Board b) {
		return sqlSession.insert("boardMapper.insertBoard",b);
	}


	public int getListCount(int b_cate_no) {
		return sqlSession.selectOne("boardMapper.getListCount",b_cate_no);
	}


	public Board selectBoard(int qna_no) {
		Board b = new Board();
		b.setQna_no(qna_no);
		return sqlSession.selectOne("boardMapper.selectBoard",b);
	}
	
}
