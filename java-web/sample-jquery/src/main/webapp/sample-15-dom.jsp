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
			<h1>클래스 조작하기</h1>
			
			<div id="box-1">
				<button id="btn-1" class="btn btn-primary btn-sm">버튼</button>
				<button id="btn-2" class="btn btn-primary btn-sm" >버튼</button>
			</div>
		</div>
		<script type="text/javascript">
			$('div').css({border:'1px solid black', padding:'16px;', margin:'15px'});
			
			$('button:eq(0)').removeClass('btn-primary').addClass('btn-danger');
			
			$('button:eq(1)').toggleClass('disabled');
			var hasDisabledClass = $('button:eq(1)').hasClass('disabled');
			console.log('disbled가 포함되어 있는가? ',hasDisabledClass);
			
			$('button:eq(1)').toggleClass('disabled');
			hasDisabledClass = $('button:eq(1)').hasClass('disabled');
			console.log('disbled가 포함되어 있는가? ',hasDisabledClass);
			
		</script>
	</body>
</html>