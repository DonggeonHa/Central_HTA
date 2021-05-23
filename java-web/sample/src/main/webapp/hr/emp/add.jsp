<%@page import="com.sample.hr.dao.EmployeeDao"%>
<%@page import="com.sample.hr.vo.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	// 요청파라미터값 조회
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	String email = request.getParameter("email");
	String phoneNumber = request.getParameter("phoneNumber");
	String jobId = request.getParameter("jobId");
	Double salary = Double.parseDouble(request.getParameter("salary"));
	Double commissionPct = Double.parseDouble(request.getParameter("commissionPct"));
	int managerId = Integer.parseInt(request.getParameter("managerId"));
	int departmentId = Integer.parseInt(request.getParameter("departmentId"));
	
	// Employee객체를 생성해서 신규 사원정보 저장
	Employee employee = new Employee();
	employee.setFirstName(firstName);
	employee.setLastName(lastName);
	employee.setEmail(email);
	employee.setPhoneNumber(phoneNumber);
	employee.setJobId(jobId);
	employee.setSalary(salary);
	employee.setCommissionPct(commissionPct);
	employee.setManagerId(managerId);
	employee.setDepartmentId(departmentId);
	
	// EmployeeDao의 insertEmployee(Employee emp)을 실행시켜서 새 사원정보 등록
	EmployeeDao employeeDao = new EmployeeDao();
	employeeDao.insertEmployee(employee);
	
	// 브라우져가 다시 요청할 URL을 응답으로 보낸다
	response.sendRedirect("list.jsp");
%>