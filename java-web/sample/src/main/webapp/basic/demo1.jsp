<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> JSP 연습1 </h1>
	
	<%
		List<String> names = new ArrayList<String>();
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("류관순");
		names.add("안창호");
		names.add("안중근");
		names.add("이봉창");
		names.add("윤봉길");
	%>
	
	<h3>사원 리스트</h3>
	<ul>
	<%
		for (String name : names) {
	%>
		<li><%=name %></li>
	<%
		}
	%>	
	</ul>
</body>
</html>