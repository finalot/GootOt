package com.kh.ot.admin.servie;

import java.util.ArrayList;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.DownCategory;
import com.kh.ot.admin.vo.UpCategory;
import com.kh.ot.admin.vo.Design;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.cart.vo.Ord;
import com.kh.ot.cart.vo.Pay;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_opt;
import com.kh.ot.member.vo.Member;
import com.kh.ot.mypage.vo.Return;

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
	public int UpCategoryInsert(UpCategory up);

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

	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환
	 * @내용 	: 오더리스트 상태값 A
	 * @return
	 */
	public ArrayList<Ord> selectOderList1();

	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  :  문태환
	 * @내용 	: 오더리스트 상태값 A 변경
	 * @param ordNo
	 * @return
	 */
	public int orderUpdate1(int ordNo);

	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환
	 * @내용 	: 오더리스트 상태값 B
	 * @return
	 */
	public ArrayList<Ord> selectOderList2();

		/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  :  문태환
	 * @내용 	: 오더리스트 상태값 B 변경
	 * @param ordNo
	 * @return
	 */
	public int orderUpdate2(int ordNo);

	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환
	 * @내용 	: 오더리스트 상태값 C
	 * @return
	 */
	public ArrayList<Ord> selectOderList3();

		/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  :  문태환
	 * @내용 	: 오더리스트 상태값 C 변경
	 * @param ordNo
	 * @return
	 */
	public int orderUpdate3(int ordNo);


	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환
	 * @내용 	: 오더리스트 상태값 D
	 * @return
	 */
	public ArrayList<Ord> selectOderList4();

		/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  :  문태환
	 * @내용 	: 오더리스트 상태값 D 변경
	 * @param ordNo
	 * @return
	 */
	public int orderUpdate4(int ordNo);

	/**
	 * @작성일 : 2020. 4. 19.
	 * @작성자 : 이서현
	 * @내용 : 회원관리 리스트
	 */
	public ArrayList<Member> selectMember();
		/**
		 * @작성일  : 2020. 4. 19.
		 * @작성자  : 문태환
		 * @내용 	: 상품배너 등록
		 * @param d
		 * @return
		 */
		public int DesignPrdt(Design d);

		/**
		 * @작성일  : 2020. 4. 19.
		 * @작성자  : 문태환
		 * @내용 	: 상품배너 블러오기
		 * @return
		 */
		public Design selectPrdtImg();

		/**
		 * @작성일  : 2020. 4. 19.
		 * @작성자  : 문태환
		 * @내용 	: 쿠폰 업데이트
		 * @param cp
		 * @return
		 */
		public int couponUpdate(ArrayList<Coupon> cplist);

		/**
		 * @작성일  : 2020. 4. 20.
		 * @작성자  : 문태환
		 * @내용 	: 회원 포인트 적립
		 * @param ordNo
		 * @return
		 */
		public Pay selectPay(int ordNo);

		/**
		 * @작성일  : 2020. 4. 21.
		 * @작성자  :  문태환
		 * @내용 	: 반품 게시판 리스트 뿌리기
		 * @return
		 */
		public ArrayList<Return> productReturnlist();

		/**
		 * @작성일  : 2020. 4. 21.
		 * @작성자  : 문태환
		 * @내용 	: 반품화면 디테일
		 * @param reNo
		 * @return
		 */
		  public Return ReturnDetail(Return re);

//	    /*
//		 *
//		 */ @작성일 : 2020. 4. 20.
//		public Return ReturnDetail(Return re);

		 /* @작성일 : 2020. 4. 20.
		 * @작성자 : 이서현
		 * @내용 : 옵션추가에서 prdtNo 가지고오기
		 */
		public Product selectPrdtNo();

		/**
		 * @작성일 : 2020. 4. 20.
		 * @작성자 : 이서현
		 * @내용 : 옵션 추가
		 */
		public int insertPotList(ArrayList<Product_opt> poArr);

		/**
		 * @작성일  : 2020. 4. 22.
		 * @작성자  : 문태환
		 * @내용 	: 반품결제 취소
		 * @param cpmemNo
		 * @return
		 */
		public int calcellCoupon(int cpmemNo);

		/**
		 * @작성일  : 2020. 4. 22.
		 * @작성자  : 문태환
		 * @내용 	: 페이 테이블 결제 취소
		 * @param ordCode
		 * @return
		 */
		public int cancellPay(int ordCode);

		/**
		 * @작성일  : 2020. 4. 22.
		 * @작성자  : 문태환
		 * @내용 	: 사용포인트 반환
		 * @param m
		 * @return
		 */
		public int cancellPoint(Member m);

		/**
		 * @작성일  : 2020. 4. 23.
		 * @작성자  : 문태환
		 * @내용 	: 반품 업데이트
		 * @param r
		 * @return
		 */
		public int ReturnUpdate(Return r);

		/**
		 * @작성일  : 2020. 4. 23.
		 * @작성자  : 문태환
		 * @내용 	: 주분테이블 반품상태 업데이트
		 * @param reNo
		 * @return
		 */
		public int updateOrdf(Return r);

		/**
		 * @작성일  : 2020. 4. 24.
		 * @작성자  : 문태환
		 * @내용 	: 업카테고리 카운트
		 * @param i
		 * @return
		 */
		public int UpCategoryCount(int i);

		/**
		 * @작성일  : 2020. 4. 24.
		 * @작성자  : 문태환
		 * @내용 	: 다운카테고리 카운트
		 * @param i
		 * @return
		 */
		public int DownCategoryCount(DownCategory dc);


}
