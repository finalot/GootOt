package com.kh.ot.admin.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;

@Repository("adDao")
public class adminDao {

	@Autowired
	private SqlSessionTemplate sqlSession;


	/**
	 * @작성일  : 2020. 4. 7.
	 * @작성자  : 문태환
	 * @내용 	: 쿠폰등록
	 * @param clist
	 * @return
	 */
	public int couponInput(ArrayList<Coupon> clist) {
		return sqlSession.insert("adminMapper.couponInput",clist);
	}
	
}
