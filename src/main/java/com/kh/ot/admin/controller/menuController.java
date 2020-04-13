package com.kh.ot.admin.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.kh.ot.admin.servie.adminService;
import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.Design;
import com.kh.ot.admin.vo.DownCategory;
import com.kh.ot.admin.vo.UpCategory;

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

	@RequestMapping("DesignEdit.ad")
	 public ModelAndView DesignEdit(ModelAndView mv) {

	      ArrayList<Design> mainList = adService.selectMainList();
	      Design video = adService.selectVideo();
	      ArrayList<Design> instaList = adService.selectInstaList();

	      System.out.println(mainList);

	      mv.addObject("mainList",mainList);
	      mv.addObject("video",video);
	      mv.addObject("instaList",instaList);
	      mv.setViewName("admin/DesignEdit");

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
	    * @내용    :쿠폰삭제
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
	    * @내용    : 디자인 업데이트
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
	          d.setDeNo(no[i]);
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

	   /**
	    * @작성일  : 2020. 4. 11.
	    * @작성자  : 문태환
	    * @내용    :인스타 업데이트
	    * @param inno
	    * @param instalink
	    * @param request
	    * @param session
	    * @param uploadFile
	    * @return
	    */
	   @RequestMapping(value="DesignInsta.do",method=RequestMethod.POST)
	   public String DesignInsta(int[] inno,String[] instalink, String[] instacomment, HttpServletRequest request,HttpSession session,
	            @RequestParam(name="instaimg",required=false) MultipartFile[] uploadFile)  {

	      ArrayList<Design> dlist = new ArrayList<Design>();
	      for(int i = 0;i<inno.length-1;i++) {
	      Design d = new Design();

	      if(!uploadFile[i].getOriginalFilename().equals("")) {
	            // 서버에 업로드
	            // saveFile메소드 : 내가 저장하고자하는 file과 request를 전달하여 서버에 업로드 시키고 그 저장된 파일명을 반환해주는 메소드

	            String renameFileName = saveFile(uploadFile[i],request);

	            if(renameFileName != null) {
	          d.setDeNo(inno[i]);
	          d.setMainLink(instalink[i]);
	          d.setMainComment(instacomment[i]);
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
	    * @내용    : 파일이름 변경
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

	   /**
	    * @작성일  : 2020. 4. 11.
	    * @작성자  : 문태환
	    * @내용    : 파일다운로드
	    * @param path
	    * @param request
	    * @param response
	    * @throws IOException
	    */
	   @RequestMapping("nfdown.ad")
	   public String fileDownload( HttpServletResponse response, HttpServletRequest request, String path) {
	       String folder =request.getSession().getServletContext().getRealPath("/resources/boardUploadFiles");
	       String fileName = path;
	        // 파일 이름 가지고 오고
	        String tempfileName = folder+path;
	        // 폴더까지 지정되어 있는 파일명 가져와서
	        StringBuilder sb = new StringBuilder("c:/tmp/");
	        sb.append(tempfileName);
	        // 파일 저장되어 있는 경로뒤에 붙여줘서
	        String saveFileName = sb.toString();
	        // saveFileName을 만든다.


	        File file = new File(saveFileName);
	        long fileLength = file.length();
	        // 데이터베이스에 없는 정보는 파일로 만들어서 가져온다. 이 경우엔 Content-Length 가져온 것

	        response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\";");
	        response.setHeader("Content-Transfer-Encoding", "binary");
	        response.setHeader("Content-Length", "" + fileLength);
	        response.setHeader("Pragma", "no-cache;");
	        response.setHeader("Expires", "-1;");
	        // 그 정보들을 가지고 reponse의 Header에 세팅한 후

	        try (FileInputStream fis = new FileInputStream(saveFileName); OutputStream out = response.getOutputStream();) {
	            // saveFileName을 파라미터로 넣어 inputStream 객체를 만들고
	            // response에서 파일을 내보낼 OutputStream을 가져와서
	            int readCount = 0;
	            byte[] buffer = new byte[1024];
	            // 파일 읽을 만큼 크기의 buffer를 생성한 후
	            while ((readCount = fis.read(buffer)) != -1) {
	                out.write(buffer, 0, readCount);
	                // outputStream에 씌워준다
	            }
	        } catch (Exception ex) {
	            throw new RuntimeException("file Load Error");
	        }
	        return "redirect:DesignEdit.ad";
	   }


	/**
	 * @작성일 : 2020. 4. 8.
	 * @작성자 : 이서현
	 * @내용 : 대분류 , 중분류 리스트 뿌리기
	 */
	@RequestMapping("UpCategorySelect.ad")
	public void UpCategorySelct (HttpServletResponse response) throws JsonIOException, IOException {
		ArrayList<UpCategory> ulist = adService.UpCategorySelect();

		response.setContentType("application/json; charset=utf-8");

		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
						//날짜 포멧을 지정하기 위해서 GsonBuilder를이용해서 객체 생성
		gson.toJson(ulist,response.getWriter());
	}


	@RequestMapping("DownCategorySelect.ad")
	public void DownCategorySelect (HttpServletResponse response) throws JsonIOException, IOException {

		ArrayList<DownCategory> dlist = adService.DownCategorySelect();

		response.setContentType("application/json; charset=utf-8");

		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
						//날짜 포멧을 지정하기 위해서 GsonBuilder를이용해서 객체 생성
		gson.toJson(dlist,response.getWriter());

	}

	/**
	 * @throws IOException
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 이서현
	 * @내용 : 카테고리 추가 버튼
	 */
	@RequestMapping("UpCategoryInsert.ad")
	@ResponseBody
	public void UpCategoryInsert(HttpServletResponse repsonse,String addOption) throws IOException {

		int result = adService.UpCategoryInsert(addOption);

		PrintWriter out = repsonse.getWriter();

		if(result>0) {
			out.print("ok");
		}else {
			out.print("fail");
		}
	}

	@RequestMapping("DownCategoryInsert.ad")
	public void DownCategoryInsert(HttpServletResponse repsonse,String addOption2,int up_no) throws IOException {

		System.out.println("up_no : " + up_no);
		System.out.println("addOption2 : " + addOption2);
		DownCategory dc = new DownCategory();
		dc.setUp_no(up_no);
		dc.setDown_name(addOption2);

		int result = adService.DownCategoryInsert(dc);

		PrintWriter out = repsonse.getWriter();

		if(result>0) {
			out.print("ok");
		}else {
			out.print("fail");
		}
	}


	/**
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 이서현
	 * @내용 : 카테고리 (대분류, 중분류) 삭제
	 */
	@RequestMapping("UpCategoryDelete.ad")
	public String UpCategoryDelete(int up_no, HttpServletRequest request) {

		int result = adService.UpCategoryDelete(up_no);

		if(result>0) {
			return "redirect:category.ad";
		}else {
			System.out.println("실패 ! ");
			return "redirect:category.ad";
		}
	}

	@RequestMapping("DownCategoryDelete.ad")
	public String DownCategoryDelete(int up_no,int down_no, HttpServletRequest request) {
		System.out.println("up_no : " + up_no);
		System.out.println("down_no : " + down_no);
		DownCategory dc = new DownCategory();
		dc.setUp_no(up_no);
		dc.setDown_no(down_no);

		int result = adService.DownCategoryDelete(dc);

		if(result>0) {
			return "redirect:category.ad";
		}else {
			System.out.println("실패 ! ");
			return "redirect:category.ad";
		}
	}


	/*
	 * @RequestMapping("ProductInsert.ad") public String ProductInsert(Product
	 * p,ProductOption po, HttpServletRequest request, MultipartFile file) {
	 *
	 * int result = adService.ProductInsert(p,po);
	 *
	 * if(result>0) { return "redirect:productList.ad"; }else {
	 * System.out.println("에러"); return "redirect:productList.ad"; }
	 *
	 * }
	 */






}
