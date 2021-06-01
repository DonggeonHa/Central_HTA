<%@page import="com.sample.util.CommonUtils"%>
<%@page import="com.sample.vo.Board"%>
<%@page import="java.util.List"%>
<%@page import="com.sample.dao.BoardDao"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<title>상품몰 :: 고객게시판</title>
 	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<%
	String navItem = "board";
	
	BoardDao boardDao = BoardDao.getInstance();
	List<Board> boards = boardDao.getAllBoards();
%>
	<header>
		<%@ include file="../common/header.jsp" %>
	</header>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<h3 class="border p-3 bg-light">
					게시글 목록
					<a href="form.jsp" class="btn btn-primary float-right">게시글 추가</a>
				</h3>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="card">
					<div class="card-body pb-0">
						<table class="table">
							<colgroup>
								<col width="10%" />
								<col width="*" />
								<col width="15%" />
								<col width="10%" />
								<col width="12%" />
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
							<%
								for (Board board : boards) {
							%>
									<tr>
										<td><%=board.getNo()%></td>
										<td><a href="detail.jsp?no=<%=board.getNo()%>&page=1"><%=board.getTitle() %></a></td>
										<td><%=board.getUserId()%></td>
										<td><%=board.getViewCount()%></td>
										<td><%=CommonUtils.dateToString(board.getCreatedDate()) %></td>
									</tr>
							<%
								}
							%>
							</tbody>
						</table>
					</div>
					<div class="card-body">
						<nav>
	  						<ul class="pagination justify-content-center">
	    						<li class="page-item "><a class="page-link" href="list.jsp?page=">이전</a></li>
	    						<li class="page-item "><a class="page-link" href="list.jsp?page=1">1</a></li>
	    						<li class="page-item active"><a class="page-link" href="list.jsp?page=2">2</a></li>
	    						<li class="page-item "><a class="page-link" href="list.jsp?page=3">3</a></li>
	    						<li class="page-item "><a class="page-link" href="list.jsp?page=4">4</a></li>
	    						<li class="page-item "><a class="page-link" href="list.jsp?page=5">5</a></li>
	    						<li class="page-item"><a class="page-link" href="list.jsp?page=">다음</a></li>
	  						</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</main>
</div>
</body>
</html>