<%@page import="com.sample.vo.Board"%>
<%@page import="com.sample.dao.BoardDao"%>
<%@page import="com.sample.util.CommonUtils"%>
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
	User sqlSessionSavedUser = (User) session.getAttribute("LOGINED_USER_INFO");

	int no = CommonUtils.stringToInt(request.getParameter("no"));
	int pageNo = CommonUtils.stringToInt(request.getParameter("page"));
	
	BoardDao boardDao = BoardDao.getInstance();
	Board board = boardDao.getBoardByNo(no);
	
	board.setViewCount(board.getViewCount() + 1);
	boardDao.updateBoard(board);
	
%>
	<header>
		<%@ include file="../common/header.jsp" %>
	</header>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<h3 class="border p-3 bg-light">게시글 상세정보</h3>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<table class="table table-bordered">
					<colgroup>
						<col width="15%">
						<col width="35%">
						<col width="15%">
						<col width="35%">
					</colgroup>
					<tr>
						<th class="bg-light">글번호</th><td><%=board.getNo() %></td>
						<th class="bg-light">조회수</th><td><%=board.getViewCount()%></td>
					</tr>
					<tr>
						<th class="bg-light">제목</th><td colspan="3"><%=board.getTitle()%></td>
					</tr>
					<tr>
						<th class="bg-light">작성자</th><td><%=board.getUserId() %></td>
						<th class="bg-light">등록일</th><td><%=CommonUtils.dateToString(board.getCreatedDate()) %></td>
					</tr>
					<tr>
						<th class="bg-light">내용</th>
						<td colspan="3">
							<textarea rows="6" class="form-control bg-white p-0 border-0" readonly><%=board.getContent()%></textarea>
						</td>
					</tr>
				</table>
				<div>
				<%
					try {
						if (board.getUserId().equals(loginedUser.getId())) { 
				%>
							<a href="modifyform.jsp?no=<%=board.getNo()%>&page=<%=pageNo %>" class="btn btn-warning">수정</a>
							<a href="delete.jsp?no=<%=board.getNo()%>" class="btn btn-danger">삭제</a>
							<a href="list.jsp" class="btn btn-primary float-right">목록</a>
				<%
						}
					} catch(NullPointerException e) {
				%>
						<a href="list.jsp" class="btn btn-primary float-right">목록</a>
				<%
					}
				%>
				</div>
			</div>
		</div>
	</main>
</div>
</body>
</html>