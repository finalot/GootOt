package com.kh.ot.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("loginMember")
@Controller
public class MypageController {

	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 주문내역 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mList.do")
	public String mList() {
		return "mypage_list";
	}
	
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 관심상품 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mWishlist.do")
	public String mWishlist() {
		return "mypage_wishList";
	}
	
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 적립금 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mPoint.do")
	public String mPoint() {
		return "mypage_point";
	}
	
	/**
	 * @작성일 : 2020. 4. 3.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 쿠폰 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mCoupon.do")
	public String mCoupon() {
		return "mypage_coupon";
	}
	
	/**
	 * @작성일 : 2020. 4. 3.
	 * @작성자 : 신경섭
	 * @내용 : 마이페이지 내가 쓴 게시글 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mBoard.do")
	public String mBoard() {
		return "mypage_board";
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
	 * @작성일 : 2020. 4. 4.
	 * @작성자 : 신경섭
	 * @내용 : 쿠폰 - 사용완료쿠폰 탭
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mCompletecoupon.do")
	public String mCompletecoupon() {
		return "mypage_mCompletecoupon";
	}
	
	/**
	 * @작성일 : 2020. 4. 4.
	 * @작성자 : 신경섭
	 * @내용 : 적립금  - 미사용적립금
	 * @param @return
	 * @return String
	 */
	@RequestMapping("mUnavailpoint.do")
	public String mUnavailpoint() {
		return "mypage_unavailpoint";
	}
}
