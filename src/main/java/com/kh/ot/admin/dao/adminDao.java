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
	 * @내용 : 상품, 상품옵션 등록 
	 */
	/*
	 * public int ProductInsert(Product p) { return
	 * sqlSession.insert("adminMapper.ProductInsert",p); }
	 * 
	 * public int ProductOptionInsert(ProductOption po,int prdtNo) {
	 * 
	 * int result =0; List<ProductOption> polist = po.getProduct_OptionVOList();
	 * for(ProductOption Option : polist) { Option.setPrdt_no(prdtNo); result
	 * =sqlSession.insert("adminMapper.ProductOptionInsert",Option); } return
	 * result; }
	 */
	 
}
