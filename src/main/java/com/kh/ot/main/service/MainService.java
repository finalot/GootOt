/**
 * 
 */
package com.kh.ot.main.service;

import java.util.ArrayList;

import com.kh.ot.main.vo.MainPageInfo;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_color;
import com.kh.ot.main.vo.Product_opt;
import com.kh.ot.main.vo.downCategory;

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

	/**
	 * 이대윤
	 * 상품옵션 불러오기
	 * @param product1
	 * @return
	 */
	ArrayList<Product_opt> selectOptionList1(int product1);
	ArrayList<Product_opt> selectOptionList2(int product2);

	/**
	 * 이대윤
	 * 상품 컬러 불러오기
	 * @param product1
	 * @return
	 */
	ArrayList<Product_color> selectColorList1();
	ArrayList<Product_color> selectColorList2();

	/**
	 * @작성일 : 2020. 4. 9.
	 * @작성자 :
	 * @내용 :
	 * @param @param product1
	 * @param @return
	 * @return ArrayList<downCategory>
	 */
	ArrayList<downCategory> selectCategoryList1(int product1);
	
}
