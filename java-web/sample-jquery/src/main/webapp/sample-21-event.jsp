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
			<h1>onchange 이벤트</h1>
			
			<div id="box-1">
				<table class="table" id="table-cart-items">
					<thead>
						<tr>
							<th><input type="checkbox" id="checkbox-all-selected"/></th>
							<th>제품명</th>
							<th>가격</th>
							<th>구매수량</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr id="row-10001">
							<td><input type="checkbox" name="productNo" value="10001" /></td>
							<td>맥북 프로</td>
							<td>2,000,000 원</td>
							<td>1개</td>
							<td>
								<a href="order?productNo=10001" class="btn btn-primary btn-sm">구매</a>
								<button class="btn btn-warning btn-sm" data-item-no="10001">삭제</button>
							</td>
						</tr>
						<tr id="row-10002">
							<td><input type="checkbox" name="productNo" value="10002" /></td>
							<td>갤럭시북 프로</td>
							<td>1,800,000 원</td>
							<td>10개</td>
							<td>
								<a href="order?productNo=10002" class="btn btn-primary btn-sm">구매</a>
								<button class="btn btn-warning btn-sm" data-item-no="10002">삭제</button>
							</td>
						</tr>
						<tr id="row-10003">
							<td><input type="checkbox" name="productNo" value="10003" /></td>
							<td>갤럭시워치4</td>
							<td>400,000 원</td>
							<td>31개</td>
							<td>
								<a href="order?productNo=10003" class="btn btn-primary btn-sm">구매</a>
								<button class="btn btn-warning btn-sm" data-item-no="10003">삭제</button>
							</td>
						</tr>
					</tbody>
				</table>
				<div class="mt-3">
					<button class="btn btn-secondary btn-sm" id="btn-remove-all-row">전체 삭제</button>
					<button class="btn btn-secondary btn-sm" id="btn-remove-checked-row">선택 삭제</button>
				</div>
			</div>
		</div>
		<script type="text/javascript">
		 $(function() {
			 // 페이지 로딩시 장바구니 테이블의 모든 체크박스를 체크된 상태로 설정하기
			 $('#table-cart-items :checkbox').prop('checked', true);
			 
			 // 전체 삭제
			 $('#btn-remove-all-row').click(function() {
				 $('#table-cart-items tbody').empty();
				 $('#checkbox-all-selected').prop('checked', false);
			 });
			 
			 // 선택 삭제
			 $('#btn-remove-checked-row').click(function() {
				 $('#table-cart-items tbody tr:has(:checked)').remove();
				 $('#checkbox-all-selected').prop('checked', false);
				 
			 });
			 
			 // 전체 선택/해제 처리하기
			 $('#checkbox-all-selected').change(function() {
				 var isChecked = $(this).prop('checked');
				 
				 $('#table-cart-items tbody :checkbox').prop('checked', isChecked);
			 });
			 
			 // 아이템의 체크박스를 선택/해제할 때 전체 선택/해제 버튼에 반영하기
			 $('#table-cart-items tbody :checkbox').change(function() {
				 changeAllCheckedCheckbox();
			 });
		 })
		 
		 // 삭제버튼 클릭시 해당 행을 삭제하기
		 $('#table-cart-items tbody .btn-warning').click(function() {
			 // 버튼의 data-item-no="장바구니번호"를 사용해서 tr 삭제하기
			 /* var itemNo = $(this).data('item-no');
			 $('#row-' + itemNo).remove(); */
			 
			 // 조상엘리먼트 중에서 가장 가까운 tr을 찾아서 삭제하기
			 $(this).closest('tr').remove();
			 
			 changeAllCheckedCheckbox();
		 });
		 
		 // 총 체크박스의 갯수와 체크된 체크박스의 갯수를 비교해서 전체 선택/해제 체크박스의 상태를 변경하는 함수
		 function changeAllCheckedCheckbox() {
			 // 체크박스의 갯수를 조회한다.
			 var checkboxAllCount = $('#table-cart-items tbody :checkbox').length;
			 // 체크박스가 하나도 없으면 전체 선택/해제 체크박스는 해제상태로 지정하고, 함수실행을 종료한다.
			 if (checkboxAllCount == 0) {
				 $("#checkbox-all-selected").prop('checked', false);
				 return;
			 }
			 
			 // 체크박스 중에서 체크된 체크박스의 갯수를 조회한다.
			 var checkedCheckboxCount = $('#table-cart-items tbody :checkbox:checked').length;
			 
			 if (checkboxAllCount == checkedCheckboxCount) {
				 $('#checkbox-all-selected').prop('checked', true);
			 } else {
				 $('#checkbox-all-selected').prop('checked', false);
			 }
		 }
		</script>
	</body>
</html>