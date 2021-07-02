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
		<style type="text/css">
			div {
				border: 1px solid black;
				margin: 15px;
				padding: 30px;
			}
			
			#box {border: 3px solid red;}
			#box-1 {border: 1px solid green;}
			#box-2 {border: 1px solid orange;}
		</style>
	</head>
	<body>
		<div class="container">
			<h1>이벤트 버블링 방지하기</h1>
			
			<div id="box">
				<div id="box-1">
					<button id="btn-1">버튼1</button>
				</div>
				<div id="box-2">
					<button id="btn-2">버튼2</button>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$('#box').click(function() {
				console.log('[#box div]에서 onclick 이벤트를 처리합니다.')
			})
			$('#box-1').click(function() {
				console.log('[#box-1 div]에서 onclick 이벤트를 처리합니다.')
			})
			$('#box-2').click(function() {
				console.log('[#box-2 div]에서 onclick 이벤트를 처리합니다.')
			})
			$('#btn-1').click(function(event) {
				// event.stopPropagation()
				// 이벤트버블링(자식엘리먼트에서 발생한 이벤트가 부모 엘리먼트로 전파되는 것)을 중단시킨다.
				event.stopPropagation();
				console.log('[#btn-1]에서 onclick 이벤트를 처리합니다.')
			})
			$('#btn-2').click(function() {
				console.log('[#btn-2]에서 onclick 이벤트를 처리합니다.')
				// jQuery의 이벤트핸들러 함수가 false값을 반환하면
				// 이벤트버블링 중단된다.
				return false;
			})
		</script>
	</body>
</html>