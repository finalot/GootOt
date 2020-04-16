package com.kh.ot.cart.service;

import java.util.ArrayList;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.cart.vo.Cart;

public interface CartService {

	/**
	 * @작성일  : 2020. 4. 14.
	 * @작성자  : 우예진
	 * @내용    : cart list뿌리기
	 * @param mem_no
	 * @return
	 */
	ArrayList<Cart> selectList(int mem_no);

	/**
	 * @작성일  : 2020. 4. 14.
	 * @작성자  : 우예진
	 * @내용    : cart coupon list 뿌리기 
	 * @param mem_no
	 * @return
	 */
	ArrayList<Coupon> selectCouponList(int mem_no);

	/**
	 * @작성일  : 2020. 4. 15.
	 * @작성자  : 우예진
	 * @내용    : cart 선택상품삭제
	 * @param ca_no
	 * @return
	 */
	int CartDeleteProduct(int ca_no);

}
