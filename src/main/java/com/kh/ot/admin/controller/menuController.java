package com.kh.ot.admin.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("loginMember")
@Controller
public class menuController {
	
	// @Autowired 타입의 어노테이션을 붙여주면 생성할 필요없이 변수 선언만 해도
		// 빈 스키냉을 통해 아래의 'mService'의 이름을 가지고 있는 빈을 찾아서
		// 자동으로 생성 후 주입해준다.

//		@Autowired
//		private MemberService mService;
	
	
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
	public String eventAdd() {
		return "admin/eventAdd";
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
	
	/**
	 * @작성일  : 2020. 4. 7.
	 * @작성자  : 문태환
	 * @내용 	: 쿠폰등록 
	 * @param response
	 */
	@RequestMapping("couponInput.do")
	public void couponInput(HttpServletResponse response) {
		
		
		
		
	}
	
	
}
