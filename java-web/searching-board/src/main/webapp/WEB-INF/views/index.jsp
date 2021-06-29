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
		<c:set var="menu" value="홈"/>
		<%@ include file="common/nav.jsp" %>
	</header>
	<main>
		<div class="jumbotron">
			<h1>고객 게시판</h1>
			<p>고객전용 게시판입니다.</p>
		</div>
	</main>
	</div>
</body>
</html>