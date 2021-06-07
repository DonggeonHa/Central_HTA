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
		과정번호에 해당하는 상세정보와 해당과정에 등록한 학생목록을 출력한다.
	*/
%>
<div class="container">
	<%@ include file="../common/header.jsp" %>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<h4>수강생 리스트</h4>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<table class="table table-bordered">
						<colgroup>
							<col width="12%">
							<col width="38%">
							<col width="12%">
							<col width="38%">
						</colgroup>
						<tr>
							<th>과정번호</th>
							<td>40000000</td>
							<th>타입</th>
							<td>전공필수</td>
						</tr>
						<tr>
							<th>과정명</th>
							<td>전기전자 기초 실험 1</td>
							<th>신청/정원</th>
							<td>11/30</td>
						</tr>
						<tr>
							<th>강의장</th>
							<td>201호</td>
							<th>건물명</th>
							<td>공대1호관</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<table class="table">
						<colgroup>
							<col width="10%">
							<col width="10%">
							<col width="10%">
							<col width="20%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
						</colgroup>
						<thead>
							<tr>
								<th>학생번호</th>
								<th>학생명</th>
								<th>학년</th>
								<th>학과명</th>
								<th>등록상태</th>
								<th>수료여부</th>
								<th>점수</th>
								<th>성적</th>
								<th>신청일</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>60000000</td>
								<td>홍길동</td>
								<td>1학년</td>
								<td>전기공학과</td>
								<td>신청완료</td>
								<td>N</td>
								<td></td>
								<td></td>
								<td>2021-03-01</td>
							</tr>
							<tr>
								<td>60000000</td>
								<td>홍길동</td>
								<td>1학년</td>
								<td>전기공학과</td>
								<td>신청완료</td>
								<td>N</td>
								<td></td>
								<td></td>
								<td>2021-03-01</td>
							</tr>
							<tr>
								<td>60000000</td>
								<td>홍길동</td>
								<td>1학년</td>
								<td>전기공학과</td>
								<td>수강완료</td>
								<td>Y</td>
								<td>91</td>
								<td>A</td>
								<td>2021-03-01</td>
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