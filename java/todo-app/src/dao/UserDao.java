package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import utils.StringUtils;
import vo.User;

public class UserDao {

	private List<User> db = new ArrayList<User>();
	
	/**
	 * 새 User을 db에 추가한다.
	 * @param user 새 User
	 */
	public void insertUser(User user) {
		db.add(user);
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
		for (User user : db) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	/**
	 * users.csv에 기록된 사용자정보를 읽어서 db에 저장한다.
	 */
	public void loadData() {
		try (FileReader fr = new FileReader("users.csv"); BufferedReader reader = new BufferedReader(fr)) {

			String value = null;
			while ((value = reader.readLine()) != null) {
				// value - 10000, hong, 프로젝트회의, 5월초 신규프로젝트 관련회의, 2021-05-04, .....
				String[] items = value.split(",");
				String id = items[0];
				String password = items[1];
				String username = items[2];
				Boolean isDisabled = StringUtils.stringToBoolean(items[3]);
				Date createdDate = StringUtils.stringToDateTime(items[4]);
				Date deletedDate = StringUtils.stringToDateTime(items[5]);
				
				User user = new User(id, password, username, isDisabled, createdDate, deletedDate);
				
				db.add(user);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * db에 저장된 사용자 정보를 users.csv 파일에 저장한다.
	 */
	public void saveData() {
		try (PrintWriter writer = new PrintWriter("users.csv")) {
			for (User user : db) {
				StringBuilder sb = new StringBuilder();
				
				sb.append(user.getId())
					.append(",")
					.append(user.getPassword())
					.append(",")
					.append(user.getUsername())
					.append(",")
					.append(user.isDisabled())
					.append(",")
					.append(StringUtils.dateTimeToString(user.getCreatedDate()))
					.append(",")
					.append(StringUtils.dateTimeToString(user.getDeletedDate()));
				
				String text = sb.toString();
				
				writer.println(text);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
