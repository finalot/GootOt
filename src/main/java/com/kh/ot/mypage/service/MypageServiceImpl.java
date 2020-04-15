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
import com.kh.ot.mypage.vo.MyBoard;

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
	public int CouponListCount(Member m) {
		return mpDao.CouponListCount(m);
	}

	@Override
	public ArrayList<CouponMem> CouponSelectList(int memNo, PageInfo pi) {
		return mpDao.CouponSelectList(memNo, pi);
	}

	@Override
	public int CompleteCouponListCount(Member m) {
		return mpDao.CompleteCouponListCount(m);
	}

	@Override
	public ArrayList<CouponMem> CompleteCouponSelectList(int memNo, PageInfo pi) {
		return mpDao.CompleteCouponSelectList(memNo, pi);

	}

	
	@Override
	public int PointPrice(Member m) {
		return mpDao.PointPrice(m);
	}

	@Override
	public int getListCount(int memNo) {
		return mpDao.getListCount(memNo);
	}

	@Override
	public ArrayList<MyBoard> selectList(PageInfo pi, int memNo) {
		return mpDao.selectList(pi, memNo);
	}
}
