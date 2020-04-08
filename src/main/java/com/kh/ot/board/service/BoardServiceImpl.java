package com.kh.ot.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.board.dao.BoardDao;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;

@Service("bService")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao bDao;

	@Override
	public int getListCount(int b_cate_no) {
		return bDao.getListCount(b_cate_no);
	}

	@Override
	public ArrayList<Board> selectList(PageInfo pi,int b_cate_no) {
		return bDao.selectList(pi,b_cate_no);
	}

	@Override
	public int insertBoard(Board b) {
		return bDao.insertBoard(b);
	}

	@Override
	public Board selectBoard(int qna_no) {
		return bDao.selectBoard(qna_no);
	}

}
