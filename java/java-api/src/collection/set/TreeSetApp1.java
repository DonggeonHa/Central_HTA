package collection.set;

import java.util.TreeSet;

public class TreeSetApp1 {

	public static void main(String[] args) {
		TreeSet<Score> scores = new TreeSet<Score>();
		
		scores.add(new Score("김유신", 100, 80, 50));
		scores.add(new Score("강감찬", 60, 60, 50));
		scores.add(new Score("이순신", 100, 100, 90));
		scores.add(new Score("유관순", 60, 80, 60));
		scores.add(new Score("안중근", 85, 80, 70));
		
		System.out.println("### 성적순으로 출력하기");
		for (Score score : scores) {
			System.out.println("총점 : " + score.getTotal());
			System.out.println("이름 : " + score.getName());
			System.out.println("국어 : " + score.getKor());
			System.out.println("영어 : " + score.getEng());
			System.out.println("수학 : " + score.getMath());
			System.out.println();
		}
	}
}
