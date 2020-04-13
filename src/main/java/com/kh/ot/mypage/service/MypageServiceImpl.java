package com.kh.ot.mypage.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.admin.vo.Coupon;
import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.mypage.dao.MypageDao;

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

//	@Override
//	public ArrayList<Coupon> selectList(PageInfo pi) {
//		return mpDao.selectList(pi);
//	}
}
