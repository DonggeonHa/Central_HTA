package day4;

public class UserArrayRepository implements UserRepository {

	private User[] db = new User[100];
	private int position = 0;
	
	public UserArrayRepository() {
		db[position++] = new User("hong", "홍길동");
		db[position++] = new User("kim", "김유신");
		db[position++] = new User("lee", "이순신");
	}
	
	@Override
	public void saveUser(User user) {
		db[position++] = user;
		
	}

	@Override
	public void removeUser(String id) {
		// 전달받은 아이디에 해당하는 User객체의 저장위치를 담는 변수
		int foundIndex = -1;
		// 배열의 0번째부터 position위치 앞까지 배열에서 User객체를 하나씩 조회한다.
		for (int i=0; i<position; i++) {
			User user = db[i];
			// 배열에서 조회된 User객체의 id와 전달받은 id가 일치하면
			// foundIndex에 i값(지금 조회된 User객체가 배열에 저장된 위치)을 대입한다.
			if (user.getId().equals(id)) {
				foundIndex = i;
				break;
			}
		}
		// foundIndex가 -1이면 전달받은 아이디와 일치하는 사용자정보가 존재하지 않는 경우다.
		// foundIndex가 -1이 아닌 경우에만 사용자 정보가 존재하는 것
		if (foundIndex != -1) {
			// 발견된 User의 저장위치가 맨 마지막이면 그 자리에 null을 저장하고,
			// 다음 저장위치를 하나 감소 시킨다.
			if (foundIndex == position -1) {
				db[foundIndex] = null;
				position--;
			} else {
				// 발견된 User의 저장위치가 맨 마지막이 아니면
				// 그 자리에 맨 마지막번째 칸에 저장된 주소값을 대입한다.
				db[foundIndex] = db[position - 1];
				// 맨 마지막 저장위치를 Null로 변경한다.
				db[position - 1] = null;
				// 다음 저장위치로 하나 감소시킨다.
				position--;
			}
		}      
	}

	@Override
	public void updateUser(User user) {
		User savedUser = this.getUserById(user.getId());
		if (savedUser != null) {
			savedUser.setId(user.getId());
			savedUser.setName(user.getName());
		}
	}

	@Override
	public User getUserById(String id) {
		User user = null;
		
		for (User item : db) {
			if (item == null) {
				break;
			}
			
			if (item.getId().equals(id) ) {
				user = item;
				break;
			}
		}
		
		return user;
	}
	
}
