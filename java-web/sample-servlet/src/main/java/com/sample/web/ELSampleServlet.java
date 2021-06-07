package com.sample.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.sample.vo.Score;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/el")
public class ELSampleServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청객체에 기본자료형 혹은 문자열을 속성으로 저장하기
		request.setAttribute("title", "2021년 시험성적 결과");
		
		// 요청객체에 객체를 속성으로 저장하기
		Score score = new Score("길동", "홍", 70, 80, 80);
		request.setAttribute("score", score);
		
		// 요청객체에 Map 객체를 속성으로 저장하기
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("deptNo", 100);
		map.put("deptName", "영업팀");
		map.put("deptAddr", "서울시종로구");
		map.put("deptManagerName", "홍길동");
		request.setAttribute("deptInfo", map);
		
		// ArrayList에 Score객체를 2개 저장해서 요청객체릐 속성으로 저장하기
		ArrayList<Score> scores = new ArrayList<Score>();
		scores.add(new Score("길동", "홍", 70, 80, 80));
		scores.add(new Score("유신", "김", 100, 80, 100));
		request.setAttribute("scoreList", scores);
		
		
		// EL의 연산자  연습하기
		request.setAttribute("username", null);				// null
		request.setAttribute("userpassword", "");			// 빈문자열
		request.setAttribute("members", new String[] {});	// 길이가 0인배열
		request.setAttribute("teams", new ArrayList());		// 아무것도 저장되어있지않은 List
		request.setAttribute("colors", new String[] {"파랑", "노랑"});
		
		// el/view.jsp로 내부이동하기
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/el/view.jsp");
		requestDispatcher.forward(request, response);
		
	}
}
