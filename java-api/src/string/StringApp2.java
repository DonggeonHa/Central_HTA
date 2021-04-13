package string;

import java.util.Arrays;

public class StringApp2 {

	public static void main(String[] args) {
		String str1=  "qazwsxedcrfv";
		
		// int length()
		// 문자열의 길이를 반환한다.
		int len = str1.length();
		System.out.println("문자열의 길이 : " + len);
		
		// boolean isEmpty();
		// 빈문자열인지 여부를 반환한다.
		// "" <-- 빈 문자열이다.
		boolean b1 = str1.isEmpty();
		System.out.println("빈 문자열인가? " + b1);
		
		// boolean contains(CharSequence s)
		// 지정된 문자열을 포함하고 있는지 여부를 반환한다.
		String str2 = "This is my home";
		boolean b2 = str2.contains("my");
		System.out.println("str2가 참조하는 문자열에 \"my\"가 포함되어 있는가?" + b2);
		
		// int indexOf(String str)
		// 지정된 문자열이 처음으로 등장하는 위치를 반환한다.
		// int lastIndexOf(String str)
		// 지정된 문자열이 맨 마지막으로 등장하는 위치를 반환한다.
		String str3 = "my car is red car";
		int index1 = str3.indexOf("car");
		int index2 = str3.lastIndexOf("car");
		System.out.println("첫번째 등장위치 : " + index1);
		System.out.println("마지막번째 등장위치 : " + index2);
		
		// String substring(int beginIndex)_
		// 지정된 위치에서 문자열의 끝에 해당하는 글자로 구성된 문자열을 반환한다.
		// String substring(int beginIndex, int endIndex)
		// 지정된 시작위치에서 지정된 끝 위치 앞까지 해당하는 글자로 구성된 문자열을 반환한다.
		String str4 = "Abcdefghijk";
		String str5 = str4.substring(3);
		String str6 = str4.substring(3, 7);
		System.out.println("3번쨰부터 끝까지 : " + str5);
		System.out.println("3번째부터 7번째 앞까지: " + str6);
		
		// String replace(CharSequence target, CharSequence replacement)
		// 문자열에서 target에 해당되는 문자열을 찾아서 replacement에 지정된 문자열로 변경한
		// 새로운 문자열을 반환한다.
		
		String str7 = "my car is red car";
		String str8 = str7.replace("car", "house");
		System.out.println("변경전 문자열 : " + str7);
		System.out.println("변경후 문자열 : " + str7);
		System.out.println("획득한 문자열 : " + str8);
		
		// String toLowerCase(), String toUpperCase()
		// 해당 문자열을 소문자, 대문자로 바뀐 새로운 문자열을 반환한다.
		String str9 = str7.toLowerCase();
		String str10 = str7.toUpperCase();
		System.out.println("변경전 문자열 : " + str7);
		System.out.println("변경후 문자열 : " + str7);
		System.out.println("소문자로 구성된 문자열 : " + str9);
		System.out.println("대문자로 구성된 문자열 : " + str10);
		
		// boolean starsWith(String prefix), boolean endsWith(String suffix)
		// 해당문자열이 prefix에서 지정한 내용으로 시작하는지,
		// 해당문자열이 suffix에서 지정한 내용으로 끝나는지 여부를 반환한다.
		String str11 = "http://www.daum.net/";
		boolean b3 = str11.startsWith("http");
		System.out.println("문자열이 http로 시작하는가? " + b3);
		
		// String[] split(String exp)
		// 문자열을 exp에서 지정한 표현식 혹은 구분자로 잘라서 각각의 요소를 배열에 담아서 반환한다.
		String str12 = "사과, 배, 바나나, 딸기, 망고, 파인애플";
		String[] arr1 = str12.split(",");
		// System.out.println(Arrays.toString(arr1));
		for (String item : arr1) {
			System.out.println(item);
		}
		
		// String trim()
		// 문자열에서 빈줄필요한 좌우 공백이 제거된 새로운 문자열을 반환한다.
		String str13 = "               안녕                              안녕";
		
	}
}
