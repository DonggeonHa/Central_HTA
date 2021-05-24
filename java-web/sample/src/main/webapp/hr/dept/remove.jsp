<%@page import="com.sample.hr.dao.DepartmentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%
	// 요청객체에서 요청파라미터로 전달
	int departmentId = Integer.parseInt(request.getParameter("deptId"));

	// DEPARTMENTS 테이블에 대한 CRUD기능을 제공하는 dEpartmentDao 객체 생성
	DepartmentDao deptDao = new DepartmentDao();
	// DepartmentDao의 deleteDepartment(부서아이디)를 실행해서 해당 부서정보 삭제
	deptDao.deleteDepartment(departmentId);
	
	// 브라우저에게 재요청 URL을 응답으로 보낸다
	response.sendRedirect("list.jsp");
%>