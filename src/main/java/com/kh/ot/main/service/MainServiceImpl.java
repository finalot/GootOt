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
import com.kh.ot.main.vo.Product;

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
	


	
	


}
