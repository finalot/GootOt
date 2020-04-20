package com.kh.ot.review.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ot.review.service.ReviewService;
import com.kh.ot.review.vo.Review;

@SessionAttributes("loginMember")
@Controller
public class ReviewController extends HttpServlet {
	
	  @Autowired
	  private ReviewService rService;
	  
	  
	  /**
		 * @작성일 : 2020. 4. 2.
		 * @작성자 :이대윤
		 * @내용 : 리뷰 페이지 이동
		 * @param @return
		 * @return String
		 */
		@RequestMapping("review.do")
		public ModelAndView review(ModelAndView mv) {

			ArrayList<Review> rlist = rService.selectReviewList();
			
			System.out.println("rlist : " + rlist);
		
			mv.addObject("rlist",rlist);

			
			mv.setViewName("review");

	   		return mv;
		}
		
		/**
		 * @작성일  : 2020. 4. 20.
		 * @작성자  : 우예진
		 * @내용    : 리뷰 디테일 창
		 * @param mv
		 * @return
		 * @throws IOException 
		 */
		@RequestMapping("reviewDetail.do")
		public void reviewDetail(HttpServletResponse response) throws IOException {
			
			PrintWriter out = response.getWriter();
			
		//	ArrayList<Review> rdlist = rService.selectReviewDetailList();
			//System.out.println("rdlist : " + rdlist);
			
			
		}
}
