<%@page import="com.sample.hr.vo.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.sample.hr.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<title>인사관리 :: 사원관리</title>
	</head>
	<body>
		<%
			// 전체 사원리스트 조회해서 tbody에 표시하기
			/*
				1.com.sample.hr.vo 패키지에 Employee.java 클래스를 정의한다.
				2.com.sample.hr.dao 패키지에 EmployeeDao.java 클래스를 정의한다.
				3.com.sample.hr.dao 패키지에 EmployeeDao.java 클래스에
					public List<Employee> GetAllEmployees() throws SQLException {
							
					} 메소드를 구현한다
				4. emp/list.jsp에서 com.sample.hr.dao.EmployeeDao의 객체를 생성한다
				5. emp/list.jsp에서 com.sample.hr.dao.EmployeeDao의 getAllEmployees() 메소드를 실행해서 전체 사원리스트를 조회한다
				6. 조회된 사원리스트 정보를 <table> 태그의 tbody안에 표시한다.
		}
			*/
			request.setCharacterEncoding("UTF-8");
			EmployeeDao employeeDao = new EmployeeDao();
			List<Employee> employees = employeeDao.getAllEmployees();
		%>
		<div class="container">
			<div class="row">
				<div class="col-12">
					<h1>사원 목록 페이지</h1> <Br>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>아이디</th>
								<th>이름</th>
								<th>이메일</th>
								<th>전화번호</th>
							</tr>
						</thead>
						<tbody>
						<%
							for (Employee emp : employees) {
						%>
								<tr>
									<td><%=emp.getId()%></td>
									<td><a href="detail.jsp?empId=<%=emp.getId()%>"> <%=emp.getFirstName()%> <%=emp.getLastName()%></a></td>
									<td><%=emp.getEmail()%></td>
									<td><%=emp.getPhoneNumber()%></td>
								</tr>
						<%
							}
						%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<p><a href="main.jsp">사원 메인페이지로 이동</a></p>
	</body>
</html>