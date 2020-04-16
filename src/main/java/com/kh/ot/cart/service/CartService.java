package com.kh.ot.cart.service;

import java.util.ArrayList;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.cart.vo.Cart;
import com.kh.ot.cart.vo.Ord;

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
	 * @작성일  : 2020. 4. 16.
	 * @작성자  : 우예진
	 * @내용    : cart 상품 삭제
	 * @param checkArr
	 * @return
	 */
	int deleteCart(ArrayList<Cart> noArr);

	/**
	 * @작성일  : 2020. 4. 16.
	 * @작성자  : 문태환
	 * @내용 	: cart 주문정보 인설트
	 * @param olist
	 * @return
	 */
	int cartInsert(ArrayList<Ord> olist);

	/**
	 * @작성일  : 2020. 4. 16.
	 * @작성자  : 우예진
	 * @내용    : 주문결과창 값 뿌려주기
	 * @param mem_no
	 * @return
	 */
	ArrayList<Ord> selectOrderList(int mem_no);

}
