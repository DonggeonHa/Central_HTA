<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자바스크립트의 함수</title>
		<script type="text/javascript">
			// 이름있는 함수와 이름없는 함수의 실행
			console.log('이름있는 함수 실행', plus(100, 600));
			// console.log('이름없는 함수 실행', minus(100, 600)); // 오류, 이름없는 함수는 그 함수가 변수에 대입된 이후에만 사용가능
		
			// 이름있는 함수 정의하기
			function plus(x, y) {
				return x + y;
			}
		
			// 이름없는 함수 정의하기
			// 이름없는 함수를 변수에 대입하면 해당 변수의 타입은 function타입이 되고,
			// 그 변수는 함수를 참조하게 된다.
			// 그 변수명에 ()를 붙이면 그 변수가 참조하는 함수를 실행할 수 있다.
			var minus = function(x, y) {
				return x - y;
			}
			
			// 이름있는 함수와 이름없는 함수 실행
			console.log('이름있는 함수 실행', plus(100, 600));
			console.log('이름없는 함수 실행', minus(100, 600));
			
		</script>
	</head>
	<body>
        <h1>자바스크립트의 함수</h1>
        <p>실행결과는 브라우저 콘솔에서 확인</p>
	</body>
</html>