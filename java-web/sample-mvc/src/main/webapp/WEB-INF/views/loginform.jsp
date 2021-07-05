<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" >
	<title>로그인</title>
</head>
<body>
<div class="container mt-3 mb-5">
	<header>
		<c:set var="currentPage" value="login"/>
		<%@ include file="common/header.jsp" %>
	</header>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border bg-light p-2">
					<span class="fw-bold">로그인</span>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-6">
				<c:if test="${not empty errorType and not empty errorMessage }">
					<div class="alert alert-warning">
						<strong>${errorType }</strong> ${errorMessage }
					</div>
				</c:if>
				<div class="border bg-light p-2">
					<form id="form-login" method="post" action="/sample-mvc/login">
						<div class="mb-3">
							<label class="form-label">아이디</label>
							<input type="text" class="form-control" name="id" id="user-id">
						</div>
						<div class="mb-3">
							<label class="form-label">비밀번호</label>
							<input type="password" class="form-control" name="password" id="user-pwd">
						</div>
						<div class="text-end">
							<a href="register" class="btn btn-outline-primary">회원가입</a>
							<button type="submit" class="btn btn-primary">로그인</button>
						</div>
					</form>
				</div>
			</div>
			<div class="col-6">
				<div class="alert alert-success" role="alert">
					<h4 class="alert-heading">로그인하기</h4>
					<p>게시글 작성, 좋아요, 댓글 작성을 하기위해서는 먼저 로그인해주세요</p>
					<hr>
					<p class="mb-0">회원가입을 하지 않았다면, 먼저 회원가입을 해주세요</p>
				</div>
			</div>
		</div>
		<!-- 모달창 -->
		<div id="modal-login-error" class="modal" tabindex="-1">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">필수 입력값 누락</h5>
						<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
					</div>
					<div class="modal-body">
						<p>아이디와 비밀번호는 필수입력값입니다.</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
					</div>
				</div>
			</div>
		</div>
	</main>
</div>    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
$(function() {
	
	var loginErrorModal = new bootstrap.Modal(document.getElementById('modal-login-error'))
	
	$("#form-login").submit(function() {
		if (!$.trim($("#user-id").val())) {
			loginErrorModal.show();
			return false;
		}
		if (!$.trim($("#user-pwd").val())) {
			loginErrorModal.show();
			return false;
		}
		return true;
	});
})
</script>
</body>
</html>