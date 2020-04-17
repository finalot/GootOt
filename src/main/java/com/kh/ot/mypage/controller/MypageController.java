package com.kh.ot.mypage.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.board.vo.SearchCondition;
import com.kh.ot.common.Pagination;
import com.kh.ot.member.vo.Member;
import com.kh.ot.mypage.service.MypageService;
import com.kh.ot.mypage.vo.CouponMem;
import com.kh.ot.mypage.vo.MyBoard;
import com.kh.ot.cart.vo.Ord;

@SessionAttributes("loginMember")
@Controller
public class MypageController {

	@Autowired
	private MypageService mpService;
	
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 주문내역 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mList.do")
	public ModelAndView mList(ModelAndView mv, HttpSession session,
			@RequestParam(value="currentPage",required=false,defaultValue="1")int currentPage) {
		
		Member m = (Member)session.getAttribute("loginMember");
		
		int memNo = m.getMemNo();
		
		int coupon = mpService.CouponListCount(m);
		
		int point = mpService.PointListCount(memNo);
		
		int listCount = mpService.getOrderListCount(memNo);
		
		System.out.println("listCount : " + listCount);
		
		PageInfo pi = Pagination.getPageInfo(currentPage, listCount);
		
		ArrayList<Ord> list = mpService.selectOrderList(pi, memNo);
		
		System.out.println("list : " + list);

		mv.addObject("CouponCount", coupon);
		mv.addObject("PointCount", point);
   		mv.addObject("list",list);
   		mv.addObject("pi", pi);
		mv.setViewName("mypage_list");
		return mv;
	}
	
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 관심상품 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mWishlist.do") //1
	public ModelAndView mWishlist(ModelAndView mv,
									@RequestParam("memNo") int memNo,HttpSession session ) {
		
		Member m = (Member)session.getAttribute("loginMember");
		int Coupon = mpService.CouponListCount(m);
													// 사용 가능 포인트 셋팅
													// 찜한 갯수 카운팅
		
		mv.addObject("couponcount", Coupon); // 쿠폰 갯수 카운팅
		//mv.addObject()						// 사용 가능 포인트 셋팅
												// 찜한 갯수 카운팅
		
		
		mv.setViewName("mypage_wishList");
		
		return mv;
	}
	
	/**
	 * @작성일 : 2020. 4. 15.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 적립금 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mPoint.do") //2
	public ModelAndView mPoint(ModelAndView mv,
							   @RequestParam(value="currentPage", required=false, defaultValue="1") int currentPage,
							   HttpSession session) {
		System.out.println(currentPage);
		
		Member m = (Member)session.getAttribute("loginMember");
		
		int memNo = m.getMemNo();
		
		int result = mpService.PointPrice(m); // 
		
		int coupon = mpService.CouponListCount(m); // 사용 가능한 쿠폰 카운팅
		
		int listCount = mpService.PointListCount(memNo); // 사용 가능한 쿠폰
		
		
		System.out.println("listCount : " + listCount);
		
		PageInfo pi = Pagination.getPageInfo(currentPage,listCount);
		
		ArrayList<Point> list = mpService.PointSelectList(memNo,pi);
		
		mv.addObject("CouponCount",coupon);
		mv.addObject("PointCount", listCount);
		mv.addObject("list", list);
		mv.addObject("pi",pi);
		mv.setViewName("mypage_point");
		
		return mv;
	}
	
	/**
	 * @작성일 : 2020. 4. 15.
	 * @작성자 : 신경섭
	 * @내용 : 적립금  - 미사용적립금
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mUnavailpoint.do") 
	public ModelAndView mUnavailpoint(ModelAndView mv,
							    @RequestParam(value="currentPage", required=false, defaultValue="1") int currentPage,
							    HttpSession session) {
		System.out.println(currentPage);
		
		Member m = (Member)session.getAttribute("loginMember");
		
		int memNo = m.getMemNo();
		
		int listCount = mpService.PointUnavailListCount(memNo);
		int coupon = mpService.CouponListCount(m); // 사용가능한 쿠폰
		int point = mpService.PointListCount(memNo); // 사용가능한 적립금
		
		System.out.println("listCount : " + listCount);
		
		PageInfo pi = Pagination.getPageInfo(currentPage,listCount);
		
		ArrayList<Point> list = mpService.PointselectUnavailList(memNo,pi);
		
		mv.addObject("PointCount", point);
		mv.addObject("CouponCount",coupon);
		mv.addObject("list", list);
		mv.addObject("pi",pi);
		mv.setViewName("mypage_unavailpoint");
		
		return mv;
	}
	
	
	/**
	 * @작성일 : 2020. 4. 15.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 쿠폰 이동
	 * @param @return
	 * @return String
	 */
	
	@RequestMapping("mCoupon.do") // 3
	public ModelAndView mCoupon(ModelAndView mv,
								@RequestParam(value="currentPage", required=false, defaultValue="1") int currentPage, 
								HttpSession session) {
		
		System.out.println(currentPage);
		
		Member m = (Member)session.getAttribute("loginMember");
		System.out.println(m);
		int memNo = m.getMemNo();
		
		int listCount = mpService.CouponListCount(m);
		
		int point = mpService.PointListCount(memNo);
		
		System.out.println("listCount : " + listCount);
		
		PageInfo pi = Pagination.getPageInfo(currentPage,listCount);
		
		ArrayList<CouponMem> list = mpService.CouponSelectList(memNo, pi);
		
		mv.addObject("CouponCount", listCount);
		mv.addObject("PointCount", point);
		mv.addObject("list", list);
		mv.addObject("pi", pi);
		mv.setViewName("mypage_coupon");
		
		return mv;
	}
	
	/**
	 * @작성일 : 2020. 4. 15.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 쿠폰 - 사용완료한 쿠폰
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mCompleteCoupon.do")
	public ModelAndView mCompleteCoupon(ModelAndView mv,
			@RequestParam(value="currentPage", required=false, defaultValue="1") int currentPage,
			HttpSession session) {
		System.out.println(currentPage);
		
		Member m = (Member)session.getAttribute("loginMember");
		
		int memNo = m.getMemNo();
		
		int coupon = mpService.CouponListCount(m);
		
		int point = mpService.PointListCount(memNo);
		
		int listCount = mpService.CompleteCouponListCount(m);
		System.out.println(m);
		System.out.println("listCount : " + listCount);
		
		PageInfo pi = Pagination.getPageInfo(currentPage,listCount);
		
		ArrayList<CouponMem> list = mpService.CompleteCouponSelectList(memNo,pi);
		
		mv.addObject("CouponCount", coupon);
		mv.addObject("PointCount", point);
		mv.addObject("list", list);
		mv.addObject("pi", pi);
		mv.setViewName("mypage_completecoupon");
		
		return mv;
	}
	
	/**
	 * @작성일 : 2020. 4. 16.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 내가 쓴 게시글 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mBoard.do")
	public ModelAndView mBoard(ModelAndView mv, HttpSession session, 
								@RequestParam(value="currentPage", 
								required=false,defaultValue="1") int currentPage) {
		
		Member m = (Member)session.getAttribute("loginMember");
		
		int memNo = m.getMemNo();
		
		int coupon = mpService.CouponListCount(m);
		
		int point = mpService.PointListCount(memNo);
		
		int listCount = mpService.getListCount(memNo);
		
		
		System.out.println("listCount : " + listCount);
		
		PageInfo pi = Pagination.getPageInfo(currentPage, listCount);
		
		ArrayList<MyBoard> list = mpService.selectList(pi, memNo);
		
		System.out.println("list : " + list);

		mv.addObject("CouponCount", coupon);
		mv.addObject("PointCount", point);
   		mv.addObject("list",list);
   		mv.addObject("pi", pi);
		mv.setViewName("mypage_board");
		return mv;
	}
	
	/**
	 * @작성일 : 2020. 4. 3.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 배송 주소록 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mAddress.do")
	public String mAddress() {
		return "mypage_address";
	}
	
	/**
	 * @작성일 : 2020. 4. 3.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 회원정보수정 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mEdit.do")
	public String mEdit() {
		return "mypage_memberEdit";
	}
	
	/**
	 * @작성일 : 2020. 4. 4.
	 * @작성자 : 신경섭
	 * @내용 : 회원정보수정 - 환불계좌 페이지
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mAccount.do")
	public String mAccount() {
		return "mypage_member_account";
	}
	
	/**
	 * @작성일 : 2020. 4. 4.
	 * @작성자 : 신경섭
	 * @내용 : 배송 주소록 - 배송지 등록
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mAddress_register.do")
	public String mAddress_register() {
		return "mypage_address_register";
	}
	
	/**
	 * @작성일 : 2020. 4. 4.
	 * @작성자 : 신경섭
	 * @내용 : 배송 주소록 - 수정페이지
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mAddress_modify.do")
	public String mAddress_modify() {
		return "mypage_address_modify";
	}
	
	/**
	 * @작성일 : 2020. 4. 4.
	 * @작성자 : 신경섭
	 * @내용 : 내가 쓴 게시글 뷰
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mBoard_view.do")
	public String mBoard_view() {
		return "mypage_board_view";
	}
	
	/**
	 * @작성일 : 2020. 4. 4.
	 * @작성자 : 신경섭
	 * @내용 : 내가 쓴 게시글 관리자 답변 뷰
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mBoard_adminreply.do")
	public String mBoard_adminreply() {
		return "mypage_board_adminreply";
	}
	
	/**
	 * @작성일 : 2020. 4. 4.
	 * @작성자 : 내가 쓴 게시글 사용자 수정 뷰
	 * @내용 : 
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mBoard_modify.do")
	public String mBoard_modify() {
		return "mypage_board_modify";
	}
	
	/**
	 * @작성일 : 2020. 4. 4.
	 * @작성자 : 신경섭
	 * @내용 : 내가 쓴 게시글 관리자 답변 수정 뷰
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mBoard_adminmodify.do")
	public String mBoard_Adminmodify() {
		return "mypage_board_adminmodify";
	}
	
	/**
	 * @작성일 : 2020. 4. 17.
	 * @작성자 : 신경섭
	 * @내용 : 내가 쓴 게시글 검색
	 * @param @param mv
	 * @param @param session
	 * @param @param currentPage
	 * @param @param search_key
	 * @param @param search
	 * @param @return
	 * @return ModelAndView
	 */
	@RequestMapping("mBoardsearch.do")
	public ModelAndView mBoardsearch(ModelAndView mv, HttpSession session,
									@RequestParam(value="currentPage",required=false,defaultValue="1")int currentPage, 
									String search_key,String search) {
		
		Member m = (Member)session.getAttribute("loginMember");
		
		int memNo = m.getMemNo();
		
		int coupon = mpService.CouponListCount(m);
		
		int point = mpService.PointListCount(memNo);
		
		SearchCondition sc = new SearchCondition();
		sc.setSearch_key(search_key);
		sc.setSearch(search);
		sc.setMemno(memNo);
		
		System.out.println(sc);
		
		if(search_key.equals("writer")) {
			sc.setWriter(search);
		} else if(search_key.equals("title")) {
			sc.setTitle(search);
		}
		
		int listCount = mpService.SearchListCount(sc);
		
		System.out.println("listCount : " + listCount);
		
		PageInfo pi = sc.getPageInfo(currentPage, listCount);
		
		ArrayList<MyBoard> list = mpService.selectSearchList(pi, sc);
		
		System.out.println("list : " + list);

		mv.addObject("CouponCount", coupon);
		mv.addObject("PointCount", point);
   		mv.addObject("list",list);
   		mv.addObject("pi", pi);
   		mv.addObject("sc", sc);
		mv.setViewName("mypage_board");
		
		return mv;
	}
}
	
	

