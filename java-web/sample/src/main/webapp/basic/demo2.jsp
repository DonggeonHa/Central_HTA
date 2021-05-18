<%@page import="com.sample.vo.Sample"%>
<%@page import="com.sample.dao.SampleDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>JSP 연습 2</h1>
		<%
			SampleDao sampleDao = new SampleDao();
			Sample sample = sampleDao.getSample();
			
		%>
		
		
		<h3>상품정보</h3>
		<table class="table table-striped" border="1" style="width: 90%;">
			<thead>
				<tr>
					<th>상품번호</th><td><%=sample.getNo() %></td>
					<th>등록일</th><td><%=sample.getCreatedDate() %></td>
				</tr>
				<tr>
					<th>상품명</th><td><%=sample.getName() %></td>
					<th>제조사</th><td><%=sample.getCompany() %></td>
				</tr>
				<tr>
					<th>가격</th><td><%=sample.getPrice() %>원</td>
					<th>제고현황</th><td><%=sample.getStock() %>개</td>
				</tr>
			</thead>
		</table>
	
	
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
	</body>
</html>