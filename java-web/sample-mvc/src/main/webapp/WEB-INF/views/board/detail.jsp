<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" >
	<title>게시글 보기</title>
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
					<span class="fw-bold">게시글 보기</span>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border bg-light p-2">
					<table class="table">
						<colgroup>
							<col width="10%">
							<col width="40%">
							<col width="10%">
							<col width="40%">
						</colgroup>
						<tbody>
							<tr>
								<th>번호</th>
								<td>${board.no }</td>
								<th>조회수</th>
								<td>${board.viewCount }</td>
							</tr>
							<tr>
								<th>제목</th>
								<td colspan="3">${board.title }</td>
							</tr>
							<tr>
								<th>작성자</th>
								<td>${board.userName }</td>
								<th>작성일</th>
								<td><fmt:formatDate value="${board.createdDate }" pattern="yyyy년 M월 d일 EEEE a h시 m분 s초"/> </td>
							</tr>
							<tr>
								<th>내용</th>
								<td colspan="3">${board.content }</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12 text-end">
				<c:if test="${not empty LOGIN_USER and board.userNo eq LOGIN_USER.no}">
					<a href="modify?no=${board.no }&page=${param.page }" class="btn btn-warning">수정</a>
					<a href="delete?no=${board.no }&page=${param.page }" class="btn btn-danger">삭제</a>
				</c:if>
				<a href="list?page=${param.page }" class="btn btn-primary">목록</a>
			</div>
		</div>
	</main>
</div>    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>