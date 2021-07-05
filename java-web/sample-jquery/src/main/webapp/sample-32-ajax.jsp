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
			<h1>json 형식의 응답데이터 다루기</h1>
			
			<div class="row">
				<div class="col-4">
					<h3>베스트셀러</h3>
					<ul class="list-group" id="bestseller-list"></ul>
				</div>
				<div class="col-8">
					<h3>책 상세정보</h3>
					<table class="table table-bordered">
						<colgroup>
							<col width="15%"/>
							<col width="35%"/>
							<col width="15%"/>
							<col width="35%"/>
						</colgroup>
						<tbody>
							<tr>
								<th>번호</th>
								<td id="no-cell"></td>
								<th>가격</th>
								<td id="price-cell"></td>
							</tr>
							<tr>
								<th>제목</th>
								<td colspan="3" id="title-cell"></td>
							</tr>
							<tr>
								<th>저자</th>
								<td id="writer-cell"></td>
								<th>출판사</th>
								<td id="publisher-cell"></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$(function() {
				
				// 페이지가 로딩되면 jQuery로 ajax요청을 보내서 책 목록정보를 조회한다.
				// 조회된 책 목록정보를 베스트셀러 리스트에 추가한다.
				$.getJSON('ajax2', function(books) {
					var $ul = $('#bestseller-list');
					
					$.each(books, function(index, book) {
						var $li = $('<li></li>');
						$li.addClass('list-group-item');
						$li.attr('data-book-no', book.no);
						$li.text(book.title);
						
						$ul.append($li);
					})
				})
				
				$('#bestseller-list').on('click', '.list-group-item', function() {
					var bookNo = $(this).data('book-no');
					
					$.ajax({
						type:"GET",
						url:'ajax3',
						data:{no:bookNo},
						dataType: 'json',
						success : function(book) {
							$('#no-cell').text(book.no);
							$('#price-cell').text(book.price);
							$('#title-cell').text(book.title);
							$('#writer-cell').text(book.writer);
							$('#publisher-cell').text(book.publisher);
						},
						error: function() {
							alert("오류가 발생하였습니다");
						}
					});
				})
			})
		
		</script>
	</body>
</html>