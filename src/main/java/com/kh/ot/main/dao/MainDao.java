/**
 * 
 */
package com.kh.ot.main.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.main.vo.MainPageInfo;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_color;
import com.kh.ot.main.vo.Product_opt;
import com.kh.ot.main.vo.downCategory;
import com.kh.ot.main.vo.upCategory;

@Repository("mainDao")
public class MainDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	
	/**
	 * 이대윤
	 * 상품 컬러,옵션 불러오기
	 * @param product1
	 * @return
	 */
	public ArrayList<Product_opt> selectOptionList1(int product1){
		return (ArrayList)sqlSession.selectList("productMapper.selectProductOption1",product1);
	}
	
	public ArrayList<Product_color> selectColorList1(){
		return (ArrayList)sqlSession.selectList("productMapper.selectProductColor1");
	}
	
	public ArrayList<Product_opt> selectOptionList2(int product2){
		return (ArrayList)sqlSession.selectList("productMapper.selectProductOption2",product2);
	}
	
	public ArrayList<Product_color> selectColorList2(){
		return (ArrayList)sqlSession.selectList("productMapper.selectProductColor2");
	}
	
	
	/**
	 * @param prdtNo 
	 * @작성일 : 2020. 4. 8.
	 * @작성자 :이대윤
	 * @내용 :상품 갯수 파악
	 * @param @return
	 * @return int
	 */
	public int getListCount1(int product1) {
		return sqlSession.selectOne("productMapper.getListCount1",product1);
	}
	public int getListCount2(int product2) {
		return sqlSession.selectOne("productMapper.getListCount2",product2);
	}
	/**
	 * @작성일 : 2020. 4. 8.
	 * @작성자 :이대윤		
	 * @내용 :상품 리스트 불러오기1
	 * @param @param mainPi
	 * @param @return
	 * @return ArrayList<Product>
	 */
	public ArrayList<Product> selectList1(MainPageInfo mainPi,int product1) {
		
		int offset=(mainPi.getCurrentPage() - 1) * mainPi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset,mainPi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("productMapper.selectProduct1",product1,rowBounds);
	}
	
	/**
	 * @작성일 : 2020. 4. 8.
	 * @작성자 :이대윤		
	 * @내용 :상품 리스트 불러오기2
	 * @param @param mainPi
	 * @param @return
	 * @return ArrayList<Product>
	 */
	public ArrayList<Product> selectList2(MainPageInfo mainPi,int product2) {
		
		int offset=(mainPi.getCurrentPage() - 1) * mainPi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset,mainPi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("productMapper.selectProduct2",product2,rowBounds);
	}

	/**
	 * @param product1 
	 * @작성일 : 2020. 4. 9.
	 * @작성자 :이대윤	
	 * @내용 :카테고리 리스트 불러오기1
	 * @param @return
	 * @return ArrayList<downCategory>
	 */
	public ArrayList<downCategory> selectCategoryList1(int product1) {
		return (ArrayList)sqlSession.selectList("productMapper.selectCategory1",product1);
	}

	public ArrayList<upCategory> selectUpCategoryList1() {
		return (ArrayList)sqlSession.selectList("productMapper.selectUpCategory1");
	}

	public ArrayList<downCategory> selectCategoryList2(int product2) {
		return (ArrayList)sqlSession.selectList("productMapper.selectCategory2",product2);
	}

	public ArrayList<upCategory> selectUpCategoryList2() {
		return (ArrayList)sqlSession.selectList("productMapper.selectUpCategory2");
	}

	public ArrayList<downCategory> selectCategoryList3() {
		return (ArrayList)sqlSession.selectList("productMapper.selectCategory3");
	}
	
	public ArrayList<upCategory> selectUpCategoryList3() {
		return (ArrayList)sqlSession.selectList("productMapper.selectUpCategory3");
	}

	
	
	
	
	
	
}
