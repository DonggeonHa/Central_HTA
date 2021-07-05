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
				<div class="col-2">
					<ul class="list-group">
						<li class="list-group-item" id="item-1">성적우수자</li>
						<li class="list-group-item" id="item-2">합격자</li>
						<li class="list-group-item" id="item-3">불합격자</li>
					</ul>
				</div>
				<div class="col-10">
					<table class="table table-bordered">
						<colgroup>
							<col width="16.6%">
							<col width="16.6%">
							<col width="16.6%">
							<col width="16.6%">
							<col width="16.6%">
							<col width="16.6%">
						</colgroup>
						<thead>
							<tr>
								<th>이름</th>
								<th>국어</th>
								<th>영어</th>
								<th>수학</th>
								<th>총점</th>
								<th>평균</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>강감찬</td>
								<td>100</td>
								<td>90</td>
								<td>90</td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>이순신</td>
								<td>70</td>
								<td>30</td>
								<td>40</td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>김유신</td>
								<td>90</td>
								<td>90</td>
								<td>90</td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>유관순</td>
								<td>50</td>
								<td>20</td>
								<td>80</td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>안중근</td>
								<td>80</td>
								<td>90</td>
								<td>100</td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>김좌진</td>
								<td>80</td>
								<td>80</td>
								<td>60</td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>임꺽정</td>
								<td>30</td>
								<td>30</td>
								<td>60</td>
								<td></td>
								<td></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$('tbody tr').each(function(index, el) {
				var kor = $(el).find('td:eq(1)').text();
				var eng = $(el).find('td:eq(2)').text();
				var math = $(el).find('td:eq(3)').text();
				
				var totalScore = parseInt(kor) + parseInt(eng) + parseInt(math);
				var average = Math.trunc(totalScore/3);
						
				$(el).find('td:eq(4)').text(totalScore).css('font-weight', 'bold');
				$(el).find('td:eq(5)').text(average).css('font-weight', 'bold');
			});
			
			// 평균이 90점 이상인 행을 선택하기
			$('#item-1').click(function() {
				$(this).addClass('active').siblings().removeClass('active');
				$('tbody tr').removeClass('bg-warning bg-danger bg-primary');
				$('tbody td:last-child').filter(function(index, el) {
					var average = parseInt($(el).text());
					
					return average >= 90;
				}).parent().addClass('bg-warning');
			});
			
			// 평균이 60점 이상인 행을 선택하기
			$('#item-2').click(function() {
				$(this).addClass('active').siblings().removeClass('active');
				$('tbody tr').removeClass('bg-warning bg-danger bg-primary');
				$('tbody td:last-child').filter(function() {
					var average = parseInt($(this).text());
					
					return average >= 60;
				}).parent().addClass('bg-primary');
			});
			
			// 평균이 60점 미만인 행을 선택하기
			$('#item-3').click(function() {
				$(this).addClass('active').siblings().removeClass('active');
				$('tbody tr').removeClass('bg-warning bg-danger bg-primary');
				$('tbody td:last-child').filter(function() {
					var average = parseInt($(this).text());
					
					return average < 60;
				}).parent().addClass('bg-danger');
			});
			
		</script>
	</body>
</html>