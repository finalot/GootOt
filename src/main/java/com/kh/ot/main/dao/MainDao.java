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

@Repository("mainDao")
public class MainDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	/**
	 * @param prdtNo 
	 * @작성일 : 2020. 4. 8.
	 * @작성자 :
	 * @내용 :
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

	
	
	
	
	
	
}
