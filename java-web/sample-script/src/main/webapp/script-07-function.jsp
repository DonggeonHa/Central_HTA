<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자바스크립트의 함수</title>
		<script type="text/javascript">
			// 함수의 정의
			function myFunction() {
				console.log("myFunction() 함수가 실행됨");
				
			};
			
			// 함수의 실행
			myFunction();
			
			// 매개변수가 있는 함수의 정의
			function plus(a, b) {
				var result = a + b;
				console.log("결과값 : ", result);
			};
			
			// 함수의 실행
			plus(100, 200);
			plus(3.15, 624.53);
			plus(593, 62.635);
			
			var message1 = hello('홍길동');
			var message2 = hello('김유신');
			console.log(message1, message2);
			
			// 반환값이 있는 함수
			function hello(name) {
				return name + "님 환영합니다";
			}
			
			// 사용자와 상호작용하는 함수 정의하기
			function deleteItem() {
				alert("아이템이 삭제되었습니다.");
			}
			
			function deleteSelectedItems() {
				alert("선택한 아이템들이 삭제되었습니다.");
			}
			
			function deleteAllItems() {
				alert("모든 아이템들이 삭제되었습니다.");
			}
		</script>
	</head>
	<body>
        <h1>자바스크립트의 함수</h1>
        <p>실행결과는 브라우저 콘솔에서 확인</p>
        
        <div>
        	<h3>사용자와 상호적용 하기</h3>
        	<button onclick="deleteItem()">삭제</button>
        	<button onclick="deleteSelectedItems()">선택삭제</button>
        	<button onclick="deleteAllItems()">전체삭제</button>
        </div>
	</body>
</html>