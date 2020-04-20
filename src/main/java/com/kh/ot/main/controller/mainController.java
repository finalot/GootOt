package com.kh.ot.main.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.kh.ot.common.MainPagination;
import com.kh.ot.main.service.MainService;
import com.kh.ot.main.vo.MainPageInfo;
import com.kh.ot.main.vo.MainSearchCondition;
import com.kh.ot.main.vo.MaindownCategory;
import com.kh.ot.main.vo.MainupCategory;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_color;
import com.kh.ot.main.vo.Product_opt;
import com.kh.ot.main.vo.Wish;
import com.kh.ot.main.vo.productbenner;
import com.kh.ot.member.vo.Member;

//@SessionAttributes("loginMember")
@Controller
public class mainController {

	// @Autowired 타입의 어노테이션을 붙여주면 생성할 필요없이 변수 선언만 해도
	// 빈 스키냉을 통해 아래의 'mService'의 이름을 가지고 있는 빈을 찾아서
	// 자동으로 생성 후 주입해준다.

	@Autowired
	private MainService mainService;

	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 프로덕트1 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("product1.do")
	public ModelAndView product1(ModelAndView mv, int product1,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {

		
		int listCount = mainService.getListCount1(product1);

		MainPageInfo mainPi = MainPagination.getPageInfo(currentPage, listCount);

		ArrayList<Product> plist = mainService.selectList1(mainPi, product1);

		ArrayList<MaindownCategory> dclist = mainService.selectCategoryList1(product1);
		ArrayList<MainupCategory> uclist = mainService.selectUpCategoryList1();

		ArrayList<Product_opt> polist = mainService.selectOptionList1(product1);

		ArrayList<Product_color> pclist = mainService.selectColorList1();
		ArrayList<productbenner> pblist = mainService.selectPB();
		mv.addObject("pblist", pblist);
		mv.addObject("plist", plist);
		mv.addObject("dclist", dclist);
		mv.addObject("uclist", uclist);
		mv.addObject("polist", polist);
		mv.addObject("pclist", pclist);
		mv.addObject("mainPi", mainPi);
		mv.setViewName("product");

		return mv;
	}

	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 프로덕트2 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("product2.do")
	public ModelAndView product2(ModelAndView mv, int product2,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {

		int listCount = mainService.getListCount2(product2);

		MainPageInfo mainPi = MainPagination.getPageInfo(currentPage, listCount);

		ArrayList<Product> plist = mainService.selectList2(mainPi, product2);

		ArrayList<MaindownCategory> dclist = mainService.selectCategoryList2(product2);
		ArrayList<MainupCategory> uclist = mainService.selectUpCategoryList2();

		ArrayList<Product_opt> polist = mainService.selectOptionList2(product2);

		ArrayList<Product_color> pclist = mainService.selectColorList2();
		ArrayList<productbenner> pblist = mainService.selectPB();
		mv.addObject("pblist", pblist);
		mv.addObject("plist", plist);
		mv.addObject("dclist", dclist);
		mv.addObject("uclist", uclist);
		mv.addObject("polist", polist);
		mv.addObject("pclist", pclist);
		mv.addObject("mainPi", mainPi);
		mv.setViewName("product2");

		return mv;
	}

	/**
	 * 이대윤 해더 에이작스
	 * 
	 * @param mv
	 * @param product2
	 * @param currentPage
	 * @return
	 */
	@RequestMapping("header.do")
	public void header(HttpServletResponse response) throws JsonIOException, IOException {

//ArrayList<downCategory> dclist = mainService.selectCategoryList3();
		ArrayList<MainupCategory> uclist = mainService.selectUpCategoryList3();

		response.setContentType("application/json; charset=utf-8");
		Gson gson = new Gson();

		gson.toJson(uclist, response.getWriter());

	}

	
	  @RequestMapping("header2.do") public void header2(HttpServletResponse
	  response) throws JsonIOException, IOException{
	  
	  ArrayList<MaindownCategory> dclist = mainService.selectCategoryList3(); //
//	  ArrayList<upCategory> uclist = mainService.selectUpCategoryList3();
	  
	  
	 response.setContentType("application/json; charset=utf-8"); Gson gson = new Gson();
	  
	  gson.toJson(dclist,response.getWriter());
	  
	  }
	 

	


	@RequestMapping("todaymain.ad")
	public String todaymain() {
		return "admin/todaymain";
	}

	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 상품 디테일 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("product_detail.do")
	public ModelAndView product_detail(ModelAndView mv, int product_detail) {
		
		ArrayList<Product> pdlist = mainService.selectDetailList(product_detail);
		ArrayList<Product_opt> polist = mainService.selectOptionList(product_detail);
		ArrayList<Product_opt> polist2 = mainService.selectOptionList22(product_detail);
		ArrayList<Product_color> pclist = mainService.selectColorList2();
		mv.addObject("pdlist", pdlist);
		mv.addObject("polist", polist);
		mv.addObject("polist2", polist2);
		mv.addObject("pclist", pclist);
		
		mv.setViewName("productDetail");

		return mv;
		
	}
	
	/**
	 * 이대윤 디테일 셀렉트 에이작스
	 * 
	 */
	@RequestMapping("detailSelect.do")
	public void detailSelect1(HttpServletResponse response,int product_detail) throws JsonIOException, IOException {

		ArrayList<Product_opt> polist3 = mainService.selectOptionList33(product_detail);
//		ArrayList<Product_opt> polist2 = mainService.selectOptionList22(product_detail);

		response.setContentType("application/json; charset=utf-8");
		Gson gson = new Gson();

		gson.toJson(polist3, response.getWriter());

	}
	/*
	 * @RequestMapping("detailSelect2.do") public void
	 * detailSelect2(HttpServletResponse response) throws JsonIOException,
	 * IOException {
	 * 
	 * // ArrayList<Product_opt> polist =
	 * mainService.selectOptionList(product_detail); ArrayList<Product_opt> polist2
	 * = mainService.selectOptionList22(product_detail);
	 * 
	 * response.setContentType("application/json; charset=utf-8"); Gson gson = new
	 * Gson();
	 * 
	 * gson.toJson(polist2, response.getWriter());
	 * 
	 * }
	 */

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
	
	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 프로덕트1 정렬 후 불러오기
	 * @param @return
	 * @return String
	 */
	@RequestMapping("sort1.do")
	public ModelAndView sort1(ModelAndView mv, int product1,int sort,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {
		MainSearchCondition msc= new MainSearchCondition();
		msc.setProduct1(product1);
		System.out.println(product1);
		msc.setSort(sort);
		System.out.println(sort);
		int listCount = mainService.getListCount1(product1);

		MainPageInfo mainPi = MainPagination.getPageInfo(currentPage, listCount);

		ArrayList<Product> plist = mainService.selectSortList1(mainPi, msc);

		ArrayList<MaindownCategory> dclist = mainService.selectCategoryList1(product1);
		ArrayList<MainupCategory> uclist = mainService.selectUpCategoryList1();

		ArrayList<Product_opt> polist = mainService.selectOptionList1(product1);

		ArrayList<Product_color> pclist = mainService.selectColorList1();
		ArrayList<productbenner> pblist = mainService.selectPB();
		mv.addObject("pblist", pblist);
		mv.addObject("plist", plist);
		mv.addObject("dclist", dclist);
		mv.addObject("uclist", uclist);
		mv.addObject("polist", polist);
		mv.addObject("pclist", pclist);
		mv.addObject("mainPi", mainPi);
		
		if(sort == 0) {
			mv.setViewName("product");
		}else if(sort ==1) {
			mv.setViewName("product_sort_1");
		}else if(sort ==2) {
			mv.setViewName("product_sort_2");
		}else if(sort ==3) {
			mv.setViewName("product_sort_3");
		}else if(sort ==4) {
			mv.setViewName("product_sort_4");
		}
		

		return mv;
	}

	
	@RequestMapping("sort2.do")
	public ModelAndView sort2(ModelAndView mv, int product2,int sort,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {
MainSearchCondition msc= new MainSearchCondition();
		msc.setProduct2(product2);
		msc.setSort(sort);
		
		int listCount = mainService.getListCount2(product2);

		MainPageInfo mainPi = MainPagination.getPageInfo(currentPage, listCount);

		ArrayList<Product> plist = mainService.selectSortList2(mainPi, msc);

		ArrayList<MaindownCategory> dclist = mainService.selectCategoryList2(product2);
		ArrayList<MainupCategory> uclist = mainService.selectUpCategoryList2();

		ArrayList<Product_opt> polist = mainService.selectOptionList2(product2);

		ArrayList<Product_color> pclist = mainService.selectColorList2();
		ArrayList<productbenner> pblist = mainService.selectPB();
		mv.addObject("pblist", pblist);
		mv.addObject("plist", plist);
		mv.addObject("dclist", dclist);
		mv.addObject("uclist", uclist);
		mv.addObject("polist", polist);
		mv.addObject("pclist", pclist);
		mv.addObject("mainPi", mainPi);
		
		if(sort == 0) {
			mv.setViewName("product2");
		}else if(sort ==1) {
			mv.setViewName("product2_sort_1");
		}else if(sort ==2) {
			mv.setViewName("product2_sort_2");
		}else if(sort ==3) {
			mv.setViewName("product2_sort_3");
		}else if(sort ==4) {
			mv.setViewName("product2_sort_4");
		}
		
		return mv;
	}
	
	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 :이대윤
	 * @내용 : wish 인설트
	 * @param @return
	 * @return String
	 * @throws IOException 
	 */
	@RequestMapping("wishInsert.do")
	@ResponseBody
	public void wishInsert(String prdtNo,HttpServletResponse response,HttpSession session) throws IOException {
		Member m = new Member();
		Wish w = new Wish();
		int result = 0;
		int result2 = 0;
		int memNo;
		m = (Member)session.getAttribute("loginMember");
		memNo = m.getMemNo();
		
		PrintWriter out = response.getWriter();

		ArrayList<Wish> wlist = mainService.selectWish(memNo);
		
		
		for(int i=0; i<wlist.size();i++) {
			if(wlist.get(i).getPrdtNo().equals(prdtNo)) {
				result2++;
			}
		}
		
		if(result2>0) {
			out.print("fail");
		}else {
			
			w.setMemNo(memNo);
			w.setPrdtNo(prdtNo);
			result = mainService.insertWish(w);
			
			
			if(result>0) {
			out.print("ok");
			}
		}
		
		
		
	}
	
	
	/**
	 * @작성일 : 2020. 4. 16.
	 * @작성자 :이대윤
	 * @내용 : 프로덕트 검색 불러오기
	 * @param @return
	 * @return String
	 */
	@RequestMapping("searchProduct.do")
	public ModelAndView searchProduct(ModelAndView mv, String search,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {
		System.out.println(search);
		int listCount = mainService.getSearchListCount(search);
		System.out.println(listCount);
		MainPageInfo mainPi = MainPagination.getPageInfo(currentPage, listCount);

		ArrayList<Product> plist = mainService.selectSearchList(mainPi, search);
		/*
		 * ArrayList<MaindownCategory> dclist = mainService.selectCategoryList1(search);
		 * ArrayList<MainupCategory> uclist = mainService.selectUpCategoryList1();
		 */

		ArrayList<Product_opt> polist = mainService.selectOptionSearchList(search);

		ArrayList<Product_color> pclist = mainService.selectColorList1();
		ArrayList<productbenner> pblist = mainService.selectPB();
		mv.addObject("pblist", pblist);
		mv.addObject("plist", plist);
		/*
		 * mv.addObject("dclist", dclist); mv.addObject("uclist", uclist);
		 */
		mv.addObject("polist", polist);
		mv.addObject("pclist", pclist);
		mv.addObject("mainPi", mainPi);
		
			mv.setViewName("product_search");
		
		

		return mv;
	}

	
	
}
