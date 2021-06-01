<%@page import="java.net.URLEncoder"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<title>상풀물 :: 고객게시판</title>
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

	//로그인 여부 체크하기
	User sessionSavedUser = (User) session.getAttribute("LOGINED_USER_INFO");
	if (sessionSavedUser == null) {
		String encodedText = URLEncoder.encode("고객게시판 등록", "utf-8");
		response.sendRedirect("../user/loginform.jsp?fail=deny&job="+ encodedText);
		return;
	}
%>
	<header>
		<%@ include file="../common/header.jsp" %>
	</header>
	<main>
		<div class="row mb-3"> 
			<div class="col-12">
				<h3 class="border p-3 bg-light">새 게시글 등록폼</h3>
			</div>
		</div>
		<%
			String fail = request.getParameter("fail");
			if ("blank".equals(fail)) {
		%>
				<div class="row mb-1">
					<div class="col-12">
						<div class="alert alert-danger">
							<strong>입력값 누락</strong> 게시글 내용이 누락되었습니다.
						</div>
					</div>
				</div>
		<%
			}
		%>
		<div class="row">
			<div class="col-12">
				<form method="post" action="add.jsp" class="border p-3 bg-light">
					<div class="form-group">
						<label>제목</label>
						<input type="text" class="form-control" name="title" />
					</div>
					<div class="form-group">
						<label>내용</label>
						<textarea rows="6" class="form-control" name="content"></textarea>
					</div>
					<div class="text-right">
						<a href="list.jsp" class="btn btn-secondary">취소</a>
						<button type="submit" class="btn btn-primary">등록</button>
					</div>
				</form>
			</div>
		</div>
	</main>
</div>
</body>
</html>