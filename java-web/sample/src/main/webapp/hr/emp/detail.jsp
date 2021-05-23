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
		<h1>사원 상세 정보 페이지</h1>
		<p>사원의 기본정보를 표시한다</p>
		
		<%
			request.setCharacterEncoding("UTF-8");
			int empId = Integer.parseInt(request.getParameter("empId"));
			
			EmployeeDao employeeDao = new EmployeeDao();
			Employee employee = employeeDao.getEmployee(empId);
		%>
		
		<h3>사원 기본 정보</h3>
		<dl>
			<dt>사원아이디</dt><dd><%=empId %></dd>
			<dt>사원이름</dt><dd><%=employee.getFirstName()%> <%=employee.getLastName()%></dd>
			<dt>이메일</dt><dd><%=employee.getEmail() %></dd>
			<dt>전화번호</dt><dd><%=employee.getPhoneNumber() %></dd>
			<dt>입사일</dt><dd><%=employee.getHireDate() %></dd>
			<dt>직업아이디</dt><dd><%=employee.getJobId() %></dd>
			<dt>연봉</dt><dd><%=employee.getSalary() %></dd>
			<dt>커미션</dt><dd><%=employee.getCommissionPct() == 0 ? "없음" : employee.getCommissionPct()%></dd>
			<dt>상사아이디</dt><dd><%=employee.getManagerId() == 0 ? "없음" : employee.getManagerId()%></dd>
			<dt>부서아이디</dt><dd><%=employee.getDepartmentId() %></dd>
		</dl>
		
		<p><a href="list.jsp">사원 목록페이지로 되돌아가기</a></p>
	</body>
</html>