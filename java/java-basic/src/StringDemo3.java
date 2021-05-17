import java.util.Scanner;

public class StringDemo3 {
	public static void main(String[] args) {
		String[] names = {"김유신", "강감찬", "이순신","홍길동", "유관순"};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("조회할 이름을 입력하세요 : ");
		String value = sc.next();
		
		// 입력한 이름이 배열에 존재하는지
		boolean isExists = false;
		for (String x : names) {
			if (x.equals(value) ) {
				isExists = true;
				break;
			}
		}
		System.out.println("입력한 이름이 존재하는가? " + isExists);
		// 입력한 이름이 배열의 몇번째 칸에 저장되어 있는지 확인하기
		
		
	}
}
