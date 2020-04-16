package com.kh.ot.cart.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.cart.vo.Cart;

@Repository("cDao")
public class CartDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	/**
	 * @작성일  : 2020. 4. 14.
	 * @작성자  : 우예진
	 * @내용    : cart list 뿌리기
	 * @param mem_no
	 * @return
	 */
	public ArrayList<Cart> selectList(int mem_no) {
		return (ArrayList)sqlSession.selectList("cartMapper.selectList",mem_no);
	}

	/**
	 * @작성일  : 2020. 4. 14.
	 * @작성자  : 우예진
	 * @내용    : coupon list 뿌리기
	 * @param mem_no
	 * @return
	 */
	public ArrayList<Coupon> selectCouponList(int mem_no) {
		return (ArrayList)sqlSession.selectList("cartMapper.selectCouponList",mem_no);
	}


	/**
	 * @작성일  : 2020. 4. 16.
	 * @작성자  : 우예진
	 * @내용    : cart 상품 삭제
	 * @param checkArr
	 * @return
	 */
	public int deleteCart(ArrayList<Cart> noArr) {
		   Map<String, Object> map = new HashMap<String, Object>();
		   map.put("noArr", noArr);
		return sqlSession.delete("cartMapper.deleteCart",map);
	}

}
