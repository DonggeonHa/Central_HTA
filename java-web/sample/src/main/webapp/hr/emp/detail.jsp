<%@page import="com.sample.hr.dto.EmployeeDto"%>
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
			// 사원상세 정보 조회하기
			/*
				1. com.sample.hr.dto패키지에 EmployeeDto.java를 정의한다.
					사원아이디, 이름, 전화번호, 이메일, 직종아이디, 입사일, 급여, 커미션,
					소속부서아이디, 소속부서명, 매니저 아이디, 매니저이름을 저장하는 필드를 정의하고,
					getter/setter를 정의한다.
				2. com.sample.hr.dao.EmployeeDao에 사원기본정보를 반환하는
					public EmployeeDto getEmployeeDtoById(int employeeId) {
			
					}를 정의한다.
				3. com.sample.hr.dao.employeeDao에 해당 사원의 부하직원목록을 반환하는 
					public List<Employee> getEmployeesByManagerId(int employeeId) {
						
					}를 정의한다.
				4. emp/detail.jsp에서는 emp/list.jsp에서 전달한 요청파라미터값을 조회한다.
					emp/detail.jsp?id=100과 같은 형식으로 요청이 온다.
				5. emp/detail.jsp에서 com.sample.hr.dao.EmployeeDao객체를 생성한다.
				6. emp/detail.jsp에서 EmployeeDao의 getEmployeeDtoById(사원아이디)를 실행해서
				   	사원기본정보를 조회한다.
				7. emp/detail.jsp에서 EmployeeDao의 getEmployeesByManagerId(사원아이디)를 실행해서
					해당 사원의 부하직원목록을 조회한다.
				9. 6번과 7번에서 조회된 정보를 사원기본정보 테이블과 부하직원 테이블에 표시한다.
			*/
			request.setCharacterEncoding("UTF-8");
			int empId = Integer.parseInt(request.getParameter("empId"));
			
			EmployeeDao employeeDao = new EmployeeDao();
			EmployeeDto employeeDto = employeeDao.getEmployeeDtoById(empId);
			
			List<Employee> employees = employeeDao.getEmployeesByManagerId(empId);
			
		%>
		<div class="container">
			<div class="row">
				<div class="col-12">
					<h1>사원 상세 정보</h1>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<h3>사원 기본 정보</h3>
					<table class="table table-bordered">
						<tr>
							<th>아이디</th><td><%=empId %></td>
							<th>이름</th><td><%=employeeDto.getEmployeeName()%></td>
						</tr>
						<tr>
							<th>전화번호</th><td><%=employeeDto.getPhoneNumber() %></td>
							<th>이메일</th><td><%=employeeDto.getEmail() %></td>
						</tr>
						<tr>
							<th>직종아이디</th><td><%=employeeDto.getJobId() %></td>
							<th>입사일</th><td><%=employeeDto.getHireDate() %></td>
						</tr>
						<tr>
							<th>급여</th><td><%=employeeDto.getSalary() %>$</td>
							<th>커미션</th><td><%=employeeDto.getCommissionPct() == 0 ? "없음" : employeeDto.getCommissionPct()%></td>
						</tr>
						<tr>
							<th>소속부서</th><td><%=employeeDto.getDepartmentId()%></td>
							<th>소속부서명</th><td><%=employeeDto.getDepartmentName()%></td>
						</tr>
					</table>
				</div>
				
				<h3>부하 직원 목록</h3>
				<table class="table table-bordered table-striped table-sm">
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
						if (employees.isEmpty()) {
					%>
							<tr>
								<td colspan="4" class="text-center">부하직원이 존재하지 않습니다.</td>
							</tr>
					<%
						} else {
							for (Employee emp : employees) {
						
					%>
								<tr>
									<td><%=emp.getId() %></td>
									<td><a href="detail.jsp?empId=<%=emp.getId()%>"><%=emp.getFirstName()%> <%=emp.getLastName()%></a></td>
									<td><%=emp.getEmail()%></td>
									<td><%=emp.getPhoneNumber()%></td>
								</tr>
					<%
							}
						}
					%>
					</tbody>
				</table>
			</div>
		</div>
		<p><a href="list.jsp">사원 목록페이지로 되돌아가기</a></p>
	</body>
</html>