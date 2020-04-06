package com.kh.ot.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ot.board.service.BoardService;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.common.Pagination;



@SessionAttributes("loginMember")
@Controller
public class BoardController extends HttpServlet {

	@Autowired
	private BoardService bService;
	
	
	/**
	 * @작성일  : 2020.04.04
	 * @작성자  : 우예진
	 * @내용    : 상품불량 및 오배송접수 글쓰기 페이지 이동
	 * @return
	 */
	@RequestMapping("bad_product_write.do")
	public String bad_product_write() {

		return "bad_product_write";
	}


	/**
	 * @작성일  : 2020.04.04
	 * @작성자  : 우예진
	 * @내용    : 상품불량 및 오배송접수 상품문의 상세페이지 이동
	 * @return
	 */
	@RequestMapping("bad_product_detail.do")
	public String bad_product_detail() {

		return "bad_product_detail";
	}


	/**
	 * @작성일  : 2020.04.04
	 * @작성자  : 우예진
	 * @내용    : 상품불량 및 오배송접수 답변 페이지 이동
	 * @return
	 */
	@RequestMapping("bad_product_reply.do")
	public String bad_product_reply() {

		return "bad_product_reply";
	}

	/**
	 * @작성일  : 2020.04.04
	 * @작성자  : 우예진
	 * @내용    : 상품불량 및 오배송접수 게시판 페이지 이동
	 * @return
	 */
	@RequestMapping("bad_product_board.do")
	public String bad_product_board() {

		return "bad_product_board";
	}

	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 입금확인/입금자변경 상세정보
	 * @return
	 */
	@RequestMapping("bank_insert_detail.do")
	public String bank_insert_detail() {

		return "bank_insert_detail";
	}


	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 입금확인/입금자변경 답변정보
	 * @return
	 */
	@RequestMapping("bank_insert_reply.do")
	public String bank_insert_reply() {

		return "bank_insert_reply";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 입금확인/입금자변경 글쓰기
	 * @return
	 */
	@RequestMapping("bank_insert_write.do")
	public String bank_insert_write() {

		return "bank_insert_write";
	}


	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 입금확인/입금자변경 페이지 이동
	 * @return
	 */
	@RequestMapping("bank_insert_board.do")
	public String bank_insert_board() {

		return "bank_insert_board";
	}


	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송문의 상세정보
	 * @return
	 */
	@RequestMapping("delivery_board_detail.do")
	public String delivery_board_detail() {

		return "delivery_board_detail";
	}


	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송문의 답변 상세정보
	 * @return
	 */
	@RequestMapping("delivery_board_reply.do")
	public String delivery_board_reply() {

		return "delivery_board_reply";
	}



	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송문의 글쓰기
	 * @return
	 */
	@RequestMapping("delivery_board_write.do")
	public String delivery_board_write() {

		return "delivery_board_write";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송문의 페이지 이동
	 * @return
	 */
	@RequestMapping("delivery_board.do")
	public String delivery_board() {

		return "delivery_board";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송전취소/변경 페이지 이동
	 * @return
	 */
	@RequestMapping("delivery_cancel.do")
	public String delivery_cancel() {

		return "delivery_cancel";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송전취소/변경 상세페이지
	 * @return
	 */
	@RequestMapping("delivery_cancel_detail.do")
	public String delivery_cancel_detail() {

		return "delivery_cancel_detail";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송전취소/변경 답변페이지
	 * @return
	 */
	@RequestMapping("delivery_cancel_reply.do")
	public String delivery_cancel_reply() {

		return "delivery_cancel_reply";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송전취소/변경 글쓰기페이지
	 * @return
	 */
	@RequestMapping("delivery_cancel_write.do")
	public String delivery_cancel_write() {

		return "delivery_cancel_write";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 상품문의 페이지 이동
	 * @return
	 */
	@RequestMapping("product_board.do")
	public ModelAndView product_board(ModelAndView mv, 
			@RequestParam(value="currentPage",required=false,defaultValue="1")
			int currentPage) { 
		
		System.out.println(currentPage);
		
		int listCount = bService.getListCount();
		
		System.out.println("listCount : " + listCount);
		
		PageInfo pi = Pagination.getPageInfo(currentPage, listCount);
		
		ArrayList<Board> list = bService.selectList(pi);
		
		mv.addObject("list",list);
		mv.addObject("pi",pi);
		mv.setViewName("product_board");
		
		return mv;	
	}


	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 상품문의 상세페이지
	 * @return
	 */
	@RequestMapping("product_board_detail.do")
	public String product_board_detail() {

		return "product_board_detail";
	}


	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 상품문의 답변페이지
	 * @return
	 */
	@RequestMapping("product_board_reply.do")
	public String product_board_reply() {

		return "product_board_reply";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 상품문의 글쓰기페이지
	 * @return
	 */
	@RequestMapping("product_board_write.do")
	public String product_board_write() {

		return "product_board_write";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송후교환/반품 페이지 이동
	 * @return
	 */
	@RequestMapping("product_change.do")
	public String product_change() {

		return "product_change";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송후교환/반품 상세페이지
	 * @return
	 */
	@RequestMapping("product_change_detail.do")
	public String product_change_detail() {

		return "product_change_detail";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송후교환/반품 답변페이지
	 * @return
	 */
	@RequestMapping("product_change_reply.do")
	public String product_change_reply() {

		return "product_change_reply";
	}

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송후교환/반품 글쓰기
	 * @return
	 */
	@RequestMapping("product_change_write.do")
	public String product_change_write() {

		return "product_change_write";
	}

	@RequestMapping(value="product_board_insert.do", method=RequestMethod.POST )
	public String product_board_insert() {
		System.out.println("인설트 이곳");
		
		
		
		
		
		return null;
	}
}
