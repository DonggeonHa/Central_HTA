<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" >
	<title>학사관리 시스템</title>
</head>
<body>
<%
	/*
		로그인한 교수가 개설한 과정정보를 모두 조회해서 화면에 출력한다.
		
		1. 세션에서 로그인정보를 조회한다.
		2. 로그인정보가 존재하지 않으면 로그인페이지로 이동시킨다.
		3. 로그인정보에서 교수번호를 조회한다.
		4. 조회된 교수번호의 교수가 개설한 모든 과정정보를 조회해서 출력한다.
	*/
%>
<div class="container">
	<%@ include file="../common/header.jsp" %>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<h4>개설과정 현황</h4>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<table class="table">
						<colgroup>
							<col width="10%">
							<col width="*">
							<col width="10%">
							<col width="10%">
							<col width="15%">
							<col width="10%">
						</colgroup>
						<thead>
							<tr>
								<th>과정번호</th>
								<th>과정명</th>
								<th>과정타입</th>
								<th>신청/정원</th>
								<th>학과명</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>40000000</td>
								<td>전기전자 기초실험 1</td>
								<td>전공필수</td>
								<td>10/30</td>
								<td>전기공학과</td>
								<td>
									<a href="students.jsp?courseNo=40000000" class="btn btn-info btn-sm">수강생 조회</a>
								</td>
							</tr>
							<tr>
								<td>40000000</td>
								<td>전기전자 기초실험 1</td>
								<td>전공필수</td>
								<td>10/30</td>
								<td>전기공학과</td>
								<td>
									<a href="students.jsp?courseNo=40000000" class="btn btn-info btn-sm">수강생 조회</a>
								</td>
							</tr>
							<tr>
								<td>40000000</td>
								<td>전기전자 기초실험 1</td>
								<td>전공필수</td>
								<td>10/30</td>
								<td>전기공학과</td>
								<td>
									<a href="students.jsp?courseNo=40000000" class="btn btn-info btn-sm">수강생 조회</a>
								</td>
							</tr>
							<tr>
								<td>40000000</td>
								<td>전기전자 기초실험 1</td>
								<td>전공필수</td>
								<td>10/30</td>
								<td>전기공학과</td>
								<td>
									<a href="students.jsp?courseNo=40000000" class="btn btn-info btn-sm">수강생 조회</a>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</main>
	<footer class="footer mt-auto py-3 bg-light">
  		<div class="container">
    		<span class="text-muted">중앙HTA 학원</span>
  		</div>
	</footer>
</div>    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>