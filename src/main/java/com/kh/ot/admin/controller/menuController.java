package com.kh.ot.admin.controller;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
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
import com.kh.ot.board.service.BoardService;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.cart.vo.Ord;
import com.kh.ot.common.Pagination;
import com.kh.ot.main.service.MainService;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_color;
import com.kh.ot.main.vo.Product_opt;
import com.kh.ot.member.vo.Member;

@SessionAttributes("loginMember")
@Controller
public class menuController {

	@Autowired
	private adminService adService;

	@Autowired
	private BoardService bService;

	@Autowired
	private MainService mainService;

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

	/**
	 * @작성일 : 2020. 4. 19.
	 * @작성자 : 이서현
	 * @내용 : 회원관리 리스트 뿌리기 
	 */
	@RequestMapping("customer.ad")
	public ModelAndView customer(ModelAndView mv) {
		
		ArrayList<Member> mlist = adService.selectMember();
		
		mv.addObject("mlist", mlist);
		mv.setViewName("admin/customer");
		return mv;
	}

	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  :  문태환 
	 * @내용 	: 오더리스트 상태값 A 리스트
	 * @param mv
	 * @return
	 */
	@RequestMapping("order.ad")
	public ModelAndView order(ModelAndView mv) {
		
		ArrayList<Ord> odlist = adService.selectOderList1();
		
		
		mv.addObject("odlist",odlist);
		mv.setViewName("admin/order");
		return mv;
	}
	
	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환 
	 * @내용 	: 오더리스트 A 상태값 변경
	 * @param response
	 * @param ordNo
	 * @throws IOException
	 */
	@RequestMapping("orderUpdate1.ad")
	public void orderUpdate1(HttpServletResponse response , int ordNo) throws IOException {
		
		PrintWriter out  = response.getWriter();
		
		int result = adService.orderUpdate1(ordNo);
		
		if(result > 0) {
			out.print("ok");
		}else {
			out.print("fail");
		}
		
	}
	
	
	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환 
	 * @내용 	: 오더리스트 상태값 B
	 * @param mv
	 * @return
	 */
	@RequestMapping("order_2.ad")
	public ModelAndView order2(ModelAndView mv) {
		
		ArrayList<Ord> odlist = adService.selectOderList2();
		
		
		mv.addObject("odlist",odlist);
		mv.setViewName("admin/order_2");
		return mv;
	}
	
	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환 
	 * @내용 	: 오더리스트 B 상태값 변경
	 * @param response
	 * @param ordNo
	 * @throws IOException
	 */
	@RequestMapping("orderUpdate2.ad")
	public void orderUpdate2(HttpServletResponse response , int ordNo) throws IOException {
		
		PrintWriter out  = response.getWriter();
		
		int result = adService.orderUpdate2(ordNo);
		
		if(result > 0) {
			out.print("ok");
		}else {
			out.print("fail");
		}
		
	}

	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환 
	 * @내용 	: 오더리스트 상태값 C
	 * @param mv
	 * @return
	 */
	@RequestMapping("order_3.ad")
	public ModelAndView order3(ModelAndView mv) {
		
		ArrayList<Ord> odlist = adService.selectOderList3();
		
		
		mv.addObject("odlist",odlist);
		mv.setViewName("admin/order_3");
		return mv;
	}
	
	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환 
	 * @내용 	: 오더리스트 C 상태값 변경
	 * @param response
	 * @param ordNo
	 * @throws IOException
	 */
	@RequestMapping("orderUpdate3.ad")
	public void orderUpdate3(HttpServletResponse response , int ordNo) throws IOException {
		
		PrintWriter out  = response.getWriter();
		
		int result = adService.orderUpdate3(ordNo);
		
		if(result > 0) {
			out.print("ok");
		}else {
			out.print("fail");
		}
	}
	
	
	
	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환 
	 * @내용 	: 오더리스트 상태값 D
	 * @param mv
	 * @return
	 */
	@RequestMapping("order_4.ad")
	public ModelAndView order4(ModelAndView mv) {
		
		ArrayList<Ord> odlist = adService.selectOderList4();
		
		
		mv.addObject("odlist",odlist);
		mv.setViewName("admin/order_4");
		return mv;
	}
	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환 
	 * @내용 	: 오더리스트 D 상태값 변경
	 * @param response
	 * @param ordNo
	 * @throws IOException
	 */
	@RequestMapping("orderUpdate4.ad")
	public void orderUpdate4(HttpServletResponse response , int ordNo) throws IOException {
		
		PrintWriter out  = response.getWriter();
		
		int result = adService.orderUpdate4(ordNo);
		
		if(result > 0) {
			out.print("ok");
		}else {
			out.print("fail");
		}
	}
	
	
	

	@RequestMapping("category.ad")
	public String category() {
		return "admin/category";
	}

	/**
	 * @작성일 : 2020. 4. 15.
	 * @작성자 : 이서현
	 * @내용 : 상품등록 리스트 뿌리기
	 */
	@RequestMapping("productAdd.ad")
	public ModelAndView productAdd(ModelAndView mv) {

		ArrayList<UpCategory> ulist = adService.UpCategorySelect();
		ArrayList<DownCategory> dlist = adService.DownCategorySelect();
		ArrayList<Product_color> pclist = mainService.selectColorList2();

		mv.addObject("ulist", ulist);
		mv.addObject("dlist", dlist);
		mv.addObject("pclist", pclist);
		mv.setViewName("admin/productAdd");
		return mv;
	}

	@RequestMapping("productList.ad")
	public ModelAndView productList(ModelAndView mv) {
		ArrayList<Product> plist = adService.ProductSelectList();
		ArrayList<UpCategory> ulist = adService.UpCategorySelect();
		ArrayList<DownCategory> dlist = adService.DownCategorySelect();
		
		mv.addObject("ulist", ulist);
		mv.addObject("dlist", dlist);
		mv.addObject("plist", plist);
		mv.setViewName("admin/productList");
		return mv;
	}

	/**
	 * @작성일 : 2020. 4. 13.
	 * @작성자 : 문태환
	 * @내용 : 이벤트 페이지 쿠폰리스트 뿌리기
	 * @param mv
	 * @return
	 */
	@RequestMapping("eventAdd.ad")
	public ModelAndView eventAdd(ModelAndView mv) {

		ArrayList<Coupon> clist = adService.selectListCoupon();

		if (!clist.isEmpty()) {
			mv.addObject("clist", clist);
			mv.setViewName("admin/eventAdd");
		} else {
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
	 * @작성일 : 2020. 4. 13.
	 * @작성자 : 문태환
	 * @내용 :디자인 페이지 리스트 뿌리기
	 * @param mv
	 * @return
	 */
	@RequestMapping("DesignEdit.ad")
	public ModelAndView DesignEdit(ModelAndView mv) {

		ArrayList<Design> mainList = adService.selectMainList();
		Design video = adService.selectVideo();
		ArrayList<Design> instaList = adService.selectInstaList();

		System.out.println(mainList);

		mv.addObject("mainList", mainList);
		mv.addObject("video", video);
		mv.addObject("instaList", instaList);
		mv.setViewName("admin/DesignEdit");

		return mv;

	}

	/**
	 * @작성일 : 2020. 4. 13.
	 * @작성자 : 문태환
	 * @내용 : 상품문의 리스트 뿌리기
	 * @param mv
	 * @return
	 */
	@RequestMapping("QnA_Product.ad")
	public ModelAndView QnA_Product(ModelAndView mv,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {
		int b_cate_no = 1;

		ArrayList<Board> list = adService.selectList(b_cate_no);

		System.out.println("list" + list);

		mv.addObject("list", list);
		mv.setViewName("admin/QnA_Product");

		return mv;

	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 배송문의 게시판 리스트 뿌리기
	 * @param mv
	 * @param currentPage
	 * @return
	 */
	@RequestMapping("QnA_del.ad")
	public ModelAndView QnA_del(ModelAndView mv,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {
		int b_cate_no = 2;

		ArrayList<Board> list = adService.selectList(b_cate_no);

		System.out.println("list" + list);

		mv.addObject("list", list);
		mv.setViewName("admin/QnA_del");

		return mv;

	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 배송전 문의 리스트 뿌리기
	 * @param mv
	 * @param currentPage
	 * @return
	 */
	@RequestMapping("QnA_delivery_cancel.ad")
	public ModelAndView QnA_delivery_cancel(ModelAndView mv,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {
		int b_cate_no = 3;

		ArrayList<Board> list = adService.selectList(b_cate_no);

		System.out.println("list" + list);

		mv.addObject("list", list);
		mv.setViewName("admin/QnA_delivery_cancel");

		return mv;
	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 배송후 문의 게시판 뿌리기
	 * @return
	 */
	@RequestMapping("QnA_delivery_after.ad")
	public ModelAndView productReturn(ModelAndView mv,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {
		int b_cate_no = 4;

		ArrayList<Board> list = adService.selectList(b_cate_no);

		System.out.println("list" + list);

		mv.addObject("list", list);
		mv.setViewName("admin/QnA_delivery_after");

		return mv;
	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 입금관련 문의 리스트
	 * @param mv
	 * @param currentPage
	 * @return
	 */
	@RequestMapping("QnA_bank_insert.ad")
	public ModelAndView QnA_bank_insert(ModelAndView mv,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {
		int b_cate_no = 5;

		ArrayList<Board> list = adService.selectList(b_cate_no);

		System.out.println("list" + list);

		mv.addObject("list", list);
		mv.setViewName("admin/QnA_bank_insert");

		return mv;
	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 불량상품 문의 리스트
	 * @param mv
	 * @param currentPage
	 * @return
	 */
	@RequestMapping("QnA_bad_product.ad")
	public ModelAndView QnA_bad_product(ModelAndView mv,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {
		int b_cate_no = 6;

		ArrayList<Board> list = adService.selectList(b_cate_no);

		System.out.println("list" + list);

		mv.addObject("list", list);
		mv.setViewName("admin/QnA_bad_product");

		return mv;
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
	 * @작성일 : 2020. 4. 7.
	 * @작성자 : 문태환
	 * @내용 : 쿠폰등록
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("couponInput.do")
	public void couponInput(HttpServletResponse response, String[] cpName, int[] cpDiscount) throws IOException {

		ArrayList<Coupon> clist = new ArrayList<Coupon>();

		for (int i = 0; i < cpName.length; i++) {
			Coupon co = new Coupon();
			System.out.println("cpName : " + cpName[i]);
			System.out.println(cpDiscount[i]);
			co.setCpName(cpName[i]);
			co.setCpDiscount(cpDiscount[i]);
			clist.add(co);
		}
		System.out.println("clist" + clist);

		int result = adService.couponInput(clist);

		PrintWriter out = response.getWriter();
		if (result > 0) {
			out.print("ok");
		} else {
			out.print("fail");
		}
	}

	/**
	 * @작성일 : 2020. 4. 8.
	 * @작성자 : 문태환
	 * @내용 :쿠폰삭제
	 * @param response
	 * @param cpName
	 * @throws IOException
	 */
	@RequestMapping("couponDelete.ad")
	public void couponDelete(HttpServletResponse response, String cpName) throws IOException {

		int result = adService.couponDelete(cpName);

		PrintWriter out = response.getWriter();

		if (result > 0) {
			out.print("ok");
		} else {
			out.print("fail");
		}
	}

	/**
	 * @작성일 : 2020. 4. 8.
	 * @작성자 : 문태환
	 * @내용 : 디자인 업데이트
	 * @param d
	 * @param request
	 * @param session
	 * @param uploadFile
	 * @return
	 */
	@RequestMapping(value = "DesignEd.do", method = RequestMethod.POST)
	public String DesignEd(int[] no, String[] mainComment, String[] mainLink, HttpServletRequest request,
			HttpSession session, @RequestParam(name = "mainImg", required = false) MultipartFile[] uploadFile) {

		ArrayList<Design> dlist = new ArrayList<Design>();
		for (int i = 0; i < no.length - 1; i++) {
			Design d = new Design();

			if (!uploadFile[i].getOriginalFilename().equals("")) {
				// 서버에 업로드
				// saveFile메소드 : 내가 저장하고자하는 file과 request를 전달하여 서버에 업로드 시키고 그 저장된 파일명을 반환해주는 메소드

				String renameFileName = saveFile(uploadFile[i], request);

				if (renameFileName != null) {
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

		if (result > -1) {
			return "home";
		} else {
			return "에러야";
		}
	}

	@RequestMapping(value = "DesignEdVideo.do", method = RequestMethod.POST)
	public String DesignEdVideo(HttpServletRequest request,
			@RequestParam(name = "mainvideo", required = false) MultipartFile uploadFile) {
		Design d = new Design();

		if (!uploadFile.getOriginalFilename().equals("")) {
			// 서버에 업로드
			// saveFile메소드 : 내가 저장하고자하는 file과 request를 전달하여 서버에 업로드 시키고 그 저장된 파일명을 반환해주는 메소드
			String renameFileName = saveFile(uploadFile, request);
			if (renameFileName != null) {
				d.setReFile(renameFileName);
			}
		}
		int result = adService.DesignEdVideo(d);

		if (result > -1) {
			return "home";
		} else {
			return "에러야";
		}
	}

	/**
	 * @작성일 : 2020. 4. 11.
	 * @작성자 : 문태환
	 * @내용 :인스타 업데이트
	 * @param inno
	 * @param instalink
	 * @param request
	 * @param session
	 * @param uploadFile
	 * @return
	 */
	@RequestMapping(value = "DesignInsta.do", method = RequestMethod.POST)
	public String DesignInsta(int[] inno, String[] instalink, String[] instacomment, HttpServletRequest request,
			HttpSession session, @RequestParam(name = "instaimg", required = false) MultipartFile[] uploadFile) {

		ArrayList<Design> dlist = new ArrayList<Design>();
		for (int i = 0; i < inno.length - 1; i++) {
			Design d = new Design();

			if (!uploadFile[i].getOriginalFilename().equals("")) {
				// 서버에 업로드
				// saveFile메소드 : 내가 저장하고자하는 file과 request를 전달하여 서버에 업로드 시키고 그 저장된 파일명을 반환해주는 메소드

				String renameFileName = saveFile(uploadFile[i], request);

				if (renameFileName != null) {
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
	 * @작성일 : 2020. 4. 8.
	 * @작성자 : 문태환
	 * @내용 : 파일이름 변경
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

		if (!folder.exists()) {
			folder.mkdir(); // 폴더가 없다면 생성해주세요
		}

		String originFileName = file.getOriginalFilename();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String renameFileName = sdf.format(new java.sql.Date(System.currentTimeMillis())) + "."
				+ originFileName.substring(originFileName.lastIndexOf(".") + 1);

		String renamePath = folder + "\\" + renameFileName;

		try {
			file.transferTo(new File(renamePath));
		} catch (Exception e) {

			System.out.println("파일 전송 에러: " + e.getMessage());
		}
		return renameFileName;
	}

	/**
	 * @작성일 : 2020. 4. 11.
	 * @작성자 : 문태환
	 * @내용 : 파일다운로드
	 * @param path
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("nfdown.ad")
	public String fileDownload(HttpServletResponse response, HttpServletRequest request, String path) {
		String folder = request.getSession().getServletContext().getRealPath("/resources/boardUploadFiles");
		String fileName = path;
		// 파일 이름 가지고 오고
		String tempfileName = folder + path;
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
	 * @내용 : 대분류 리스트 뿌리기
	 */
	@RequestMapping("UpCategorySelect.ad")
	public void UpCategorySelct(HttpServletResponse response) throws JsonIOException, IOException {
		ArrayList<UpCategory> ulist = adService.UpCategorySelect();

		response.setContentType("application/json; charset=utf-8");

		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		// 날짜 포멧을 지정하기 위해서 GsonBuilder를이용해서 객체 생성
		gson.toJson(ulist, response.getWriter());
	}

	/**
	 * @작성일 : 2020. 4. 8.
	 * @작성자 : 이서현
	 * @내용 : 중분류 리스트 뿌리기
	 */
	@RequestMapping("DownCategorySelect.ad")
	public void DownCategorySelect(HttpServletResponse response) throws JsonIOException, IOException {

		ArrayList<DownCategory> dlist = adService.DownCategorySelect();

		response.setContentType("application/json; charset=utf-8");

		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		// 날짜 포멧을 지정하기 위해서 GsonBuilder를이용해서 객체 생성
		gson.toJson(dlist, response.getWriter());

	}

	/**
	 * @throws IOException
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 이서현
	 * @내용 : 대분류 카테고리 추가 버튼
	 */
	@RequestMapping("UpCategoryInsert.ad")
	@ResponseBody
	public void UpCategoryInsert(HttpServletResponse repsonse, String addOption) throws IOException {

		int result = adService.UpCategoryInsert(addOption);

		PrintWriter out = repsonse.getWriter();

		if (result > 0) {
			out.print("ok");
		} else {
			out.print("fail");
		}
	}

	/**
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 이서현
	 * @내용 : 중분류 카테고리 추가 버튼
	 */
	@RequestMapping("DownCategoryInsert.ad")
	public void DownCategoryInsert(HttpServletResponse repsonse, String addOption2, int up_no) throws IOException {

		System.out.println("up_no : " + up_no);
		System.out.println("addOption2 : " + addOption2);
		DownCategory dc = new DownCategory();
		dc.setUp_no(up_no);
		dc.setDown_name(addOption2);

		int result = adService.DownCategoryInsert(dc);

		PrintWriter out = repsonse.getWriter();

		if (result > 0) {
			out.print("ok");
		} else {
			out.print("fail");
		}
	}

	/**
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 이서현
	 * @내용 : 대분류 카테고리 삭제 버튼
	 */
	@RequestMapping("UpCategoryDelete.ad")
	public String UpCategoryDelete(int up_no, HttpServletRequest request) {

		int result = adService.UpCategoryDelete(up_no);

		if (result > 0) {
			return "redirect:category.ad";
		} else {
			System.out.println("실패 ! ");
			return "redirect:category.ad";
		}
	}

	/**
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 이서현
	 * @내용 : 중분류 카테고리 삭제 버튼
	 */
	@RequestMapping("DownCategoryDelete.ad")
	public String DownCategoryDelete(int up_no, int down_no, HttpServletRequest request) {
		System.out.println("up_no : " + up_no);
		System.out.println("down_no : " + down_no);
		DownCategory dc = new DownCategory();
		dc.setUp_no(up_no);
		dc.setDown_no(down_no);

		int result = adService.DownCategoryDelete(dc);

		if (result > 0) {
			return "redirect:category.ad";
		} else {
			System.out.println("실패 ! ");
			return "redirect:category.ad";
		}
	}

	/**
	 * @작성일 : 2020. 4. 13.
	 * @작성자 : 문태환
	 * @내용 : 어드민 상품문의 디테일 화면
	 * @param mv
	 * @param qna_no
	 * @return
	 */
	@RequestMapping("QnA_ProductUpdateView.ad")
	public ModelAndView QnA_ProductUpdate(ModelAndView mv, int qna_no) {

		Board b = bService.selectBoard(qna_no);
		System.out.println(b);
		if (b != null) {
			mv.addObject("b", b);
			mv.setViewName("admin/QnA_Product_detail");

		} else {
			mv.addObject("msg", "게시글 상세조회 실패").setViewName("common/errorPage");
		}
		return mv;
	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 어드민 상품문의 업데이트
	 * @param b
	 * @return
	 */
	@RequestMapping("QnA_ProductUpdate.ad")
	public String QnA_ProductUpdate(Board b) {

		int result = adService.QnA_ProductUpdate(b);

		if (result > 0) {

			return "redirect:QnA_Product.ad";
		} else {
			return "에러다";
		}

	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 어드민 불향상품 게시판 디테일
	 * @param mv
	 * @param qna_no
	 * @return
	 */
	@RequestMapping("QnA_badUpdateView.ad")
	public ModelAndView QnA_BadUpdateView(ModelAndView mv, int qna_no) {

		Board b = bService.selectBoard(qna_no);
		System.out.println(b);
		if (b != null) {
			mv.addObject("b", b);
			mv.setViewName("admin/QnA_bad_detail");

		} else {
			mv.addObject("msg", "게시글 상세조회 실패").setViewName("common/errorPage");
		}
		return mv;
	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 불량상품 문의 업데이트
	 * @param b
	 * @return
	 */
	@RequestMapping("QnA_BadUpdate.ad")
	public String QnA_BadUpdate(Board b) {

		int result = adService.QnA_ProductUpdate(b);

		if (result > 0) {

			return "redirect:QnA_bad_product.ad";
		} else {
			return "에러다";
		}

	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 입급관련 디테일 화면이동
	 * @param mv
	 * @param qna_no
	 * @return
	 */
	@RequestMapping("QnA_bankUpdateView.ad")
	public ModelAndView QnA_bankUpdateView(ModelAndView mv, int qna_no) {

		Board b = bService.selectBoard(qna_no);
		System.out.println(b);
		if (b != null) {
			mv.addObject("b", b);
			mv.setViewName("admin/QnA_bank_detail");

		} else {
			mv.addObject("msg", "게시글 상세조회 실패").setViewName("common/errorPage");
		}
		return mv;
	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 입금관련 문의 업데이트
	 * @param b
	 * @return
	 */
	@RequestMapping("QnA_bankUpdate.ad")
	public String QnA_bankUpdate(Board b) {

		int result = adService.QnA_ProductUpdate(b);

		if (result > 0) {

			return "redirect:QnA_bank_insert.ad";
		} else {
			return "에러다";
		}
	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 배송문의 디테일 화면
	 * @param mv
	 * @param qna_no
	 * @return
	 */
	@RequestMapping("QnA_delUpdateView.ad")
	public ModelAndView QnA_delUpdateView(ModelAndView mv, int qna_no) {

		Board b = bService.selectBoard(qna_no);
		System.out.println(b);
		if (b != null) {
			mv.addObject("b", b);
			mv.setViewName("admin/QnA_delivery_detail");

		} else {
			mv.addObject("msg", "게시글 상세조회 실패").setViewName("common/errorPage");
		}
		return mv;
	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 배송문의 업데이트
	 * @param b
	 * @return
	 */
	@RequestMapping("QnA_delUpdate.ad")
	public String QnA_delUpdate(Board b) {

		int result = adService.QnA_ProductUpdate(b);

		if (result > 0) {

			return "redirect:QnA_del.ad";
		} else {
			return "에러다";
		}

	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 배송전 문의 디테일 화면
	 * @param mv
	 * @param qna_no
	 * @return
	 */
	@RequestMapping("QnA_deliveryUpdateView.ad")
	public ModelAndView QnA_deliveryUpdateView(ModelAndView mv, int qna_no) {

		Board b = bService.selectBoard(qna_no);
		System.out.println(b);
		if (b != null) {
			mv.addObject("b", b);
			mv.setViewName("admin/QnA_delivery_detail");

		} else {
			mv.addObject("msg", "게시글 상세조회 실패").setViewName("common/errorPage");
		}
		return mv;
	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 배송전 문의 업데이트
	 * @param b
	 * @return
	 */
	@RequestMapping("QnA_deliveryUpdate.ad")
	public String QnA_deliveryUpdate(Board b) {

		int result = adService.QnA_ProductUpdate(b);

		if (result > 0) {

			return "redirect:QnA_delivery_cancel.ad";
		} else {
			return "에러다";
		}

	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 배송후 문의 업데이트
	 * @param mv
	 * @param qna_no
	 * @return
	 */
	@RequestMapping("QnA_afterUpdateView.ad")
	public ModelAndView QnA_afterUpdateView(ModelAndView mv, int qna_no) {

		Board b = bService.selectBoard(qna_no);
		System.out.println(b);
		if (b != null) {
			mv.addObject("b", b);
			mv.setViewName("admin/QnA_delivery_after_detail");

		} else {
			mv.addObject("msg", "게시글 상세조회 실패").setViewName("common/errorPage");
		}
		return mv;
	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 문태환
	 * @내용 : 배송후 문의 업데이트
	 * @param b
	 * @return
	 */
	@RequestMapping("QnA_afterUpdate.ad")
	public String QnA_afterUpdate(Board b) {

		int result = adService.QnA_ProductUpdate(b);

		if (result > 0) {

			return "redirect:QnA_delivery_after.ad";
		} else {
			return "에러다";
		}
	}

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 이서현
	 * @내용 : 상품리스트 상품 삭제 버튼
	 */
	@RequestMapping("ProductDelete.ad")
	public String ProductDelete(int prdtNo, HttpServletRequest request) {
		int result = adService.ProductDelete(prdtNo);

		if (result > 0) {
			return "redirect:productList.ad";
		} else {
			System.out.println("상품 삭제 오류 ! ");
			return "redirect:productList.ad";
		}
	}

	/**
	 * @작성일 : 2020. 4. 15.
	 * @작성자 : 이서현
	 * @내용 : 상품등록
	 */
	@RequestMapping(value="ProductInsert.ad" ,method=RequestMethod.POST)
	public String ProductInsert(Product p, HttpServletRequest request,
			@RequestParam(name="thumbnailImg",required=false) MultipartFile file1,
			@RequestParam(name="descrptionImg",required=false) MultipartFile file2	) {
		
		// Product만 있는거

		String root = request.getSession().getServletContext().getRealPath("resources");
		
		System.out.println(file1);
		System.out.println(file2);
		
		String savePath = "";
		String saveDetailPath = "";
		String frontPath = "/ot/resources/images/oT";

		if (p.getUpNo() == 1 && p.getDownNo() == 1) {
			savePath = root + "\\images/oT/clothing/t_nasi";
			p.setPrdtImagePath(frontPath + "/clothing/t_nasi/");
			saveDetailPath = root + "\\images/oT/clothing/t_nasi/detail";
			p.setPrdtDetailImagePath(frontPath + "/clothing/t_nasi/detail/");

		} else if (p.getUpNo() == 1 && p.getDownNo() == 2) {
			savePath = root + "\\images/oT/clothing/mantoman";
			p.setPrdtImagePath(frontPath + "/clothing/mantoman/");
			saveDetailPath = root + "\\images/oT/clothing/mantoman/detail";
			p.setPrdtDetailImagePath(frontPath + "/clothing/mantoman/detail/");
		} else if (p.getUpNo() == 1 && p.getDownNo() == 3) {
			savePath = root + "\\images/oT/clothing/hoody";
			p.setPrdtImagePath(frontPath + "/clothing/hoody/");
			saveDetailPath = root + "\\images/oT/clothing/hoody/detail";
			p.setPrdtDetailImagePath(frontPath + "/clothing/hoody/detail/");
		} else if (p.getUpNo() == 1 && p.getDownNo() == 4) {
			savePath = root + "\\images/oT/clothing/pants";
			p.setPrdtImagePath(frontPath + "/clothing/pants/");
			saveDetailPath = root + "\\images/oT/clothing/pants/detail";
			p.setPrdtDetailImagePath(frontPath + "/clothing/pants/detail/");
		} else if (p.getUpNo() == 1 && p.getDownNo() == 5) {
			savePath = root + "\\images/oT/clothing/knit";
			p.setPrdtImagePath(frontPath + "/clothing/knit/");
			saveDetailPath = root + "\\images/oT/clothing/knit/detail";
			p.setPrdtDetailImagePath(frontPath + "/clothing/knit/detail/");
		} else if (p.getUpNo() == 1 && p.getDownNo() == 6) {
			savePath = root + "\\images/oT/clothing/onepiece_skirt";
			p.setPrdtImagePath(frontPath + "/clothing/onepiece_skirt/");
			saveDetailPath = root + "\\images/oT/clothing/onepiece_skirt/detail";
			p.setPrdtDetailImagePath(frontPath + "/clothing/onepiece_skirt/detail/");
		} else if (p.getUpNo() == 1 && p.getDownNo() == 7) {
			savePath = root + "\\images/oT/clothing/shirt_blouse";
			p.setPrdtImagePath(frontPath + "/clothing/shirt_blouse/");
			saveDetailPath = root + "\\images/oT/clothing/shirt_blouse/detail";
			p.setPrdtDetailImagePath(frontPath + "/clothing/shirt_blouse/detail/");
		}

		else if (p.getUpNo() == 2 && p.getDownNo() == 1) {
			savePath = root + "\\images/oT/outer/jacket";
			p.setPrdtImagePath(frontPath + "/outer/jacket/");
			saveDetailPath = root + "\\images/oT/outer/jacket/detail";
			p.setPrdtDetailImagePath(frontPath + "/outer/jacket/detail/");
		} else if (p.getUpNo() == 2 && p.getDownNo() == 2) {
			savePath = root + "\\images/oT/outer/coat_jumper";
			p.setPrdtImagePath(frontPath + "/outer/coat_jumper/");
			saveDetailPath = root + "\\images/oT/outer/coat_jumper/detail";
			p.setPrdtDetailImagePath(frontPath + "/outer/coat_jumper/detail/");
		} else if (p.getUpNo() == 2 && p.getDownNo() == 3) {
			savePath = root + "\\images/oT/outer/cardigan";
			p.setPrdtImagePath(frontPath + "/outer/cardigan/");
			saveDetailPath = root + "\\images/oT/outer/cardigan/detail";
			p.setPrdtDetailImagePath(frontPath + "/outer/cardigan/detail/");
		}

		else if (p.getUpNo() == 3 && p.getDownNo() == 1) {
			savePath = root + "\\images/oT/shoes/shoes";
			p.setPrdtImagePath(frontPath + "/shoes/shoes/");
			saveDetailPath = root + "\\images/oT/shoes/shoes/detail";
			p.setPrdtDetailImagePath(frontPath + "/shoes/shoes/detail/");
		}

		else if (p.getUpNo() == 4 && p.getDownNo() == 1) {
			savePath = root + "\\images/oT/acc/belt";
			p.setPrdtImagePath(frontPath + "/acc/belt/");
			saveDetailPath = root + "\\images/oT/acc/belt/detail";
			p.setPrdtDetailImagePath(frontPath + "/acc/belt/detail/");
		} else if (p.getUpNo() == 4 && p.getDownNo() == 2) {
			savePath = root + "\\images/oT/acc/glasses";
			p.setPrdtImagePath(frontPath + "/acc/glasses/");
			saveDetailPath = root + "\\images/oT/acc/glasses/detail";
			p.setPrdtDetailImagePath(frontPath + "/acc/glasses/detail/");
		} else if (p.getUpNo() == 4 && p.getDownNo() == 3) {
			savePath = root + "\\images/oT/acc/hat";
			p.setPrdtImagePath(frontPath + "/acc/hat/");
			saveDetailPath = root + "\\images/oT/acc/hat/detail";
			p.setPrdtDetailImagePath(frontPath + "/acc/hat/detail/");
		} else if (p.getUpNo() == 4 && p.getDownNo() == 4) {
			savePath = root + "\\images/oT/acc/socks";
			p.setPrdtImagePath(frontPath + "/acc/socks/");
			saveDetailPath = root + "\\images/oT/acc/socks/detail";
			p.setPrdtDetailImagePath(frontPath + "/acc/socks/detail/");
		} else if (p.getUpNo() == 4 && p.getDownNo() == 5) {
			savePath = root + "\\images/oT/acc/accessories";
			p.setPrdtImagePath(frontPath + "/acc/accessories/");
			saveDetailPath = root + "\\images/oT/acc/accessories/detail";
			p.setPrdtDetailImagePath(frontPath + "/acc/accessories/detail/");
		} else if (p.getUpNo() == 4 && p.getDownNo() == 6) {
			savePath = root + "\\images/oT/acc/etc";
			p.setPrdtImagePath(frontPath + "/acc/etc/");
			saveDetailPath = root + "\\images/oT/acc/etc/detail";
			p.setPrdtDetailImagePath(frontPath + "/acc/etc/detail/");
		}

		else if (p.getUpNo() == 5 && p.getDownNo() == 1) { // 임의로 Event Best20 저장
			savePath = root + "\\images/oT/event/new5";
			p.setPrdtImagePath(frontPath + "/event/new5/");
			saveDetailPath = root + "\\images/oT/event/new5/detail";
			p.setPrdtDetailImagePath(frontPath + "/event/new5/detail/");
		} else if (p.getUpNo() == 5 && p.getDownNo() == 2) { // 임의로 Event Best20 저장
			savePath = root + "\\images/oT/event/sale";
			p.setPrdtImagePath(frontPath + "/event/sale/");
			saveDetailPath = root + "\\images/oT/event/sale/detail";
			p.setPrdtDetailImagePath(frontPath + "/event/sale/detail/");
		}

		else if (p.getUpNo() == 6 && p.getDownNo() == 1) {
			savePath = root + "\\images/oT/best/best20";
			p.setPrdtImagePath(frontPath + "/best/best20/");
			saveDetailPath = root + "\\images/oT/best/best20/detail";
			p.setPrdtDetailImagePath(frontPath + "/best/best20/detail/");
		}

		File folder = new File(savePath);
		File folder2 = new File(saveDetailPath);
		if (!folder.exists()) {
			folder.mkdir(); // 폴더가 없다면 생성해주세요
		}
		if(!folder2.exists()) {
			folder2.mkdir();
		}

		String originFileName = file1.getOriginalFilename();
		String originDetailFileName = file2.getOriginalFilename();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String renameFileName = sdf.format(new java.sql.Date(System.currentTimeMillis())) + "."
				+ originFileName.substring(originFileName.lastIndexOf(".") + 1);
		String renameDetailName = sdf.format(new java.sql.Date(System.currentTimeMillis())) + "."
				+ originDetailFileName.substring(originDetailFileName.lastIndexOf(".") + 1);

		String renamePath = folder + "\\" + renameFileName;
		String renameDetailPath = folder2 + "\\" + renameDetailName;

		try {
			file1.transferTo(new File(renamePath));
			file2.transferTo(new File(renameDetailPath));
		} catch (Exception e) {

			System.out.println("파일 전송 에러: " + e.getMessage());
		}

		p.setPrdtImage(renameFileName);
		p.setPrdtDetailImage(renameDetailName);

		int result = adService.ProductInsert(p);

		if (result > 0) {
			return "redirect:productList.ad";
		} else {
			System.out.println("에러");
			return "redirect:productAdd.ad";
		}
	}

	/* *//**
			 * @작성일 : 2020. 4. 16.
			 * @작성자 : 이서현
			 * @내용 : 상품 파일 다운로드
			 *//*
				 * public String savePrdtFile(MultipartFile file, HttpServletRequest
				 * request,Product p) { // 저장할 경로 설정et // 웹 서버 contextPath를 불러와서 폴더의 경로
				 * 찾음(webapp 하위의 resources) String root =
				 * request.getSession().getServletContext().getRealPath("resources");
				 * 
				 * String savePath=""; String saveDetailPath="";
				 * 
				 * if(p.getUpNo()==1 && p.getDownNo()== 1) { savePath= root +
				 * "\\images/oT/clothing/t_nasi";
				 * p.setPrdtImagePath("\\images/oT/clothing/t_nasi/"); saveDetailPath = root +
				 * "\\images/oT/clothing/t_nasi/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/clothing/t_nasi/detail/");
				 * 
				 * }else if(p.getUpNo()==1 && p.getDownNo()== 2) { savePath= root +
				 * "\\images/oT/clothing/mantoman";
				 * p.setPrdtImagePath("\\images/oT/clothing/mantoman/"); saveDetailPath = root +
				 * "\\images/oT/clothing/mantoman/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/clothing/mantoman/detail/"); }else
				 * if(p.getUpNo()==1 && p.getDownNo()== 3) { savePath= root +
				 * "\\images/oT/clothing/hoody";
				 * p.setPrdtImagePath("\\images/oT/clothing/hoody/"); saveDetailPath = root +
				 * "\\images/oT/clothing/hoody/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/clothing/hoody/detail/"); }else
				 * if(p.getUpNo()==1 && p.getDownNo()== 4) { savePath= root +
				 * "\\images/oT/clothing/pants";
				 * p.setPrdtImagePath("\\images/oT/clothing/pants/"); saveDetailPath = root +
				 * "\\images/oT/clothing/pants/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/clothing/pants/detail/"); }else
				 * if(p.getUpNo()==1 && p.getDownNo()== 5) { savePath= root +
				 * "\\images/oT/clothing/knit";
				 * p.setPrdtImagePath("\\images/oT/clothing/knit/"); saveDetailPath = root +
				 * "\\images/oT/clothing/knit/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/clothing/knit/detail/"); }else
				 * if(p.getUpNo()==1 && p.getDownNo()== 6) { savePath= root +
				 * "\\images/oT/clothing/onepiece_skirt";
				 * p.setPrdtImagePath("\\images/oT/clothing/onepiece_skirt/"); saveDetailPath =
				 * root + "\\images/oT/clothing/onepiece_skirt/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/clothing/onepiece_skirt/detail/");
				 * }else if(p.getUpNo()==1 && p.getDownNo()== 7) { savePath= root +
				 * "\\images/oT/clothing/shirt_blouse";
				 * p.setPrdtImagePath("\\images/oT/clothing/shirt_blouse/"); saveDetailPath =
				 * root + "\\images/oT/clothing/shirt_blouse/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/clothing/shirt_blouse/detail/"); }
				 * 
				 * else if(p.getUpNo()==2 && p.getDownNo()==1) { savePath= root +
				 * "\\images/oT/outer/jacket"; p.setPrdtImagePath("\\images/oT/outer/jacket/");
				 * saveDetailPath = root + "\\images/oT/outer/jacket/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/outer/jacket/detail/"); }else
				 * if(p.getUpNo()==2 && p.getDownNo()==2) { savePath= root +
				 * "\\images/oT/outer/coat_jumper";
				 * p.setPrdtImagePath("\\images/oT/outer/coat_jumper/"); saveDetailPath = root +
				 * "\\images/oT/outer/coat_jumper/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/outer/coat_jumper/detail/"); }else
				 * if(p.getUpNo()==2 && p.getDownNo()==3) { savePath= root +
				 * "\\images/oT/outer/cardigan";
				 * p.setPrdtImagePath("\\images/oT/outer/cardigan/"); saveDetailPath = root +
				 * "\\images/oT/outer/cardigan/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/outer/cardigan/detail/"); }
				 * 
				 * 
				 * else if(p.getUpNo()==3 && p.getDownNo()==1) { savePath= root +
				 * "\\images/oT/shoes/shoes"; p.setPrdtImagePath("\\images/oT/shoes/shoes/");
				 * saveDetailPath = root + "\\images/oT/shoes/shoes/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/shoes/shoes/detail/"); }
				 * 
				 * else if(p.getUpNo()==4 && p.getDownNo()==1) { savePath= root +
				 * "\\images/oT/acc/belt"; p.setPrdtImagePath("\\images/oT/acc/belt/");
				 * saveDetailPath = root + "\\images/oT/acc/belt/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/acc/belt/detail/"); }else
				 * if(p.getUpNo()==4 && p.getDownNo()==2) { savePath= root +
				 * "\\images/oT/acc/glasses"; p.setPrdtImagePath("\\images/oT/acc/glasses/");
				 * saveDetailPath = root + "\\images/oT/acc/glasses/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/acc/glasses/detail/"); }else
				 * if(p.getUpNo()==4 && p.getDownNo()==3) { savePath= root +
				 * "\\images/oT/acc/hat"; p.setPrdtImagePath("\\images/oT/acc/hat/");
				 * saveDetailPath = root + "\\images/oT/acc/hat/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/acc/hat/detail/"); }else
				 * if(p.getUpNo()==4 && p.getDownNo()==4) { savePath= root +
				 * "\\images/oT/acc/socks"; p.setPrdtImagePath("\\images/oT/acc/socks/");
				 * saveDetailPath = root + "\\images/oT/acc/socks/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/acc/socks/detail/"); }else
				 * if(p.getUpNo()==4 && p.getDownNo()==5) { savePath= root +
				 * "\\images/oT/acc/accessories";
				 * p.setPrdtImagePath("\\images/oT/acc/accessories/"); saveDetailPath = root +
				 * "\\images/oT/acc/accessories/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/acc/accessories/detail/"); }else
				 * if(p.getUpNo()==4 && p.getDownNo()==6) { savePath= root +
				 * "\\images/oT/acc/etc"; p.setPrdtImagePath("\\images/oT/acc/etc/");
				 * saveDetailPath = root + "\\images/oT/acc/etc/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/acc/etc/detail/"); }
				 * 
				 * else if(p.getUpNo()==5 && p.getDownNo()==1) { //임의로 Event Best20 저장 savePath=
				 * root + "\\images/oT/event/new5";
				 * p.setPrdtImagePath("\\images/oT/event/new5/"); saveDetailPath = root +
				 * "\\images/oT/event/new5/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/event/new5/detail/"); }else
				 * if(p.getUpNo()==5 && p.getDownNo()==2) { //임의로 Event Best20 저장 savePath= root
				 * + "\\images/oT/event/sale"; p.setPrdtImagePath("\\images/oT/event/sale/");
				 * saveDetailPath = root + "\\images/oT/event/sale/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/event/sale/detail/"); }
				 * 
				 * else if(p.getUpNo()==6 && p.getDownNo()==1) { savePath= root +
				 * "\\images/oT/best/best20"; p.setPrdtImagePath("\\images/oT/best/best20/");
				 * saveDetailPath = root + "\\images/oT/best/best20/detail";
				 * p.setPrdtDetailImagePath("\\images/oT/best/best20/detail/"); }
				 * 
				 * File folder = new File(savePath,saveDetailPath);
				 * 
				 * if(!folder.exists()) { folder.mkdir(); // 폴더가 없다면 생성해주세요 }
				 * 
				 * String originFileName = file.getOriginalFilename(); String
				 * originDetailFileName = file.getOriginalFilename();
				 * 
				 * SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss"); String
				 * renameFileName = sdf.format(new java.sql.Date(System.currentTimeMillis())) +
				 * "." + originFileName.substring(originFileName.lastIndexOf(".")+1); String
				 * renameDetailName = sdf.format(new java.sql.Date(System.currentTimeMillis()))
				 * + "." +
				 * originDetailFileName.substring(originDetailFileName.lastIndexOf(".")+1);
				 * 
				 * String renamePath = folder + "\\" + renameFileName; String renameDetailPath =
				 * folder + "\\" + renameDetailName;
				 * 
				 * 
				 * try { file.transferTo(new File(renamePath)); file.transferTo(new
				 * File(renameDetailPath)); } catch (Exception e) {
				 * 
				 * System.out.println("파일 전송 에러: " + e.getMessage()); } return paths; }
				 */

}
