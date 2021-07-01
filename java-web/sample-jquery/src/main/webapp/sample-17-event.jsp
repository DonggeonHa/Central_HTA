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
			<h1>onclick 이벤트</h1>
			
			<div>
				<button onclick="fn1()" class="btn btn-success" id="btn-1">버튼1</button>
				<button class="btn btn-success" id="btn-2">버튼2</button>
				<button class="btn btn-success" id="btn-3">버튼3</button>
				<button class="btn btn-success" id="btn-4">버튼4</button>
				<button class="btn btn-success" id="btn-5">버튼5</button>
			</div>
			
			<div class="mt-3">
				<button class="btn btn-secondary" id="btn-off-1">버튼1</button>
				<button class="btn btn-secondary" id="btn-off-2">버튼2</button>
				<button class="btn btn-secondary" id="btn-off-3">버튼3</button>
				<button class="btn btn-secondary" id="btn-off-4">버튼4</button>
				<button class="btn btn-secondary" id="btn-off-5">버튼5</button>
			</div>
		</div>
		<script type="text/javascript">
			// jQuery의 .off()메소드로 이벤트처리가 폐기되지 않음.
			/* $("#btn-off-1").click(function() {
				console.log('이벤트처리 폐기');
				$('#btn-1').off('click');
			})
			$("#btn-off-2").click(function() {
				console.log('이벤트처리 폐기');
				$('#btn-2').off('click');
			})
			$("#btn-off-3").click(function() {
				console.log('이벤트처리 폐기');
				$('#btn-3').off('click');
			}) */
			$("#btn-off-4").click(function() {
				console.log('이벤트처리 폐기');
				$('#btn-4').off('click');
			})
			$("#btn-off-5").click(function() {
				console.log('이벤트처리 폐기');
				$('#btn-5').off('click');
			})
		
			function fn1() {
				console.log("버튼1의 onclick이벤트 처리");
			}
			
			document.getElementById("btn-2").onclick = function(event) {
				console.log("버튼2의 onclick이벤트 처리");
			}
			
			document.getElementById("btn-3").addEventListener('click', function(event) {
				console.log("버튼3의 onclick이벤트 처리");
			})
			
			$('#btn-4').on('click', function(event) {
				console.log("버튼4의 onclick이벤트 처리");
			})
			
			$('#btn-5').click(function(event) {
				console.log("버튼5의 onclick이벤트 처리");
			})
		</script>
	</body>
</html>