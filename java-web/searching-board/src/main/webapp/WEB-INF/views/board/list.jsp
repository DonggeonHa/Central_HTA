<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
<div class="container">
	<header class="my-3">
		<c:set var="menu" value="게시판"/>
		<%@ include file="../common/nav.jsp" %>
	</header>
	<main class="mb-3">
		<div class="row mb-2">
			<div class="col-12">
				<div class="border bg-light px-3 py-2">
					<strong>게시글 목록</strong>
					<a href="register" class="btn btn-primary btn-sm float-right">새 글쓰기</a>
				</div>
			</div>
		</div>
		<div class="row mb-2">
			<div class="col-12">
				<table class="table table-striped table-sm">
					<colgroup>
						<col width="10%">
						<col width="*">
						<col width="15%">
						<col width="15%">
						<col width="15%">
					</colgroup>
					<thead>
						<tr>
							<th>번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>조회수</th>
							<th>등록일</th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty boards }">
								<tr>
									<td class="text-center" colspan="5">검색결과가 없습니다.</td>
								</tr>
							</c:when>
							<c:otherwise>
								<c:forEach var="board" items="${boards }">
									<tr>
										<td>${board.no }</td>
										<td><a href="javascript:goToDetail(${board.no })">${board.title }</a></td>
										<td>${board.userId }</td>
										<td>${board.viewCount }</td>
										<td><fmt:formatDate value="${board.createdDate }" pattern="yyyy-MM-dd"/></td>
									</tr>
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</tbody>
				</table>
			</div>
		</div>
		<c:if test="${pagination.totalRows gt 0 }">
			<div class="row mb-2">
				<div class="col-12">
					<ul class="pagination justify-content-center">
						<li class="page-item ${pagination.pageNo le 1 ? 'disabled' : ''}">
							<a class="page-link" href="javascript:goToPage(${pagination.pageNo - 1 })">이전</a>
						</li>
						<c:forEach var="num" begin="${pagination.beginPage }" end="${pagination.endPage }">
							<li class="page-item ${pagination.pageNo eq num ? 'active' : '' }">
								<a class="page-link" href="javascript:goToPage(${num })">${num }</a>
							</li>
						</c:forEach>
						<li class="page-item ${pagination.pageNo ge pagination.totalPages ? 'disabled' : ''}">
							<a class="page-link" href="javascript:goToPage(${pagination.pageNo + 1 })">다음</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="row mb-2">
				<div class="col-12 ">
					<form id="form-search" class="form-inline justify-content-center" method="get" action="list">
						<input type="hidden" name="no" value="" />
						<input type="hidden" name="page" value="${pagination.pageNo }">
						<select class="form-control mr-2" name="opt">
							<option value="title" ${param.opt eq 'title' ? 'selected' : '' }> 제목</option>
							<option value="writer" ${param.opt eq 'writer' ? 'selected' : '' }> 작성자</option>
							<option value="content" ${param.opt eq 'content' ? 'selected' : '' }> 내용</option>
						</select>
						<input type="text" class="form-control mr-2" name="keyword" value="${param.keyword }">
						<button type="button" class="btn btn-outline-primary" onclick="submitForm()">검색</button>
					</form>
				</div>
			</div>
		</c:if>
	</main>
</div>
</div>
<script type="text/javascript">
	function submitForm() {
		var text = document.querySelector("input[name='keyword']").value;
		if (!text) {
			alert("검색어를 입력하세요");
			document.querySelector("input[name='keyword']").focus();
			return;
		}
		document.querySelector("input[name='page']").value = 1;
		document.querySelector("#form-search").submit();
	}

	function goToPage(pageNo) {
		var text = document.querySelector("input[name='keyword']").value;
		if (!text) {
			document.querySelector("select[name='opt']").disabled = true;
			document.querySelector("input[name='keyword']").disabled = true;
		}
		document.querySelector("input[name='no']").disabled = true;
		
		document.querySelector("input[name='page']").value = pageNo;
		document.querySelector("#form-search").setAttribute("action", "list");
		document.querySelector("#form-search").submit();
	}
	
	function goToDetail(boardNo) {
		var text = document.querySelector("input[name='keyword']").value;
		if (!text) {
			document.querySelector("select[name='opt']").disabled = true;
			document.querySelector("input[name='keyword']").disabled = true;
		}
		
		document.querySelector("input[name='no']").value = boardNo;
		document.querySelector("#form-search").setAttribute("action", "detail");
		document.querySelector("#form-search").submit();
	}
</script>
</body>
</html>