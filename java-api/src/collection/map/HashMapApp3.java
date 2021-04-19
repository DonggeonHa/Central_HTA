package collection.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapApp3 {

	public static void main(String[] args) {
		HashMap<String, User> users = new HashMap<>();
		users.put("hong", new User("hong", "zxcv1234", "홍길동"));
		users.put("kim", new User("kim", "zxcv1234", "김유신"));
		users.put("kang", new User("kang", "zxcv1234", "강감찬"));
		users.put("lee", new User("lee", "zxcv1234", "이순신"));
		users.put("ryu", new User("ryu", "zxcv1234", "류관순"));
		
		// Map에 저장된 Entry(key, value 쌍)를 모두 조회하기
		Set<Entry<String, User>> entrySet = users.entrySet();
		for (Entry<String, User> entry : entrySet) {
			String key = entry.getKey();
			User user = entry.getValue();
			System.out.println("[" + key + "]" + user.getName() + ", " + user.getPwd());
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
