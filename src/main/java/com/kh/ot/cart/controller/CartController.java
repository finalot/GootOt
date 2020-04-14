package com.kh.ot.cart.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.cart.service.CartService;
import com.kh.ot.cart.vo.Cart;
import com.kh.ot.member.vo.Member;


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
	
	
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 카트 페이지 이동
	 * @param @return
	 * @return String
	 */
	
	@RequestMapping("cartbutton.do")
	public ModelAndView cartbutton(ModelAndView mv,HttpSession session) {
		
		Member m = (Member)session.getAttribute("loginMember");
		int mem_no = m.getMemNo();
		
		ArrayList<Cart> list = cService.selectList(mem_no);
		ArrayList<Coupon> clist = cService.selectCouponList(mem_no);
		System.out.println("list:"+list);
		System.out.println("clist: " + clist);

   		mv.addObject("list",list);
   		mv.addObject("clist", clist);
   		mv.setViewName("cart");

   		return mv; 
	}
	
	

}
