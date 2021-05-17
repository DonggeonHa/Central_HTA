package collection.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapApp2 {

	public static void main(String[] args) {
		HashMap<String, User> users = new HashMap<>();
		users.put("hong", new User("hong", "zxcv1234", "홍길동"));
		users.put("kim", new User("kim", "zxcv1234", "김유신"));
		users.put("kang", new User("kang", "zxcv1234", "강감찬"));
		users.put("lee", new User("lee", "zxcv1234", "이순신"));
		users.put("ryu", new User("ryu", "zxcv1234", "류관순"));
		
		// Map객체에 저장된 데이터(객체) 조회하기
		// User user = users.get("hong");	// 홍길동정보를 담고 있는 User객체 획득
		
		// Map객체에 모든 key값을 조회하기
		// Set<T> getSet() : Map객체의 모든 key값을 중복을 허용하지 않는 Set 객체에 담아서 반환한다.
		Set<String> keys = users.keySet();
		System.out.println("Map객체의 key들 : " + keys);	// [hong, kang, lee, kim, ryu]
		
		// Set<String> keys(조회된 key값)로 Map에 저장된 데이터 전부 조회하기
		for (String key : keys) {
			User savedUser = users.get(key);
			System.out.println("[" + key + "]" + savedUser.getName() + ", " + savedUser.getPwd());
		}
		
	}
	
	private static class User {
		String id;
		String pwd;
		String name;
		
		User(String id, String pwd, String name) {
			this.id = id;
			this.pwd = pwd;
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public String getPwd() {
			return pwd;
		}

		public String getName() {
			return name;
		}
	}
}
