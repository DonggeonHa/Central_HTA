package day5.inner.example;

public class StudentRepo implements Repo {

	private Student[] students = new Student[5];
	
	public StudentRepo() {
		students[0] = new Student("홍길동", 50, 100, 60);
		students[1] = new Student("김유신", 100, 70, 80);
		students[2] = new Student("강감찬", 90, 40, 70);
		students[3] = new Student("이순신", 80, 90, 90);
		students[4] = new Student("류관순", 70, 100, 60);
	}
	
	public Stats getStats() {
		return new StudentStats();
	}

	// 인스턴스 내부 클래스
	// 학생들의 성적을 기반으로 총합과 평균을 제공하는 Stats 인터페이스 구현 클래스
	private class StudentStats implements Stats {

		@Override
		public int total() {
			int totalScore = 0;
			
			for (Student student : students) {
				totalScore += student.getKor();
				totalScore += student.getEng();
				totalScore += student.getMath();
			}
			
			return totalScore;
		}

		@Override
		public int average() {
			int totalScore = this.total();
			int average = totalScore / (3 * students.length);
			
			return average;
		}
		
	}
}
