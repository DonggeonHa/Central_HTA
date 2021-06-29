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
			<h1>필터 선택자 연습하기</h1>	
			
			<p>0</p>
			<p>1</p>
			<p>2</p>
			<p>3</p>
			<p>4</p>
			<p>5</p>
			<p>6</p>
			<p>7</p>
			<p>8</p>
		</div>
		<script type="text/javascript">
			// 첫번째 p를 선택해서 빨간색으로 변경하시오
			$("p:first").css("color",'red');
			// 마지막번째 p를 선택해서 파란색으로 변경하시오
			$('p:last').css('color', 'blue');
			// 홀수번째 p를 선택해서 배경색을 회색으로 변경하시오
			$('p:odd').css('background-color', 'gray');
			// 짝수번째 p를 선택해서 배경색을 노란색으로 변경하시오.
			$('p:even').css('background-color', 'yellow');
		</script>
	</body>
</html>