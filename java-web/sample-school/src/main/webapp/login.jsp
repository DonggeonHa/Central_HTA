<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	/*
		체크된 유저타입에 따라서 학생 혹은 교수로 구분해서 로그인처리를 수행한다.
		
		1. 요청파라미터를 조회한다.
		2. 유저타입이 student인지, professor인지 구분해서 
		   student인 경우 StudentDao로 학생정보를 조회해서 로그인처리를 수행한다.
		   professor인 경우 ProfessorDao로 교수정보를 조회해서 로그인처리를 수행한다.
		   - 학생정보나 교수정보가 존재하지 않으면 입력폼에 에러 메세지를 표시한다.
		   - 비밀번호가 일치하지 않으면 입력폼에 에러 메세지를 표시한다.
		3. 인증이 완료되면 세션객체에 
			LoginUser객체를 생성해서 교수나 학생의 정보를 저장하고, 
			세션객체에 "LOGINED_USER"라는 속성명으로 LoginUser객체를 저장한다.
		4. 홈페이지를 재요청하는 URL을 응답으로 보낸다.
	*/
	
	response.sendRedirect("/sample-school/index.jsp");
%>