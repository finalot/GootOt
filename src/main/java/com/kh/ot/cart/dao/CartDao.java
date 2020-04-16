package com.kh.ot.cart.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.cart.vo.Cart;
import com.kh.ot.cart.vo.Ord;

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

	public int CartDeleteProduct(int ca_no) {
		return sqlSession.delete("cartMapper.CartDeleteProduct",ca_no);
	}

	public int cartInsert(ArrayList<Ord> olist) {
		   Map<String, Object> map = new HashMap<String, Object>();
		   map.put("olist", olist);
		return sqlSession.insert("cartMapper.cartInsert",map);
	}

}
