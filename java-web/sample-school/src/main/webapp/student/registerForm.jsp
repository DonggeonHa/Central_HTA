<%@page import="com.sample.school.dao.DepartmentDao"%>
<%@page import="com.sample.school.vo.Department"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" >
	<title>학사관리 시스템</title>
</head>
<body>
<%
	/*
		모든 학과정보를 조회해서 입력폼의 select박스에 option을 추가한다
	*/
	DepartmentDao departmentdao = DepartmentDao.getInstance();
	List<Department> departments = departmentdao.getAllDepartments();
%>
<div class="container">
	<%@ include file="../common/header.jsp" %>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<h4>학생 정보 등록</h4>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<form method="post" action="../registerStudent">
						<div class="mb-3">
							<label class="form-label">아이디</label>
							<input type="text" class="form-control" name="userid" />
						</div>
						<div class="mb-3">
							<label class="form-label">비밀번호</label>
							<input type="password" class="form-control" name="password" />
						</div>
						<div class="mb-3">
							<label class="form-label">이름</label>
							<input type="text" class="form-control" name="name" />
						</div>
						<div class="mb-3">
							<label class="form-label">학과</label>
							<select class="form-control" name="departmentNo">
								<%
									for(Department department : departments) {
								%>
										<option value="<%=department.getNo()%>"><%=department.getName()%></option>
								<%
									}
								%>
							</select>
						</div>
						<div class="mb-3">
							<label class="form-label">학년</label>
							<select class="form-control" name="grade">
								<option value="1"> 1학년</option>
								<option value="2"> 2학년</option>
								<option value="3"> 3학년</option>
								<option value="4"> 4학년</option>
							</select>
						</div>
						<div class="mb-1 text-end">
							<a href="/index" class="btn btn-outline-primary">취소</a>
							<button type="submit" class="btn btn-primary">가입</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</main>
	<footer class="footer mt-auto py-3 bg-light">
  		<div class="container">
    		<span class="text-muted">중앙HTA 학원</span>
  		</div>
	</footer>
</div>    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>