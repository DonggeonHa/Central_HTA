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
%>
<div class="container">
	<%@ include file="../common/header.jsp" %>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<h4>교수 정보 등록</h4>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<form method="post" action="login.jps">
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
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
							</select>
						</div>
						<div class="mb-3">
							<label class="form-label">직위</label>
							<select class="form-control" name="position">
								<option value="정교수"> 정교수</option>
								<option value="부교수"> 부교수</option>
								<option value="조교수"> 조교수</option>
							</select>
						</div>
						<div class="mb-1 text-end">
							<a href="/sample-school/index.jsp" class="btn btn-outline-primary">취소</a>
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