package com.kh.ot.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.cart.dao.CartDao;


@Service("cService")
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDao cDao;
}
