<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	/*
		교수정보를 등록한다.
		
		1. 폼입력으로 제출된 요청파라미터값을 조회한다.
		2. 조회된 아이디로 교수정보가 존재하는지 조회한다. 교수정보가 존재하면 입력폼에 에러메세지를 표시한다.
		3. 비밀번호를 암호화한다.
		4. Professor객체를 생성해서 교수정보를 저장한다.
		5. ProfessorDao객체의 insertProfessor(교수정보)로 데이터베이스에 저장한다.
		6. 홈페이지를 재요청하는 URL을 응답으로 보낸다.
	*/
	
	response.sendRedirect("/sample-school/index.jsp");
%>