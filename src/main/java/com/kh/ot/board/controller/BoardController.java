package com.kh.ot.board.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ot.board.service.BoardService;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.board.vo.SearchCondition;
import com.kh.ot.common.Pagination;
import com.kh.ot.member.vo.Member;



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
							   @RequestParam(value="currentPage", 
							   required=false,defaultValue="1") int currentPage) { 
      
      System.out.println(currentPage);
	   
	  int b_cate_no = 1;
      
      int listCount = bService.getListCount(b_cate_no);
      
      System.out.println("listCount : " + listCount);
      
      PageInfo pi = Pagination.getPageInfo(currentPage, listCount);
      
      ArrayList<Board> list = bService.selectList(pi,b_cate_no);
      
      System.out.println("list:"+list);
      
        mv.addObject("list",list);
        mv.addObject("pi",pi);
        mv.setViewName("product_board");
      
      return mv; 
   }
   
   /**
    * @작성일  : 2020.04.06
    * @작성자  : 우예진
    * @내용    : 상품문의 글쓰기 insert
    * @return
    */
   @RequestMapping(value="product_board_insert.do",method=RequestMethod.POST)
   public String product_board_insert(Board b,HttpServletRequest request,HttpSession session,
         @RequestParam(name="uploadFile",required=false) MultipartFile uploadFile) {
   
      
      Member m = (Member)session.getAttribute("loginMember");      
      
      b.setMem_no(m.getMemNo());
      b.setQna_writer(m.getMemId());
      System.out.println(uploadFile.getOriginalFilename());
      
      if(!uploadFile.getOriginalFilename().equals("")) {
         // 서버에 업로드
         // saveFile메소드 : 내가 저장하고자하는 file과 request를 전달하여 서버에 업로드 시키고 그 저장된 파일명을 반환해주는 메소드
         
         String renameFileName = saveFile(uploadFile,request);
         
         if(renameFileName != null) {
            b.setOriginalFileName(uploadFile.getOriginalFilename());// DB에는 파일명 저장
            b.setRenameFileName(renameFileName);
         }
         
      }      
      int result = bService.insertBoard(b);
        
      System.out.println(b);
      
      if(result >0) {
         return "redirect:product_board.do";
      } else {
         return null;
      }
   }
   
   
   
  


   /**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 상품문의 상세페이지
	 * @return
	 */
	@RequestMapping("product_board_detail.do")
	public ModelAndView product_board_detail(ModelAndView mv, int qna_no 
			/*@RequestParam(value="currentPage",required=false, defaultValue="1") int currentPage*/) {
		
		Board b = bService.selectBoard(qna_no);
		
		if(b!=null) {
			mv.addObject("b",b)
					/* .addObject("currentPage",currentPage) */
			.setViewName("product_board_detail");
		} else {
			mv.addObject("msg","게시글 상세조회 실패")
			.setViewName("common/errorPage");
		}
		return mv;
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
 * @작성일  : 2020. 4. 8.
 * @작성자  : 우예진
 * @내용    : 상품문의 게시글 업데이트 화면 이동
 * @return
 */
@RequestMapping("product_board_update.do")
   public ModelAndView product_board_update(ModelAndView mv, int qna_no) {

	
	Board b = bService.selectBoard(qna_no);
	
	if(b!=null) {
		mv.addObject("b",b)
				/* .addObject("currentPage",currentPage) */
		.setViewName("product_board_update");
	} else {
		mv.addObject("msg","게시글 상세조회 실패")
		.setViewName("common/errorPage");
	}
      return mv;
  }



	/**
	 * @작성일  : 2020. 4. 9.
	 * @작성자  : 우예진 
	 * @내용    : 상품문의 게시글 업데이트 
	 * @param mv
	 * @param qna_no
	 * @return
	 */
	@RequestMapping("product_board_updateView.do")
	public String product_board_updateView(Board b,HttpServletRequest request) {

			int result = bService.UpdatePrBoard(b);
		
		if(result > 0) {
			return "redirect:product_board.do";
		}else {
			return "에러다";
		}
			
	}

	
	/**
	 * @작성일  : 2020. 4. 9.
	 * @작성자  : 우예진
	 * @내용    : 파일 삭제
	 * @param fileName
	 * @param request
	 */
	public void deleteFile(String fileName, HttpServletRequest request) {
		String root = request.getSession().getServletContext().getRealPath("resources");
		String savePath = root + "\\buploadFiles";
	
		File f = new File(savePath + "\\" + fileName);
		// webapp / resource / buploadFiles / 202003261111.png
	
		if(f.exists()) {
			f.delete();
	}
	
}
   
   
   /**
    * @작성일  : 2020.04.08
    * @작성자  : 우예진
    * @내용    : 상품문의 검색 기능
    * @return
    */
@RequestMapping("pb_search.do")
   public ModelAndView pb_search(ModelAndView mv, 
		   						@RequestParam(value="currentPage",required=false,defaultValue="1")int currentPage
		   						,String search_key,String search) {
	int b_cate_no = 1;
	
	SearchCondition sc = new SearchCondition();
	
	if(search_key.equals("writer")) {
		sc.setWriter(search);
	} else if(search_key.equals("title")) {
		sc.setTitle(search);
	}
	sc.setB_cate_no(b_cate_no);
	
	int listCount = bService.SearchListCount(sc);
	
	PageInfo pi = sc.getPageInfo(currentPage, listCount);
	
	ArrayList<Board> list = bService.selectSearchList(pi,sc);
    
    System.out.println("list:"+list);
	
	  mv.addObject("list",list);
      mv.addObject("pi",pi);
      mv.setViewName("product_board");
	
	return mv;
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
   
   
   /**
    * @작성일  : 2020.04.06
    * @작성자  : 우예진
    * @내용    : 파일저장경로
    * @param file
    * @param request
    * @return
    */
   public String saveFile(MultipartFile file, HttpServletRequest request) {
      // 저장할 경로 설정et
      // 웹 서버 contextPath를 불러와서 폴더의 경로 찾음(webapp 하위의 resources)
      String root = request.getSession().getServletContext().getRealPath("resources");
      
      String savePath = root + "\\buploadFiles";
      
      File folder = new File(savePath);
      
      if(!folder.exists()) {
         folder.mkdir(); // 폴더가 없다면 생성해주세요
      }
      
      String originFileName = file.getOriginalFilename();
      
      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
      String renameFileName = sdf.format(new java.sql.Date(System.currentTimeMillis())) + "."
               + originFileName.substring(originFileName.lastIndexOf(".")+1);
      
      String renamePath = folder + "\\" + renameFileName;
      
      try {
         file.transferTo(new File(renamePath));
      } catch (Exception e) {
         
         System.out.println("파일 전송 에러: " + e.getMessage());
      } 
      return renameFileName;
   }
   
}