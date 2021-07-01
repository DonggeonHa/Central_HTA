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
			<h1>폼 요소 선택자 연습하기</h1>	
			
			<from id="form-register">
				이름 : <input type="text" name="username" class="form-control"/> <br/>			
				아이디 : <input type="text" name="userid" class="form-control"/> <br/>			
				비밀번호 : <input type="password" name="userpwd" class="form-control"/> <br/>			
				파일 : <input type="file" name="upfile"/> <br/>			
				성별 : <input type="radio" name="gender" value="F" checked/>여자			
					   <input type="radio" name="gender" value="M"/>남자 <br/>			
				기술 : <input type="checkbox" name="skill" value="java" checked="checked"/> 자바			
					   <input type="checkbox" name="skill" value="c" />	C
					   <input type="checkbox" name="skill" value="python" /> 파이썬			
					   <input type="checkbox" name="skill" value="db" /> 데이터베이스 <br/>
				경력 : <select name="career">
							<option value="1">1년이상</option>
							<option value="3">3년이상</option>
							<option value="5">5년이상</option>
							<option value="7">7년이상</option>
					   </select> <br/>
				자기소개: <textarea rows="5" cols="60" name="memo" class="form-control"></textarea>			
			</from>
		</div>
		<script type="text/javascript">
			// 모든 폼 입력요소를 선택해서 비활성화 함.
			$(":input").prop('disabled', true);
			// type="text" 폼 요소를 선택해서 활성화 함.
			$(":text").prop('disabled', false);
			// type="password" 폼 요소 활성화
			$(":password").prop('disabled', false).val('zxcv1234');
			// type="file" 폼 요소 활성화
			$(":file").prop('disabled', false);
			// 라디오버튼 폼 요소 활성화
			$(":radio").prop('disabled', false);
			// 체크박스버튼 폼 요소 활성화
			$(":checkbox").prop('disabled', false);
			// select, textarea 폼 요소 활성화
			$("select").prop('disabled', false);
			$("textarea").prop('disabled', false);
			
			// 활성화 상태인 폼 요소 전부 비활성화하기
			$(":enabled").prop('disabled', true);
		</script>
	</body>
</html>