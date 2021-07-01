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
			<h1>이벤트발생시 실행되는 기본 행동이 실행되지않게 하기</h1>
			<p>
				a태그는 onclick이벤트가 발생하면 지정된 링크로 이동하는 것이 기본 행동이다.<br/>
				form태그는 onsubmit이벤트가 발생하면 서버로 폼입력값을 제출하는 것이 기본 행동이다.<br />
				
				a태그를 클릭해도 지정된 링크로 이동되지 않게 하기,
				submit이벤트가 발생해도 폼입력값을 제출하기 않게 하고 싶다.
			</p>
			
			<div id="box-1">
				<a href="http://www.daum.net" id="link-1">다음</a>
				<a href="http://www.daum.net" id="link-2">다음</a>
			</div>
				
			<div id="box-2">
				<form id="form-login" method="post" action="login.jsp">
					아이디 : <input type="text" name="userid" class="form-control"> <br/>
					비밀번호 : <input type="password" name="userpwd" class="form-control"> <br/>
					<button type="submit" class="btn btn-outline-success btn-lg">로그인</button>
				</form>
			</div>	
		</div>
		<script type="text/javascript">
			$('#link-1').click(function(event) {
				// event.preventDefault()는 해당 이벤트 발생시 자동 실행되는 기본행동의 실행을 방해한다.
				event.preventDefault();
			});
			
			$('#link-2').click(function(event) {
				// jQuery의 이벤트핸들러 함수가 false값을 반환하면
				// 해당 이벤트 발생시 자동 실행되는 기본행동의 실행을 방해한다.
				return false;
			});
			
			$('#form-login').submit(function() {
				if (!$(':text[name=userid]').val()) {
					alert('아이디를 입력하세요');
					return false;
				}
				
				if (!$(':password[name=userpwd]').val()) {
					alert('비밀번호를 입력하세요');
					return false;
				}
				
				return true;
			})
		</script>
	</body>
</html>