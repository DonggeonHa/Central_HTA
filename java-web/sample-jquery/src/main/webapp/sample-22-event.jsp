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
		<style type="text/css">
			div {
				border: 1px solid black;
				margin: 15px;
				padding: 30px;
			}
			
			#box {border: 3px solid red;}
			#box-1 {border: 1px solid green;}
			#box-2 {border: 1px solid orange;}
		</style>
	</head>
	<body>
		<div class="container">
			<h1>onsubmit 이벤트 처리</h1>
			<%--
				onsubmit 이벤트는 <form> 태그에서 발생하는 이벤트다
				<form> 태그 안에 위치한
					<input type="submit" value="로그인" />
					<button type="submit">로그인</button>
					<button>로그인</button>
					위의 버튼을 클릭했을 때 <form> 태그에서 onsubmit 이벤트가 발생한다
					
					<button type="button">로그인</button>처럼
					type="button"으로 지정된 버튼을 클릭햇을 때는 <form> 태그에서 onsubmit 이벤트가 발생하지 않는다.
			 --%>
			<div class="row">
				<div class="col-12">
					<form id="form-login" method="post" action="login">
						<div class="form-group">
							<label>아이디</label>
							<input type="text" class="form-control" name="userId" id ="user-id">
						</div>
						<div class="form-group">
							<label>비밀번호</label>
							<input type="password" class="form-control" name="userPwd" id ="user-pwd">
						</div>
						<div class="text-right">
							<button type="submit" class="btn btn-primary">로그인</button>
						</div>
					</form>
				</div>
			</div>
		</div>
		<script type="text/javascript">
		$(function() {
			// form에서 onsubmit 이벤트 발생시 실행된다.
			// 폼 입력값의 유효성을 검사한다.
			$('#form-login').submit(function() {
				if (!$.trim($('#user-id').val())) {
					alert('아이디는 필수입력값입니다.');
					$('#user-id').focus();
					return false;
				}
				
				if (!$.trim($('#user-pwd').val())) {
					alert('비밀번호는 필수입력값입니다.');
					$('#user-pwd').focus();
					return false;
				}
				
				return true;
			});
		})
		</script>
	</body>
</html>