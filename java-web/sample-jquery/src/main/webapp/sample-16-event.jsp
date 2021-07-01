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
			<h1>이벤트 처리</h1>
			
			<div id="box-1">
				<input type="number" value="1" class="w-50"><button class="btn btn-outline-primary">버튼1</button>
				<input type="number" value="2" class="w-50"><button class="btn btn-outline-primary">버튼2</button>
				<input type="number" value="3" class="w-50"><button class="btn btn-outline-primary">버튼3</button>
				<input type="number" value="4" class="w-50"><button class="btn btn-outline-primary">버튼4</button>
			</div>
		</div>
		<script type="text/javascript">
			$('button').on('click', function() {
				// - jQuery 이벤트핸들러함수의 this에는 언제나 이벤트를 발생시킨 그 엘리먼트가 들어있다.
				// - this에는 엘리먼트 객체가 들어있다. jQuery객체가 아니다.
				// - this에 대하여 $(this)를 실행하면 this에 들어있는 엘리먼트와 그 엘리먼트를 조작하는
				//   조작함수가 포함된 jQuery객체가 반환됨
				//	 * this.jQuery조작함수()		<----- 오류
				//	 * $(this).jQeury조작함수()		<----- 정상동작
// 				$(this).prop('disabled', true).css('color', 'red').prev().val(10000); 
// 				$(this).prev().val(10000).prop('disabled', true); 
 				$(this).prev().val(10000).end().prop('disabled', true); 
			})		
			
			/*
				var x = $('button');	// x에는 jQuery객체(button 엘리먼트 + 조작함수)가 들어있다.
				x.css('color', 'red');
			*/
		</script>
	</body>
</html>