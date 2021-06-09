<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자바스크립트의 배열</title>
		<script type="text/javascript">
			// 배열
			// - 길이가 가변적이다.
			// - 타입이 서로 다른 값들을 배열의 요소로 가질 수 있다.
			// - 배열객체는 배열의 길이를 반환하는 length 프로퍼티(Property)가 있다.
			// - 자바의 ArrayList와 유사하다.
			
			// 배열의 선언과 초기화
			var emptyArray = [];
			var names = ["홍길동", "김유신", "강감찬", "이순신"];
			var complexArray = ["김유신", 100, true, [10, 20, 40], 3.15];
			console.log(emptyArray, emptyArray.length);
			console.log(names, names.length);
			console.log(complexArray, complexArray.length);
			
			// 배열에 요소 추가하기, 조회하기, 삭제하기
			var numbers = [];
			numbers[0] = 10;
			numbers[1] = 100;
			numbers[2] = 1000;
			numbers[99] = 10000;
			console.log(numbers, numbers.length);
			
			var numbers2 = [];
			// 배열객체의 push(값)메소드를 이용하면 배열의 맨마지막요소 다음에 새로운 요소를 추가한다.
			numbers2.push(100);
			numbers2.push(200);
			numbers2.push(300);
			numbers2.push(400);
			numbers2.push(500);
			console.log(numbers2, numbers2.length);
			
			var numbers3 = [];
			// 배열객체의 unshift(값)메소드를 이용하면 배열의 맨 처음 요소 앞에 새로운 요소를 추가한다.
			numbers3.unshift(100);
			numbers3.unshift(200);
			numbers3.unshift(300);
			numbers3.unshift(400);
			numbers3.unshift(500);
			console.log(numbers3, numbers3.length);
			
			var numbers4 = [1, 2, 3, 4, 5];
			// 배열객체의 pop() 메소드를 이용하면 배열의 맨 마지막번째 값부터 추출할 수 있다.
			console.log(numbers4.pop(), numbers4);
// 			console.log(numbers4.pop(), numbers4);
// 			console.log(numbers4.pop(), numbers4);
// 			console.log(numbers4.pop(), numbers4);
// 			console.log(numbers4.pop(), numbers4);

			var numbers5 = [1, 2, 3, 4, 5];
			// 배열객체의 shift()메소드를 이용하면 배열의 첫번째 값부터 추출할 수 있다
			console.log(numbers5.shift(), numbers5);
			
			var numbers6 = [1, 2, 3, 4, 5];
			// 배열객체의 splice(start, howManyDelete, addItems, ...)메소드를 이용하면
			// 요소의 추가, 삭제가 가능하다
			// 배열.splice(1, 1) : 배열의 1번째부터 요소를 1개 삭제한다
			// 배열.splice(1, 2) : 배열의 1번째부터 요소를 2개 삭제한다
			// 배열.splice(1, 1, 값, 값, 값) : 배열의 1번째부터 1개 값을 삭제하고 그 자리에 값들을 추가한다.
			numbers6.splice(1, 1);
			console.log(numbers6);
			
			// 학생들의 국어점수
			var scores = [70, 60, 80, 90, 50];
			// 국어점수 총점과 평균 계산하기
			var totalScore = 0;
			for (var i=0; i<scores.length; i++) {
				totalScore += scores[i];
			}
			console.log("국어 총점", totalScore);
			console.log("국어 평균", totalScore/scores.length);
			
			scores.sort();
			console.log("정렬하기", scores);
			console.log("순서바꾸기", scores.reverse());
			
		</script>
	</head>
	<body>
        
	</body>
</html>