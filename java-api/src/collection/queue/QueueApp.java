package collection.queue;

import java.util.LinkedList;

public class QueueApp {

	public static void main(String[] args) {
		// LinkedList 는 List<E>와 Queue<E>의 구현 클래스다
		LinkedList<String> queue = new LinkedList<String>();
		
		System.out.println("### Queue구현객체에 값 저장하기");
		queue.offer("보고서 표지 인쇄");
		queue.offer("1학기 수업계획서");
		queue.offer("1학기 컴퓨터개론 학습자료");
		queue.offer("1학기 중간고사 문제지");
		
		System.out.println("### Queue구현객체에서 값 꺼내기");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
