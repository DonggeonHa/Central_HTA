package day4;

public class UserManagerApp {

	public static void main(String[] args) {
		// UserRepository의 구현객체 생성하기
		UserArrayRepository arrayRepo = new UserArrayRepository();
				
		
		// UserManager객체 생성
		UserManager userManager = new UserManager();
		// Setter 메소드를 이용해서 UserRepository구현 객체를 UserManager의 repo변수에 전달하기
		userManager.setRepo(arrayRepo);
		
		System.out.println("### 아이디로 사용자 조회하기");
		User user1 = userManager.findUser("lee");
		
		if ( user1 != null) {
			System.out.println(user1.getId() + ", " + user1.getName());
		} else {
			System.out.println("사용자가 존재하지 않습니다");
		}
		
		System.out.println("## 신규 사용자 등록하기");
		userManager.addNewUser("park", "박혁거세");
		
		System.out.println("### 아이디로 사용자 조회하기");
		User user2 = userManager.findUser("park");
		System.out.println(user2.getId() + ", " + user2.getName());
		
		System.out.println("### 등록된 사용자 삭제하기");
		userManager.deleteUser("hong");
		userManager.deleteUser("hong");
		
		User user3 = userManager.findUser("lee");
		System.out.println(user3.getId() + ", " + user3.getName());
		User user4 = userManager.findUser("kim");
		System.out.println(user4.getId() + ", " + user4.getName());
		
		// UserManager객체 생성, 생성자 메소드를 이용해서 UserRepository구현객체를 UserManager의
		// repo 변수에 전달하기
		// UserManager userManager2 = new UserManager(arrayRepo);
	}
}
