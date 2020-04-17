package com.kh.ot.admin.servie;

import java.util.ArrayList;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.DownCategory;
import com.kh.ot.admin.vo.UpCategory;
import com.kh.ot.admin.vo.Design;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_opt;

public interface adminService{

	/**
	 * @작성일  : 2020. 4. 7.
	 * @작성자  : 문태환
	 * @내용 	: 쿠폰등록
	 * @param clist
	 * @return
	 */
	public int couponInput(ArrayList<Coupon> clist);

	/**
	 * @작성일  : 2020. 4. 7.
	 * @작성자  : 문태환
	 * @내용 	:쿠폰 리스트
	 * @return
	 */
	public ArrayList<Coupon> selectListCoupon();

	/**
	 * @작성일  : 2020. 4. 8.
	 * @작성자  : 문태환
	 * @내용 	: 쿠폰 삭제
	 * @param cpName
	 * @return
	 */
	public int couponDelete(String cpName);

	/**
	 * @작성일  : 2020. 4. 8.
	 * @작성자  : 문태환
	 * @내용 	: 디자인 업데이트
	 * @param d
	 * @return
	 */
	public int DesignEd(ArrayList<Design> dlist);

	/**
	 * @param d 
	 * @작성일  : 2020. 4. 9.
	 * @작성자  : 문태환 
	 * @내용 	: 메인 비디오 업데이트
	 * @return
	 */
	public int DesignEdVideo(Design d);

	/**
	 * @작성일  : 2020. 4. 9.
	 * @작성자  : 문태환
	 * @내용 	: 메인 인스타 업데이트
	 * @param dlist
	 * @return
	 */
	public int DesignInsta(ArrayList<Design> dlist);

	/**
	 * @작성일  : 2020. 4. 9.
	 * @작성자  :  문태환
	 * @내용 	:  메인 배너 리스트
	 * @return
	 */
	public ArrayList<Design> selectMainList();

	/**
	 * @작성일  : 2020. 4. 9.
	 * @작성자  : 문태환
	 * @내용 	: 비디오 객체
	 * @return
	 */
	public Design selectVideo();

	/**
	 * @작성일  : 2020. 4. 9.
	 * @작성자  :  문태환
	 * @내용 	:  인스타 배너 리스트
	 * @return
	 */
	public ArrayList<Design> selectInstaList();
	
	/*s*/
	/**
	 * @작성일 : 2020. 4. 8.
	 * @작성자 : 이서현
	 * @내용 : 대분류,중분류 리스트 
	 */
	ArrayList<UpCategory> UpCategorySelect();

	ArrayList<DownCategory> DownCategorySelect();

	/**
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 이서현
	 * @내용 : 카테고리 추가 버튼 
	 */
	public int UpCategoryInsert(String addOption);

	public int DownCategoryInsert(DownCategory downCategory);

	/**
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 이서현
	 * @내용 : 카테고리 삭제 버튼
	 */
	public int UpCategoryDelete(int up_no);

	public int DownCategoryDelete(DownCategory downCategory);
	
	/**s
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 이서현
	 * @내용 : 상품 등록 
	 */
	public int ProductInsert(Product p);

	/**
	 * @작성일  : 2020. 4. 13.
	 * @작성자  : 문태환
	 * @내용 	: 어드민 상품문의 리스트
	 * @param b_cate_no
	 * @return
	 */
	public ArrayList<Board> selectList(int b_cate_no);

	/**
	 * @작성일  : 2020. 4. 13.
	 * @작성자  : 문태환 
	 * @내용 	: 어드민 상품문의 업데이트
	 * @param b
	 * @return
	 */
	public int QnA_ProductUpdate(Board b);

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 이서현
	 * @내용 : 상품 리스트 뿌리기 
	 */
	public ArrayList<Product> ProductSelectList();

	/**
	 * @작성일 : 2020. 4. 14.
	 * @작성자 : 이서현
	 * @내용 : 상품리스트 - 상품삭제 버튼
	 */
	public int ProductDelete(int prdtNo);
	


}
