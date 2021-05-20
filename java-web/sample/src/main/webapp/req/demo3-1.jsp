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
		<p>
			클라이언트가 전달한 요청파라미터값을 조회할 때는
				- 요청객체가 제공하는 String getParameter("파라미터명")
				- 요청객체가 제공하는 STring[] get PArameterValues("파라미터명")	
		</p>
		
		<h3>요청 파라미터값 조회하기</h3>
		<%
			// id라는 이름으로 전달되는 요청파라미터 값 조회하기
			String value = request.getParameter("id");
		%>
		<p>요청파라미터 명: <%="id" %></p>
		<p>요청파라미터 값: <%=value %></p>
		
		<p><a href="main.jsp">메인페이지로 돌아가기</a></p>
	</body>
</html>