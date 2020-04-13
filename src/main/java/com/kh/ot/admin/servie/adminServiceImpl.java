package com.kh.ot.admin.servie;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.admin.dao.adminDao;
import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.DownCategory;
import com.kh.ot.admin.vo.UpCategory;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_opt;
import com.kh.ot.admin.vo.Design;

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
	
	public int DesignEd(ArrayList<Design>  dlist) {
		return adDao.DesignEd(dlist);
	}

	public int DesignEdVideo(Design d) {
		return adDao.DesignEdVideo(d);
	}	
	
	public int DesignInsta(ArrayList<Design> dlist) {
		return adDao.DesignInsta(dlist);
	}	
	
	public ArrayList<Design> selectMainList() {
		return adDao.selectMainList();
	}
	
	public Design selectVideo() {
		return adDao.selectVideo();
	}
	
	public ArrayList<Design> selectInstaList() {
		return adDao.selectInstaList();
	}
	

	
//	/////여기부터 서현쓰
	
	
	@Override
	public ArrayList<UpCategory> UpCategorySelect() {
		return adDao.upCategorySelect();
	}
	


	@Override
	public ArrayList<DownCategory> DownCategorySelect() {
		return adDao.DownCategorySelect();
	}
	
	

	@Override
	public int UpCategoryInsert(String addOption) {
		return adDao.UpCategoryInsert(addOption);
	}

	@Override
	public int DownCategoryInsert(DownCategory downCategory) {
		return adDao.DownCategoryInsert(downCategory);
	}


	@Override
	public int UpCategoryDelete(int up_no) {
		return adDao.UpCategoryDelete(up_no);
	}


	@Override
	public int DownCategoryDelete(DownCategory downCategory) {
		return adDao.DownCategoryDelete(downCategory);
	}

	@Override public int ProductInsert(Product p, Product_opt po) { 
	  int result=0; 
	  int presult = adDao.ProductInsert(p);
	
	  int poresult = 0; 
	  int prdtNo =p.getPrdtNo();
	
	  if(presult>0) { 
		  poresult=adDao.ProductOptionInsert(po, prdtNo); 
		  result =presult * poresult; 
	  }
	  	return result; 
	}
	 



}
