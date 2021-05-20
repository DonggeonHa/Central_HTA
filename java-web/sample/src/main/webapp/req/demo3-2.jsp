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
			String category = request.getParameter("category");
			// no라는 이름으로 서버로 전송된 요청파라미터값 조회하기
			String no = request.getParameter("no");
		%>
		<p>카테고리 <%= category %></p>
		<p>번호 <%= no %></p>
		
		<p><a href="main.jsp">메인페이지로 돌아가기</a></p>
	</body>
</html>