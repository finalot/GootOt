package com.kh.ot.admin.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.json.simple.JSONObject;
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
		   Map<String, Object> map = new HashMap<String, Object>();
		   map.put("clist", clist);
		return sqlSession.insert("adminMapper.couponInput",map);
	}


	/**
	 * @작성일  : 2020. 4. 7.
	 * @작성자  : 문태환
	 * @내용 	: 쿠폰 리스트
	 * @return
	 */
	public ArrayList<Coupon> selectListCoupon() {
		return (ArrayList)sqlSession.selectList("adminMapper.selectListCoupon");
	}


	/**
	 * @작성일  : 2020. 4. 8.
	 * @작성자  :문태환 
	 * @내용 	:쿠폰삭제
	 * @param cpName
	 * @return
	 */
	public int couponDelete(String cpName) {
		return sqlSession.delete("adminMapper.couponDelete",cpName);
	}
	
}
