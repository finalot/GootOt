package com.kh.ot.admin.servie;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.admin.dao.adminDao;
import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.DownCategory;
import com.kh.ot.admin.vo.Product;
import com.kh.ot.admin.vo.ProductOption;
import com.kh.ot.admin.vo.UpCategory;
import com.kh.ot.admin.vo.Design;
import com.kh.ot.board.dao.BoardDao;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;

@Service("adService")
public class adminServiceImpl implements adminService{
	
	@Autowired
	private adminDao adDao;


	@Override
	public int couponInput(ArrayList<Coupon> clist) {
		return adDao.couponInput(clist);
	}


	@Override
	public ArrayList<Coupon> selectListCoupon() {
		return adDao.selectListCoupon();
	}


	@Override
	public int couponDelete(String cpName) {
		return adDao.couponDelete(cpName);
	}


	@Override
	public ArrayList<UpCategory> UpCategorySelect() {
		return adDao.upCategorySelect();
	}
	
	@Override
	public int DesignEd(ArrayList<Design>  dlist) {
		return adDao.DesignEd(dlist);
	}


	@Override
	public ArrayList<DownCategory> DownCategorySelect() {
		return adDao.DownCategorySelect();
	}
	
	@Override
	public int DesignEdVideo(Design d) {
		return adDao.DesignEdVideo(d);
	}


	@Override
	public int UpCategoryInsert(String addOption) {
		return adDao.UpCategoryInsert(addOption);
	public int DesignInsta(ArrayList<Design> dlist) {
		return adDao.DesignInsta(dlist);
	}


	@Override
	public int DownCategoryInsert(DownCategory downCategory) {
		return adDao.DownCategoryInsert(downCategory);
	public ArrayList<Design> selectMainList() {
		return adDao.selectMainList();
	}


	@Override
	public int UpCategoryDelete(int up_no) {
		return adDao.UpCategoryDelete(up_no);
	public Design selectVideo() {
		return adDao.selectVideo();
	}


	@Override
	public int DownCategoryDelete(DownCategory downCategory) {
		return adDao.DownCategoryDelete(downCategory);
	}

	




	/*
	 * @Override public UpCategory selectUpCategory(int up_no) { int result =
	 * adDao.UpCategoryDelete(up_no);
	 * 
	 * if(result>0) { return adDao.selectUpCategory(up_no); }else { return null; } }
	 */


	
	





	
	/*
	 * @Override public int ProductInsert(Product p, ProductOption po) { int result
	 * =0; int presult = adDao.ProductInsert(p);
	 * 
	 * int poresult = 0; int prdtNo =p.getPrdtNo();
	 * 
	 * if(presult>0) { poresult=adDao.ProductOptionInsert(po, prdtNo); result =
	 * presult * poresult; }
	 * 
	 * return result; }
	 */


	






	



	public ArrayList<Design> selectInstaList() {
		return adDao.selectInstaList();
	}

}
