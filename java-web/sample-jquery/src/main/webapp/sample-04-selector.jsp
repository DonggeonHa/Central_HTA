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
			<h1>자식, 자손, 형제 선택자 연습하기</h1>	
			
			<div id="box-1">
				<h3>h3</h3>
				<a>링크1</a>
				
				<h4>리스트</h4>
				<ul>
					<li><a>리스트링크1</a></li>
					<li><a>리스트링크2</a></li>
					<li><a>리스트링크3</a></li>
					<li><a>리스트링크4</a></li>
				</ul>
			</div>
			
			<div id="box-2">
				<h3>h3</h3>
				<a>링크2</a>
				<a>링크3</a>
				
				<h4>리스트</h4>
				<ul>
					<li><a>리스트링크1</a></li>
					<li><a>리스트링크2</a></li>
					<li><a>리스트링크3</a></li>
					<li><a>리스트링크4</a></li>
				</ul>
			</div>
			
			<div id="box-3">
				<a>링크4</a>
				<h3>h3</h3>
				<a>링크5</a>
				<a>링크6</a>
				<a>링크7</a>
				<p>p</p>
				<a>링크8</a>
				<a>링크9</a>
			</div>
		</div>
		<script type="text/javascript">
			// 첫번째 div의 링크1을 선택해서 배경색을 노랑색으로 변경하기
			$('#box-1 > a').css('background-color', 'yellow');
			// 두번째 div의 링크2를 선택해서 글자를 링크2222로 변경하기
			$('#box-2 > a:first').text("링크2222");
			// 첫번째 div의 모든 링크를 선택해서 테두리를 표시하기
			$('#box-1 a').css('border', '1px solid black');
			// 두번째 div에서 h3 다음에 있는 a들을 선택해서 글자크기를 변경하기
			$('#box-2 h3 ~ a').css('font-size','50px');
			// 두번째 div에서 리스트링크들을 선택해서 글자크기를 변경하기
			$('#box-2 li a').css('font-size','8px');
			// 첫번째 div의 리스트 링크 중에서 첫번째 리스트링크1만 선택해서 배경색을 초록색으로 변경하기
			$('#box-1 li a:first').css('background-color', 'lightgreen');
			// 첫번째 div의 맨 마지막번째 리스트 링크4와 두번째 div의 맨마지막번째 리스트 링크4를 선택해서 배경색을 회색으로 변경
			$('#box-1 li a:last, #box-2 li a:last').css('background-color', 'lightgray');
			// 세번째 div의 모든 링크를 선택해서 배경색을 노란색으로 변경하기
			$('#box-3 a').css('background-color', 'yellow');
			// 세번째 div의 링크5를 선택해서 빨간색 테두리를 표시하기
			$('#box-3 h3 + a').css('border', '1px solid red');
			// 세번째 div의 h3 다음에 있는 모든 링크를 선택해서 이탤릭체로 표시하기
			$('#box-3 h3 ~ a').css('font-style', 'italic');
		</script>
	</body>
</html>