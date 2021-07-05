<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" >
	<title>게시글 리스트</title>
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
				<div class="border bg-light p-2 d-flex justify-content-between">
					<span class="fw-bold align-middle">게시글 목록</span>
					<c:if test="${not empty LOGIN_USER }">
						<a href="register" class="btn btn-outline-primary btn-sm">새 글쓰기</a>
					</c:if>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border bg-light p-2">
					<table class="table">
						<colgroup>
							<col width="10%">
							<col width="60%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
						</colgroup>						
						<thead>
							<tr>
								<th>번호</th>
								<th>제목</th>
								<th>작성자</th>
								<th>등록일</th>
								<th>조회수</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${empty boards }">
									<tr>
										<td colspan="5" class="text-center">조회된 내용이 없습니다.</td>
									</tr>
								</c:when>
								<c:otherwise>
									<c:forEach var="board" items="${boards }">
										<tr>
											<td>${board.no }</td>
											<td><a class="text-decoration-none" href="detail?no=${board.no }&page=${pagination.page }">${board.title }</a></td>
											<td>${board.userName }</td>
											<td><fmt:formatDate value="${board.createdDate }" pattern="yyyy.MM.dd"/> </td>
											<td>${board.viewCount }</td>
										</tr>
									</c:forEach>
								</c:otherwise>
							</c:choose>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<c:if test="${not empty boards }">
			<div class="row mb-3">
				<div class="col-12">
					<ul class="pagination justify-content-center">
						<li class="page-item ${pagination.first ? 'disabled' : '' }">
							<a class="page-link" href="list?page=${pagination.page - 1 }" tabindex="-1" aria-disabled="true">이전</a>
						</li>
						<c:forEach var="num" begin="${pagination.begin }" end="${pagination.end }">
							<li class="page-item ${pagination.page eq num ? 'active' : '' }"><a class="page-link" href="list?page=${num }">${num }</a></li>
						</c:forEach>
						<li class="page-item  ${pagination.last ? 'disabled' : '' }">
							<a class="page-link" href="list?page=${pagination.page  + 1 }">다음</a>
						</li>
					</ul>
				</div>
			</div>
		</c:if>
	</main>
</div>    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>