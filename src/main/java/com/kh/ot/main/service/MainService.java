/**
 * 
 */
package com.kh.ot.main.service;

import java.util.ArrayList;

import com.kh.ot.main.vo.MainPageInfo;
import com.kh.ot.main.vo.Product;

public interface MainService {
	
	int getListCount1(int product1);

	int getListCount2(int product2);

	/**
	 * @param product2 
	 * @작성일 : 2020. 4. 8.
	 * @작성자 :이대윤
	 * @내용 :프로덕트 리스트 불러오기
	 * @param @return
	 * @return product
	 */
	ArrayList<Product> selectList2(MainPageInfo mainPi, int product2);
	
	/**
	 * @param product1
	 * @작성일 : 2020. 4. 8.
	 * @작성자 :이대윤
	 * @내용 :프로덕트 리스트 불러오기
	 * @param @return
	 * @return product
	 */
	ArrayList<Product> selectList1(MainPageInfo mainPi, int product1);
	
	
}
