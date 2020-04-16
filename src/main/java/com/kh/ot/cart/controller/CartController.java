package com.kh.ot.cart.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
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
import com.kh.ot.cart.vo.Ord;
import com.kh.ot.cart.vo.Pay;
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

	/**
	 * @작성일  : 2020. 4. 15.
	 * @작성자  : 우예진
	 * @내용    : 선택상품삭제
	 * @param ca_no
	 * @param request
	 * @return
	 */
	@RequestMapping("CartDeleteProduct.do")
	public void CartDeleteProduct(int[] checkArr,HttpServletResponse response) {

		ArrayList<Cart> noArr = new ArrayList<Cart>();

		for(int i =0; i<checkArr.length;i++) {
			Cart c = new Cart();
			c.setCa_no(checkArr[i]);
			noArr.add(c);
		}


		int result =  cService.deleteCart(noArr);



		//int result = cService.CartDeleteProduct(ca_no);

		/*if(result >0) {
			return "redirect:cartbutton.do";
		} else {
			return "에러다";
		}*/

	}

	/**
	 * @작성일  : 2020. 4. 16.
	 * @작성자  : 문태환
	 * @내용 	: 주문정보 인설트
	 * @param mv
	 * @param session
	 * @param prdtArr
	 * @param sizeArr
	 * @param colorArr
	 * @param countArr
	 * @param ord_receiver
	 * @param ord_phone
	 * @param ord_address
	 * @param ord_message
	 * @return
	 */
	@RequestMapping("cartInsert.do")
	public String cartInsert(ModelAndView mv,HttpSession session,
						int[] prdtArr, String[] sizeArr, String[] colorArr,int[] countArr,
						String ord_receiver, String ord_phone, String ord_address,String ord_message,
						int[] sumpriceArr,String pay_category,int pay_point,int pay_usedcp,int coupon_price){


		Member m =(Member)session.getAttribute("loginMember");

		ArrayList<Ord> olist = new ArrayList<Ord>();
		ArrayList<Pay> plist = new ArrayList<Pay>();

		for(int i=0;i<prdtArr.length;i++) {
			Ord o = new Ord();
			o.setMem_no(m.getMemNo());
			o.setPrdt_no(prdtArr[i]);
			o.setOrd_receiver(ord_receiver);
			o.setOrd_phone(ord_phone);
			o.setOrd_address(ord_address);
			o.setOrd_message(ord_message);
			o.setOrd_size(sizeArr[i]);
			o.setOrd_color(colorArr[i]);
			o.setOrd_count(countArr[i]);

			olist.add(o);
		}


		for(int i=0;i<sumpriceArr.length;i++) {
			Pay p = new Pay();
			if(i==0) {
			p.setMem_no(m.getMemNo());
			p.setSumprice(sumpriceArr[i]+2500-pay_point-coupon_price);
			p.setPay_category(pay_category);
			p.setPay_usedcp(pay_usedcp);
			p.setPay_point(pay_point);
			}else {
			p.setMem_no(m.getMemNo());
			p.setSumprice(sumpriceArr[i]);
			p.setPay_category(pay_category);
			p.setPay_usedcp(pay_usedcp);
			p.setPay_point(pay_point);
			}

			plist.add(p);
		}
		System.out.println(plist);
		int result = cService.cartInsert(olist);
		System.out.println(result);
		if(result > -2) {
			int result2 = cService.payInsert(plist);
			session.setAttribute("olist", olist);
			session.setAttribute("plist", plist);
			return "redirect:orderResultView.do?";

		}else {
			
			return null;
		}

	
	}

	/**
	 * @작성일  : 2020. 4. 16.
	 * @작성자  : 우예진
	 * @내용    : 주문후 결과창 페이지 이동
	 * @return
	 */
	@RequestMapping("orderResult.do")
	public String orderResult() {

		return "orderResult";
	}

	@RequestMapping("orderResultView.do")
	public ModelAndView orderResultView(ModelAndView mv,HttpSession session) {

//		Member m = (Member)session.getAttribute("loginMember");
//	
//		
//		int mem_no = m.getMemNo();
//
//		int prdtArr[] = new int[2];
//
//		prdtArr[0] = 11002;
//		prdtArr[1] = 11002;
//
//		
//		ArrayList<Pay> pplist = new ArrayList<Pay>();
//		
//		for(int i=0;i<prdtArr.length;i++) {
//			Pay p = new Pay();
//			p.setMem_no(m.getMemNo());
//			p.setPrdt_no(prdtArr[i]);
//		
//			pplist.add(p);
//		}
//
//
//		ArrayList<Pay> plist = cService.selectPayList(pplist);
//
//
//		ArrayList<Cart> list = cService.selectList(mem_no);
//		ArrayList<Coupon> clist = cService.selectCouponList(mem_no);
//		ArrayList<Ord> olist = cService.selectOrderList(mem_no);
//
//		System.out.println("list:"+list);
//		System.out.println("clist: " + clist);
//		System.out.println("olist: " + olist);
//		System.out.println("plist : " + plist);
//
//
//   		mv.addObject("list",list);
//   		mv.addObject("clist", clist);
//   		mv.addObject("olist", olist);
   		mv.setViewName("orderResult");

   		return mv;
	}




}
