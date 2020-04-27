package com.kh.ot.main.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.kh.ot.board.vo.Board;
import com.kh.ot.cart.vo.Cart;
import com.kh.ot.common.MainPagination;
import com.kh.ot.common.MainPagination2;
import com.kh.ot.main.service.MainService;
import com.kh.ot.main.vo.DetailReview;
import com.kh.ot.main.vo.ListCount;
import com.kh.ot.main.vo.MainPageInfo;
import com.kh.ot.main.vo.MainPageInfo2;
import com.kh.ot.main.vo.MainSearchCondition;
import com.kh.ot.main.vo.MaindownCategory;
import com.kh.ot.main.vo.MainupCategory;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_color;
import com.kh.ot.main.vo.Product_opt;
import com.kh.ot.main.vo.ReviewCheck;
import com.kh.ot.main.vo.ReviewPoint;
import com.kh.ot.main.vo.Wish;
import com.kh.ot.main.vo.productWith;
import com.kh.ot.main.vo.productbenner;
import com.kh.ot.member.vo.Member;
import com.kh.ot.review.vo.Review;

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
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 상품 디테일 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("product_detail.do")
	public ModelAndView product_detail(ModelAndView mv, int product_detail,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {
		
		
		ListCount lcount = new ListCount();
		int listCount = mainService.getQnaListCount(product_detail);
		System.out.println(listCount);
		
		lcount.setListCount(listCount);
		
		MainPageInfo2 mainPi2 = MainPagination2.getPageInfo(currentPage, listCount);
		ArrayList<productWith> ppwlist = mainService.selectWithList(product_detail);
		
		ArrayList<Product> plist = new ArrayList<>();
		
		for(int i =0; i<ppwlist.size();i++){
			Product pp = new Product();
			if(ppwlist.get(i).getWith1() != 0) {
				pp =mainService.selectDetailListp(ppwlist.get(i).getWith1());
				plist.add(pp);
				System.out.println(pp.getPrdtImagePath());
				if(ppwlist.get(i).getWith2() != 0) {
					pp =mainService.selectDetailListp(ppwlist.get(i).getWith2());
					plist.add(pp);
				
					if(ppwlist.get(i).getWith3() != 0) {
						pp =mainService.selectDetailListp(ppwlist.get(i).getWith3());
						plist.add(pp);
					
						if(ppwlist.get(i).getWith4() != 0) {
							pp =mainService.selectDetailListp(ppwlist.get(i).getWith4());
							plist.add(pp);
						
							if(ppwlist.get(i).getWith5() != 0) {
								pp =mainService.selectDetailListp(ppwlist.get(i).getWith5());
								plist.add(pp);
							
								if(ppwlist.get(i).getWith6() != 0) {
									pp =mainService.selectDetailListp(ppwlist.get(i).getWith6());
									plist.add(pp);
								
									if(ppwlist.get(i).getWith7() != 0) {
										pp =mainService.selectDetailListp(ppwlist.get(i).getWith7());
										plist.add(pp);
									
										if(ppwlist.get(i).getWith8() != 0) {
											pp =mainService.selectDetailListp(ppwlist.get(i).getWith8());
											plist.add(pp);
										
										}
									}
								}
							}
						}
					}
				}
			
			}
		}
		
		ReviewPoint rp = new ReviewPoint();
		int star1 =0;
		int star2 =0;
		int star3 =0;
		int star4 =0;
		int star5 =0;
		int sumPoint =0;
		
		ArrayList<Product> pdlist = mainService.selectDetailList(product_detail);
		ArrayList<Review> rvlist = mainService.selectPoint(product_detail);
		int avg = 0;
		int avg1 = 0;
		double pointAvg =0;
		for (int i =0; i<rvlist.size();i++) {
			sumPoint+=rvlist.get(i).getRvPoint();
			avg1++;
			if(rvlist.get(i).getRvPoint()==1) {
				star1++;
			}else if(rvlist.get(i).getRvPoint()==2) {
				star2++;
			}else if(rvlist.get(i).getRvPoint()==3) {
				star3++;
			}else if(rvlist.get(i).getRvPoint()==4) {
				star4++;
			}else if(rvlist.get(i).getRvPoint()==5) {
				star5++;
			}
			
		}
		if(avg1==0) {
			avg=1;
			pointAvg = (double)sumPoint/(double)avg;
		}else {
			pointAvg = (double)sumPoint/(double)avg1;
		}
		
		
		rp.setPoint1(star1);
		rp.setPoint2(star2);
		rp.setPoint3(star3);
		rp.setPoint4(star4);
		rp.setPoint5(star5);
		
		
		rp.setPointAvg(Math.round(pointAvg*10)/10.0);
		
		int per = star1;
		
		if (star1<star2) {
			per = star2;
		}else if(per<star3) {
			per = star3;
		}else if(per<star4) {
			per = star4;
		}else if(per<star5) {
			per = star5;
		}
		
		rp.setPer(per);
		
		int sumStar = star1+star2+star3+star4+star5;
		
		rp.setReviewCount(sumStar);
		ArrayList<Product_opt> polist = mainService.selectOptionList(product_detail);
		ArrayList<Product_opt> poolist2 = mainService.selectOptionList33(product_detail);
		ArrayList<Board> blist = mainService.selectQnaList(mainPi2,product_detail);
		ArrayList<Product_color> pclist = mainService.selectColorList2();
		
		
		mv.addObject("rp", rp);
		mv.addObject("lcount", lcount);
		mv.addObject("plist", plist);
		mv.addObject("mainPi2", mainPi2);
		mv.addObject("pdlist", pdlist);
		mv.addObject("blist", blist);
		mv.addObject("polist", polist);
		mv.addObject("poolist2", poolist2);
		mv.addObject("pclist", pclist);
		
		mv.setViewName("productDetail");

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
	 * 이대윤 디테일 셀렉트 에이작스
	 * 
	 */
	@RequestMapping("detailSelect.do")
	public void detailSelect1(HttpServletResponse response,int product_detail) throws JsonIOException, IOException {

		ArrayList<Product_opt> polist3 = mainService.selectOptionList33(product_detail);

		response.setContentType("application/json; charset=utf-8");
		Gson gson = new Gson();

		gson.toJson(polist3, response.getWriter());

	}
	
	@RequestMapping("detailSelect2.do")
	public void detailSelect2(HttpServletResponse response,int product_detail) throws JsonIOException, IOException {

		ArrayList<Product_opt> polist2 = mainService.selectOptionList22(product_detail);

		response.setContentType("application/json; charset=utf-8");
		Gson gson = new Gson();

		gson.toJson(polist2, response.getWriter());

	}
	
	@RequestMapping("detailSelect3.do")
	public void detailSelect3(HttpServletResponse response,int product_detail) throws JsonIOException, IOException {

		ArrayList<Product_color> pclist = mainService.selectColorList3(product_detail);

		response.setContentType("application/json; charset=utf-8");
		Gson gson = new Gson();

		gson.toJson(pclist, response.getWriter());

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

	@RequestMapping("cartcartInsert.do")
	public void cartInsert(HttpServletResponse response,HttpSession session, String[] colorArr, String[] sizeArr, int prdtNo, int prdtPrice) throws IOException {
		Member m = new Member();
		int memNo;
		m = (Member)session.getAttribute("loginMember");
		memNo = m.getMemNo();
		
		int count = 0;
		
		PrintWriter out  = response.getWriter(); 
		
		for(int i =0; i<colorArr.length;i++) {
			Cart c = new Cart();
			c.setMemNo(memNo);
			c.setPrdt_no(prdtNo);
			c.setPrdt_price(prdtPrice);
			c.setPrdt_count(1);
			c.setPrdt_sumprice(prdtPrice);
			c.setPrdt_color(colorArr[i]);
			c.setPrdt_size(sizeArr[i]);
			
			int result = mainService.insertCart(c);
			
			if(result>0) {
				count++;
				System.out.println("성공"+i);
			}
		}
		
		if(count>0) {
			out.print("ok");
		}else {
			out.print("fail");
		}
		
		
	}
	
	
	
	
	@RequestMapping("DetailReviewWrite.do")
	@ResponseBody
	public String detailReviewWriteCheck(HttpSession session, int prdtNo) throws IOException {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		ReviewCheck rc = new ReviewCheck();
		
		Member m = (Member)session.getAttribute("loginMember");
		rc.setMemNo(m.getMemNo());
		rc.setPrdtNo(prdtNo);
		
		
		int result = mainService.detailReviewWriteCheck(rc);
			
		if(result>0) {
			resultMap.put("status","success");
		}else {
			resultMap.put("status","fail");
			resultMap.put("message","리뷰작성은 주문 후 가능합니다.");
		}

		return new Gson().toJson(resultMap);
	}
	
	
	
	
	
	
	/**
	    * @작성일  : 2020.04.22
	    * @작성자  : 이대윤
	    * @내용    : 배송문의 글쓰기
	    * @return
	    */
	   @RequestMapping("delivery_board_write1.do")
	   public ModelAndView delivery_board_write(ModelAndView mv, int prdtNo) {

		   mv.addObject("prdtNo", prdtNo);
		   mv.setViewName("delivery_board_write1");
		return mv;
	   }
	
	
	   @RequestMapping(value = "detailReviewInsert.do")
	   @ResponseBody
	   public String detailReviewInsert(HttpServletRequest request,HttpSession session,DetailReview dr) throws Exception {
		   Map<String,Object> resultMap = new HashMap<String,Object>();
		   String root = request.getSession().getServletContext().getRealPath("resources");
		   Member m = (Member)session.getAttribute("loginMember");
		   System.out.println(m.getMemNo());
			dr.setMemNo(m.getMemNo());
		   
			int count = 0;
			String rvImage = "";
			String rvImage2 = "";
			ArrayList<Product> pdlist = mainService.selectDetailList(dr.getPrdtNo());
			
		   for(MultipartFile f : dr.getFile()) {
			   String timeStamp = new SimpleDateFormat("yyyyMMddhhmmssSSS").format(new Date());
			   
			   String fileName = root+"\\images\\oT\\detailReviewPhoto\\"+timeStamp+f.getOriginalFilename();
			   
			   String savePath = root+"\\images\\oT\\detailReviewPhoto\\";
			   File folder = new File(savePath);
				
				if(!folder.exists()) {
					folder.mkdir();
				}
			   File file = new File(fileName);
			   f.transferTo(file);
			   
			   if(f.getOriginalFilename()==""&&count==0) {
				   for(int i=0; i<pdlist.size(); i++) {
					   
					   rvImage=pdlist.get(i).getPrdtImagePath()+pdlist.get(i).getPrdtImage();
				   }
				   count++;
			   }
			   
			   
			   if(count==0) {
				   fileName="/ot/resources/images/oT/detailReviewPhoto/"+timeStamp+f.getOriginalFilename();
				   rvImage=fileName;
				   count++;
			   }else if(count==1) {
				   fileName="/ot/resources/images/oT/detailReviewPhoto/"+timeStamp+f.getOriginalFilename();
				   rvImage2=fileName;
				   count++;
			   }
			   
		   }
		   
		  
		   
		   dr.setFileName(rvImage);
		   dr.setFileName2(rvImage2);
		   ReviewCheck rc = new ReviewCheck();
		   rc.setPrdtNo(dr.getPrdtNo());
		   rc.setMemNo(dr.getMemNo());
		   
		   int ordNo = mainService.getOrdNo(rc);
		   dr.setOrdNo(ordNo);
		   System.out.println(dr.toString());
		   
		   int result= mainService.detailReviewInsert(dr);
		   
		  if(result>0) {
			  
			  int rvNo = mainService.getRvNo(rc);
			  dr.setRvNo(rvNo);
			  int result2= mainService.detailReviewPhotoInsert(dr);
			  
			  if(result2>0) {
				  int result3= mainService.detailReviewPhotoInsert2(dr);
				  int result4= mainService.updateReviewCount(dr);
				  if(result3>0) {
				  resultMap.put("status","success"); }
			  		}
			  }
		  
		  else {
			  
		  resultMap.put("status","fail");
		  resultMap.put("message","리뷰작성 실패,관리자에 문의하세요."); 
		  
		  }
		 
		   
		   return new Gson().toJson(resultMap);
		   
	   }
	   
	   @RequestMapping("reviewModal.do")
	   @ResponseBody
	   public String reviewModal(int product_detail,String sort,int opNo,
			   @RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage){
		   Map<String,Object> resultMap = new HashMap<String,Object>();
		   ReviewPoint rp = new ReviewPoint();
			int star1 =0;
			int star2 =0;
			int star3 =0;
			int star4 =0;
			int star5 =0;
			int sumPoint =0;
			Product_opt po = new Product_opt();
			ArrayList<Review> rvlist = new ArrayList<>();
			
			
			int listCount = mainService.getReviewListCount(product_detail);
			MainPageInfo mainPi = MainPagination.getPageInfo2(currentPage, listCount);

			if(sort.equals("no")) {
				 rvlist = mainService.selectPoint1(mainPi,product_detail);
			}else if(sort.equals("like")) {
				 rvlist = mainService.selectPoint2(mainPi,product_detail);
			}else if(sort.equals("point")) {
				 rvlist = mainService.selectPoint3(mainPi,product_detail);
			}else if(sort.equals("height")) {
				po.setOptNo(opNo);
				po.setPrdtNo(product_detail);
				
				rvlist = mainService.selectHeightSort(mainPi,po);
			}else if(sort.equals("weight")) {
				po.setOptNo(opNo);
				po.setPrdtNo(product_detail);
				
				rvlist = mainService.selectWeightSort(mainPi,po);
			}else if(sort.equals("size")) {
				po.setOptNo(opNo);
				po.setPrdtNo(product_detail);
				
				rvlist = mainService.selectSizeSort(mainPi,po);
			}
			
			ArrayList<Product> pdlist = mainService.selectDetailList(product_detail);
			int avg = 0;
			int avg1 = 0;
			double pointAvg =0;
			ArrayList<String> namelist = new ArrayList<>();
			String userName = "";
			for (int i =0; i<rvlist.size();i++) {
				
				userName=mainService.selectUserName(rvlist.get(i).getMemCode());
				namelist.add(userName);
				sumPoint+=rvlist.get(i).getRvPoint();
				avg1++;
				if(rvlist.get(i).getRvPoint()==1) {
					star1++;
				}else if(rvlist.get(i).getRvPoint()==2) {
					star2++;
				}else if(rvlist.get(i).getRvPoint()==3) {
					star3++;
				}else if(rvlist.get(i).getRvPoint()==4) {
					star4++;
				}else if(rvlist.get(i).getRvPoint()==5) {
					star5++;
				}
			}
			if(avg1==0) {
				avg=1;
				pointAvg = (double)sumPoint/(double)avg;
			}else {
				pointAvg = (double)sumPoint/(double)avg1;
			}
			
			rp.setPoint1(star1);
			rp.setPoint2(star2);
			rp.setPoint3(star3);
			rp.setPoint4(star4);
			rp.setPoint5(star5);
			
			rp.setPointAvg(Math.round(pointAvg*10)/10.0);
			
			int sumStar = star1+star2+star3+star4+star5;
			
			rp.setReviewCount(sumStar);
			System.out.println(rp);
			System.out.println(pdlist);
			System.out.println(namelist);
			System.out.println(rvlist);
			System.out.println(mainPi);
			resultMap.put("rp",rp);
			resultMap.put("mainPi",mainPi);
			resultMap.put("pdlist",pdlist);
			resultMap.put("namelist",namelist);
		   resultMap.put("rvlist",rvlist);
		   
		   return new Gson().toJson(resultMap);
		   
	   }
	
}
