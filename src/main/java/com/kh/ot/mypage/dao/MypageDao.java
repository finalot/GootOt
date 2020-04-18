package com.kh.ot.mypage.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ot.admin.vo.Point;
import com.kh.ot.board.vo.PageInfo;
import com.kh.ot.board.vo.SearchCondition;
import com.kh.ot.cart.vo.Ord;
import com.kh.ot.member.vo.Member;
import com.kh.ot.mypage.vo.Address;
import com.kh.ot.mypage.vo.CouponMem;
import com.kh.ot.mypage.vo.MyBoard;

@Repository("mpDao")
public class MypageDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	/*
	 * ========================================= 적립금 부분
	 * =========================================
	 */
	public int PointListCount(int memNo) {
		return sqlSession.selectOne("mypageMapper.PointListCount",memNo);
	}

	public ArrayList<Point> PointSelectList(int memNo, PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return (ArrayList) sqlSession.selectList("mypageMapper.PointselectList", memNo, rowBounds);
	}

	public int PointUnavailListCount(int memNo) {
		return sqlSession.selectOne("mypageMapper.PointUnavailListCount",memNo);
	}

	public ArrayList<Point> PointselectUnavailList(int memNo, PageInfo pi) {

		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return (ArrayList) sqlSession.selectList("mypageMapper.PointselectUnavailList", memNo, rowBounds);
	}

	/*
	 * ========================================= 쿠폰 부분
	 * =========================================
	 */

	public int CouponListCount(Member m) {
		return sqlSession.selectOne("mypageMapper.CouponListCount", m);
	}

	public ArrayList<CouponMem> CouponSelectList(int memNo, PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return (ArrayList) sqlSession.selectList("mypageMapper.CouponSelectList", memNo, rowBounds);
	}

	public int CompleteCouponListCount(Member m) {
		return sqlSession.selectOne("mypageMapper.CompleteCouponListCount", m);
	}

	public ArrayList<CouponMem> CompleteCouponSelectList(int memNo, PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return (ArrayList) sqlSession.selectList("mypageMapper.CompleteCouponSelectList", memNo, rowBounds);
	}

	public int PointPrice(Member m) {
		
		int memNo = m.getMemNo();
		
		int pointSet = sqlSession.selectOne("mypageMapper.selectPoint",memNo);
		
		m.setMem_point(pointSet);
		 
		return sqlSession.update("mypageMapper.updatePoint", m);
	}

	public int getListCount(int memNo) {
		return sqlSession.selectOne("mypageMapper.selectBoardListCount", memNo);
	}

	public ArrayList<MyBoard> selectList(PageInfo pi, int memNo) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList) sqlSession.selectList("mypageMapper.selectBoardList", memNo, rowBounds);
	}

	public int SearchListCount(SearchCondition sc) {
		
		return sqlSession.selectOne("mypageMapper.SearchListCount", sc);
	}

	public ArrayList<MyBoard> selectSearchList(PageInfo pi, SearchCondition sc) {
		
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("mypageMapper.selectSearchList", sc, rowBounds);
	}

	public int getOrderListCount(int memNo) {
		return sqlSession.selectOne("mypageMapper.getOrderListCount", memNo);
	}

	public ArrayList<Ord> selectOrderList(PageInfo pi, int memNo) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("mypageMapper.selectOrderList", memNo, rowBounds);
	}

	public int mAddressInsert(Address ad) {
		return sqlSession.insert("mypageMapper.mAddressInsert",ad);
	}

	public int getAddressCount(Member m) {
		int memNo = m.getMemNo();
		return sqlSession.selectOne("mypageMapper.getAddressCount",memNo);
	}

	public ArrayList<Address> selectAddressList(PageInfo pi, Member m) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("mypageMapper.selectAddressList",m,rowBounds);
	}

	public Address ModifyAddress(int mAddress) {
		return sqlSession.selectOne("mypageMapper.ModifyAddress",mAddress);
	}

	public int AddressUpdate(Address ad) {
		return sqlSession.update("mypageMapper.AddressUpdate",ad);
	}

	public int AddressDelete(ArrayList<Address> nokArr) {
		  Map<String, Object> map = new HashMap<String, Object>();
		   map.put("nokArr", nokArr);
		return sqlSession.delete("mypageMapper.AddressDelete",map);
	}

}
