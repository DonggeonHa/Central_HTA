<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자바스크립트의 함수</title>
		<script type="text/javascript">
			var products = [
				{name:"연필", price:1500, stock:100},
				{name:"공책", price:2000, stock:500},
				{name:"샤프", price:15000, stock:46},
				{name:"시계", price:160000, stock:10},
				{name:"지우개", price:700, stock:600}
			];
			
			// 함수를 전달받은 매개변수(수행할 행동(작업)을 전달받는다.)
			function search(filter) {
				var filteredItems = [];
				
				for (var i = 0; i < products.length; i++) {
					var item = products[i];
					// 조건이 일치하는지 확인하기
					if (filter(item)) {
						filteredItems.push(item);
					}
				}
				
				return filteredItems;
			}
			
			// 상품의 가격이 5000원 미만인 경우만 true를 반환하는 기능이 구현된 함수
			function filter1(product) {
				if (product.price < 5000) {
					return true;
				}
				
				return false;
			}
			
			// 상품의 재고량이 50개 미만인 경우에만 true를 반환하는 기능이 구현된 함수
			function filter2(product) {
				if (product.stock < 50) {
					return true;
				}
				
				return false;
			}
			
			// 상품가격이 5000원 미만일 때만 true를 반환하는 기능이 구현된 함수를 전달해서 상품 찾게 하기
			var items1 = search(filter1);
			// 상품의 재고량이 50개 미만일 때만 true를 반환하는 기능이 구현된 함수를 전달해서 상품 찾게 하기
			var items2 = search(filter2);
			
			console.log("5000원 미만 상품", items1);
			console.log("50개 미만 상품", items2);
		</script>
	</head>
	<body>
        <h1>자바스크립트의 함수</h1>
        <p>실행결과는 브라우저 콘솔에서 확인</p>
	</body>
</html>