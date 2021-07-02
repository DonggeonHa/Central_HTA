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
			<h1>hover(onmouseenter과 onmouseleave) 이벤트 처리</h1>
			
			<div class="row">
				<div class="col-7" >
					<div class="row" id="img-items">
						<div class="col-4">
							<img alt="사진1" src="images/1.jpg" class="img-thumbnail" />
						</div>
						<div class="col-4">
							<img alt="사진2" src="images/2.jpg" class="img-thumbnail" />
						</div>
						<div class="col-4">
							<img alt="사진3" src="images/3.jpg" class="img-thumbnail" />
						</div>
					</div>
				</div>
				<div class="col-5">
					<div class="border p-2 bg-light">
						<img src="images/1.jpg" alt="사진2" class="img-thumbnail" id="img-box"/>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$(function() {
				$('#img-box').css('opacity', '0.4');
				
				$('#img-items img').hover(function() {
					var imagePath = $(this).attr('src');
					$('#img-box').attr('src', imagePath).css('opacity','1.0');
				}, function() {
					$('#img-box').css('opacity', '0.4');
				});
			})
		</script>
	</body>
</html>