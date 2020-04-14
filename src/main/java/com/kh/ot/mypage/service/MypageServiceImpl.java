package com.kh.ot.mypage.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.member.vo.Member;
import com.kh.ot.mypage.dao.MypageDao;
import com.kh.ot.mypage.vo.CouponMem;

@Service("mpService")
public class MypageServiceImpl implements MypageService{

	@Autowired
	private MypageDao mpDao;

	@Override
	public int PointListCount(int memNo) {
		return mpDao.PointListCount(memNo);
	}

	@Override
	public ArrayList<Point> PointSelectList(int memNo, PageInfo pi) {
		return mpDao.PointSelectList(memNo, pi);
	}

	@Override
	public int PointUnavailListCount(int memNo) {
		return mpDao.PointUnavailListCount(memNo);
	}
	
	@Override
	public ArrayList<Point> PointselectUnavailList(int memNo, PageInfo pi) {
		return mpDao.PointselectUnavailList(memNo, pi);
	}

	@Override
	public int CouponListCount(int memNo) {
		return mpDao.CouponListCount(memNo);
	}

	@Override
	public ArrayList<CouponMem> CouponSelectList(int memNo, PageInfo pi) {
		return mpDao.CouponSelectList(memNo, pi);
	}

	@Override
	public int CompleteCouponListCount(int memNo) {
		return mpDao.CompleteCouponListCount(memNo);
	}

	@Override
	public ArrayList<CouponMem> CompleteCouponSelectList(int memNo, PageInfo pi) {
		return mpDao.CompleteCouponSelectList(memNo, pi);

	}

	
	@Override
	public int PointPrice(Member m) {
		return mpDao.PointPrice(m);
	}
}
