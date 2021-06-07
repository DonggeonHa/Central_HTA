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
<div class="container">
	<%@ include file="common/header.jsp" %>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<h4>로그인</h4>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-6">
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
						<div class="mb-3 form-check">
							<div class="form-check form-check-inline">
  								<input class="form-check-input" type="radio" name="usertype" id="inlineRadio1" value="student" checked>
  								<label class="form-check-label" for="inlineRadio1">학생</label>
							</div>
							<div class="form-check form-check-inline">
							  	<input class="form-check-input" type="radio" name="usertype" id="inlineRadio2" value="professor">
							  	<label class="form-check-label" for="inlineRadio2">교수</label>
							</div>
						</div>
						<div class="mb-1 text-end">
							<a href="/sample-school/index.jsp" class="btn btn-outline-primary">취소</a>
							<button type="submit" class="btn btn-primary">로그인</button>
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