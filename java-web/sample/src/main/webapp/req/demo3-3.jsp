<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>클라이언트가 전달한 요청파라미터값 조회하기</title>
	</head>
	<body>
		<h1>요청파라미터값 조회하기</h1>
		
		<h3>요청 파라미터값 조회하기</h3>
		<%
			// category라는 이름으로 서버로 전송된 요청파라미터값 조회하기
			String opt = request.getParameter("opt");
			// no라는 이름으로 서버로 전송된 요청파라미터값 조회하기
			String keyword = request.getParameter("keyword");
			String order = request.getParameter("order");
			String rows = request.getParameter("rows");
		%>
		<p>검색옵션 <%= opt %></p>
		<p>검색어 <%= keyword %></p>
		<p>정렬순서 <%= order %></p>
		<p>목록갯수 <%= rows %></p>
		
		<p><a href="main.jsp">메인페이지로 돌아가기</a></p>
	</body>
</html>