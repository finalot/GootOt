package com.kh.ot.board.service;

import java.util.ArrayList;

import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;

public interface BoardService{

	
	// 1. 게시판 전체 리스트 조회
	/**
	 * 1_1. 게시판 총 갯수 조회
	 * @return
	 */
	int getListCount();
	
	
	/**
	 * 1_2. 게시판 리스트 조회
	 * @param pi
	 * @return
	 */

	ArrayList<Board> selectList(PageInfo pi);

}
