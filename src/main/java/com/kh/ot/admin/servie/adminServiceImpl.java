package com.kh.ot.admin.servie;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.admin.dao.adminDao;
import com.kh.ot.admin.vo.Coupon;
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
	public int DesignEd(ArrayList<Design>  dlist) {
		return adDao.DesignEd(dlist);
	}


	@Override
	public int DesignEdVideo(Design d) {
		return adDao.DesignEdVideo(d);
	}


	@Override
	public int DesignInsta(ArrayList<Design> dlist) {
		return adDao.DesignInsta(dlist);
	}


	@Override
	public ArrayList<Design> selectMainList() {
		return adDao.selectMainList();
	}


	@Override
	public Design selectVideo() {
		return adDao.selectVideo();
	}


	@Override
	public ArrayList<Design> selectInstaList() {
		return adDao.selectInstaList();
	}

}
