package day5;

public class Facebook implements SNS {

	@Override
	public void post(String title, String writer, String content) {
		System.out.println("### Facebook에 포스팅");
		System.out.println("-----------------------------------------");
		System.out.println("제목 : " + title);
		System.out.println("작성자 : " + writer);
		System.out.println("내용 : " +  content);
		System.out.println("-----------------------------------------");		
	}
}
