package day4;

public class UserManager {
	
	// 사용자정보 등록 / 삭제 / 변경 / 조회 기능을 제공하는 객체에 대한 표준(인터페이스)사용
	private UserRepository repo;
	
	public void setRepo(UserRepository repo) {
		this.repo = repo;
	}
	
	public UserManager() {}

	public UserManager(UserRepository repo) {
		super();
		this.repo = repo;
	}

	// 새 사용자 등록하기
	public void addNewUser(String id, String name) {
		User savedUser = repo.getUserById(id);
		if (savedUser != null) {
			System.out.println("동일한 아이디로 가입한 사용자가 이미 존재합니다.");
			return; // 메소드 실행 끝내기
		}
		User user = new User(id, name);
		repo.saveUser(user);
		System.out.println("### 신규 사용자 등록이 완료되었습니다.");
		System.out.println();
	}
	
	// 사용자 정보 삭제하기
	public void deleteUser(String id) {
		User savedUser = repo.getUserById(id);
		if (savedUser == null) {
			System.out.println("지정된 아이디의 사용자가 존재하지 않습니다.");
			return;
		}
		repo.removeUser(id);
		System.out.println("### [" +  id +"] 아이디 사용자가 삭제 되었습니다.");
	}
	
	// 사용자 정보 조회하기
	public User findUser(String id) {
		User savedUser = repo.getUserById(id);
		
		return savedUser;
	}
	
	// 사용자 정보 변경하기
	public void modifyUserInfo(User user) {
		User savedUser = repo.getUserById(user.getId());
		if (savedUser == null) {
			System.out.println("지정된 아이디의 사용자가 존재하지 않습니다.");
			return;
		}
		repo.updateUser(user);
		System.out.println("### [ " + user.getId() + "] 아이디 사용자의 정보가 변경되었습니다.");
	}
}
