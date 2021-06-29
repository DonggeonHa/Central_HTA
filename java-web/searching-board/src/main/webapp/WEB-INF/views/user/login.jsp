<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>검색기능이 있는 게시판</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
	<header class="my-3">
		<c:set var="menu" value="로그인"/>
		<%@ include file="../common/nav.jsp" %>
	</header>
	<main class="mb-5">
		<div class="row mb-2">
			<div class="col-12">
				<div class="border bg-light px-3 py-2">
					<strong>로그인</strong>
				</div>
			</div>
		</div>
		<c:choose>
			<c:when test="${param.fail eq 'invalid' }">
				<div class="row">
					<div class="col-12">
						<div class="alert alert-warning">
							<strong>로그인 실패</strong> 아이디 혹은 비밀번호가 일치하지 않습니다.
						</div>
					</div>
				</div>
			</c:when>
			<c:when test="${param.fail eq 'deny' }">
				<div class="row">
					<div class="col-12">
						<div class="alert alert-warning">
							<strong>서비스 거부</strong> [${param.job }]은 로그인 후 이용가능한 서비스입니다.
						</div>
					</div>
				</div>
			</c:when>
		</c:choose>
		<div class="row">
			<div class="col-6">
				<form class="border p-3 bg-light" method="post" action="login">
					<div class="form-group">
						<label>아이디</label>
						<input type="text" class="form-control" name="id">
					</div>
					<div class="form-group">
						<label>비밀번호</label>
						<input type="password" class="form-control" name="password">
					</div>
					<div class="text-right">
						<button type="submit" class="btn btn-primary">로그인</button>
					</div>
				</form>
			</div>
		</div>
	</main>
	</div>
</body>
</html>