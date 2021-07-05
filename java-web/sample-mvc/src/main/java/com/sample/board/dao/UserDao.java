package com.sample.board.dao;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.board.vo.User;
import com.sample.util.MybatisUtils;

public class UserDao {

	private SqlSessionFactory sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	
	private static UserDao instance = new UserDao();
	private UserDao() {}
	public static UserDao getInstance() {
		return instance;
	}
	
	public void insertUser(User user) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.insert("users.insertUser", user);
		session.close();
	}
	
	public User getUserById(String userId) {
		SqlSession session = sqlSessionFactory.openSession();
		User user = session.selectOne("users.getUserById", userId);
		session.close();
		return user;
	}
}
