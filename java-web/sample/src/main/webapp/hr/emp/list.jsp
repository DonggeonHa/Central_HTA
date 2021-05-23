<%@page import="com.sample.hr.vo.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.sample.hr.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>인사관리 :: 사원관리</title>
	</head>
	<body>
		<h1>사원 목록 페이지</h1>
		
		<h3>전체 사원 목록</h3>
		<%
			request.setCharacterEncoding("UTF-8");
			EmployeeDao employeeDao = new EmployeeDao();
			List<Employee> employees = employeeDao.getAllEmployees();
		%>
		<ul>
		<%
			for (Employee emp : employees) {
		%>
			<li><a href="detail.jsp?empId=<%=emp.getId()%>"><%=emp.getFirstName()%> <%=emp.getLastName()%></a></li>
		<%
			}
		%>
		</ul>
		
		<p><a href="main.jsp">사원 메인페이지로 이동</a></p>
	</body>
</html>