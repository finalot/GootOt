package com.kh.ot.review.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.kh.ot.member.vo.Member;
import com.kh.ot.review.service.ReviewService;
import com.kh.ot.review.vo.Like_Heart;
import com.kh.ot.review.vo.Review;
import com.kh.ot.review.vo.ReviewReply;

import net.sf.json.JSONObject;

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
		public ModelAndView review(ModelAndView mv,String Sort) {

			ArrayList<Review> rlist = new ArrayList();
			
			if(Sort.equals("like")) {
				 rlist = rService.selectLikeSort();
			} else {
			    rlist = rService.selectReviewList();
			}
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
		public void reviewDetail(HttpSession session, HttpServletResponse response,int rv_no) throws IOException {
			
			Member m = (Member)session.getAttribute("loginMember");
			
			Like_Heart lh = new Like_Heart();
			lh.setMemNo(m.getMemNo());
			lh.setRvNo(rv_no);
			lh.setLikeCheck("N");
			
			int result = rService.selectLikeCount(lh);
			Like_Heart lhl = null;
			if(result > 0) {
				lhl = rService.selectLike(lh);
			}else {
				int result2 = rService.insertLike(lh);
				lhl = rService.selectLike(lh);
			}
			
			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();
			
			System.out.println("rvNo: " + rv_no);
			Review r = rService.selectReviewDetail(rv_no);
			
			System.out.println("r:" +r);
			
			Map hmap = new HashMap();
			hmap.put("lhl", lhl);
			hmap.put("r",r);
			
		    
		    
		    new Gson().toJson(hmap,response.getWriter());
			
			
		}
		
		/**
		 * @throws IOException 
		 * @작성일  : 2020. 4. 21.
		 * @작성자  : 우예진
		 * @내용    : 리뷰 좋아요
		 */
		@RequestMapping("reviewLike.do") 
		public void reviewLike(HttpSession session, HttpServletResponse response,int rv_no, String likeCheck) throws IOException {
			
			System.out.println("rvvvvvv_no: " + rv_no);
			System.out.println("likeccccc" + likeCheck);
			
			Member m = (Member)session.getAttribute("loginMember");
			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();
			
			Like_Heart lh = new Like_Heart();
			lh.setMemNo(m.getMemNo());
			lh.setRvNo(rv_no);
			
			
			if(likeCheck.equals("N")) {
				int result = rService.updateLikeCheck(lh);
				int result2 = rService.updateLikeCount(rv_no);
				System.out.println("1"+result);
				System.out.println("2"+result2);
			}else if(likeCheck.equals("Y")){
				int result3 = rService.updateLikeCheck2(lh); 
				int result4 = rService.updateLikeCount2(rv_no);
				System.out.println("3"+result3);
				System.out.println("4"+result4);
			}
			
			
			Review r = rService.selectReviewDetail(rv_no);
			Like_Heart lhl = rService.selectLike(lh);
			
			System.out.println("r222232:"+r);
			System.out.println("lhlll2ll2l2: " + lhl);
			
			Map hmap = new HashMap();
			hmap.put("lhl", lhl);
			hmap.put("r",r);
			
		    
		    
		    new Gson().toJson(hmap,response.getWriter());
			
			
		}
//		
//		@RequestMapping("rList.do")
//		public void getReplyList(HttpServletResponse response, int rvNo) {
//			
//			ArrayList<ReviewReply> rplist = rService.selectReplyList(rvNo);
//			
//			response.setContentType("appliction/json; charset=utf-8");
//			
//			
//			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
//			
//			gson.toJson(rplist,response.getWriter());
//		}
		
		/**
		 * @작성일  : 2020. 4. 21.
		 * @작성자  : 우예진
		 * @내용    : 리뷰 댓글 등록
		 * @param rp
		 * @return
		 */
		@RequestMapping("addReply.do")
		@ResponseBody
		public String addReply(String rvComment, int rv_no,HttpSession session) {
			
			Member m = (Member)session.getAttribute("loginMember");
			ReviewReply rp = new ReviewReply();
			rp.setMemNo(m.getMemNo());
			rp.setRvComment(rvComment);
		
			rp.setRvNo(rv_no);
			
			int result = rService.insertReply(rp);
			
			
			
			if(result > 0) {
				return "success";
			}else {
				return "fail";
			}
		}
		
		
		/**
		 * @작성일  : 2020. 4. 22.
		 * @작성자  : 우예진
		 * @내용    : 리뷰 댓글 리스트 뿌려주기
		 * @param response
		 * @param rv_no
		 * @throws IOException
		 */
		@RequestMapping("rList.do") 
		public void getReplyList(HttpServletResponse response,int rv_no) throws IOException {
			
			ArrayList<ReviewReply> rplist = rService.selectReplyList(rv_no);
			
			response.setContentType("appliction/json; charset=utf-8");
			System.out.println("rplist:"+rplist);
			
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			
			Map hmap = new HashMap();
			hmap.put("rplist", rplist);
			
			
			gson.toJson(hmap,response.getWriter());
			
			
		}
		
		/**
		 * @작성일  : 2020. 4. 22.
		 * @작성자  : 우예진
		 * @내용    : 리뷰 댓글 삭제기능
		 * @param rvComment
		 * @param rv_no
		 * @param session
		 * @return
		 * @throws IOException 
		 * @throws JsonIOException 
		 */
		@RequestMapping("DeleteReply.do")
		public void DeleteReply(int rvcNo, int rv_no, HttpServletResponse response) throws JsonIOException, IOException {
			
			ReviewReply rp = new ReviewReply();
		
			rp.setRvcNo(rvcNo);
			
			int result = rService.DeleteReply(rp);
			if(result >0) {
				
			
			
			ArrayList<ReviewReply> rplist = rService.selectReplyList(rv_no);
			
			response.setContentType("appliction/json; charset=utf-8");
			System.out.println("rplist:"+rplist);
			
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			
			Map hmap = new HashMap();
			hmap.put("rplist", rplist);
			
			
			gson.toJson(hmap,response.getWriter());
			
			} else {
				System.out.println("에러당~");
			}
			
		}
		
		/**
		 * @작성일  : 2020. 4. 22.
		 * @작성자  : 우예진
		 * @내용    : 리뷰 신고기능
		 * @param rv_no
		 * @param rvcNo
		 * @param response
		 * @throws IOException 
		 * @throws JsonIOException 
		 */
		@RequestMapping("WarningReply.do") 
		public void WarningReply(int rv_no, int rvcNo, HttpServletResponse response) throws JsonIOException, IOException {
			ReviewReply rp = new ReviewReply();
			
			rp.setRvcNo(rvcNo);
			
			int result = rService.WarningReply(rp);
			
			
			if(result >0) {
				
				ArrayList<ReviewReply> rplist = rService.selectReplyList(rv_no);
				
				response.setContentType("appliction/json; charset=utf-8");
				System.out.println("rplist:"+rplist);
				
				Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
				
				Map hmap = new HashMap();
				hmap.put("rplist", rplist);
				
				
				gson.toJson(hmap,response.getWriter());
				
				} else {
					System.out.println("에러당~");
				}
		}
		
		/**
		 * @작성일  : 2020. 4. 23.
		 * @작성자  : 우예진
		 * @내용    : 최신순/좋아요순 정렬
		 * @param Sort
		 * @param response
		 * @throws JsonIOException
		 * @throws IOException
		 */
		@RequestMapping("LikeSort.do")
		public void LikeSort(String Sort,HttpServletResponse response) throws JsonIOException, IOException {
			
			ArrayList<Review> rlist = new ArrayList();
			
			if(Sort.equals("like")) {

				rlist = rService.selectLikeSort();
			} else if(Sort.equals("date")) {
				rlist = rService.selectDateSort();
			}
			response.setContentType("appliction/json; charset=utf-8");
			
			
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			
			Map hmap = new HashMap();
			hmap.put("rlist", rlist);
			
			
			gson.toJson(hmap,response.getWriter());
			
	
		}
		
		/**
		 * @작성일  : 2020. 4. 23.
		 * @작성자  : 우예진
		 * @내용    : 키 체크박스 값
		 * @return
		 * @throws IOException 
		 * @throws JsonIOException 
		 */
		@RequestMapping("checkSort.do") 
		public void checkSort(int optionHeight, HttpServletResponse response,HttpSession session) throws JsonIOException, IOException {
			
			ArrayList<Review> rlist = new ArrayList<Review>();
			
			
			rlist = rService.selectCheckSort(optionHeight);
			
		
			response.setContentType("appliction/json; charset=utf-8");
			
			
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			
			Map hmap = new HashMap();
			hmap.put("rlist", rlist);
			
			
			gson.toJson(hmap,response.getWriter());
			
		}
		
		/**
		 * @작성일  : 2020. 4. 23.
		 * @작성자  : 우예진 
		 * @내용    : 몸무게 정렬
		 * @param optionWeight
		 * @param response
		 * @param session
		 * @throws IOException 
		 * @throws JsonIOException 
		 */
		@RequestMapping("WeightSort.do")
		public void WeightSort(int optionWeight, HttpServletResponse response, HttpSession session) throws JsonIOException, IOException {
			ArrayList<Review> rlist = new ArrayList<Review>();
			
			
			rlist = rService.selectWeightSort(optionWeight);
			
		
			response.setContentType("appliction/json; charset=utf-8");
			
			
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			
			Map hmap = new HashMap();
			hmap.put("rlist", rlist);
			
			
			gson.toJson(hmap,response.getWriter());
		}
		
		@RequestMapping("SizeSort.do")
		public void SizeSort(int optionSize, HttpServletResponse response, HttpSession session) throws JsonIOException, IOException {
			ArrayList<Review> rlist = new ArrayList<Review>();
			
			
			rlist = rService.selectSizeSort(optionSize);
			
		
			response.setContentType("appliction/json; charset=utf-8");
			
			
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			
			Map hmap = new HashMap();
			hmap.put("rlist", rlist);
			
			
			gson.toJson(hmap,response.getWriter());
		}
}
