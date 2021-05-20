<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<h1>POST 방식으로 전달된 요청파라미터값 조회하기</h1>
		
		<h3>사용자정보 입력폼에 입력해서 제출한 값 조회하기</h3>
		<%
			// 한글이 깨지지 않도록 요청객체의 문자인코딩방식을 UTF-8방식으로 설정한다.
			request.setCharacterEncoding("UTF-8");
		
			String name = request.getParameter("username");
			String id = request.getParameter("userid");
			String password = request.getParameter("userpassword");
			String gender = request.getParameter("gender");
			String[] skills = request.getParameterValues("skill");
			
			String year = request.getParameter("year");
		%>
		<dl>
			<dt>이름</dt><dd><%= name%></dd>
			<dt>아이디</dt><dd><%= id%></dd>
			<dt>비밀번호</dt><dd><%=password %></dd>
			<dt>성별</dt><dd><%= gender%></dd>
			<dt>보유기술</dt>
			<% 
			for(String skill : skills) {
			%>
				<dd><%= skill%></dd>
			<%
				}
			%>
			<dt>경력</dt><dd><%=year %></dd>
		</dl>
		
		<p><a href="main.jsp">메인페이지로 돌아가기</a></p>
	</body>
</html>