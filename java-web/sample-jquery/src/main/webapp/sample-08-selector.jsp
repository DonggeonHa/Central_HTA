<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<title>Bootstrap 5 Example</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	</head>
	<body>
		<div class="container">
			<h1>속성 선택자 연습하기</h1>	
			
			<h3>즐겨찾기 사이트</h3>
			<ul id="list-site-favorite">
				<li><a href="https://www.google.com">구글</a></li>
				<li><a href="https://www.daum.net">다음</a></li>
				<li><a href="http://www.jhta.co.kr">중앙HTA 학원</a></li>
			</ul>
			
			<h3>쇼핑몰 사이트</h3>
			<ul id="list-site-mall">
				<li><a href="https://www.gmarket.co.kr">G마켓</a></li>
				<li><a href="http://11st.co.kr/main">11번가</a></li>
			</ul>
			
			<h3>SNS 사이트</h3>
			<ul id="list-site-sns">
				<li><a href="https://instagram.com">인스타그램</a></li>
				<li><a href="https://www.facebook.com">페이스북</a></li>
			</ul>
			
			<h3>검색조건</h3>
			<div id="checkboxs">
				<input type="checkbox" id="search-opt-skill-1" name="skill" value="java" /> 자바 
				<input type="checkbox" id="search-opt-skill-2" name="skill" value="python" /> 파이썬
				<input type="checkbox" id="search-opt-skill-3" name="skill" value="db" /> 데이터베이스
				<input type="checkbox" id="search-opt-skill-4" name="skill" value="bigdata" />  빅데이터
				<input type="checkbox" id="search-opt-skill-5" name="skill" value="c#" /> C#
				<input type="checkbox" id="search-opt-skill-6" name="skill" value="javascript" /> 자바스크립트 
			</div>
		</div>
		<script type="text/javascript">
			// href의 속성값이 https://www.google.com 인 링크를 선택하기
			$("a[href='https://www.google.com']").css('font-size', '30px');
		
			// href의 속성값이 https로 시작하는 링크를 선택하기
			$("a[href^='https']").css('border' , '1px solid red');
			
			// href의 속성값이 com로 끝나는 링크를 선택하기
			$("a[href$='com']").css('background-color', 'yellow');
			
			// ul의 id 속성값이 list-site로 시작하는 
			$("ul[id^='list-site']").css('border', '3px solid red');
			
			// 체크박스 전부 선택하기
			// $("input[type=checkbox]").prop('checked', true);
			// $("input[name=skill]").prop('checked', true);
			$("input[id^=search-opt-skill").prop('checked', true);
			$("#checkboxs input").prop('checked', false);
		</script>
	</body>
</html>