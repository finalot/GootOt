package com.kh.ot.cart.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.cart.dao.CartDao;
import com.kh.ot.cart.vo.Cart;


@Service("cService")
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDao cDao;

	@Override
	public ArrayList<Cart> selectList(int mem_no) {
		return cDao.selectList(mem_no);
	}

	@Override
	public ArrayList<Coupon> selectCouponList(int mem_no) {
		return cDao.selectCouponList(mem_no);
	}
}