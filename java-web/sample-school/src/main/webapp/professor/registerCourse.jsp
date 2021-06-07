<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	/*
		신규 개설과정 정보를 저장한다.
		
		1. 세션에서 로그인된 사용자정보가 존재하지 않으면 로그인페이지로 이동시킨다.
		1. 입력폼으로 제출된 요청파라미터(신규 과정 정보)를 조회한다.
		2. Courses객체를 생성해서 신규과정정보를 저장한다.
		   (학과번호, 과정명, 과정타입, 강의장, 빌딩, 교수번호)
		3. 개설과정 현황페이지를 재요청하는 URL을 응답으로 보낸다.
	*/
	
	response.sendRedirect("/sample-school/professor/courses.jsp");
%>