package com.kh.ot.cart.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kh.ot.cart.service.CartService;


@SessionAttributes("loginMember")
@Controller
public class CartController extends HttpServlet {

	@Autowired
	   private CartService cService;
	
	/**
	 * @작성일  : 2020. 4. 13.
	 * @작성자  : 우예진
	 * @내용    : 주문상세정보 페이지 이동
	 * @return
	 */
	@RequestMapping("orderDetail.do")
	public String orderDetail() {
		
		return "orderDetail";
	}
}
