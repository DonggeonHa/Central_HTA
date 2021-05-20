<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>POST방식으로 요청파라미터 전송하기</title>
	</head>
	<body>
		<h1>POST방식으로 요청파라미터 보내기</h1>
		
	<form method="post" action="demo4-1.jsp">
		이름<br />
		<input type="text" name="username"/><br />
		아이디<br />
		<input type="text" name="userid"/><br />
		비밀번호<br />
		<input type="password" name="userpassword"/><br />
		성별<br />
		<input type="radio" name="gender" value="여성" checked> 여성
		<input type="radio" name="gender" value="남성"> 남성 <br />
		보유기술<br />
		<input type="checkbox" name="skill" value="Java" /> 자바
		<input type="checkbox" name="skill" value="DB" /> 데이터베이스
		<input type="checkbox" name="skill" value="Network" /> 네크워크
		<input type="checkbox" name="skill" value="BigDate" /> 빅데이터
		<input type="checkbox" name="skill" value="DateScience" /> 데이터과학 <br />
		근무경력<br />
		<select name="year">
			<option value=""> -- 선택하세요 --</option>
			<option value="1"> 1년 이상</option>
			<option value="3"> 3년 이상</option>
			<option value="5"> 5년 이상</option>
			<option value="7"> 7년 이상</option>
		</select><br />
		<button type="submit" >제출</button>
	</form>
	</body>
</html>