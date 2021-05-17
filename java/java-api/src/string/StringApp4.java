package string;

public class StringApp4 {
	/*
	 	1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
		     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	 */
	
	public static void main(String[] args) {
		String src = "...!@BaT#*..y.abcdefghijklm";
		
		// 1단계, 대문자를 소문자로 변경
		src = src.toLowerCase();
		System.out.println("1단계 : " + src);
		
		// 2단계, 특수문자 제거
		// [^]는 부정의 의미
		// [a-z] 소문자 전부 [0-9] 숫자 전부
		// [^a-z0-9-_.]영어 소문자, 숫자, -, _, . 아닌것
		src = src.replaceAll("[^a-z0-9-_.]", "");
		System.out.println("2단계 : " + src);
		
		// 3단계, 마침표가 2개 이상이면 하나로
		// [.] 점
		// {min, max} min 최소 등장횟수, max 최대등장횟수
		// [.]{2,} 점이 2개 이상인것
		src = src.replaceAll("[.]{2,}", ".");
		System.out.println("3단계 : " + src);
		
		// 4단계, 마침표가 처음이나 끝에 있으면 제거하시오.
		// ^[.] 시작문자가 점인것
		src = src.replaceAll("^[.]", "");
		// [.]$ 끝문자가 점인것
		src = src.replaceAll("[.]$", "");
		System.out.println("4단계 : " + src);
		
		// 5단계, 빈문자열이 있으면 a를
		if (src.isEmpty()) {
			src = "a";
		}
		System.out.println("5단계 : " + src);
		
		// 6단계, 길이가 16이상이면, 15개를 제외한 나머지를 제거한다.
		if (src.length() >= 16) {
			src = src.substring(0, 15);
		}
		System.out.println("6단계 : " + src);
		
		// 7단계, 길이가 2이하면 맨마지막글자를 길이가 3이 될때까지 채운다
		if (src.length() <= 2) {
			// ab
			String lastChar = String.valueOf(src.charAt(src.length()-1));
			if (src.length() == 1) {
				src = src + lastChar + lastChar;
			}
			src += lastChar;
		}
		System.out.println("7단계 : " + src);
		
		
		/*
			1단계 대문자 'B'와 'T'가 소문자 'b'와 't'로 바뀌었습니다.
			"...!@BaT#*..y.abcdefghijklm" → "...!@bat#*..y.abcdefghijklm"
			
			2단계 '!', '@', '#', '*' 문자가 제거되었습니다.
			"...!@bat#*..y.abcdefghijklm" → "...bat..y.abcdefghijklm"
			
			3단계 '...'와 '..' 가 '.'로 바뀌었습니다.
			"...bat..y.abcdefghijklm" → ".bat.y.abcdefghijklm"
			
			4단계 아이디의 처음에 위치한 '.'가 제거되었습니다.
			".bat.y.abcdefghijklm" → "bat.y.abcdefghijklm"
			
			5단계 아이디가 빈 문자열이 아니므로 변화가 없습니다.
			"bat.y.abcdefghijklm" → "bat.y.abcdefghijklm"
			
			6단계 아이디의 길이가 16자 이상이므로, 처음 15자를 제외한 나머지 문자들이 제거되었습니다.
			"bat.y.abcdefghijklm" → "bat.y.abcdefghi"
			
			7단계 아이디의 길이가 2자 이하가 아니므로 변화가 없습니다.
			"bat.y.abcdefghi" → "bat.y.abcdefghi"
			
			따라서 신규 유저가 입력한 new_id가 "...!@BaT#*..y.abcdefghijklm"일 때, 네오의 프로그램이 추천하는 새로운 아이디는 "bat.y.abcdefghi" 입니다.
		 */
		
	}
}
