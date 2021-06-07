<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	/*
		요청파라미터로 조회된 과정에 대한 수강신청을 철회한다.
		
		1. 세션에서 로그인된 사용자 정보를 조회한다.
		2. 로그인된 사용자가 존재하지 않으면 로그인페이지로 보낸다.
		2. 요청파라미터값을 조회한다.
		3. 로그인된 아이디를 조회한다.
		4. 과정번호로 과정등록정보를 조회한다.
		5. 과정등록정보의 status를 취소로 변경한다.
		6. RegistrationDao의 updateRegistration(과정등록정보)를 실행해서 데이터베이스에 반영한다.
		7. myList.jsp를 재요청하는 URL을 응답으로 보낸다.
	*/
	
	response.sendRedirect("/sample-school/student/myList.jsp");
%>