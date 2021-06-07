<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	/*
		요청파라미터에서 과정번호를 조회해서 그 과정을 등록한다.
		
		1. 세션에서 로그인된 학생회원정보를 조회한다.
		2. 로그인된 정보가 존재하지 않으면 로그인 페이지로 보낸다.
		3. 요청파라미터에서 과정번호를 조회한다.
		4. 과정번호에 해당하는 과정정보를 조회한다.
		5. Registration객체를 생성해서 과정번호, 개설년도, 개설학기, 학생번호을 저장한다.
		   * 개설년도와 개설학기는 4번에서 조회된 과정정보에서 가져온다.
		6. Registration의 insertRegistraion(과정등록정보)를 실행해서 저자안다.
		7. myList.jsp를 재요청하는 URL을 응답으로 보낸다.;
	*/
	
	response.sendRedirect("/sample-school/student/myList.jsp");
%>