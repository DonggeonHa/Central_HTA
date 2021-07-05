package com.sample.board.service;

import org.apache.commons.codec.digest.DigestUtils;

import com.sample.board.dao.UserDao;
import com.sample.board.exception.CommonException;
import com.sample.board.vo.User;

public class UserService {

	private UserDao userDao = UserDao.getInstance();
	
	private static UserService instance = new UserService();
	private UserService() {}
	public static UserService getInstance() {
		return instance;
	}
	
	public void addNewUser(User user) {
		User savedUser = userDao.getUserById(user.getId());
		if (savedUser != null) {
			throw new CommonException("["+user.getId()+"]는 사용중인 아이디입니다.");
		}
		
		user.setPassword(DigestUtils.sha256Hex(user.getPassword()));
		userDao.insertUser(user);
	}
	
	public User login(String userId, String password) {
		User user = userDao.getUserById(userId);
		if (user == null) {
			throw new CommonException("아이디 혹은 비밀번호가 올바르지 않습니다.");
		}
		if ("Y".equals(user.getDeleted())) {
			throw new CommonException("삭제된 사용자입니다.");
		}
		if (!user.getPassword().equals(DigestUtils.sha256Hex(password))) {
			throw new CommonException("아이디 혹은 비밀번호가 일치하지 않습니다.");
		}
		return user;
	}
}
