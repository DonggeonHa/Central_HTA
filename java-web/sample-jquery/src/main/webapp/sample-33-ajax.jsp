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
			<div class="mb-3">
				<h1>json 응답데이터 처리하기</h1>
			</div>
			
			<div class="row">
				<div class="col">
					<form class="form-inline border bg-light" id="form-search-1">
						<label class="mr-2">조회일자 : </label>
						<input type="date" class="mr-2" id="date-boxoffice-1" />
						<button type="button" class="btn btn-outline-primary btn-sm" id="btn-boxoffice-1">조회</button>
					</form>
					<div class="mt-3 border bg-list p-2">
						<h4>박스오피스 순위</h4>
						<table class="table" id="table-boxoffice-1">
							<colgroup>
								<col width="10%">
								<col width="50%">
								<col width="20%">
								<col width="20%">
							</colgroup>
							<thead>
								<tr>
									<td>순위</td>
									<td>제목</td>
									<td>개봉일자</td>
									<td>예매율</td>
								</tr>
							</thead>
							<tbody></tbody>
						</table>
					</div>
				</div>
				
			</div>
		</div>
		<script type="text/javascript">
			$(function() {
				
				$('#btn-boxoffice-1').click(function() {
					
					var $tbody = $('#table-boxoffice-1 tbody').empty();
					
					var dateString = $('#date-boxoffice-1').val();
					if (!dateString) {
						alert('조회날짜를 입력하세요!');
						return false;
					}
					
					if (!isBeforeDate(dateString)) {
						alert('조회날짜는 오늘보다 이전날짜만 가능합니다.');
						return false;
					}
					
					// 조회된 날짜에서 -를 제거한다. "2021-07-05" -> "20210705"
					dateString = dateString.replace(/-/g, '');
					
					// 선택한 날짜에 대한 박스오피스 정보를 조회하기
					$.ajax({
						type:"GET",
						url: 'https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json',
						data: {key:'f5eef3421c602c6cb7ea224104795888', targetDt:dateString},
						dataType: 'json',
						success: function(boxoffice) {
							var boxofficeList = boxoffice.boxOfficeResult.dailyBoxOfficeList;
							
							$.each(boxofficeList, function(index, item) {
								var $tr = $('<tr></tr>');
								$('<td></td>').text(item.rank).appendTo($tr);
								$('<td></td>').text(item.movieNm).appendTo($tr);
								$('<td></td>').text(item.openDt).appendTo($tr);
								$('<td></td>').text(item.salesShare).appendTo($tr);
								
								$tbody.append($tr);
							})
						},
						error: function() {
							alert('박스오피스 조회중 오류가 발생하였습니다.');
						}
					});
				})
				
				// 오늘 자정의 유닉스타임을 반환한다.
				function getTodayTime() {
					var now = new Date();
					
					var year = now.getFullYear();
					var month = now.getMonth();
					var date = now.getDate();
					
					var today = new Date(year, month, date);
					
					return today.getTime();
				}
				
				// 선택한 날짜의 유닉스타임을 반환한다.
				function getSearchTime(dateString) {
					var date = new Date(dateString);
					return date.getTime();
				}
				
				// 선택한 날짜가 오늘보다 이전인지 여부를 반환한다.
				function isBeforeDate(dateString) {
					return getTodayTime() > getSearchTime(dateString); 
				}
			})
			
		</script>
	</body>
</html>