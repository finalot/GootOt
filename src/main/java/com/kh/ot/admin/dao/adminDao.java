package com.kh.ot.admin.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.json.simple.JSONObject;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.DownCategory;
import com.kh.ot.admin.vo.UpCategory;
import com.kh.ot.admin.vo.Design;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.cart.vo.Ord;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_opt;

@Repository("adDao")
public class adminDao {

	@Autowired
	private SqlSessionTemplate sqlSession;


	/**
	 * @작성일  : 2020. 4. 7.
	 * @작성자  : 문태환
	 * @내용 	: 쿠폰등록
	 * @param clist
	 * @return
	 */
	public int couponInput(ArrayList<Coupon> clist) {
		   Map<String, Object> map = new HashMap<String, Object>();
		   map.put("clist", clist);
		return sqlSession.insert("adminMapper.couponInput",map);
	}


	/**
	 * @작성일  : 2020. 4. 7.
	 * @작성자  : 문태환
	 * @내용 	: 쿠폰 리스트
	 * @return
	 */
	public ArrayList<Coupon> selectListCoupon() {
		return (ArrayList)sqlSession.selectList("adminMapper.selectListCoupon");
	}


	/**
	 * @작성일  : 2020. 4. 8.
	 * @작성자  :문태환 
	 * @내용 	:쿠폰삭제
	 * @param cpName
	 * @return
	 */
	public int couponDelete(String cpName) {
		return sqlSession.delete("adminMapper.couponDelete",cpName);
	}


	/**
	 * @작성일 : 2020. 4. 8.
	 * @작성자 : 이서현
	 * @내용 : 카테고리 관린
	 */
	public ArrayList<UpCategory> upCategorySelect() {
		return (ArrayList)sqlSession.selectList("adminMapper.UpCategorySelect");
	}


	public ArrayList<DownCategory> DownCategorySelect() {
		return (ArrayList)sqlSession.selectList("adminMapper.DownCategorySelect");
	}


	public int UpCategoryInsert(String addOption) {
		return sqlSession.insert("adminMapper.UpCategoryInsert",addOption);
	}


	public int DownCategoryInsert(DownCategory downCategory) {
		return sqlSession.insert("adminMapper.DownCategoryInsert",downCategory);
	}


	public int UpCategoryDelete(int up_no) {
		return sqlSession.update("adminMapper.UpCategoryDelete",up_no);
	}

	
	public int DownCategoryDelete(DownCategory downCategory) {
		return sqlSession.update("adminMapper.DownCategoryDelete",downCategory);
	}
	
	
	/*
	 * @작성일  : 2020. 4. 8.
	 * @작성자  : 문태환
	 * @내용 	:메인배너등록
	 * @param d
	 * @return
	 */
	public int DesignEd(ArrayList<Design>  dlist) {
		   Map<String, Object> map = new HashMap<String, Object>();
		   map.put("dlist", dlist);
		return sqlSession.update("adminMapper.DesignEd",map);
	}


	/**
	 * @작성일  : 2020. 4. 9.
	 * @작성자  : 문태환 
	 * @내용 	 : 메인동영상 등록
	 * @param d
	 * @return
	 */
	public int DesignEdVideo(Design d) {
		return sqlSession.update("adminMapper.DesignEdVideo",d);
	}


	/**
	 * @작성일  : 2020. 4. 9.
	 * @작성자  : 문태환
	 * @내용 	: 메인 인스타 등록
	 * @param dlist
	 * @return
	 */
	public int DesignInsta(ArrayList<Design> dlist) {
		Map<String, Object> map = new HashMap<String, Object>();
		   map.put("dlist", dlist);
		return sqlSession.insert("adminMapper.DesignInsta",map);
	}


	public ArrayList<Design> selectMainList() {
		return (ArrayList)sqlSession.selectList("adminMapper.selectMainList");
	}

	public Design selectVideo() {
		return (Design)sqlSession.selectOne("adminMapper.selectVideo");
	}


	public ArrayList<Design> selectInstaList() {
		return (ArrayList)sqlSession.selectList("adminMapper.selectInstaList");
	}


	/**
	 * @작성일  : 2020. 4. 13.
	 * @작성자  : 문태환
	 * @내용 	: 어드민 상품문의 리스트
	 * @param b_cate_no
	 * @return
	 */
	public ArrayList<Board> selectList(int b_cate_no) {
		return (ArrayList)sqlSession.selectList("boardMapper.selectList",b_cate_no);
	}


	public int QnA_ProductUpdate(Board b) {
		return sqlSession.update("adminMapper.QnA_ProductUpdate",b);
	}
	
	/**
	 * @작성일 : 2020. 4. 12.
	 * @작성자 : 이서현
	 * @내용 : 상품만 등록
	 */
	
	public int ProductInsert(Product p) { 
		return sqlSession.insert("productMapper.ProductInsert",p); 
	}
	
	/*
	 * public int ProductOptionInsert(Product_opt po,int prdtNo) {
	 * 
	 * int result =0; List<Product_opt> polist = po.getOptionVOList();
	 * for(Product_opt Option : polist) { Option.setPrdtNo(prdtNo);
	 * result=sqlSession.insert("adminMapper.ProductOptionInsert",Option); } return
	 * result; }
	 */


	public ArrayList<Product> ProductSelectList() {
		return (ArrayList)sqlSession.selectList("productMapper.ProductSelectList");
	}


	public int ProductDelete(int prdtNo) {
		return sqlSession.update("productMapper.ProductDelete",prdtNo);
	}


	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환
	 * @내용 	:오더리스트 상태값 A
	 * @return
	 */
	public ArrayList<Ord> selectOderList1() {
		return (ArrayList)sqlSession.selectList("adminMapper.selectOderList1");
	}


	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  :  문태환
	 * @내용 	: 오더리스트 상태값 A 변경
	 * @param ordNo
	 * @return
	 */
	public int orderUpdate1(int ordNo) {
		return sqlSession.update("adminMapper.orderUpdate1",ordNo);
	}

	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환
	 * @내용 	:오더리스트 상태값 B
	 * @return
	 */
	public ArrayList<Ord> selectOderList2() {
		return (ArrayList)sqlSession.selectList("adminMapper.selectOderList2");
	}



	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  :  문태환
	 * @내용 	: 오더리스트 상태값 B 변경
	 * @param ordNo
	 * @return
	 */
	public int orderUpdate2(int ordNo) {
		return sqlSession.update("adminMapper.orderUpdate2",ordNo);
	}

	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환
	 * @내용 	:오더리스트 상태값 C
	 * @return
	 */
	public ArrayList<Ord> selectOderList3() {
		return (ArrayList)sqlSession.selectList("adminMapper.selectOderList3");
	}



	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  :  문태환
	 * @내용 	: 오더리스트 상태값 C 변경
	 * @param ordNo
	 * @return
	 */
	public int orderUpdate3(int ordNo) {
		return sqlSession.update("adminMapper.orderUpdate3",ordNo);
	}
	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  : 문태환
	 * @내용 	:오더리스트 상태값 D
	 * @return
	 */
	public ArrayList<Ord> selectOderList4() {
		return (ArrayList)sqlSession.selectList("adminMapper.selectOderList4");
	}



	/**
	 * @작성일  : 2020. 4. 19.
	 * @작성자  :  문태환
	 * @내용 	: 오더리스트 상태값 D 변경
	 * @param ordNo
	 * @return
	 */
	public int orderUpdate4(int ordNo) {
		return sqlSession.update("adminMapper.orderUpdate4",ordNo);
	}
	 
}
