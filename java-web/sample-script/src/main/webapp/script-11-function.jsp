<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자바스크립트의 함수</title>
		<script type="text/javascript">
			// 즉시 실행함수 정의하기
			// 즉시 실행함수는 페이지 로딩시 함수가 자동으로 실행되게 한다.
			
			/* 
				즉시 실행함수의 장점
					- 단 한번만 실행된다.(절대로 여러 번 실행할 수 없다.)
					- 전역 이름공간을 오염시키지 않는다.
					
				즉시 실행함수의 사용 목적
					- 웹페이지의 초기화
					- 웹페이지에서 사용할 초기 데이터를 서버로부터 가져오는 작업
			
			*/
			
			// 인자를 전달받지 않는 즉시 실행함수
			(function() {
				console.log("실행됨 실행됨 실행됨");
			})();
			
			// 인자를 전달받는 즉시 실행함수
			(function(x) {
				console.log("x의 값", x);
			})(10);
			
		</script>
	</head>
	<body>
        <h1>자바스크립트의 함수</h1>
        <p>실행결과는 브라우저 콘솔에서 확인</p>
	</body>
</html>