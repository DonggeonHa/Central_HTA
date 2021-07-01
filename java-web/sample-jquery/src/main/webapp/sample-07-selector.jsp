<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<title>Bootstrap 5 Example</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	</head>
	<body>
		<div class="container">
			<h1>기타 필터 선택자 연습하기</h1>	
			
			<table class="table">
				<thead>
					<tr>
						<th>no</th>
						<th>name</th>
						<th>phone</th>
						<th>email</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>10</td>
						<td>홍길동</td>
						<td>010-1111-1111</td>
						<td>hong@gmail.com</td>
					</tr>
					<tr>
						<td>20</td>
						<td>김유신</td>
						<td>010-2222-2222</td>
						<td>kim@naver.com</td>
					</tr>
					<tr>
						<td>30</td>
						<td>이순신</td>
						<td>010-3333-3333</td>
						<td>lee@hanmail.com</td>
					</tr>
				</tbody>
			</table>
		</div>
		<script type="text/javascript">
			// 텍스트컨텐츠로 김유신을 포함하고 있는 엘리먼트를 선택하기
			$('td:contains(김유신)').css({color:'red', fontWeight:'bold'});
			$('tr:contains(김유신)').css('background-color', 'yellow');
			
			// th태그를 가지고 있는 엘리먼트를 선택하기
			$('tr:has(th)').css('background-color', '#eee');
			
			// th태그를 가지고 있지 않는 엘리먼트를 선택하기
			// $('tbody tr').css('font-size', '35px');
			$('tr:not(:has(th))').css('font-size', '35px');
		</script>
	</body>
</html>