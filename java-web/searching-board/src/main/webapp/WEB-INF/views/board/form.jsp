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
		<c:set var="menu" value="게시판"/>
		<%@ include file="../common/nav.jsp" %>
	</header>
	<main class="mb-3">
		<div class="row mb-2">
			<div class="col-12">
				<div class="border bg-light px-3 py-2">
					<strong>게시글 쓰기</strong>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-12">
				<form class="border bg-light px-3 py-2" method="post" action="register">
					<div class="form-group">
						<label>제목</label>
						<input type="text" class="form-control" name="title">
					</div>
					<div class="form-group">
						<label>내용</label>
						<textarea rows="5" class="form-control" name="content"></textarea>
					</div>
					<div class="text-right">
						<a href="list" class="btn btn-secondary">취소</a>
						<button type="submit" class="btn btn-primary">등록</button>
					</div>
				</form>
			</div>
		</div>
	</main>
	</div>
</body>
</html>