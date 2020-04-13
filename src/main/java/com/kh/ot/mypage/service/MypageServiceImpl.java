package com.kh.ot.mypage.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.mypage.dao.MypageDao;
import com.kh.ot.mypage.vo.CouponMem;

@Service("mpService")
public class MypageServiceImpl implements MypageService{

	@Autowired
	private MypageDao mpDao;

	@Override
	public int PointListCount() {
		return mpDao.PointListCount();
	}

	@Override
	public ArrayList<Point> PointSelectList(PageInfo pi) {
		return mpDao.PointSelectList(pi);
	}

	@Override
	public int PointUnavailListCount() {
		return mpDao.PointUnavailListCount();
	}

	@Override
	public ArrayList<Point> PointselectUnavailList(PageInfo pi) {
		return mpDao.PointselectUnavailList(pi);
	}

	@Override
	public int CouponListCount() {
		return mpDao.CouponListCount();
	}

	@Override
	public ArrayList<CouponMem> CouponSelectList(PageInfo pi) {
		return mpDao.CouponSelectList(pi);
	}

	@Override
	public int CompleteCouponListCount() {
		return mpDao.CompleteCouponListCount();
	}

	@Override
	public ArrayList<CouponMem> CompleteCouponSelectList(PageInfo pi) {
		return mpDao.CompleteCouponSelectList(pi);

	}
}
