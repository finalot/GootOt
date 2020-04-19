package com.kh.ot.mypage.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.Board;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.board.vo.SearchCondition;
import com.kh.ot.cart.vo.Ord;
import com.kh.ot.member.vo.Member;
import com.kh.ot.mypage.dao.MypageDao;
import com.kh.ot.mypage.vo.Address;
import com.kh.ot.mypage.vo.CouponMem;
import com.kh.ot.mypage.vo.MyBoard;
import com.kh.ot.mypage.vo.OrdSearch;

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

	@Override
	public int SearchListCount(SearchCondition sc) {
		return mpDao.SearchListCount(sc);
	}

	@Override
	public ArrayList<MyBoard> selectSearchList(PageInfo pi, SearchCondition sc) {
		return mpDao.selectSearchList(pi, sc);
	}

	@Override
	public int getOrderListCount(int memNo) {
		return mpDao.getOrderListCount(memNo);
	}

	@Override
	public ArrayList<Ord> selectOrderList(PageInfo pi, int memNo) {
		return mpDao.selectOrderList(pi, memNo);
	}

	@Override
	public int mAddressInsert(Address ad) {
		return mpDao.mAddressInsert(ad);
	}

	@Override
	public int getAddressCount(Member m) {
		return mpDao.getAddressCount(m);
	}

	@Override
	public ArrayList<Address> selectAddressList(PageInfo pi, Member m) {
		return mpDao.selectAddressList(pi,m);
	}

	@Override
	public Address ModifyAddress(int mAddress) {
		return mpDao.ModifyAddress(mAddress);
	}

	@Override
	public int AddressUpdate(Address ad) {
		return mpDao.AddressUpdate(ad);
	}

	@Override
	public int AddressDelete(ArrayList<Address> nokArr) {
		return mpDao.AddressDelete(nokArr);
	}
	
	@Override
	public int SearchListCount(OrdSearch os) {
		return mpDao.SearchListCount(os);
	}

	@Override
	public ArrayList<Ord> selectSearchList(PageInfo pi, OrdSearch os) {
		return mpDao.selectSearchList(pi, os);
	}

	@Override
	public int orderCount1(int memNo) {
		return mpDao.orderCount1(memNo);
	}

	@Override
	public int orderCount2(int memNo) {
		return mpDao.orderCount2(memNo);

	}

	@Override
	public int orderCount3(int memNo) {
		return mpDao.orderCount3(memNo);

	}

	@Override
	public int orderCount4(int memNo) {
		return mpDao.orderCount4(memNo);

	}

	@Override
	public int orderCount5(int memNo) {
		return mpDao.orderCount5(memNo);

	}

	@Override
	public int orderCount6(int memNo) {
		return mpDao.orderCount6(memNo);
	}

	@Override
	public int orderCount7(int memNo) {
		return mpDao.orderCount7(memNo);
	}
	
	
}
