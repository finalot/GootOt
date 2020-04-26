package com.kh.ot.review.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.main.vo.MainupCategory;
import com.kh.ot.main.vo.Product;
import com.kh.ot.main.vo.Product_color;
import com.kh.ot.main.vo.Product_opt;
import com.kh.ot.review.dao.ReviewDao;
import com.kh.ot.review.vo.Like_Heart;
import com.kh.ot.review.vo.Review;
import com.kh.ot.review.vo.ReviewReply;
import com.kh.ot.review.vo.Review_Photo;
import com.kh.ot.review.vo.Review_count;

@Service("rService")
public class ReviewServiceImpl implements ReviewService{
	
	@Autowired
	private ReviewDao rDao;

	@Override
	public ArrayList<Review> selectReviewList() {
		return rDao.selectReviewList();
	}

	@Override
	public Review selectReviewDetail(int rv_no) {
		return rDao.selectReviewDetail(rv_no);
	}

	@Override
	public int selectLikeCount(Like_Heart lh) {
		return rDao.selectLikeCount(lh);
	}

	@Override
	public int insertLike(Like_Heart lh) {
		return rDao.insertLike(lh);
	}

	@Override
	public Like_Heart selectLike(Like_Heart lh) {
		return rDao.selectLike(lh);
	}

	@Override
	public int updateLikeCheck(Like_Heart lh) {
		return rDao.updateLikeCheck(lh);
	}

	@Override
	public int updateLikeCount(int rv_no) {
		return rDao.updateLikeCount(rv_no);
	}

	@Override
	public int updateLikeCheck2(Like_Heart lh) {
		return rDao.updateLikeCheck2(lh);
	}

	@Override
	public int updateLikeCount2(int rv_no) {
		return rDao.updateLikeCount2(rv_no);
	}

	@Override
	public int insertReply(ReviewReply rp) {
		return rDao.insertReply(rp);
	}

	@Override
	public ArrayList<ReviewReply> selectReplyList(int rv_no) {
		return rDao.selectReplyList(rv_no);
	}

	@Override
	public int DeleteReply(ReviewReply rp) {
		return rDao.DeleteReply(rp);
	}

	@Override
	public int WarningReply(ReviewReply rp) {
		return rDao.WarningReply(rp);
	}

	@Override
	public ArrayList<Review> selectLikeSort() {
		return rDao.LikeSort();
	}

	@Override
	public ArrayList<Review> selectDateSort() {
		return rDao.DateSort();
	}

	@Override
	public ArrayList<Review> selectCheckSort(int optionHeight) {
		return rDao.selectCheckSort(optionHeight);
	}

	@Override
	public ArrayList<Review> selectWeightSort(int optionWeight) {
		return rDao.selectWeightSort(optionWeight);
	}

	@Override
	public ArrayList<Review> selectSizeSort(int optionSize) {
		return rDao.selectSizeSort(optionSize);
	}

	@Override
	public ArrayList<Product> getBestList() {
		return rDao.getBestList();
	}

	@Override
	public ArrayList<Product_color> selectColorList1() {
		return rDao.selectColorList1();
	}

	@Override
	public ArrayList<Product_opt> selectOptionBestList() {
		return rDao.selectOptionBestList();
	}

	@Override
	public ArrayList<MainupCategory> selectCategoryList() {
		return rDao.selectCategoryList();
	}

	@Override
	public ArrayList<Review> selectCategoryReview(int upNo) {
		return rDao.selectCategoryReview(upNo);
	}

	@Override
	public ArrayList<Review> selectAllSort() {
		return rDao.selectAllSort();
	}

	@Override
	public ArrayList<Review_Photo> selectReviewPhoto(int rv_no) {
		return rDao.selectReviewPhoto(rv_no);
	}

	@Override
	public ArrayList<Review_count> selectReviewCount() {
		return rDao.selectReviewCount();
	}

}
