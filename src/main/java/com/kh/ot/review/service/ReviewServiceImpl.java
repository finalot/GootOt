package com.kh.ot.review.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ot.review.dao.ReviewDao;
import com.kh.ot.review.vo.Review;

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

}
