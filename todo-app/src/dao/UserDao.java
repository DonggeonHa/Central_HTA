package dao;

import java.util.ArrayList;
import java.util.List;

import vo.User;

public class UserDao {

	private List<User> db = new ArrayList<User>();
	
	/**
	 * 새 User을 db에 추가한다.
	 * @param user 새 User
	 */
	public void insertUser(User user) {
		
	}
	
	/**
	 * 모든 User 정보를 반환한다.
	 * @return User 리스트
	 */
	public List<User> getUsers() {
		return db;
	}
	
	/**
	 * 지정한 사용자 아이디의 User 정보를 반환한다.
	 * @param id userId
	 * @return User 정보
	 */
	public User getUserById(String id) {
		return null;
	}
	
	/**
	 * users.csv에 기록된 사용자정보를 읽어서 db에 저장한다.
	 */
	public void loadData() {
		
	}
	
	/**
	 * db에 저장된 사용자 정보를 users.csv 파일에 저장한다.
	 */
	public void saveData() {
		
	}
}
