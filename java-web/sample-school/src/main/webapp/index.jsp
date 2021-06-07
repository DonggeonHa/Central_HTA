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
				<div class="border p-5 bg-light">
					<h1>학사관리 시스템</h1>
					<p>교수계정은 개설과정 등록, 과정별 수강신청자 현황조회, 성적입력 등이 가능합니다.</p>
					<p>학생계정은 개설과정 조회, 수강신청, 수강신청내역조회, 성적조회 등이 가능합니다.</p>
					<div>
						<a href="/sample_school/loginForm.jsp" class="btn btn-primary btn-lg">로그인</a>
					</div>
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