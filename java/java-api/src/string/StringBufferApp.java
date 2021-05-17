package string;

public class StringBufferApp {

	public static void main(String[] args) {
		String name1 = "김유신";
		String name2 = "강감찬";
		String name3 = "이순신";
		
		StringBuffer sb = new StringBuffer();
		sb.append(name1)
			.append(",")
			.append(name2)
			.append(",")
			.append(name3);
		
		String text = sb.toString();
		System.out.println(text);
	}
}
