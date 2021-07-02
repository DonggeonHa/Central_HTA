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
			<h1>이벤트 버블링 방지하기</h1>
			
			<div id="box-1">
				<form>
					<div class="form-group">
						<label>입사구분</label>
						<select name="career" id="combobox-career" class="form-control">
							<option value="" selected disabled> 선택하세요</option>
							<option value="N">신입</option>
							<option value="Y">경력직</option>
						</select>
					</div>
					<div class="form-group" id="box-worked">
						<label for="">경력사항</label>
						<input type="text" class="form-control" name="worked"/>
					</div>
				</form>
			</div>
		</div>
		<script type="text/javascript">
			$(function() {
				// 경력사항 입력란을 화면에 표시되지 않게 한다
				$('#box-worked').hide();
				
				// 입사구분 입력란의 select박스의 선택된 옵션이 변경될 때마다 onchange 이벤트 발생
				// onchange이벤트 발생시 실행될 이벤트핸들러 함수를 jQuery의 change() 함수에 전달하기
				$('#combobox-career').change(function() {
					var careerValue = $(this).val();


					if (careerValue == 'Y') {
						$('#box-worked').show();
					} else if (careerValue == 'N') {
						$('#box-worked').hide();
					}
						
				});
			})
		</script>
	</body>
</html>