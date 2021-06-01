package com.sample.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.util.MybatisUtils;
import com.sample.vo.Review;

public class ReviewDao {

	private static ReviewDao instance = new ReviewDao();
	private ReviewDao() {
		this.sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	}
	
	/**
	 * SAMPLE_PRODUCT_REVIEWS 테이블에 대한 CRUD기능을 제공하는 ReviewDao객체를 반환한다.
	 * @return
	 */
	public static ReviewDao getInstance() {
		return instance;
	}
	
	private SqlSessionFactory sqlSessionFactory;
	
	/**
	 * 리뷰정보를 전달받아서 SAMPLE_PRODUCT_REVIEWS에 저장한다.
	 * @param review 리뷰정보
	 */
	public void insertReview(Review review) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.insert("insertReview", review);
		session.close();
	}
	
	/**
	 * 리뷰번호를 전달받아서 SAMPLE_PRODUCT_REVIEWS에서 리뷰번호에 해당하는 리뷰를 삭제한다.
	 * @param reviewNo 삭제할 리뷰번호
	 */
	public void deleteReview(int reviewNo) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.delete("deleteReview", reviewNo);
		session.close();
	}
	
	/**
	 * 상품번호를 전달받아서 SAMPLE_PRODUCT_REVIEWS에서 해당 상품과 관련된 모든 리뷰들을 반환한다.
	 * @param productNo 리뷰를 조회할 상품번호
	 * @return 리뷰 리스트
	 */
	public List<Review> getReviewsByProductNo(int productNo) {
		SqlSession session = sqlSessionFactory.openSession();
		List<Review> reviews = session.selectList("getReviewsByProductNo", productNo);
		session.close();
		
		return reviews;
	}
	
	/**
	 * 리뷰번호를 전달받아서 SAMPLE_PRODUCT_REVIEWS에서 리뷰번호에 해당하는 리뷰를 반환한다.
	 * @param reviewNo 조회할 리뷰번호
	 * @return 리뷰정보
	 */
	public Review getReviewByNo(int reviewNo) {
		SqlSession session = sqlSessionFactory.openSession();
		Review review = session.selectOne("getReviewByNo", reviewNo);
		session.close();
		
		return review;
	}
}
