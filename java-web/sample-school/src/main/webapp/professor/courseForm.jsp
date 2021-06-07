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
		모든 학과정보를 조회해서 입력폼의 select박스에 option을 추가한다
	*/
%>
<div class="container">
	<%@ include file="../common/header.jsp" %>
	<main>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<h4>신규 과정 등록</h4>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<div class="col-12">
				<div class="border p-2 bg-light">
					<form method="post" action="registerCourse.jsp">
						<div class="mb-3">
							<label class="form-label">학과</label>
							<select class="form-control" name="departmentNo">
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
								<option value="20000000"> 전기공학과</option>
							</select>
						</div>
						<div class="mb-3">
							<label class="form-label">과정명</label>
							<input type="text" class="form-control" name="name" />
						</div>
						<div class="mb-3">
							<label class="form-label">과정타입</label>
							<select class="form-control" name="type">
								<option value="교양선택"> 교양선택</option>
								<option value="교양필수"> 교양필수</option>
								<option value="전공선택"> 전공선택</option>
								<option value="전공필수"> 전공필수</option>
							</select>
						</div>
						<div class="mb-3">
							<label class="form-label">강의장</label>
							<select class="form-control" name="room">
								<option value="101"> 101호</option>
								<option value="102"> 102호</option>
								<option value="103"> 103호</option>
								<option value="201"> 201호</option>
								<option value="202"> 202호</option>
								<option value="203"> 203호</option>
								<option value="301"> 301호</option>
								<option value="302"> 302호</option>
								<option value="303"> 303호</option>
								<option value="401"> 401호</option>
								<option value="402"> 402호</option>
								<option value="402"> 403호</option>
								<option value="501"> 501호</option>
								<option value="502"> 502호</option>
								<option value="503"> 503호</option>
							</select>
						</div>
						<div class="mb-3">
							<label class="form-label">건물</label>
							<select class="form-control" name="building">
								<option value="공대1호관"> 공대1호관</option>
								<option value="공대2호관"> 공대2호관</option>
								<option value="공대3호관"> 공대3호관</option>
								<option value="공대4호관"> 공대4호관</option>
								<option value="공대5호관"> 공대5호관</option>
							</select>
						</div>
						<div class="mb-1 text-end">
							<a href="/sample-school/index.jsp" class="btn btn-outline-primary">취소</a>
							<button type="submit" class="btn btn-primary">등록</button>
						</div>
					</form>
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