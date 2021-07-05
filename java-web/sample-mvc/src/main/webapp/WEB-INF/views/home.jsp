<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" >
	<title>홈</title>
</head>
<body>
<div class="container mt-3 mb-5">
	<header>
		<c:set var="currentPage" value="home" />
		<%@ include file="common/header.jsp" %>
	</header>
	<main>
		<div class="row">
			<div class="col">
				<div class="border bg-light p-3">
					<h1>샘플 애플리케이션</h1>
					<p class="border-bottom pb-3">MVC 패턴을 적용해서 구현한 샘플 애플리케이션이다.</p>
					<p class="mb-0">회원가입, 로그인, 게시글 조회/등록/수정/삭제, 댓글/조회/등록 기능 제공</p>
				</div>
			</div>
		</div>
	</main>
	<footer></footer>
</div>    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>