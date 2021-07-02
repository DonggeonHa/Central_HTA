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
			<h1>부모, 조상 엘리먼트 찾아다니기</h1>
			
			<div id='box'>
				<ul>
					<li><a href="">링크1</a></li>
					<li><a href="">링크2</a></li>
					<li><a href="">링크3</a></li>
					<li><a href="">링크4</a></li>
				</ul>
			</div>
		</div>
		<script type="text/javascript">
			$(function() {
				$('#box a').click(function(event) {
					event.preventDefault();
					
					// 이벤트가 발생한 엘리먼트 -> <a>
					console.log('this', this);
					
					// 이벤트가 발생한 엘리먼트를 포함하고 있는 jQuery객체
					console.log('$(this)', $(this));
					
					// 이벤트가 발생한 엘리먼트의 부모 엘리먼트 -> <li>
					console.log('$(this).parent()', $(this).parent());
					
					// 이벤트가 발생한 엘리먼트의 모든조상 엘리먼트-> <li>, <ul>, <div id="box">, <div id="container">, <body>, <html>
					console.log('$(this).parents()', $(this).parents());
					
					// 이벤트가 발생한 엘리먼트의 조상 엘리먼트 중에서 div인 것-> <div id="box">, <div id="container">
					console.log('$(this).parents("div")', $(this).parents("div"));

					// 이벤트가 발생한 엘리먼트의 조상 엘리먼트 중에서 아이디가 box인 것 -> <div id="box">
					console.log('$(this).parents("div")', $(this).parents("#box"));
					
					// 이벤트가 발생한 엘리먼트의 조상 엘리먼트 중에서 가장 가까운 div인 것 ->
					console.log('$(this).closest("div")', $(this).closest("div"));
				})
				
			})
		</script>
	</body>
</html>