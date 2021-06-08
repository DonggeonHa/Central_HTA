package com.sample.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.util.MybatisUtils;
import com.sample.vo.User;

public class UserDao {

	private SqlSessionFactory sqlSessionFactory;
	
	private static UserDao instance = new UserDao();
	private UserDao() {
		this.sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	}
	public static UserDao getInstance() {
		return instance;
	}
	
	/**
	 * 사용자 아이디를 전달받아서 사용자정보를 조회해서 반환한다.
	 * @param userId 사용자아이디
	 * @return 사용자정보
	 */
	public User getUserById(String userId) {
		SqlSession session = sqlSessionFactory.openSession();
		User user = session.selectOne("users.getUserById", userId);
		session.close();
		return user;
	}
}
