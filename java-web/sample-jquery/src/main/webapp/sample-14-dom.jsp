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
			<h1>엘리먼트 삭제하기</h1>
			
			<div id="box-1">
				<h3>remove</h3>
				<p>컨텐츠</p>
				<p>컨텐츠</p>
				<p>컨텐츠</p>
			</div>
			
			<div id="box-2">
				<h3>empty</h3>
				<p>컨텐츠</p>
				<p>컨텐츠</p>
				<p>컨텐츠</p>
			</div>
			
			<div id="box-3">
				<h3>hide</h3>
				<p>컨텐츠</p>
				<p>컨텐츠</p>
				<p>컨텐츠</p>
			</div>
		</div>
		<script type="text/javascript">
			$('div').css({border:'1px solid black', padding:'16px;', margin:'15px'});
			
			$('#box-1').remove();
			$('#box-2').empty();
			$('#box-3').hide();
		</script>
	</body>
</html>