/**
 * 
 */
package com.kh.ot.main.service;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.main.dao.MainDao;
import com.kh.ot.main.vo.MainPageInfo;
import com.kh.ot.main.vo.MainSearchCondition;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_color;
import com.kh.ot.main.vo.Product_opt;
import com.kh.ot.main.vo.MaindownCategory;
import com.kh.ot.main.vo.MainupCategory;

@Service("mainService")
public class MainServiceImpl implements MainService {

	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Autowired
	private MainDao mainDao;
	
	@Override
	public int getListCount1(int product1) {
		return mainDao.getListCount1(product1);
	}
	@Override
	public int getListCount2(int product2) {
		return mainDao.getListCount2(product2);
	}
	
	@Override
	public ArrayList<Product> selectList1(MainPageInfo mainPi,int product1) {
		return mainDao.selectList1(mainPi,product1);
	}

	
	@Override
	public ArrayList<Product> selectList2(MainPageInfo mainPi,int product2) {
		return mainDao.selectList2(mainPi,product2);
	}
	@Override
	public ArrayList<Product_opt> selectOptionList1(int product1) {
		return mainDao.selectOptionList1(product1);
	}
	@Override
	public ArrayList<Product_color> selectColorList1() {
		return mainDao.selectColorList1();
	}
	@Override
	public ArrayList<Product_opt> selectOptionList2(int product2) {
		return mainDao.selectOptionList2(product2);
	}
	@Override
	public ArrayList<Product_color> selectColorList2() {
		return mainDao.selectColorList2();
	}
	@Override
	public ArrayList<MaindownCategory> selectCategoryList1(int product1) {
		return mainDao.selectCategoryList1(product1);
	}
	@Override
	public ArrayList<MainupCategory> selectUpCategoryList1() {
		return mainDao.selectUpCategoryList1();
	}
	@Override
	public ArrayList<MaindownCategory> selectCategoryList2(int product2) {
		int product22 = product2/10;
		System.out.println(product22);
		return mainDao.selectCategoryList2(product22);
	}
	@Override
	public ArrayList<MainupCategory> selectUpCategoryList2() {
		return mainDao.selectUpCategoryList2();
	}
	@Override
	public ArrayList<MaindownCategory> selectCategoryList3() {
		
		return mainDao.selectCategoryList3();
	}
	@Override
	public ArrayList<MainupCategory> selectUpCategoryList3() {
		return mainDao.selectUpCategoryList3();
	}
	@Override
	public ArrayList<Product> selectSortList1(MainPageInfo mainPi, MainSearchCondition msc) {
		return mainDao.selectSortList1(mainPi,msc);
	}
	@Override
	public ArrayList<Product> selectSortList2(MainPageInfo mainPi, MainSearchCondition msc) {
		return mainDao.selectSortList2(mainPi,msc);
	}

	


	
	


}
