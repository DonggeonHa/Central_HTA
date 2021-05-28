package com.sample.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.util.MybatisUtils;
import com.sample.vo.CartItem;

public class CartItemDao {


	private static CartItemDao instance = new CartItemDao();

	private CartItemDao() {
		this.sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	}

	/**
	 * 미리 생성된 ProductDao 객체를 반환한다.
	 * 
	 * @return ProductDao
	 */
	public static CartItemDao getInstance() {
		return instance;
	}

	private SqlSessionFactory sqlSessionFactory;
	
	/**
	 * 새 장바구니 아이템정보를 SAMPLE_CART_ITEMS 테이블에 추가한다.
	 * @param cartItem 새 장바구니 아이템정보
	 */
	public void insertCartItem(CartItem cartItem) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.insert("insertCartItem", cartItem);
		session.close();
	}
}
