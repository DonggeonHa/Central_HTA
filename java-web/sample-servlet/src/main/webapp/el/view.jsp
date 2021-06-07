<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ko">
<head>
  	<title>EL 연습</title>
  	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="row mt-3">
		<div class="col-12">
			<h1>제목: ${title }</h1>
		</div>
		<div class="col-12">
			<h5><strong>객체를 속성으로 저장했을 때</strong></h5>
			<dl>
			<!--
			  서블릿에서 요청객체에 "score"라는 이름으로 Score객체를 저장했다.
				"score"는 요청객체에 Score객체를 저장할 때 지정한 이름일 뿐이다.
			 -->
				<dt>성적객체</dt><dd>${score }</dd>
				<dt>성</dt><dd>${score.lastName }</dd>
				<dt>이름</dt><dd>${score.firstName }</dd>
				<dt>전체이름</dt><dd>${score.lastName } ${score.firstName } </dd>
				<dt>국어점수</dt><dd>${score.kor }</dd>
				<dt>영어점수</dt><dd>${score.eng }</dd>
				<dt>수학점수</dt><dd>${score.math }</dd>
				<dt>총점</dt><dd>${score.kor + score.eng + score.math }</dd>
				<dt>평균</dt><dd>${(score.kor + score.eng + score.math)/3 }</dd>
			</dl>
		</div>
	</div>
	<div class="row mt-3">
		<div class="col-12">
			<h5>Map 객체를 속성으로 저장했을 때</h5>
			<div>부서번호: ${deptInfo.deptNo }</div>
			<div>부서이름: ${deptInfo.deptName }</div>
			<div>부서주소: ${deptInfo.deptAddr }</div>
			<div>부서관리자명: ${deptInfo.deptManagerName }</div>
		</div>
	</div>
	
	<div class="row mt-3">
		<div class="col-12">
			<div>비어있는가? ${empty username } 비어있지않은가? ${not empty username}</div>
			<div>비어있는가? ${empty userpassword } 비어있지않은가? ${not empty userpassword}</div>
			<div>비어있는가? ${empty members } 비어있지않은가? ${not empty members}</div>
			<div>비어있는가? ${empty teams} 비어있지않은가? ${not empty teams}</div>
			<div>비어있는가? ${empty colors} 비어있지않은가? ${not empty colors}</div>
		</div>
	</div>
	
	<div class="row mt-3">
		<div class="col-12">
			<h5>ArrayList에 Score객체를 속성으로 저장했을 때</h5>
			<table class="table">
				<thead>
					<tr>
						<td>이름</td>
						<td>국어</td>
						<td>영어</td>
						<td>수학</td>
						<td>총점</td>
						<td>평균</td>
						<td>장학금지급여부</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${scoreList[0].fullName }</td>
						<td>${scoreList[0].kor }</td>
						<td>${scoreList[0].eng }</td>
						<td>${scoreList[0].math }</td>
						<td>${scoreList[0].total }</td>
						<td>${scoreList[0].average }</td>
						<td>${scoreList[0].average >= 90}</td>
					</tr>
					<tr>
						<td>${scoreList[1].fullName }</td>
						<td>${scoreList[1].kor }</td>
						<td>${scoreList[1].eng }</td>
						<td>${scoreList[1].math }</td>
						<td>${scoreList[1].total }</td>
						<td>${scoreList[1].average }</td>
						<td>${scoreList[1].average ge 90}</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>

</body>
</html>