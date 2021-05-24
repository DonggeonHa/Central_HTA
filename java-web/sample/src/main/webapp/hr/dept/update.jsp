<%@page import="com.sample.hr.dao.DepartmentDao"%>
<%@page import="com.sample.hr.vo.Department"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	// 요청파라미터값 조회하기 <-- 수정폼에서 입력하거나 선택한 값
	int deptId = Integer.parseInt(request.getParameter("deptId"));
	String deptName = request.getParameter("deptName");
	int managerId = Integer.parseInt(request.getParameter("managerId"));
	int locationId = Integer.parseInt(request.getParameter("locationId"));
	
	System.out.println("수정할 부서아이디 : " + deptId);
	System.out.println("수정할 부서이름 : "  + deptName);
	System.out.println("수정할 부서의 관리자 : "  + managerId);
	System.out.println("수정할 부서 주소지 : "  + locationId);
	
	// 변경된 부서정보를 Department객체에 담는다
	Department department = new Department();
	department.setId(deptId);
	department.setName(deptName);
	department.setManagerId(managerId);
	department.setLocationId(locationId);

	// DEPARTMENTS 테이블에 대한 CRUD작업을 지원하느 ㄴDepartmentDao 객체 생성하기
	DepartmentDao deptDao = new DepartmentDao();
	deptDao.updateDepartment(department);
	
	// 브라우저에게 재요청할 URL을 응답으로 보낸다.
	response.sendRedirect("list.jsp");
	

%>