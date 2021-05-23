<%@page import="com.sample.hr.vo.Department"%>
<%@page import="com.sample.hr.dao.DepartmentDao"%>
<%@page import="com.sample.hr.dto.EmployeeDto"%>
<%@page import="com.sample.hr.dao.JobDao"%>
<%@page import="com.sample.hr.vo.Job"%>
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
		<h1>새 사원 등록 페이지</h1>
		
		<%
			EmployeeDao employeeDao = new EmployeeDao();
			List<Employee> employees = employeeDao.getAllEmployees();
			
			JobDao jobDao = new JobDao();
			List<Job> jobs = jobDao.getAllJobs();
			
			DepartmentDao departmentDao = new DepartmentDao();
			List<Department> departments = departmentDao.getAllDepartments();
			
			EmployeeDto employeeDto = new EmployeeDto();
			List<EmployeeDto> dtos = employeeDao.getEmployeeDto();
		%>
		<h3>새 사원정보 등록폼</h3>
		<form method="POST" action="add.jsp">
			<label>사원 이름(FirstName/LastName)</label><br/>
			<input type="text" name="firstName"/> <input type="text" name="lastName" /><br/>
			<label>이메일</label><br/>
			<input type="text" name="email" /><br/>
			<label>전화번호</label><br/>
			<input type="text" name="phoneNumber" /><br/>
			<label>직종아이디</label><br/>
			<select name="jobId">
			<%
				for (Job job : jobs) {
			%>
				<option value="<%=job.getId()%>"><%=job.getJobTitle() %></option>
			<%
				}
			%>
			</select><br/>
			<label>연봉</label><br/>
			<input type="number" name="salary" /><br/>
			<label>커미션</label><br/>
			<input type="number" name="commissionPct" /><br/>
			<label>상사아이디</label><br/>
			<select name="managerId">
			<%
				for (EmployeeDto dto : dtos) {
			%>
				<option value="<%=dto.getManagerId()%>"><%=dto.getManagerName()%></option>
			<%
				}
			%>
			</select><br/>
			<label>부서</label><br/>
			<select name="departmentId">
			<%
				for (Department dept : departments) {
			%>
				<option value="<%=dept.getId()%>"><%=dept.getName()%></option>
			<%
				}
			%>
			</select><br/>
			<button type="submit">사원 등록</button>
		</form>
	</body>
</html>