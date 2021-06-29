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
			<h1>자식 필터 선택자 연습하기</h1>	
			
			<div>
				<p>p1</p>	
				<p>p2</p>	
				<p>p3</p>	
				<p>p4</p>	
			</div>
			
			<div>
				<p>p5</p>	
				<p>p6</p>	
				<p>p7</p>	
				<p>p8</p>	
				<div>
					<p>p12</p>	
					<p>p13</p>	
					<p>p14</p>	
				</div>	
			</div>
			<div>
				<p>p9</p>	
				<p>p10</p>	
				<p>p11</p>	
			</div>
				
		</div>
		<script type="text/javascript">
			// css("프로퍼티", "값");
			// css({프로퍼티:"값", 프로퍼티:"값", 프로퍼티:"값"})
			$("div").css({border:"1px solid black", margin: "10px", padding: "10px", backgroundColor: '#fafafa'});
			
			$("p:first").css('color', 'red'); // p1
			$("p:last").css('color', 'blue'); // p11
			
			$("p:first-child").css("background-color", 'yellow'); // p1, p5, p9, p12
			$("p:last-child").css("border", '1px solid red'); // p4, p14, p11
			
			$("p:nth-child(2)").css({color:'red', fontWeight: 'bold'}); // p2, p6, p13, p10
			
		</script>
	</body>
</html>