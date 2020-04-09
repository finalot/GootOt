package com.kh.ot.admin.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ot.admin.servie.adminService;
import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.Design;

@SessionAttributes("loginMember")
@Controller
public class menuController {
	
		@Autowired
		private adminService adService;
	
	
	/**
	 * @작성일 : 2020. 4. 4.
	 * @작성자 : 이서현
	 * @내용 : ADMIN VIEW 연결
	 */
	@RequestMapping("todayMain.ad")
	public String todayMain() {
		return "admin/todaymain";
	}
	
	@RequestMapping("todayChart.ad")
	public String todayChart() {
		return "admin/todaychart";
	}
	
	@RequestMapping("best.ad")
	public String best() {
		return "admin/best";
	}
	
	@RequestMapping("customer.ad")
	public String customer() {
		return "admin/customer";
	}
	
	@RequestMapping("order.ad")
	public String order() {
		return "admin/order";
	}
	
	@RequestMapping("order_2.ad")
	public String order_2() {
		return "admin/order_2";
	}
	
	@RequestMapping("order_3.ad")
	public String order_3() {
		return "admin/order_3";
	}
	
	@RequestMapping("order_4.ad")
	public String order_4() {
		return "admin/order_4";
	}
	
	@RequestMapping("category.ad")
	public String category() {
		return "admin/category";
	}
	
	@RequestMapping("productAdd.ad")
	public String productAdd() {
		return "admin/productAdd";
	}
	
	@RequestMapping("productList.ad")
	public String productList() {
		return "admin/productList";
	}
	
	@RequestMapping("eventAdd.ad")
	public ModelAndView eventAdd(ModelAndView mv) {
		
		ArrayList<Coupon> clist = adService.selectListCoupon();
 		
		if(!clist.isEmpty()) {
			mv.addObject("clist",clist);
			mv.setViewName("admin/eventAdd");
		}else {
			mv.setViewName("admin/eventAdd");
			System.out.println("리스트 비었다 확인");
		}
		
		
		return mv;
	}
	
	@RequestMapping("eventList.ad")
	public String eventList() {
		return "admin/eventList";
	}
	
	/**
	 * @작성일  : 2020. 4. 9.
	 * @작성자  : 문태환 
	 * @내용 	: 디자인 리스트 
	 * @return
	 */
	@RequestMapping("DesignEdit.ad")
	public ModelAndView DesignEdit(ModelAndView mv) {
		
		ArrayList<Design> mainList = adService.selectMainList();
						Design video = adService.selectVideo();
		ArrayList<Design> instaList = adService.selectInstaList();
		
		
		
		
		return mv;
	}
	
	@RequestMapping("QnA_Product.ad")
	public String QnA_Product() {
		return "admin/QnA_Product";
	}
	
	@RequestMapping("QnA_Product_detail.ad")
	public String QnA_Product_detail() {
		return "admin/QnA_Product_detail";
	}
	
	@RequestMapping("QnA_delivery_cancel.ad")
	public String QnA_delivery_cancel() {
		return "admin/QnA_delivery_cancel";
	}
	
	@RequestMapping("productReturn.ad")
	public String productReturn() {
		return "admin/productReturn";
	}
	
	@RequestMapping("QnA_bank_insert.ad")
	public String QnA_bank_insert() {
		return "admin/QnA_bank_insert";
	}
	
	@RequestMapping("QnA_bad_product.ad")
	public String QnA_bad_product() {
		return "admin/QnA_bad_product";
	}
	
	@RequestMapping("status.ad")
	public String status() {
		return "admin/status";
	}
	
	@RequestMapping("customerDetail.ad")
	public String customerDetail() {
		return "admin/customerDetail";
	}
	
	@RequestMapping("productListDetail.ad")
	public String productListDetail() {
		return "admin/productListDetail";
	}

	@RequestMapping("QnA_bank_detail.ad")
	public String QnA_bank_detail() {
		return "admin/QnA_bank_detail";
	}
	
	@RequestMapping("QnA_bad_detail.ad")
	public String QnA_bad_detail() {
		return "admin/QnA_bad_detail";
	}
	
	@RequestMapping("QnA_delivery_detail.ad")
	public String QnA_delivery_detail() {
		return "admin/QnA_delivery_detail";
	}
	
	@RequestMapping("productReturn_list.ad")
	public String productReturn_list() {
		return "admin/productReturn_list";
	}
	
	@RequestMapping("review_list.ad")
	public String review_list() {
		return "admin/review_list";
	}
	
	@RequestMapping("review_report_list.ad")
	public String review_report_list() {
		return "admin/review_report_list";
	}
	
	
	
//	기능 시작 	
	
	
	/**
	 * @작성일  : 2020. 4. 7.
	 * @작성자  : 문태환
	 * @내용 	: 쿠폰등록 
	 * @param response
	 * @throws IOException 
	 */
	@RequestMapping("couponInput.do")
	public void couponInput(HttpServletResponse response,String[] cpName,int[] cpDiscount) throws IOException {
		
		ArrayList<Coupon> clist = new ArrayList<Coupon>();
		
		for(int i=0; i<cpName.length;i++) {
			Coupon co  = new Coupon();
			System.out.println("cpName : " + cpName[i]);
			System.out.println(cpDiscount[i]);
			co.setCpName(cpName[i]);
			co.setCpDiscount(cpDiscount[i]);
			clist.add(co);
		}
		System.out.println("clist" + clist);
		
		int result = adService.couponInput(clist);
		
		PrintWriter out = response.getWriter();
		if(result > 0) {
			out.print("ok");
		}else {
			out.print("fail");
		}
	}
		
	/**
	 * @작성일  : 2020. 4. 8.
	 * @작성자  : 문태환
	 * @내용 	:쿠폰삭제
	 * @param response
	 * @param cpName
	 * @throws IOException
	 */
	@RequestMapping("couponDelete.ad")
	public void couponDelete(HttpServletResponse response,String cpName) throws IOException {
		
		int result = adService.couponDelete(cpName);
		
		PrintWriter out = response.getWriter();

		if(result > 0) {
			out.print("ok");
		}else {
			out.print("fail");
		}
	}
	
	/**
	 * @작성일  : 2020. 4. 8.
	 * @작성자  : 문태환
	 * @내용 	: 디자인 업데이트
	 * @param d
	 * @param request
	 * @param session
	 * @param uploadFile
	 * @return
	 */
	@RequestMapping(value="DesignEd.do", method=RequestMethod.POST)
	public String DesignEd(int[] no, String[] mainComment,String[] mainLink, HttpServletRequest request,HttpSession session,
	         @RequestParam(name="mainImg",required=false) MultipartFile[] uploadFile) {

		
		ArrayList<Design> dlist = new ArrayList<Design>();
		for(int i = 0;i<no.length-1;i++) {
		Design d = new Design();
		
	
		
		if(!uploadFile[i].getOriginalFilename().equals("")) {
	         // 서버에 업로드
	         // saveFile메소드 : 내가 저장하고자하는 file과 request를 전달하여 서버에 업로드 시키고 그 저장된 파일명을 반환해주는 메소드
	         
	         String renameFileName = saveFile(uploadFile[i],request);
	         
	         if(renameFileName != null) {
	       d.setNo(no[i]);
	       d.setMainComment(mainComment[i]);
	       d.setMainLink(mainLink[i]); 	 
	       d.setOriFIle(uploadFile[i].getOriginalFilename());// DB에는 파일명 저장
	       d.setReFile(renameFileName);
	       dlist.add(d);
	         		}
				}      
		}
				int result = adService.DesignEd(dlist);
		
				if(result > -1 ) {
					return "home";	
				}else {
					return "에러야";
				}
	}
	
		@RequestMapping(value="DesignEdVideo.do" , method=RequestMethod.POST)
		public String DesignEdVideo(HttpServletRequest request, 
				@RequestParam(name="mainvideo",required=false) MultipartFile uploadFile) {
			Design d = new Design();
			
			if(!uploadFile.getOriginalFilename().equals("")) {
		         // 서버에 업로드
		         // saveFile메소드 : 내가 저장하고자하는 file과 request를 전달하여 서버에 업로드 시키고 그 저장된 파일명을 반환해주는 메소드
		         String renameFileName = saveFile(uploadFile,request);
		         if(renameFileName != null) {
		        	 d.setReFile(renameFileName);
		         }
			}
			int result = adService.DesignEdVideo(d);
			
			if(result > -1) {
				return "home";	
			}else {
				return "에러야";
			}
		}
	
	@RequestMapping(value="DesignInsta.do",method=RequestMethod.POST)
	public String DesignInsta(int[] inno,String[] instalink, HttpServletRequest request,HttpSession session,
	         @RequestParam(name="instaimg",required=false) MultipartFile[] uploadFile)  {
		
		ArrayList<Design> dlist = new ArrayList<Design>();
		for(int i = 0;i<inno.length-1;i++) {
		Design d = new Design();
		
		if(!uploadFile[i].getOriginalFilename().equals("")) {
	         // 서버에 업로드
	         // saveFile메소드 : 내가 저장하고자하는 file과 request를 전달하여 서버에 업로드 시키고 그 저장된 파일명을 반환해주는 메소드
	         
	         String renameFileName = saveFile(uploadFile[i],request);
	         
	         if(renameFileName != null) {
	       d.setNo(inno[i]);
	       d.setMainLink(instalink[i]); 	 
	       d.setOriFIle(uploadFile[i].getOriginalFilename());// DB에는 파일명 저장
	       d.setReFile(renameFileName);
	       dlist.add(d);
	         		}
				}
		}
		int result = adService.DesignInsta(dlist);
	
			return "home";	
	
	}
	/**
	 * @작성일  : 2020. 4. 8.
	 * @작성자  : 문태환 
	 * @내용 	: 파일이름 변경
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
