package com.kh.ot.main.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.kh.ot.member.service.MemberService;
import com.kh.ot.member.vo.Member;

@SessionAttributes("loginMember")
@Controller
public class mainController {

	// @Autowired 타입의 어노테이션을 붙여주면 생성할 필요없이 변수 선언만 해도
	// 빈 스키냉을 통해 아래의 'mService'의 이름을 가지고 있는 빈을 찾아서
	// 자동으로 생성 후 주입해준다.

//	@Autowired
//	private MemberService mService;
	
//	암호화용 	
//	@Autowired
//	private BCryptPasswordEncoder bcryptPasswordEncoder;

	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 프로덕트2 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("dailyCheck.do")
	public String dailyCheck() {
		return "dailyCheck";
	}
	
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 프로덕트1 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("product1.do")
	public String product1() {
		return "product";
	}

	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 프로덕트2 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("product2.do")
	public String product2() {
		return "product";
	}
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 리뷰 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("review.do")
	public String review() {
		return "review";
	}
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 카트 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("cartbutton.do")
	public String cartbutton() {
		return "cart";
	}
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 상품 디테일 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("product_detail.do")
	public String product_detail() {
		return "productDetail";
	}
	
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 문의글 쓰기페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("product_detail_qna_write.do")
	public String product_detail_qna_write() {
		return "product_detail_qna_write";
	}
	
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 문의글 디테일 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("product_detail_qna_detail.do")
	public String product_detail_qna_detail() {
		return "product_detail_qna_detail";
	}
	
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 상품디테일에서 바로결제 옮겨지는 창
	 * @param @return
	 * @return String
	 */
	@RequestMapping("buynow.do")
	public String buynow() {
		return "order";
	}
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 노티스로 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("notice.do")
	public String notice() {
		return "notice";
	}
	
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : QnA,FaQ 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("faq.do")
	public String faq() {
		return "FaQ";
	}
	
	
	

}
