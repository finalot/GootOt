package com.kh.ot.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ot.admin.servie.adminService;
import com.kh.ot.admin.vo.Coupon;

@SessionAttributes("loginMember")
@Controller
public class menuController {
	
	@Autowired
	private AdminService aService;

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
	public String DesignEdit() {
		return "admin/DesignEdit";
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
	 * @작성일 : 2020. 4. 7.
	 * @작성자 : 이서현
	 * @내용 : 카테고리 전체 출력  
	 */
	@RequestMapping(value = "category.ad", method = RequestMethod.GET)
	public void insertUpCategory(Model model) throws Exception {
	 //logger.info("get goods register");
	 
	 List<UpCategory> upcate = null;
	 upcate = AdminService.insertUpCategory();
	 model.addAttribute("upcate", JSONArray.fromObject(upcate));
	}
	
	
	
	
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
}
