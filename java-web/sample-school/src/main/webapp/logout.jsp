<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	/*
		세션을 폐기시켜서 로그아웃 시킨다.
		
		1. 세션을 무효화시킨다.
		2. 홈페이지를 재요청하는 URL을 응답으로 보낸다.
	*/
	
	response.sendRedirect("/sample-school/index.jsp");
%>