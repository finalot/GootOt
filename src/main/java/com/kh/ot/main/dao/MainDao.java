/**
 * 
 */
package com.kh.ot.main.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.board.vo.Board;
import com.kh.ot.cart.vo.Cart;
import com.kh.ot.main.vo.DetailReview;
import com.kh.ot.main.vo.MainPageInfo;
import com.kh.ot.main.vo.MainPageInfo2;
import com.kh.ot.main.vo.MainSearchCondition;
import com.kh.ot.main.vo.MaindownCategory;
import com.kh.ot.main.vo.MainupCategory;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_color;
import com.kh.ot.main.vo.Product_opt;
import com.kh.ot.main.vo.ReviewCheck;
import com.kh.ot.main.vo.Wish;
import com.kh.ot.main.vo.productWith;
import com.kh.ot.main.vo.productbenner;
import com.kh.ot.review.vo.Review;

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
	
	public ArrayList<Product_opt> selectOptionList(int product_detail){
		return (ArrayList)sqlSession.selectList("productMapper.selectProductOption",product_detail);
	}
	public ArrayList<Product_opt> selectOptionList22(int product_detail){
		return (ArrayList)sqlSession.selectList("productMapper.selectProductOption22",product_detail);
	}
	public ArrayList<Product_opt> selectOptionList33(int product_detail){
		return (ArrayList)sqlSession.selectList("productMapper.selectProductOption33",product_detail);
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
	public ArrayList<MaindownCategory> selectCategoryList1(int product1) {
		return (ArrayList)sqlSession.selectList("productMapper.selectCategory1",product1);
	}

	public ArrayList<MainupCategory> selectUpCategoryList1() {
		return (ArrayList)sqlSession.selectList("productMapper.selectUpCategory1");
	}

	public ArrayList<MaindownCategory> selectCategoryList2(int product2) {
		return (ArrayList)sqlSession.selectList("productMapper.selectCategory2",product2);
	}

	public ArrayList<MainupCategory> selectUpCategoryList2() {
		return (ArrayList)sqlSession.selectList("productMapper.selectUpCategory2");
	}

	public ArrayList<MaindownCategory> selectCategoryList3() {
		return (ArrayList)sqlSession.selectList("productMapper.selectCategory3");
	}
	
	public ArrayList<MainupCategory> selectUpCategoryList3() {
		return (ArrayList)sqlSession.selectList("productMapper.selectUpCategory3");
	}

	public ArrayList<Product> selectSortList1(MainPageInfo mainPi, MainSearchCondition msc) {
		int offset=(mainPi.getCurrentPage() - 1) * mainPi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset,mainPi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("productMapper.selectSortProduct1",msc,rowBounds);
	}
	
	public ArrayList<Product> selectSortList2(MainPageInfo mainPi, MainSearchCondition msc) {
		int offset=(mainPi.getCurrentPage() - 1) * mainPi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset,mainPi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("productMapper.selectSortProduct2",msc,rowBounds);
	}

	public int insertWish(Wish w) {
		return sqlSession.insert("productMapper.insertWish", w);
	}

	public ArrayList<Wish> selectWish(int memNo) {
		return (ArrayList)sqlSession.selectList("productMapper.selectWish",memNo);
	}

	public int getSearchListCount(String search) {
		return sqlSession.selectOne("productMapper.getSearchListCount",search);
	}

	public ArrayList<Product> selectSearchList(MainPageInfo mainPi, String search) {
		
		int offset=(mainPi.getCurrentPage() - 1) * mainPi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset,mainPi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("productMapper.selectSearchProduct",search,rowBounds);
	}

	public ArrayList<Product_opt> selectOptionSearchList(String search) {
		return (ArrayList)sqlSession.selectList("productMapper.selectSearchProductOption",search);
	}
	public ArrayList<Product_opt> selectOptionBestList() {
		return (ArrayList)sqlSession.selectList("productMapper.selectOptionBestList");
	}

	public ArrayList<productbenner> selectPB() {
		return (ArrayList)sqlSession.selectList("productMapper.selectPB");
	}

	public ArrayList<Product> selectDetailList(int product_detail) {
		return (ArrayList)sqlSession.selectList("productMapper.selectProductDetail",product_detail);
	}

	public ArrayList<Product_color> selectColorList3(int product_detail) {
		return (ArrayList)sqlSession.selectList("productMapper.selectProductColor3",product_detail);
	}

	public int insertCart(Cart c) {
		return sqlSession.insert("productMapper.insertCart",c);
	}

	public int getQnaListCount(int product_detail) {
		return sqlSession.selectOne("productMapper.selectQnaListCount",product_detail);
	}

	public ArrayList<Board> selectQnaList(MainPageInfo2 mainPi2, int product_detail) {
		int offset=(mainPi2.getCurrentPage() - 1) * mainPi2.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset,mainPi2.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("productMapper.selectQnaList",product_detail,rowBounds);
	}

	public ArrayList<productWith> selectWithList(int product_detail) {
		return (ArrayList)sqlSession.selectList("productMapper.selectWithList",product_detail);
	}

	public Product selectDetailListp(int with) {
		return sqlSession.selectOne("productMapper.selectDetailListp",with);
	}

	public int detailReviewWriteCheck(ReviewCheck rc) {
		return sqlSession.selectOne("productMapper.selectDetailReviewWriteCheck",rc);
	}

	public int detailReviewInsert(DetailReview dr) {
		return sqlSession.insert("productMapper.detailReviewInsert",dr);
	}

	public int getOrdNo(ReviewCheck rc) {
		return sqlSession.selectOne("productMapper.getOrdNo",rc);
	}

	public int getRvNo(ReviewCheck rc) {
		return sqlSession.selectOne("productMapper.getRvNo",rc);
	}

	public int detailReviewPhotoInsert(DetailReview dr) {
		return sqlSession.insert("productMapper.detailReviewPhotoInsert",dr);
	}
	public int detailReviewPhotoInsert2(DetailReview dr) {
		return sqlSession.insert("productMapper.detailReviewPhotoInsert2",dr);
	}

	public int updateReviewCount(DetailReview dr) {
		return sqlSession.update("productMapper.updateReviewCount",dr);
	}

	public ArrayList<Review> selectPoint(int product_detail) {
		return (ArrayList)sqlSession.selectList("productMapper.selectPoint",product_detail);
	}
	
	public ArrayList<Review> selectPoint2(int product_detail) {
		return (ArrayList)sqlSession.selectList("productMapper.selectPoint2",product_detail);
	}
	public ArrayList<Review> selectPoint3(int product_detail) {
		return (ArrayList)sqlSession.selectList("productMapper.selectPoint3",product_detail);
	}

	public String selectUserName(int memCode) {
		return sqlSession.selectOne("productMapper.selectUserName",memCode);
	}

	/**
	 * @작성일  : 2020. 4. 25.
	 * @작성자  : 이대윤
	 * @내용    : 키 정렬
	 * @param optionHeight
	 * @return
	 */
	public ArrayList<Review> selectHeightSort(Product_opt op) {
		
		if(op.getOptNo()==1) {
			return (ArrayList)sqlSession.selectList("productMapper.selectCheckSort1",op);
		} else if(op.getOptNo()==2) {
			return (ArrayList)sqlSession.selectList("productMapper.selectCheckSort2",op);			
		} else if(op.getOptNo()==3) {			
			return (ArrayList)sqlSession.selectList("productMapper.selectCheckSort3",op);
		} else if(op.getOptNo()==4) {
			return (ArrayList)sqlSession.selectList("productMapper.selectCheckSort4",op);			
		} else if(op.getOptNo()==5) {
			return (ArrayList)sqlSession.selectList("productMapper.selectCheckSort5",op);			
		} else if(op.getOptNo()==6){
			return (ArrayList)sqlSession.selectList("productMapper.selectCheckSort6",op);			
		}else {
			return (ArrayList)sqlSession.selectList("productMapper.selectReviewList",op);
		}
	}

	/**
	 * @작성일  : 2020. 4. 25.
	 * @작성자  : 이대윤
	 * @내용    : 몸무게 정렬
	 * @param optionWeight
	 * @return
	 */
	public ArrayList<Review> selectWeightSort(Product_opt op) {
		if(op.getOptNo()==7) {
			return (ArrayList)sqlSession.selectList("productMapper.selectWeightSort7",op);
		} else if(op.getOptNo()==8) {
			return (ArrayList)sqlSession.selectList("productMapper.selectWeightSort8",op);			
		} else if(op.getOptNo()==9) {			
			return (ArrayList)sqlSession.selectList("productMapper.selectWeightSort9",op);
		} else if(op.getOptNo()==10) {
			return (ArrayList)sqlSession.selectList("productMapper.selectWeightSort10",op);			
		} else if(op.getOptNo()==11) {
			return (ArrayList)sqlSession.selectList("productMapper.selectWeightSort11",op);			
		} else if(op.getOptNo()==12){
			return (ArrayList)sqlSession.selectList("productMapper.selectWeightSort12",op);			
		}else {
			return (ArrayList)sqlSession.selectList("productMapper.selectReviewList",op);
		}
	}
	
	
	/**
	 * @작성일  : 2020. 4. 25.
	 * @작성자  : 이대윤
	 * @내용    : 사이즈 정렬
	 * @param optionSize
	 * @return
	 */
	public ArrayList<Review> selectSizeSort(Product_opt op) {
		if(op.getOptNo()==13) {
			return (ArrayList)sqlSession.selectList("productMapper.selectSizeSort13",op);
		} else if(op.getOptNo()==14) {
			return (ArrayList)sqlSession.selectList("productMapper.selectSizeSort14",op);			
		} else if(op.getOptNo()==15) {			
			return (ArrayList)sqlSession.selectList("productMapper.selectSizeSort15",op);
		} else if(op.getOptNo()==16) {
			return (ArrayList)sqlSession.selectList("productMapper.selectSizeSort16",op);			
		} else if(op.getOptNo()==17) {
			return (ArrayList)sqlSession.selectList("productMapper.selectSizeSort17",op);			
		} else if(op.getOptNo()==18){
			return (ArrayList)sqlSession.selectList("productMapper.selectSizeSort18",op);			
		}else {
			return (ArrayList)sqlSession.selectList("productMapper.selectReviewList",op);
		}
	}



	
	
	
	
	
	
}
