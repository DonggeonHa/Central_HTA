
public class IfDemo2 {

	public static void main(String[] args) {
		/*
		 * 91점 이상이면 "A", 81점 이상이면 "B", 71점 이상이면 "C", 
		 * 61점 이상이면 "D", 60점 이하는 "F"를 출력한다.
		 */
		
		int score = 81;
		String grade;
		
		// if ~ else if ~ else if ~ else 문을 사용하면
		// 다양한 조건을 제시해야하는 조건문을 작성할 수 있다.
		if (score >= 91 ) {
			grade = "A";
		} else if(score >= 81) {
			grade = "B";
		} else if(score >= 71) {
			grade = "C";
		} else if(score >= 61) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("학점 : " + grade);
	}

}
