<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" >
	<title>게시글 수정하기</title>
</head>
<body>
<div class="container mt-3 mb-5">
	<header>
		<c:set var="currentPage" value="board" />
		<%@ include file="../common/header.jsp" %>
	</header>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border bg-light p-2">
					<span class="fw-bold">게시글 수정하기</span>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border bg-light p-2">
					<form id="form-modify" method="post" action="modify">
						<input type="hidden" name="page" value="${param.page }" />
						<input type="hidden" name="no" value="${board.no }" />
						<div class="mb-3">
							<label class="form-label">제목</label>
							<input type="text" class="form-control" name="title" id="board-title" value="${board.title }">
						</div>
						<div class="mb-3">
							<label class="form-label">내용</label>
							<textarea rows="5" class="form-control" name="content" id="board-content">${board.content }</textarea>
						</div>
						<div class="text-end">
							<a href="detail?no=${board.no }&page=${param.page }" class="btn btn-secondary">취소</a>
							<button type="submit" class="btn btn-primary">수정</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</main>
</div>    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>