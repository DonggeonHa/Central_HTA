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
			<h1>필터링 하기</h1>
			<div class="row">
				<div class="col">
					<div id="box-1">
						<div class="mb-3"><button class="btn btn-primary">.first()</button></div>
						<ul class="list-group">
							<li class="list-group-item">item1</li>
							<li class="list-group-item">item2</li>
							<li class="list-group-item">item3</li>
							<li class="list-group-item">item4</li>
							<li class="list-group-item">item5</li>
							<li class="list-group-item">item6</li>
							<li class="list-group-item">item7</li>
						</ul>
					</div>
				</div>
				<div class="col">
					<div id="box-2">
						<div class="mb-3"><button class="btn btn-primary">.last()</button></div>
						<ul class="list-group">
							<li class="list-group-item">item1</li>
							<li class="list-group-item">item2</li>
							<li class="list-group-item">item3</li>
							<li class="list-group-item">item4</li>
							<li class="list-group-item">item5</li>
							<li class="list-group-item">item6</li>
							<li class="list-group-item">item7</li>
						</ul>
					</div>
				</div>
				<div class="col">
					<div id="box-3">
						<div class="mb-3"><button class="btn btn-primary">.eq()</button></div>
						<ul class="list-group">
							<li class="list-group-item">item1</li>
							<li class="list-group-item">item2</li>
							<li class="list-group-item">item3</li>
							<li class="list-group-item">item4</li>
							<li class="list-group-item">item5</li>
							<li class="list-group-item">item6</li>
							<li class="list-group-item">item7</li>
						</ul>
					</div>
				</div>
				<div class="col">
					<div id="box-4">
						<div class="mb-3"><button class="btn btn-primary">.has()</button></div>
						<ul class="list-group">
							<li class="list-group-item">item1</li>
							<li class="list-group-item">item2</li>
							<li class="list-group-item">item3</li>
							<li class="list-group-item"><a>item4</a></li>
							<li class="list-group-item">item5</li>
							<li class="list-group-item">item6</li>
							<li class="list-group-item">item7</li>
						</ul>
					</div>
				</div>
				<div class="col">
					<div id="box-5">
						<div class="mb-3"><button class="btn btn-primary">.not()</button></div>
						<ul class="list-group">
							<li class="list-group-item">item1</li>
							<li class="list-group-item">item2</li>
							<li class="list-group-item">item3</li>
							<li class="list-group-item">item4</li>
							<li class="list-group-item">item5</li>
							<li class="list-group-item">item6</li>
							<li class="list-group-item">item7</li>
						</ul>
					</div>
				</div>
				<div class="col">
					<div id="box-6">
						<div class="mb-3"><button class="btn btn-primary">.filter()</button></div>
						<ul class="list-group">
							<li class="list-group-item">item1</li>
							<li class="list-group-item">item2</li>
							<li class="list-group-item">item3</li>
							<li class="list-group-item">item4</li>
							<li class="list-group-item">item5</li>
							<li class="list-group-item">item6</li>
							<li class="list-group-item">item7</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$(function() {
				// .first()
				$('#box-1 .btn').click(function() {
					$(this).closest('#box-1').find('.list-group-item')							// li 전부
									.first().addClass('list-group-item-primary');				// 첫번째 li
				});
				// .last()
				$('#box-2 .btn').click(function() {
					$(this).closest('#box-2').find('.list-group-item')							// li 전부
									.last().addClass('list-group-item-primary');				// 마지막번째 li
				});
				// .eq(index)
				$('#box-3 .btn').click(function() {
					$(this).closest('#box-3').find('.list-group-item')							// li 전부
									.eq(3).addClass('list-group-item-primary');					// 4번째 li
				});
				// .has(selector)
				$('#box-4 .btn').click(function() {
					$(this).closest('#box-4').find('.list-group-item')							// li 전부
									.has('a').addClass('list-group-item-primary');				// a를 가지고있는 li
				});
				// .not(selector)
				$('#box-5 .btn').click(function() {
					$(this).closest('#box-5').find('.list-group-item')							// li 전부
									.not(':first-child').addClass('list-group-item-primary');	// 첫번째 li가 아닌 나머지
				});
				// .filter(selector)
				$('#box-6 .btn').click(function() {
					$(this).closest('#box-6').find('.list-group-item')							// li 전부
									.filter(':lt(3)').addClass('list-group-item-primary');		// 4번째 이전 li
				});
					
			})		
		</script>
	</body>
</html>