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
			/*
				search(함수)
					* 함수 : function(product) {}
					- 함수는 매개변수로 상품객체를 전달받는다.
					- 함수는 조건에 따라서 true/false값을 반환해야 한다.
					- 함수의 실행결과가 true인 상품만 배열에 담아서 반환한다.
			*/
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
			
			// 상품가격이 1만원 이상 5만원 이하인 상품을 검색한다.
			var items1 = search(function(product) {
				if (product.price >= 10000 && product.price <= 50000) {
					return true;
				}
				
				return false;
			});
			console.log("1만원 이상 5만원 이하인 상품", items1);
			
			// 화살표 함수 표현식으로 작성된 함수를 전달하기
			// 화살표 함수
			//            형식
			//               (매개변수, 매개변수, ...) => { 수행문; 수행문; 수행문; }
			//            매개변수가 한개, 수행문이 하나일 때
			//               매개변수 => 수행문
			//               * 수행문이 하나뿐인 경우 {}을 생략할 수 있다.
			//               * 수행문이 하나뿐인 경우 return문을 생략할 수 있다.
			//               * 수행문의 결과값이 화살표함수의 최종 반환값이 된다.
			//               
			
			// 상품의 재고량이 500개 이상인 상품을 검색한다.
			var items2 = search(product => product.stock > 500);
			console.log("재고량이 500개 이상인 상품", items2);
			
			// 주문내역
			var orders = [
				{no:10, category:"전자책", name:"이것이 자바다", price:35000, amount:5},
				{no:11, category:"노트북", name:"맥북", price:2500000, amount:2},
				{no:12, category:"스마트폰", name:"아이폰12", price:1200000, amount:2}
			];
			
			function calculatePoint(sum) {
				var point = 0;
				for (var i = 0; i < orders.length; i++) {
					point += sum(orders[i]);
				}
				
				return point;
			}
			
			// vip고객일 때의 적립금 계산하기
			// 상품가격이 200만원 이상인 경우 5%적립, 추가로 구매수량만큼 상품가격의 2%적립
			// 상품가격이 100만원 이상인 경우 3%적립, 추가로 구매수량만큼 상품가격의 1%적립
			// 상품가격이 100만원 미만인 경우 1%적립, 구매수량만큼
			var point1 = calculatePoint(item => {
				if (item.price >= 2000000) {
					return item.price * 0.05 + item.price * 0.02 * item.amount;
				}
				if (item.price > 1000000) {
					return item.price * 0.03 + item.price * 0.01 * item.amount;
				}
				
				return item.price * 0.01;
			});
			
			console.log("VIP고객일 때의 적립금 계산", point1);
		</script>
	</head>
	<body>
        <h1>자바스크립트의 함수</h1>
        <p>실행결과는 브라우저 콘솔에서 확인</p>
	</body>
</html>