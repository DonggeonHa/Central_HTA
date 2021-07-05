<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<title>jQuery 연습하기</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	</head>
	<body>
		<div class="container">
			<h1>일반 텍스트를 응답데이터로 받는 ajax</h1>
			
			<div class="row mb-3">
				<div class="col-2">
					<h3>장르</h3>
					<ul class="list-group">
						<li class="list-group-item">소설</li>
						<li class="list-group-item">기술</li>
						<li class="list-group-item">외국어</li>
					</ul>
				</div>
				<div class="col-4">
					<h3>장르별 베스트셀러</h3>
					<table class="table">
						<colgroup>
							<col width="25%">
							<col width="75%">
						</colgroup>
						<thead>
							<tr>
								<th>순위</th>
								<th>제목</th>
							</tr>
						</thead>
						<tbody></tbody>
					</table>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$(function() {
				$('.list-group-item').click(function() {
					$('table tbody').empty();
					$(this).addClass('active').siblings().removeClass('active');
					
					var text = $(this).text();
					// $.get(url, data, callback)
					// url : 요청URL
					// data : 서버로 보내는 요청 데이터 {key:value, key:value, ...}
					// callback: 서버로부터 성공적인 응답이 왔을 떄 jQuery가 실행하는 함수
					//			 callback함수의 매개변수에는 서버로부터 받은 데이터가 전달된다.
					//			 응답데이터 예시: "이것이 자바다, 자바의 정석, 혼자공부하는 자바";
					$.get('ajax1', {genre:text}, function(data) {
						// items는 배열이다.
																		// 서버로부터 받은 데이터 분석
						var items = data.split(",");
						// $.each(배열, 콜백함수)는 지정된 배열에 저장된 요소의 갯수만큼 콜백함수를 실행한다.
						// 콜백함수를 실행할 떄 마다 배열이 요소(값)가 순서대로 하나씩 콜백함수의 매개변수로 전달된다.
						$.each(items, function(index, item) {			// 새로운 html 컨텐츠 생성
							var row = "<tr>";
							row += "<td>" + (index + 1) + "</td>";
							row += "<td>" + item + "</td>";
							row += "</tr>";
							
							$('table tbody').append(row);
						})
					})
				});
			})
		</script>
	</body>
</html>